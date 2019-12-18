<%-- 
    Document   : Cart
    Created on : Oct 30, 2019, 5:54:31 PM
    Author     : HuongHoang
--%>

<%@page import="dal.ProductDAO"%>
<%@page import="model.Products"%>
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
        <title>Thanh toán</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            Orders order = (Orders) session.getAttribute("Cart");
            ArrayList<Customers> customers = (ArrayList<Customers>) session.getAttribute("customers");
            
            String customer_id = (String) request.getAttribute("customer_id");
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
        <div class="container">
            <form action="OrderInsertController" method="post">
                    <div class="table-responsive mb-5 text-center col-4">
                        <div class="login-form m-auto" >
                            <div class="form-group">        
                                <div class="form-group">
                                    <input type="hidden" required class="form-control"  name="customer_id" value="<%=customers.get(0).getCustomer_id()%>">
                                </div>
                                <div class="form-group">
                                    <label class="text-uppercase">Họ và Tên</label>
                                    <input type="text" required class="form-control" placeholder="Tên của bạn"  name="name" value="<%=customers.get(0).getName()%>">
                                </div>
                                <div class="form-group">
                                    <label class="text-uppercase">Email</label>
                                    <input type="email" class="form-control" placeholder="Email của bạn" name="email" value="<%=customers.get(0).getEmail()%>">
                                </div>
                                <div class="form-group">
                                    <label class="text-uppercase">Địa chỉ</label>
                                    <input type="text" class="form-control" placeholder="Địa chỉ của bạn" name="address" value="<%=customers.get(0).getAddress()%>">
                                </div>
                                <div class="form-group">
                                    <label class="text-uppercase">Số điện thoại</label>
                                    <input type="text" class="form-control" placeholder="Sđt của bạn" name="phone" value="<%=customers.get(0).getPhone()%>">
                                </div>
                                <p>(*)Sửa thông tin và nơi nhận hàng lại nếu cần</p>
                                <p>(*)Thanh toán khi nhận hàng</p>
                            </div>
                        </div>
                    </div>                   
                    <div class="form-check " style="margin-right: 60px;margin-top:20px" >
                        <button type="submit" class="btn btn-outline-dark float-right">Thanh toán</button>
                    </div>
            </form>
        </div>
        <%@ include file="footer.jsp"%>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="scrip.js"></script>
    </body>
</html>
