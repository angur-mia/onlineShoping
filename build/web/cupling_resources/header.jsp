<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    String mainSess = request.getRemoteAddr();
    session.setAttribute("user", mainSess);

%>



<header id="header"><!--header-->
    <div class="header_top"><!--header_top-->
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="contactinfo">
                        <ul class="nav nav-pills">
                            <li><a href="#"><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
                            <li><a href="#"><i class="fa fa-envelope"></i> info@domain.com</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="social-icons pull-right">
                        <ul class="nav navbar-nav">
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                            <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header_top-->

    <div class="header-middle"><!--header-middle-->
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <div class="logo pull-left">
                        <a href="indexPage"><img src="images/home/Amazon-Logo.jpg" alt="" width="170" height="55"/></a>
                    </div>
                    <div class="btn-group pull-right">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default dropdown-toggle usa" data-toggle="dropdown">
                                USA
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <li><a href="#">Canada</a></li>
                                <li><a href="#">UK</a></li>
                            </ul>
                        </div>


                    </div>
                </div>
                <div class="col-sm-8">
                    <div class="shop-menu pull-right">
                        <ul class="nav navbar-nav">
                            <li>
                                <c:set var="username" value="${parUser}"/>
                                <c:choose>
                                    <c:when test="${parUser != null}">
                                        <div class="mainmenu pull-left"  >
                                            <ul class="nav navbar-nav collapse navbar-collapse">
                                                <li class="dropdown"><a href="#"><i class="fa fa-user"></i> <c:out value="${parUser}"/><i class="fa fa-angle-down"></i></a>
                                                    <ul role="menu" class="sub-menu">
                                                        <li ><a href="userStatement" style="background: transparent"><i class="fa fa-envelope"></i> Customer Statment</a> </li> 
                                                        <li><a href="editCustomerinfo?email=${parUser}" style="background: transpaerent"><i class="fa fa-edit"></i> Edit Customer Info</a></li> 
                                                        <li><a href="edit?email=${parUser}" style="background: transparent"><i class="fa fa-check"></i> Change Password</a></li> 
                                                        <li><a href="userLogout" style="background: transparent"><i class="fa fa-lock"></i> User Logout</a></li>
                                                    </ul>
                                                </li>    
                                            </ul>                 

                                        </div>

                                    </c:when>
                                    <c:otherwise>
                                    <li><a href="userloggin"><i class="fa fa-lock"></i> User Login</a></li>

                                </c:otherwise>
                            </c:choose>




                            <c:choose>
                                <c:when test="${parUser != null}">

                                </c:when>
                            </c:choose>

                            <li><a href="checkout"><i class="fa fa-crosshairs"></i> Checkout</a></li>
                                <c:choose>
                                    <c:when test="${(selectedAmount != null) && (selectedAmount!=0)}">
                                    <li><a href="showChoiceList?&sesId=${user}" class="active"><i class="fa fa-shopping-cart"></i> Cart &nbsp;<span class="badge" style="color: #ff0066; background: #00cc00">${selectedAmount}</span></a></li>
                                        </c:when>
                                        <c:otherwise>
                                    <li><a href="showChoiceList?&sesId=${user}" class="active"><i class="fa fa-shopping-cart"></i> Cart</a></li>
                                    <li><a href="findWishlistPage?&userEmail=${parUser}"><i class="fa fa-shopping-cart"></i> Wishlist&nbsp;<span class="badge" style="color: #0083C9; background: pink">${wishedItems}</span></a></li>
                                        </c:otherwise>
                                    </c:choose>


                        </ul>

                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-middle-->

    <div class="header-bottom"><!--header-bottom-->
        <div class="container">
            <div class="row">
                <div class="col-sm-9">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="mainmenu pull-left">
                        <ul class="nav navbar-nav collapse navbar-collapse">
                            <li><a href="indexPage?&sesId=${user}" class="active">Home</a></li>
                            <li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                <ul role="menu" class="sub-menu">
                                    <li><a href="indexPage?&sesId=${user}">Products</a></li> 
                                    <li><a href="showChoiceList?&sesId=${user}" class="active"><i class="fa fa-shopping-cart"></i>&nbsp;Cart &nbsp;<span class="badge" style="color: #ff0066; background: #00cc00">${selectedAmount}</span></a></li>
                                    <li><a href="checkout">Checkout</a></li> 
                                    <li><a href="adminlog"><i class="fa fa-lock"></i> Admin Login</a></li>
                                </ul>
                            </li> 
                            <li><a href="contact-us.jsp">Contact</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="search_box pull-right">
                        <input type="text" placeholder="Search"/>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-bottom-->
</header><!--/header-->
