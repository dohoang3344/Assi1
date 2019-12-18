<%-- 
    Document   : Dangnhap
    Created on : Oct 8, 2019, 9:57:55 AM
    Author     : HuongHoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Đăng nhập</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            String err = "";
            if (request.getAttribute("err") != null) {
                err = (String) request.getAttribute("err");
            }
        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div class=" container">
            <div class="row">
                <div class="col-8 m-auto">
                    <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center"> Đăng Nhập</h1><br>
                    <div class="row" style="">
                        <form class="login-form m-auto" action="Login" method="post">
                            <div class="form-group">
                                <label for="exampleInputUser" class="text-uppercase">Tài khoản</label>
                                <input type="text" placeholder="Nhập tài khoản" class="form-control" name="username" >
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1" class="text-uppercase">Mật khẩu</label>
                                <input type="password"placeholder="Nhập mật khẩu" class="form-control"  name="password">
                            </div>
                            <p style="color:red"><%=err%></p>
                            <div class="form-check m-auto">
                                <input type="checkbox" name="remember" value="remember" class="form-check-input"> Ghi nhớ tài khoản
                            </div>
                            <input type="submit" class="btn btn-outline-dark float-right" value="Đăng nhập"/>
                            <div style="margin-top: 30px;width: 200px" >
                                <a href="Dangky.jsp">Đăng ký tài khoản </a> 
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
