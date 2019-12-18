<%-- 
    Document   : Dangky
    Created on : Oct 8, 2019, 9:56:26 AM
    Author     : HuongHoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Đăng Ký</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            String username_err = "", password_err = "", name_err = "", email_err = "", address_err = "", phone_err = "", gender_err = "";
            if (request.getAttribute("username_err") != null) {
                username_err = (String) request.getAttribute("username_err");
            }
            if (request.getAttribute("password_err") != null) {
                password_err = (String) request.getAttribute("password_err");
            }
            if (request.getAttribute("name_err") != null) {
                name_err = (String) request.getAttribute("name_err");
            }
            if (request.getAttribute("email_err") != null) {
                email_err = (String) request.getAttribute("email_err");
            }
            if (request.getAttribute("address_err") != null) {
                address_err = (String) request.getAttribute("address_err");
            }
            if (request.getAttribute("phone_err") != null) {
                phone_err = (String) request.getAttribute("phone_err");
            }
            String username = "", password = "", name = "", email = "", address = "", phone = "", gender = "";
            if (request.getAttribute("username_err") != null) {
                username = (String) request.getAttribute("username");
            }
            if (request.getAttribute("password_err") != null) {
                password = (String) request.getAttribute("password");
            }
            if (request.getAttribute("name_err") != null) {
                name = (String) request.getAttribute("name");
            }
            if (request.getAttribute("email_err") != null) {
                email = (String) request.getAttribute("email");
            }
            if (request.getAttribute("address_err") != null) {
                address = (String) request.getAttribute("address");
            }
            if (request.getAttribute("phone_err") != null) {
                phone = (String) request.getAttribute("phone");
            }
        %>
    </head>
    <body>
         <%@ include file="header.jsp"%>
        <div class=" container">
            <div class="row">
                <div class="col-8 m-auto">
                    <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center"> Đăng Ký</h1><br>
                    <div class="row" style="">
                        <form class="login-form m-auto"  action="Registration" method="post">
                            <div class="form-group">
                                <label class="text-uppercase">Tài khoản</label>
                                <input type="text" placeholder="Nhập tài khoản" class="form-control" name="username" value="<%=username%>">
                                <p style="color:red"><%=username_err%></p>
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Mật khẩu</label>
                                <input type="password" placeholder="Nhập mật khẩu" class="form-control" name="password" value="<%=password%>">
                                <p style="color:red"><%=password_err%></p>
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Họ và Tên</label>
                                <input type="text" class="form-control" placeholder="Tên của bạn"  name="name" value="<%=name%>">
                                <p style="color:red"><%=name_err%></p>
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Email</label>
                                <input type="email" class="form-control" placeholder="Email của bạn" name="email" value="<%=email%>">
                                <p style="color:red"><%=email_err%></p>
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Địa chỉ</label>
                                <input type="text" class="form-control" placeholder="Địa chỉ của bạn" name="address" value="<%=address%>">
                                <p style="color:red"><%=address_err%></p>
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Số điện thoại</label>
                                <input type="text" class="form-control" placeholder="Sđt của bạn" name="phone" value="<%=phone%>">
                                <p style="color:red"><%=phone_err%></p>
                            </div>
                            <div class="form-check " style="margin-right: 60px;margin-top:20px" >
                                <button type="submit" class="btn btn-outline-dark float-right">Đăng ký</button>
                            </div>
                        </form>
                    </div>
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
