<%@page import="java.util.Calendar"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Home | Amazon-bd</title>
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
        <!--zoom Image-->
        <script src='js/jquery-1.8.3.min.js'></script>
        <script src='js/jquery.elevatezoom.js'></script>

    </head><!--/head-->

    <body>



        <%@include file='../cupling_resources/header.jsp' %> 


        <section id="slider"><!--slider-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="slider-carousel" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
                                <li data-target="#slider-carousel" data-slide-to="1"></li>
                                <li data-target="#slider-carousel" data-slide-to="2"></li>
                            </ol>

                            <div class="carousel-inner">
                                <div class="item active">
                                    <div class="col-sm-6">
                                        <h1><span>Amazon</span>-bd</h1>
                                        <h2>E-Commerce Online Market</h2>
                                        <p>A Reliable OnlineShoping Market In Your  Finger Press</p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/girl1.jpg" class="girl img-responsive" alt="" />
                                        <img src="images/home/pricing.png"  class="pricing" alt="" />
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>Amazon</span>-bd</h1>
                                        <h2>E-Commerce Online Market</h2>
                                        <p>Just Time Delevery Product, Easy Payment System</p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/girl2.jpg" class="girl img-responsive" alt="" />
                                        <img src="images/home/pricing.png"  class="pricing" alt="" />
                                    </div>
                                </div>

                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>Amazon</span>-bd</h1>
                                        <h2>E-Commerce Online Market</h2>
                                        <p>Commitment to Quality Product,Sell back Product Offer</p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/girl3.jpg" class="girl img-responsive" alt="" />
                                        <img src="images/home/pricing.png" class="pricing" alt="" />
                                    </div>
                                </div>

                            </div>

                            <a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
                                <i class="fa fa-angle-left"></i>
                            </a>
                            <a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </div>

                    </div>
                </div>
            </div>
        </section><!--/slider-->

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">
                            <h2>Category</h2>
                            <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordian" href="#sportswear">
                                                <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                Sportswear
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="sportswear" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <ul>
                                                <li><a href="getNikePage">Nike </a></li>
                                                <li><a href="getUnderArmor">Under Armour </a></li>
                                                <li><a href="geAdidasPage">Adidas </a></li>
                                                <li><a href="#">Puma</a></li>
                                                <li><a href="#">ASICS </a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordian" href="#mens">
                                                <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                Mens
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="mens" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <ul>
                                                <li><a href="getMensFandi123">Fendi</a></li>
                                                <li><a href="getGuessPage">Guess</a></li>
                                                <li><a href="getValentinoPage">Valentino</a></li>
                                                <li><a href="getDiorPage">Dior</a></li>
                                                <li><a href="getVersacePage">Versace</a></li>
                                                <li><a href="#">Armani</a></li>
                                                <li><a href="#">Prada</a></li>
                                                <li><a href="#">Dolce and Gabbana</a></li>
                                                <li><a href="#">Chanel</a></li>
                                                <li><a href="#">Gucci</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordian" href="#womens">
                                                <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                Womens
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="womens" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <ul>
                                                <li><a href="getWomensFendiPage">Fendi</a></li>
                                                <li><a href="getWomensGuessPage">Guess</a></li>
                                                <li><a href="getWomensValantinoPage">Valentino</a></li>
                                                <li><a href="getWomensDiorPage">Dior</a></li>
                                                <li><a href="getWomensVersacePage">Versace</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="getKidsPage">Kids</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="getFashionPage">Fashion</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="getHouseholdsPage">Households</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="getInteriorsPage">Interiors</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="getClothingPage">Clothing</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="getBagsPage">Bags</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="getShowsPage">Shoes</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="findNewProductPage">New Product</a></h4>
                                    </div>
                                </div>
                            </div><!--/category-products-->

                            <div class="brands_products"><!--brands_products-->
                                <h2>Brands</h2>
                                <div class="brands-name">
                                    <ul class="nav nav-pills nav-stacked">
                                        <li><a href="#"> <span class="pull-right">(50)</span>Acne</a></li>
                                        <li><a href="#"> <span class="pull-right">(56)</span>Grüne Erde</a></li>
                                        <li><a href="#"> <span class="pull-right">(27)</span>Albiro</a></li>
                                        <li><a href="#"> <span class="pull-right">(32)</span>Ronhill</a></li>
                                        <li><a href="#"> <span class="pull-right">(5)</span>Oddmolly</a></li>
                                        <li><a href="#"> <span class="pull-right">(9)</span>Boudestijn</a></li>
                                        <li><a href="#"> <span class="pull-right">(4)</span>Rösch creative culture</a></li>
                                    </ul>
                                </div>
                            </div><!--/brands_products-->


                            <div class="shipping text-center"><!--shipping-->
                                <img src="images/home/shipping.jpg" alt="" />
                            </div><!--/shipping-->

                        </div>
                    </div>

                    <div class="col-sm-9 padding-right">
                        <div class="features_items"><!--features_items-->
                            <h2 class="title text-center">Groups of Product</h2>

                            <input type="hidden" value="<% out.print(session.getId());%>"/>
                            <c:set var="ses" value="<% session.getId(); %>"/>

                            <c:forEach var="data" items="${demo}" begin="186" end="186">

                                <div class="col-sm-4">

                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img class="mycss" src="${data.proUrl}" alt="" />

                                                <a href="getSportsGroup" class="btn  btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Sports Items</a>
                                            </div>

                                        </div>

                                    </div>


                                </div>    


                            </c:forEach>

                            <c:forEach var="data" items="${demo}" begin="187" end="187">

                                <div class="col-sm-4">

                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center" >
                                                <img class="mycss" src="${data.proUrl}" alt=""/>
                                                <a href="getMensGroup" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Men's Collection</a>
                                            </div>

                                        </div>

                                    </div>


                                </div>    


                            </c:forEach>

                            <c:forEach var="data" items="${demo}" begin="188" end="188">

                                <div class="col-sm-4">

                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center" >
                                                <img class="mycss" src="${data.proUrl}" alt=""  />
                                                <a href="getWomensGroup" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Women's Collection</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>    
                            </c:forEach>

                            <c:forEach var="data" items="${demo}" begin="195" end="195">

                                <div class="col-sm-4">

                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center" >
                                                <img class="mycss" src="${data.proUrl}" alt="" />
                                                <a href="getKidsPage" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Kids Items</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>    


                            </c:forEach>
                            <c:forEach var="data" items="${demo}" begin="189" end="189">

                                <div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center" >
                                                <img class="mycss" src="${data.proUrl}" alt="" />
                                                <a href="getFashionPage" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Fashion Items</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>    
                            </c:forEach>

                            <%--<c:forEach var="data" items="${demo}" begin="57" end="59">--%>
                            <c:forEach var="data" items="${demo}" begin="190" end="190">

                                <div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center" >
                                                <img class="mycss" src="${data.proUrl}" alt="" />
                                                <a href="getHouseholdsPage" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Households Products</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>    
                            </c:forEach>

                            <c:forEach var="data" items="${demo}" begin="191" end="191">

                                <div class="col-sm-4">

                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img class="mycss" src="${data.proUrl}" alt=""/>
                                                <a href="getInteriorsPage" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Interiors Product</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>    


                            </c:forEach>

                            <c:forEach var="data" items="${demo}" begin="192" end="192">

                                <div class="col-sm-4">

                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center" >
                                                <img class="mycss" src="${data.proUrl}" alt="" />
                                                <a href="getClothingPage" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Clothing Items</a>
                                            </div>
                                        </div>

                                    </div>
                                </div>    
                            </c:forEach>

                            <c:forEach var="data" items="${demo}" begin="193" end="193">
                                <div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img class="mycss" src="${data.proUrl}" alt=""/>
                                                <a href="getBagsPage" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Bag Items</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>    


                            </c:forEach>

                            <c:forEach var="data" items="${demo}" begin="183" end="185">

                                <div class="col-sm-4">

                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img class="mycss" src="${data.proUrl}" alt=""/>
                                                <a href="getShowsPage" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>&nbsp;Shows Items</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>    
                            </c:forEach>

                        </div><!--  features_items-->

                        <div class="category-tab"><!--category-tab-->
                            <div class="col-sm-12">
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#tshirt" data-toggle="tab">T-Shirt</a></li>
                                    <li><a href="#blazers" data-toggle="tab">Blazers</a></li>
                                    <li><a href="#sunglass" data-toggle="tab">Sunglass</a></li>
                                    <li><a href="#kids" data-toggle="tab">Kids</a></li>
                                    <li><a href="#poloshirt" data-toggle="tab">Polo shirt</a></li>
                                </ul>
                            </div>
                            <div class="tab-content">
                                <div class="tab-pane fade active in" id="tshirt" >
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="209" end="209">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceTshirtFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="210" end="210">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceTshirtFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="211" end="211">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceTshirtFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="212" end="212">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceTshirtFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="tab-pane fade" id="blazers" >
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="214" end="214">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="215" end="215">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="216" end="216">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="217" end="217">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="tab-pane fade" id="sunglass" >
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="224" end="224">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="225" end="225">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="226" end="226">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">

                                                    <c:forEach var="data" items="${demo}" begin="227" end="227">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>

                                </div>
                                <div class="tab-pane fade" id="kids" >
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <c:forEach var="data" items="${demo}" begin="39" end="39">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceKidsFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <c:forEach var="data" items="${demo}" begin="40" end="40">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceKidsFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <c:forEach var="data" items="${demo}" begin="41" end="41">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceKidsFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <c:forEach var="data" items="${demo}" begin="42" end="42">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceKidsFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="tab-pane fade" id="poloshirt" >
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <c:forEach var="data" items="${demo}" begin="219" end="219">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <c:forEach var="data" items="${demo}" begin="220" end="220">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <c:forEach var="data" items="${demo}" begin="221" end="221">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <c:forEach var="data" items="${demo}" begin="222" end="222">
                                                        <img src="${data.proUrl}" alt="" style="height: 230px;" />
                                                        <h2>$${data.proPrice}</h2>
                                                        <p>${data.proName}</p>
                                                        <a href="saveChoiceBlazerFromHome?&sesId=${user}&proId=${data.proId}&proName=${data.proName}&proUrl=${data.proUrl}&proPrice=${data.proPrice}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </c:forEach>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div><!--/category-tab-->
                        <%--<c:set var="totalSize" value="${fn:length(demo)}"/>--%>

                        



                    </div>
                </div>
            </div>
        </section>


        <%@include file='../cupling_resources/footer.jsp' %>
        <%@include file='../cupling_resources/java_Script.jsp' %>


    </body>
</html>

<!--<style>

    
    img {
  border-radius: 100%;
  //-webkit-transition: -webkit-transform .8s ease-in-out;
  transition: transform .8s ease-in-out;
}
img:hover {
  //-webkit-transform: rotate(45deg);
  transform: rotate(45deg);
}
</style>-->