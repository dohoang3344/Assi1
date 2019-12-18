<%-- 
    Document   : Cart
    Created on : Oct 30, 2019, 5:54:31 PM
    Author     : HuongHoang
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Orders"%>
<%@page import="model.Customers"%>
<%@page import="model.OrderLine"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            String name = "", email = "", address = "", phone = "", quantity = "";
            name = (String) request.getAttribute("name");
            email = (String) request.getAttribute("email");
            address = (String) request.getAttribute("address");
            phone = (String) request.getAttribute("phone");
            quantity = (String) request.getAttribute("quantity");
        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <h2 align="center">Cảm ơn vì bạn đã lựa chọn sản phẩm ở bên tôi</h2>
        <h3 align="center">Thông tin người đặt : <%=name %></h3>
        <h3 align="center">Địa chỉ nhận hàng : <%=address %></h3>
        <h3 align="center">Email người nhận hàng : <%=email %></h3>
        <h3 align="center">Số điện thoại nhận hàng : <%=phone %></h3>
        <a  href="Homepage" >Quay về trang chủ</a>        
        <p></p>
        <a href="ProductListController">Tiếp tục mua sắm</a>
        <%@ include file="footer.jsp"%>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="scrip.js"></script>
    </body>
</html>
