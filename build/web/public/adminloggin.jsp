<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Login | E-Shopper</title>
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

    <body>
        <%@include file='../cupling_resources/header.jsp' %> 
        <section id="form"><!--form-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-4 col-sm-offset-1">
                        <div class="login-form"><!--login form-->
                            <h2>Login to your account</h2>
                            
                            
                            
                            
                            <form action="adminLogin">
                                <input type="text" placeholder="User Id" name="id"/>
                                <input type="password" placeholder="Password" name="pass"/>
                                <span>
                                    <input type="checkbox" class="checkbox"> 
                                    Keep me signed in
                                </span>
                                <button type="submit" class="btn btn-default">Login</button>
                            </form>
                            
                            
                            
                        </div><!--/login form-->
                    </div>

                </div>
            </div>
        </section><!--/form-->


      <%@include file='../cupling_resources/footer.jsp' %>
     <%@include file='../cupling_resources/java_Script.jsp' %>


        
    </body>
</html>