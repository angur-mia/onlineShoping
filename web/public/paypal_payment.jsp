<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Product Details |  Amazon-bd</title>
        <link href="assets/bootstrap.min.css" rel="stylesheet">
        <link href="assets/font-awesome.min.css" rel="stylesheet">
        <link href="assets/prettyPhoto.css" rel="stylesheet">
        <link href="assets/price-range.css" rel="stylesheet">
        <link href="assets/animate.css" rel="stylesheet">
        <link href="assets/main.css" rel="stylesheet">
        <link href="assets/responsive.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
        <!--for Picture Zoom-->

        <script>

            function par() {
                var price = document.getElementById("pri").value;
                var qunatity = document.getElementById("qty").value;

                var result = price * qunatity;
                var n = result.toFixed(0);

                var total = document.getElementById("tpri");
                total.value = n;
            }

        </script>





    </head><!--/head-->

    <body>
        <%@include file='../cupling_resources/header.jsp' %> 
      

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">


                            <div class="shipping text-center"><!--shipping-->
                                <img src="images/home/shipping.jpg" alt="" />
                            </div><!--/shipping-->

                        </div>
                    </div>

                    <div class="col-sm-9 padding-right">

                        <div class="category-tab shop-details-tab"><!--category-tab-->
                            <div class="col-sm-12">
                                <ul class="nav nav-tabs">
                                    <li><a href="#" data-toggle="tab">We Accept Below Payment GatWay</a></li>
                                    <li><a href="#" data-toggle="tab">Click And Pay Your bill  </a></li>


                                </ul>
                            </div>
                            <div class="tab-content">
                                <sql:setDataSource var="db2" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shop_online" user="root" password="apcl123456"/>
                                <sql:query var="q2" dataSource="${db2}">
                                    select * from choose where ses_id='${user}'
                                </sql:query> 
                                <table  cellpadding="10" cellspacing="5 0"  >
                                    <tr>
                                        <td align="center" ><h3 style="color: #0099ff">Pay By Paypal</h3></td> 
                                        <td align="center" ><h3 style="color: #0099ff">Pay By Skrill-card</h3></td>
                                    </tr>
                                    <tr >
                                        <td class="col-sm-4" align="center" >
<!--https://www.sandbox.paypal.com/cgi-bin/webscr-->
                                            <form method="post" action="http://localhost:8080/OnlineShoppingV2807/paymentsuccess?email=${parUser}" target="_blank">
                                                <input type="hidden" name="cmd" value="_cart"/>
                                                <input type="hidden" name="upload" value="1"/>
                                                <c:set var="dem"  value="1"/>

                                                <c:forEach var="row" items="${q2.rows}" >

                                                    <input type="hidden" name="item_number_${dem}" value="${row.pro_id}"/>
                                                    <input type="hidden" name="item_name_${dem}" value="${row.pro_name}"/>
                                                    <input type="hidden" name="quantity_${dem}" value="${row.quantity}"/>
                                                    <input type="hidden" name="amount_${dem}" value="${row.price}"/>



                                                    <c:set var="dem"  value="${dem+1}"/>
                                                </c:forEach>

                                                <input type="hidden" name="quantity_${dem}" value=""/>
                                                <input type="hidden" name="item_name_${dem}" value="Vat 5%"/>

                                                <input type="hidden" name="amount_${dem}" value="${tx}"/>

                                                <c:set var="dem"  value="${dem+1}"/>
                                                <input type="hidden" name="quantity_${dem}" value=""/>
                                                <input type="hidden" name="item_name_${dem}" value="Shipping Cost "/>

                                                <input type="hidden" name="amount_${dem}" value="${ship}"/>



                                                <input type="hidden" name="business" value="angur7-facilitator@yahoo.com"/>
                                                <input type="hidden" name="return" value="http://localhost:8080/OnlineShoppingV2807/paymentsuccess?email=${parUser}"/>
                                                <input type="hidden" name="cancel" value="http://localhost:8080/OnlineShoppingV2807/public/product_buy.jsp"/>
                                                <input type="image" name="submit" src="images/payment_Logo/paypal.png" alt="" width="260" height="160" />

                                            </form>
                                        </td>

                                        <td class="col-sm-4" align="center">

                                            <form action="https://pay.skrill.com" method="post" target="_blank">
                                                <input type="hidden" name="pay_to_email" value="demoqco@sun-fish.com">
                                                <input type="hidden" name="transaction_id" value="${user}">
                                                <input type="hidden" name="return_url" value="http://localhost:8080/OnlineShopping1507/">
                                                <input type="hidden" name="cancel_url" value="http://localhost:8080/OnlineShopping1507/">
                                                <input type="hidden" name="status_url" value="https://merchantsite.com/
                                                       process_payment.cgi">
                                                <input type="hidden" name="language" value="EN">
                                                <input type="hidden" name="merchant_fields" value="customer_number,session_id">
                                                <input type="hidden" name="customer_number" value="C1234">
                                                <input type="hidden" name="session_ID" value="${user}">
                                                <input type="hidden" name="pay_from_email" value="payer123@skrill.com">
                                                <input type="hidden" name="amount2_description" value="Product Price:">
                                                <input type="hidden" name="amount2" value="29.90">
                                                <input type="hidden" name="amount3_description" value="Handling Fees & Charges:">
                                                <input type="hidden" name="amount3" value="3.10">
                                                <input type="hidden" name="amount4_description" value="VAT (20%):">
                                                <input type="hidden" name="amount4" value="6.60">
                                                <input type="hidden" name="amount" value="39.60">
                                                <input type="hidden" name="currency" value="GBP">
                                                <input type="hidden" name="firstname" value="John">
                                                <input type="hidden" name="lastname" value="Payer">
                                                <input type="hidden" name="address" value="Payerstreet">
                                                <input type="hidden" name="postal_code" value="EC45MQ">
                                                <input type="hidden" name="city" value="Payertown">
                                                <input type="hidden" name="country" value="GBR">
                                                <input type="hidden" name="detail1_description" value="Product ID:">
                                                <input type="hidden" name="detail1_text" value="4509334">
                                                <input type="hidden" name="detail2_description" value="Description:">
                                                <input type="hidden" name="detail2_text" value="Romeo and Juliet (W.
                                                       Shakespeare)">
                                                <input type="hidden" name="detail3_description" value="Special Conditions:">
                                                <input type="hidden" name="detail3_text" value="5-6 days for delivery">
                                               <input type="image" name="submit" src="images/payment_Logo/Skrill-card.png" alt="" width="260" height="160" />
                                            </form>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="center" ><h3 style="color: #0099ff">Pay By Payoneer</h3></td> 
                                        <td align="center" ><h3 style="color: #0099ff">Pay By Payza</h3></td>
                                    </tr>

                                    <tr>
                                        <td class="col-sm-4" align="center">
                                            <form method="post" action="https://www.sandbox.paypal.com/cgi-bin/webscr">
                                                <input type="hidden" name="cmd" value="_cart"/>
                                                <input type="hidden" name="upload" value="1"/>
                                                <c:set var="dem"  value="1"/>

                                                <c:forEach var="row" items="${q2.rows}" >

                                                    <input type="hidden" name="item_number_${dem}" value="${row.pro_id}"/>
                                                    <input type="hidden" name="item_name_${dem}" value="${row.pro_name}"/>
                                                    <input type="hidden" name="quantity_${dem}" value="${row.quantity}"/>
                                                    <input type="hidden" name="amount_${dem}" value="${row.price}"/>
                                                    <c:set var="dem"  value="${dem+1}"/>
                                                </c:forEach>

                                                <input type="hidden" name="quantity_${dem}" value=""/>
                                                <input type="hidden" name="item_name_${dem}" value="Vat 5%"/>

                                                <input type="hidden" name="amount_${dem}" value="${tx}"/>

                                                <c:set var="dem"  value="${dem+1}"/>
                                                <input type="hidden" name="quantity_${dem}" value=""/>
                                                <input type="hidden" name="item_name_${dem}" value="Shipping Cost "/>
                                                <input type="hidden" name="amount_${dem}" value="${ship}"/>
                                                <input type="hidden" name="business" value="angur7-facilitator@yahoo.com"/>
                                                <input type="hidden" name="return" value="http://localhost:8080/Ecomercev0206/"/>
                                                <input type="hidden" name="cancel" value="http://localhost:8080/Ecomercev0206/product_buy.jsp"/>
                                                <input type="image" name="submit" src="images/payment_Logo/debitcard1.jpg" alt="" width="260" height="160" />

                                            </form>
                                        </td>

                                        <td class="col-sm-4" align="center">

                                            <form method="post" action="https://www.sandbox.paypal.com/cgi-bin/webscr">
                                                <input type="hidden" name="cmd" value="_cart"/>
                                                <input type="hidden" name="upload" value="1"/>
                                                <c:set var="dem"  value="1"/>



                                                <c:forEach var="row" items="${q2.rows}" >

                                                    <input type="hidden" name="item_number_${dem}" value="${row.pro_id}"/>
                                                    <input type="hidden" name="item_name_${dem}" value="${row.pro_name}"/>
                                                    <input type="hidden" name="quantity_${dem}" value="${row.quantity}"/>
                                                    <input type="hidden" name="amount_${dem}" value="${row.price}"/>

                                                    <c:set var="dem"  value="${dem+1}"/>
                                                </c:forEach>

                                                <input type="hidden" name="quantity_${dem}" value=""/>
                                                <input type="hidden" name="item_name_${dem}" value="Vat 5%"/>

                                                <input type="hidden" name="amount_${dem}" value="${tx}"/>

                                                <c:set var="dem"  value="${dem+1}"/>
                                                <input type="hidden" name="quantity_${dem}" value=""/>
                                                <input type="hidden" name="item_name_${dem}" value="Shipping Cost "/>

                                                <input type="hidden" name="amount_${dem}" value="${ship}"/>



                                                <input type="hidden" name="business" value="angur7-facilitator@yahoo.com"/>
                                                <input type="hidden" name="return" value="http://localhost:8080/Ecomercev0206/"/>
                                                <input type="hidden" name="cancel" value="http://localhost:8080/Ecomercev0206/product_buy.jsp"/>
                                                <input type="image" name="submit" src="images/payment_Logo/payza_card.png" alt="" width="260" height="160" />

                                            </form>
                                        </td>
                                    </tr>
                                </table>      







                            </div>


                        </div>





                    </div>
                </div>


            </div>
        </section>

      <%@include file='../cupling_resources/footer.jsp' %>
      <%@include file='../cupling_resources/java_Script.jsp' %>
        <script>
            $('#zoom_01').elevateZoom({
                zoomType: "inner",
                cursor: "crosshair",
                zoomWindowFadeIn: 500,
                zoomWindowFadeOut: 750
            });
        </script>
    </body>
</html>