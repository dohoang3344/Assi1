<%-- 
    Document   : Thongtintaikhoan
    Created on : Oct 29, 2019, 8:27:04 AM
    Author     : HuongHoang
--%>

<%@page import="model.Customers"%>
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
        <title>Thông tin tài khoản</title>
        <%

            String username = (String)session.getAttribute("username");
            ArrayList<Customers> cus = (ArrayList<Customers>) request.getAttribute("cus");
        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div class=" container">
            <div class="row">
                <div class="col-8 m-auto">
                    <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center"> Thông tin tài khoản</h1><br>
                    <div class="row" style="">
                        <form class="login-form m-auto"  action="Chinhsuataikhoan.jsp" method="post">
                            <%for (Customers c : cus) {%>
                            <div class="form-group">
                                <label class="text-uppercase">Tài khoản</label>
                                <input type="text" placeholder="Nhập tài khoản" readonly class="form-control" name="username" value="<%=session.getAttribute("username")%>">
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Mật khẩu</label>
                                <input type="text" required readonly placeholder="Nhập mật khẩu" class="form-control" name="password" value="<%=c.getPassword()%>">
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Họ và Tên</label>
                                <input type="text" required readonly class="form-control" placeholder="Tên của bạn"  name="name" value="<%=c.getName()%>">
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Email</label>
                                <input type="email" required readonly class="form-control" placeholder="Email của bạn" name="email" value="<%=c.getEmail()%>">
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Địa chỉ</label>
                                <input type="text" required readonly class="form-control" placeholder="Địa chỉ của bạn" name="address" value="<%=c.getAddress()%>">
                            </div>
                            <div class="form-group">
                                <label class="text-uppercase">Số điện thoại</label>
                                <input type="text" required readonly class="form-control" placeholder="Sđt của bạn" name="phone" value="<%=c.getPhone()%>">
                            </div>
                            <%}%>
                            <div class="form-check " style="margin-right: 60px;margin-top:20px" >
                                <button type="submit" class="btn btn-outline-dark float-right">Chỉnh sửa</button>
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
