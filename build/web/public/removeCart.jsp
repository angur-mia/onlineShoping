<%-- 
    Document   : remveCart
    Created on : Jul 26, 2016, 10:52:40 AM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

        <c:forEach var="r" items="${q3.rows}">
            <c:set var="stock" value="${r.pro_qty}"/>
        </c:forEach>  


        <c:forEach var="row" items="${q2.rows}" >

            <sql:query var="q3" dataSource="${db2}">
                select pro_price from purchase where pro_id='${row.pro_id}'
            </sql:query>

            <c:forEach var="r" items="${q3.rows}">
                <c:set var="prches" value="${r.pro_price}"/>
            </c:forEach>   

            <sql:update dataSource="${db2}" var="result">
                INSERT INTO sell(pro_id, pro_name, pur_price, sell_price, sell_qty, sell_total,profit) VALUES (?,?,?,?,?,?,?)
                <sql:param value="${row.pro_id}" />
                <sql:param value="${row.pro_name}" />
                <sql:param value="${prches}" />
                <sql:param value="${row.price}" />
                <sql:param value="${row.quantity}" />
                <sql:param value="${row.total}" />
                <sql:param value="${row.price-prches}" />

            </sql:update>
        </c:forEach>
        <c:if test="${result>=1}">
            <c:redirect url="after_payment_stock_modify.jsp" />
        </c:if>
    </body>
</html>
