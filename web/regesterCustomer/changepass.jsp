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
                var pass1 = document.getElementById("pass1").value;
                var pass2 = document.getElementById("pass2").value;
                if (pass1 == pass2) {
                   
                  confirmGo('Are You Sure to Update ?','<c:out value="${ourUser}"/>')
                } else {
                    window.alert("Dose not match");
                    return false;
                }
            }
        </script>
    </head><!--/head-->

    <body>
        <c:set var="userEmail1" scope="session" value="${ourUser}"/>
        <%@include file='../cupling_resources/header.jsp' %> 


        <div class="container">

            <div class="col-sm-4 col-sm-offset-1">
                <div class="login-form"><!--login form-->

                    <h2>Change your account Password</h2>
                    <h5 style="color: red">${sms}</h5>
                    <form method="POST" action="changepass" onsubmit="return  match2()">

                        <input type="hidden" name="email" value="${shopUser.email}" />

                        <input type="text"   name="contactNo" placeholder="Old Password*" required/>
                        <input type="text" id="pass1"  placeholder="New Password*" required/>
                        <input type="text" id="pass2" name="password" placeholder="Confirm Password*" value="${shopUser.password}"  required/>


                        <button type="submit" class="btn btn-default" >Change Now</button>
                    </form>
                </div><!--/login form-->
            </div>


            <div class="col-sm-4">

            </div>

        </div>
        <br><br><br><br><br><br>


        <%@include file='../cupling_resources/footer.jsp' %>
        <%@include file='../cupling_resources/java_Script.jsp' %>
    </body>
</html>