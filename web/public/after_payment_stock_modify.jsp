<%-- 
    Document   : after_payment_stock_modify
    Created on : Jul 21, 2016, 11:42:08 PM
    Author     : User
--%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>

        <%
            String mainSess = request.getRemoteAddr();
            session.setAttribute("user", mainSess);
        %>


        <sql:setDataSource var="db2" driver="${initParam['driver']}" url="${initParam['db']}" user="${initParam['user']}" password="${initParam['password']}"/>
        <sql:query var="q2" dataSource="${db2}">
            select * from choose where ses_id='${user}'
        </sql:query> 



        <c:forEach var="row" items="${q2.rows}" >

            <sql:query var="q3" dataSource="${db2}">
                select pro_qty from product where pro_id='${row.pro_id}'
            </sql:query>
            <c:forEach var="r" items="${q3.rows}"> <c:set var="stock" value="${r.pro_qty}"/></c:forEach>    


            <c:set var="qt" value="${row.quantity}"/>

            <sql:update dataSource="${db2}" var="count">
                UPDATE product SET pro_qty = ?
                WHERE pro_id=${row.pro_id}
                <sql:param value="${stock-qt}" />

            </sql:update>

        </c:forEach>
        <c:if test="${count>=1}">

            <sql:update dataSource="${db2}" var="cont">
                DELETE FROM choose
                WHERE ses_id='${user}'
            </sql:update>   

            <c:redirect url="index1.jsp" ></c:redirect>


        </c:if>





    </body>
</html>
