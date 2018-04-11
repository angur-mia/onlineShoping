<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Cart |  Amazon-bd</title>
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

       


    </head><!--/head-->

    <body onload="onloadtex()">
        <%@include file='../cupling_resources/header.jsp' %> 

        <section id="cart_items">
            <div class="container">
                <div class="breadcrumbs">
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li class="active">Shopping Cart</li>
                    </ol>
                </div>
                <div class="table-responsive cart_info">


                    <table class="table table-condensed">
                        <thead>
                            <tr class="cart_menu" >
                                <td class="image">Item</td>
                                <td class="description"></td>
                                <td class="price">Price</td>
                                <td class="quantity">Quantity</td>
                                <td class="total">Total</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>


                            <c:set var="dem"  value="1"/>
                            <c:forEach var="data" items="${demo}" >

                                <tr id="1089771">
                                    <td class="cart_product" style="margin-right: 0px;" >
                                        <a href=""><img src="${data.proUrl}" alt="" height="120px" width="150px;"></a>
                                    </td>
                                    <td class="cart_description" style="width: 30%">
                                        <h4><a href="">${data.proName}</a></h4>
                                        <p> Product Id : ${data.proId}</p>
                                    </td>


                                    <td class="cart_price">
                                        <p>$<span id="unit">${data.price}</span></p>
                                    </td>
                                    <td  >
                                        <div class="cart_quantity_button" style="width: 50%">

                                           <form action="updateChoose12">

                                                <input type="hidden" name="id" value="${data.id}" readonly="readonly"/>
                                                <input type="hidden" name="sesId" value="${choose.sesId}" readonly="readonly"/>
                                                <input type="hidden" name="proId" value="${data.proId}" readonly="readonly"/>
                                                <input type="hidden" name="proName" value="${data.proName}" readonly="readonly"/>
                                                <input type="hidden" name="proUrl" value="${data.proUrl}" readonly="readonly"/>
                                                <input type="hidden" id="pri_${dem}" name="price" value="${data.price}" readonly="readonly"/>
                                                <table>
                                                    <tr>
                                                        <td>
                                                            <input type="number" id="qty_${dem}" ng-keydown="false" name="quantity" value="${data.quantity}" onclick="par_${dem}()" style="width: 75px;" min="1" max="10"/>
                                                        </td>
                                                        <td>
                                                            <button type="submit" class="cart_quantity_update" title="Update Quntity"  ><i class="fa fa-edit" style="color: #398439" ></i></button>
                                                        </td>
                                                    </tr>
                                                </table>

                                                <input type="hidden" id="tpri_${dem}" name="total" value="${data.total}" readonly="readonly"/>


                                            </form>
                                        </div>
                                    </td>
                                    <td class="cart_total">
                                        <p class="cart_total_price">$<span id="totall">${data.total}</span></p>
                                    </td>
                                    <td class="cart_delete">


                                        <!--<a href="findUpdatePage?&id=${data.id}&sesId=${data.sesId}&proId=${data.proId}&proName=${quantity}&proUrl=${data.proUrl}&price=${data.price}&quantity=${data.quantity}&total=${data.total}" class="cart_quantity_update"  ><span style="color: #333333">up</span></a>-->
                                        <a href="deleteChoice?&id=${data.id}&sesId=${data.sesId}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&price=${data.price}&quantity=${data.quantity}&total=${data.total}" class="cart_quantity_delete" ><i class="fa fa-times-circle" style="color: #cc0033" >  Delete</i></a>
                                    </td>
                                </tr>
                                <c:set var="dem"  value="${dem+1}"/>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </section> <!--/#cart_items-->



        <section id="do_action">
            <div class="container">
                <div class="heading">
                    <h3>What would you like to do next?</h3>
                    <p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="chose_area">
                            <form method="POST" action="findZoneCost">
                                <ul class="user_option">
                                    <li>
                                        <input type="checkbox">
                                        <label>Use Coupon Code</label>
                                    </li>
                                    <li>
                                        <input type="checkbox">
                                        <label>Use Gift Voucher</label>
                                    </li>
                                    <li>
                                        <input type="checkbox">
                                        <label>Estimate Shipping & Taxes</label>
                                    </li>
                                </ul>
                                <ul class="user_info">
                                    <li class="single_field">
                                        <label>Country:</label>
                                        <select id="country" name="country"> 
                                            <option value="Select Country" selected="selected">Select Country</option>
                                            <option value="Bangladesh">Bangladesh</option>

                                        </select>
                                    </li>

                                    <!--Bagerhat  Bandarban  Barguna  Barisal  Bhola  Bogra  Brahmanbaria  Chandpur  Chittagong  Chuadanga  Comilla  Cox's Bazar  Dhaka  Dinajpur  Faridpur  Feni  Gaibandha  Gazipur  Gopalganj  Habiganj  Jamalpur  Jessore  Jhalokati  Jhenaidah  Joypurhat  Khagrachhari  Khulna  Kishoreganj  Kurigram  Kushtia  Lakshmipur  Lalmonirhat  Madaripur  Magura  Manikganj  Meherpur  Moulvibazar  Munshiganj  Mymensingh  Naogaon  Narail  Narayanganj  Narsingdi  Natore  Nawabganj  Netrakona  Nilphamari  Noakhali  Pabna  Panchagarh  Patuakhali  Pirojpur  Rajbari  Rajshahi  Rangamati  Rangpur  Satkhira  Shariatpur  Sherpur  Sirajganj  Sunamganj  Sylhet  Tangail  Thakurgaon--> 

                                    <li class="single_field">
                                        <label>City :</label>
                                        <select name="zoneName" id="state">
                                            <option value="">Select City</option>
                                            <option value="Bagerhat">Bagerhat</option>
                                            <option value="Bandarban">Bandarban</option>
                                            <option value="Barguna">Barguna</option>
                                            <option value="Barisal">Barisal</option>
                                            <option value="Bhola">Bhola</option>
                                            <option value="Bogra">Bogra</option>
                                            <option value="Brahmanbaria">Brahmanbaria</option>
                                            <option value="Chandpur">Chandpur</option>
                                            <option value="Chittagong">Chittagong</option>
                                            <option value="Chuadanga">Chuadanga</option>

                                        </select>
                                        <input type="hidden" name="sesId" value="${user}"/>



                                    </li>
                                    <li class="single_field zip-field">
                                        <label>Zip Code:</label>
                                        <input type="text">
                                    </li>
                                </ul>
                                <a class="btn btn-default update" href="">Get Quotes</a>
                                <!--                                <a class="btn btn-default check_out" href="">Continue</a>-->
                                <input class="btn btn-default check_out" type="submit" value="Continue" onclick="checkshippin()"/>
                            </form>
                        </div>

                    </div>
                    <div class="col-sm-6">
                        <div class="total_area">
                            <ul>
                                <li>Cart Sub Total <span id="subtotall">$ ${tAmount}</span></li>

                                <%
                                    Double restult = (Double) request.getAttribute("tAmount");
                                    double tex = restult * .05;
                                    double tex1 = Math.round(tex * 100) / 100.0d;

                                    Double zoneCost = (Double) request.getAttribute("tCost");
                                    double shipCost = 0.0;

                                    if (tex1 > 0 && zoneCost == 0) {
                                        shipCost = 40;
                                    }

                                    if (zoneCost != 0.0) {
                                        shipCost = zoneCost;
                                    }

                                    double finalTotal = Math.round((restult + tex1 + shipCost) * 100) / 100.0d;
                                %>

                                <c:set var="tx" value="<%=tex1%>" scope="session"/>
                                <c:set var="ship" value="<%=shipCost%>" scope="session"/>
                                <c:set var="ftotal" value="<%=finalTotal%>"/>

                                <li>VAT  5%<span >$ ${tx}</span></li>
                                <li>Shipping Cost <span>$ ${ship}</span></li>
                                <li>Total <span>$ ${ftotal}</span></li>
                            </ul>
                            <a class="btn btn-default update" href="">Update</a>
                            <a class="btn btn-default check_out" href="checkout">Checkout</a>
                        </div>
                    </div>
                </div>
            </div>
        </section><!--/#do_action-->

 
       <%@include file='../cupling_resources/footer.jsp' %>
      <%@include file='../cupling_resources/java_Script.jsp' %>
    </body>
</html>