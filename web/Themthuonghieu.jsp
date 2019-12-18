<%-- 
    Document   : Thongtintaikhoan
    Created on : Oct 29, 2019, 8:27:04 AM
    Author     : HuongHoang
--%>

<%@page import="model.Brands"%>
<%@page import="model.Categories"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <title>Thêm thương hiệu</title>
        <%
            String brand_name_err = "";
            String brand_name = "";
            if (request.getAttribute("brand_name_err") != null) {
                brand_name_err = (String) request.getAttribute("brand_name_err");
            }
            if (request.getAttribute("brand_name_err") != null) {
                brand_name = (String) request.getAttribute("brand_name");
            }
        %>

    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div class=" container">
            <div class="row">
                <div class="col-8 m-auto">
                    <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center"> Thêm thương hiệu</h1><br>
                    <div class="row" style="">
                        <form class="login-form m-auto"  action="AddBrand" method="post">
                            <div class="form-group">
                                <%if (brand_name == null) {
                                        brand_name = "";
                                    }%>
                                <label class="text-uppercase">Tên thương hiệu</label>
                                <input type="text" required placeholder="Nhập tên thương hiệu" class="form-control" name="brand_name" value="<%=brand_name%>">
                                <p style="color:red"><%=brand_name_err%></p>
                            </div>   
                            <div class="form-check " style="margin-right: 60px;margin-top:20px" >
                                <button type="submit" class="btn btn-outline-dark float-right">Thêm thương hiệu</button>
                            </div>
                        </form>
                    </div>
                    <form action="AdminController" method="post">
                        <input type="submit" class="btn btn-outline-dark float-right" value="Quay về Admin"/>
                    </form>
                </div>
            </div>
        </div>
        <%@ include file="footer.jsp"%>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="scrip.js"></script>

    </body>
</html>
