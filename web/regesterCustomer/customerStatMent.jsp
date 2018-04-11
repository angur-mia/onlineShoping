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

        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>

    </head><!--/head-->

    <body >
        <%@include file='../cupling_resources/header.jsp' %> 


        <div class="container">
            <div class="col-lg-3"></div>
            <div class="col-lg-6">

                <table >
                    <tr class="text-style-tm">
                        <td colspan="2" align="center" style="color:blue;">
                            You can check account statement for a date range of maximum 365 days.
                        </td>
                    </tr>
                </table>
                <hr />

                <form method="POST" action="regesterCustomer/statementview.jsp">
                    <table border="0" cellspacing="1" cellpadding="1" >
                        <tr><th></th><th>Account Statement</th></tr> 
                        <tr>
                            <td></td>
                            <td></td>
                        </tr>

                        <tr >
                            <td><b>Customer Email</b></td>
                            <td>${parUser}</td>
                        </tr>

                        <tr>
                            <td width="150">Transaction Start Date</td>
                            <td width="230">
                                <input type="text" name="email" maxlength="20" size="35" value="${parUser}" id="fromDate" hidden="">
                                <input type="text" name="fromDate" maxlength="10" size="35" value="2016-07-01" id="datepicker">
                            </td>
                        </tr>
                        <tr class="td-color1">
                            <td width="150">Transaction End Date</td>
                            <td width="230"><input  type="text" name="toDate" maxlength="10" size="35" value="2016-10-31" id="toDate">
                        </tr>

                        <tr class="td-color1">
                            <td width="150">Output Format</td>
                            <td>
                                <select name="format" id="reportFormat" class="text-style">
                                    <option value="pdf" selected="selected">PDF</option>
                                    <option value="html" >HTML</option>
                                    <option value="excel">EXCEL</option>
                            </td>
                        </tr>
                        <tr>
                            <td></td>   <td><input type="submit" value="Submit"/><input type="submit" value="Cancel" /></td>
                        </tr>

                    </table>

                </form>
                <br><br><br><br><br>
            </div>
            <div class="col-lg-3"></div>

        </div>

        <%@include file='../cupling_resources/footer.jsp' %>
        <%@include file='../cupling_resources/java_Script.jsp' %>
    </body>
</html>