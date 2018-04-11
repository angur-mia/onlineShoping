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

    <body >
        <%@include file='../cupling_resources/header.jsp' %> 

        <section id="cart_items">
            <div class="container">
                <div class="breadcrumbs">
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li class="active">Wishlist Items</li>
                    </ol>
                </div>
                <div class="table-responsive cart_info">


                    <table class="table table-condensed">
                        <thead>
                            <tr class="cart_menu" >
                                <td class="image">Item</td>
                                <td class="description">Product Name</td>
                                <td class="price">Price</td>

                                
                                <td class="total"></td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach var="data" items="${demo}" >

                                <tr id="1089771">
                                    <td class="cart_product" style="margin-right: 0px; width: 5%;"  >
                                        <a href=""><img src="${data.proUrl}" alt="" height="120px" width="150px;"></a>
                                    </td>
                                    <td class="cart_description" style="width: 30%">
                                        <h4><a href="">${data.proName}</a></h4>
                                        <p> Product Id : ${data.proId}</p>
                                    </td>


                                    <td class="cart_price">
                                        <p>$<span id="unit">${data.price}</span></p>
                                    </td>


                                    <td class="cart_delete">
                                        <a href="" style="background-color: #009999" ><i class="fa fa-shopping-cart"></i> Add to cart</a>
                                        <a href="deleteFromWishlist?id=${data.id}&time=${data.time}&&userEmail=${data.userEmail}" class="cart_quantity_delete" ><i class="glyphicon glyphicon-trash" style="color: #cc0033" >  Delete</i></a>
                                    </td>
                                </tr>

                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </section> <!--/#cart_items-->






        <%@include file='../cupling_resources/footer.jsp' %>
        <%@include file='../cupling_resources/java_Script.jsp' %>
    </body>
</html>