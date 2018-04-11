<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Login |  Amazon-bd</title>
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

        <script>
            function confirmGo(m, u) {

                if (confirm(m)) {
                    window.location = u;

                } else {
                    return false;
                }

            }

            function match2() {

                confirmGo('Are You Sure to Update ?', '<c:out value="${ourUser}"/>')

            }
        </script>
    </head><!--/head-->

    <body>
        <c:set var="userEmail1" scope="session" value="${ourUser}"/>
        <%@include file='../cupling_resources/header.jsp' %> 


        <div class="container">

            <div class="col-sm-12 clearfix">
                <div class="bill-to">

                    <center><h3>Customer Information Update</h3>
                        <hr>


                        <h3 style="color: ${color}">${sms}</h3>
                    </center>
                    <div class="form-one col-sm-6" >
                        <form >
                            <input type="text" placeholder="Customer ID" style="color: #0099ff;font-weight: bold" disabled>
                            <input type="text" placeholder="Customer Name" style="color: #0099ff;font-weight: bold" disabled>
                            <input type="text" placeholder="Email*" style="color: #0099ff;font-weight: bold" disabled>
                            <input type="text" placeholder="Mobile Phone" style="color: #0099ff;font-weight: bold" disabled>
                            <input type="text" placeholder="Address  *" style="color: #0099ff;font-weight: bold" disabled>
                            <input type="text" placeholder="Country *" style="color: #0099ff;font-weight: bold" disabled> 
                            <input type="text" placeholder="District *" style="color: #0099ff;font-weight: bold" disabled>
                            <input type="text" placeholder="Zip Code *" style="color: #0099ff;font-weight: bold" disabled>


                        </form>
                        <br><br><br><br>
                    </div>
                    <div class="form-two ">

                        <form method="POST" action="updateCustomerinfo" onsubmit="return  confirmGo('Are You Sure to Update ?', '')">
                            <c:forEach items="${li}" var="row">
                                <input type="text" name="userId" value="${row.userId}" readonly="" required="">
                                <input type="text" name="shoperName" value="${row.shoperName}" required="">
                                <input type="email" name="email" value="${row.email}" required="">
                                <input type="text" name="contactNo" value="${row.contactNo}" required="" maxlength="11">
                                <input type="text" name="address" value="${row.address}" required="">
                                <input type="text" name="country" value="${row.country}" required="">
                                <input type="text" name="district" value="${row.district}" required="">
                                <input type="text" name="zipCode" value="${row.zipCode}" required="">
                            </c:forEach>
                            <button type="submit" class="btn btn-default" >Change Now</button>
                        </form>
                    </div>


                </div>
            </div>




        </div>



        <%@include file='../cupling_resources/footer.jsp' %>
        <%@include file='../cupling_resources/java_Script.jsp' %>
    </body>
</html>