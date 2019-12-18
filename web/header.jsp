<%-- 
    Document   : header
    Created on : Oct 23, 2019, 4:53:20 PM
    Author     : HuongHoang
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Customers"%>
<%@page import="dal.CustomerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    CustomerDAO customerDAO = new CustomerDAO();
    ArrayList<Customers> cus = customerDAO.showInformationCustomerByUserName((String) session.getAttribute("username"));
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="Homepage" style="font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;">Harley</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="Homepage">Trang chủ <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Gioithieu.jsp">Giới thiệu</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ProductListController">Sản phẩm</a>
                </li>
                <% if (session.getAttribute("username") == null) {%>
                <li class="nav-item">
                    <a href="Login" class="nav-link">Đăng Nhập</a>
                </li>
                <li class="nav-item">
                    <a href="Registration" class="nav-link">Đăng Ký</a> 
                </li>
                <%}%>
                <% if (session.getAttribute("username") != null) {%>
                <li class="nav-item">
                    <div class="btn-group">
                        <button type="button" class="btn btn-dark dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <%=(session.getAttribute("username")) != null ? session.getAttribute("username") : ""%>
                        </button>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="ChangeInformationController">Chỉnh sửa tài khoản</a>
                            <a class="dropdown-item" href="HistoryCart">Đơn hàng đã mua</a>
                            <%
                                if (cus.get(0).getController_id() == 1) {
                            %>
                            <a class="dropdown-item" href="AdminController">Admin</a>
                            <%}%>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="Logout?command=logout">Đăng xuất</a>                          
                        </div>
                    </div>
                </li>
                <li class="nav-item">
                    <a href="ShoppingCartController" class="fas fa-cart-plus" style="font-size: 22px;margin-top: 10px;padding: 0 10px;color: black;text-decoration: none;"></a>
                </li>
                <%}%>
            </ul>
        </div>
    </div>
</nav>
