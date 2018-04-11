<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Checkout |  Amazon-bd</title>
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
<!--        <script>
            
            function  par(){
                
               var x1 =  document.getElementById("flip");
               var x2 =  document.getElementById("stop");
               if(document.getElementById("flip").checked){
                    document.getElementById("stop").selected = "false";
               }else if(document.getElementById("stop").checked){
                   document.getElementById("flip").selected = "false";
               }
                
            }
            
        </script>-->
        
    </head><!--/head-->

    <body>
        <%@include file='../cupling_resources/header.jsp' %> 

        <section id="cart_items">
            <div class="container">
                <div class="breadcrumbs">
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li class="active">Check out</li>
                    </ol>
                </div><!--/breadcrums-->

                

                <div class="step-one">
                    <h2 class="heading">Step1</h2>
                </div>
                <div class="checkout-options">
                    <h3>User type checkout</h3>
                    <ul class="nav">
                        <li>
                            <label><input type="checkbox"   id="flip" > Regular User </label>
                        </li>
                        <li>
                            <label><input type="checkbox"  id="stop"> Guest User</label>
                        </li>

                    </ul>
                </div><!--/checkout-options-->

                <div class="register-req">
                    <p>Please use Register And Checkout to easily get access to your order history, or use Checkout as Guest</p>
                </div><!--/register-req-->

                <div class="shopper-informations">
                    <div class="row">
                        <div class="col-sm-3" id="col-sm">
                            <div class="shopper-info">
                                <p>Shopper Information</p>
                                <p style="font-size: 16px; color: red">${msg}</p>
                                <form method="POST" action="findUserDataByIdPass">
                                    <input type="text" name="email" placeholder="Email Address">
                                    <input type="password" name="password" placeholder="Password">

                                    <input type="submit"  style="width: 40%;" class="btn btn-primary" value="Continue"/>
                                </form>

                            </div>
                        </div>
                        <div class="col-sm-6 clearfix">

                            <div class="bill-to" >
                                <p>Bill To</p>

                                <div >
                                    <form method="POST" action="addNewDelivary">
                                        <table cellpadding="2" cellspacing="2">
                                            <tr >
                                                <td >
                                                    <input type="text" name="shoperName" value="${shopUser.shoperName}" placeholder="Shopper Name" style="background-color: #ddd;width: 140%;height: 40px; padding:5px">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td ><input type="email" name="email" value="${shopUser.email}" placeholder="Email*" style="background-color: #ddd;width: 140%;height: 40px;padding: 5px"></td>
                                                <td><input type="text" name="phone" value="${shopUser.contactNo}" placeholder="Phone*" style="background-color: #ddd;width: 140%;height: 40px;padding: 5px"></td>
                                            </tr>
                                            <tr>
                                                <td><input type="text" name="zipCode" value="${shopUser.zipCode}" placeholder="Zip Code" style="background-color: #ddd;width: 140%;height: 40px;padding: 5px"></td>
                                                <td><input type="text" name="district" value="${shopUser.district}" placeholder="District" style="background-color: #ddd;width: 140%;height: 40px;padding: 5px"></td>
                                            </tr>
                                            <tr>
                                                <td><input type="text" name="country" value="${shopUser.country}" placeholder="Country" style="background-color: #ddd;width: 140%;height: 40px;padding: 5px"></td>
                                                <td> <input type="text" name="address" value="${shopUser.address}" placeholder="Address" style="background-color: #ddd;width: 140%;height: 40px;padding: 5px"></td>
                                            </tr>
                                            <tr>
                                                <td><input type="text" name="comments" placeholder="Comments" style="background-color: #ddd;width: 140%;height: 40px;padding: 5px"></td>
                                                <td>  <input type="text" name="reciveTime" placeholder="Recive Time" style="background-color: #ddd;width: 140%;height: 40px;padding:5px" ></td>
                                            </tr>
                                            <tr>

                                                <td colspan="2"> <input type="submit"  style="width: 40%; margin-left: 35%;" class="btn btn-primary" value="Continue"/>&emsp;${msg}</td>
                                            </tr>
                                        </table>
















                                    </form>



                                </div>


                            </div>


                        </div>

                    </div>
                </div>
                <div class="review-payment">
                    <h2>Review & Payment</h2>
                </div>


                <div class="payment-options">
                    <span>
                        <label><input type="checkbox"> Direct Bank Transfer</label>
                    </span>
                    <span>
                        <label><input type="checkbox"> Check Payment</label>
                    </span>
                    <span>
                        <label><input type="checkbox"> Paypal</label>
                    </span>
                </div>
            </div>
        </section> <!--/#cart_items-->


        <%@include file='../cupling_resources/footer.jsp' %>
        <%@include file='../cupling_resources/java_Script.jsp' %>
    </body>
</html>