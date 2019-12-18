<%-- 
    Document   : footer
    Created on : Oct 23, 2019, 4:54:11 PM
    Author     : HuongHoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="container-fluid" style="margin-top: 100px">
    <div class="row" style="background-color: black;color: white" >
        <div class="card col-e2 col-md-6 col-lg-3 spzero mb-5" style="background-color: black;color: white">
            <div >
                <a class="navbar-brand" href="Homepage" style="font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;">Harley</a>
                <p >Địa chỉ : Đại học FPT,Km29,Đại lộ Thăng Long,Khu công nghệ cao Hoà Lạc</p>
                <p >Sđt : 0988888888</p>
                <p >Email : ShopRamus@gmail.com</p>
                <a href="https://www.facebook.com/profile.php?id=100014495745790"><i class="fab fa-facebook"></i></a>
                <a href="https://twitter.com/hoang_doduc_3" ><i class="fab fa-twitter"></i></a>
                <a href="https://www.instagram.com/hoang.doduc/" ><i class="fab fa-instagram"></i></a>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3 spzero mb-5" style="padding-top: 50px ">
            <div class=>
                <h3 class="card-text">Liên kết nhanh</h3>
                <a href="Trangchu.jsp" class="Trangchu">Trang chủ</a><br>
                <a href="ProductListController" class="sanpham">Sản phẩm</a><br>
                <a href="http://genk.vn/do-choi-so.chn" class="tintuc">Tin tức</a>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3 spzero mb-5" style="padding-top: 50px ">
            <div class=>
                <h3 class="card-text">Thông tin</h3><br>
                <p  class="bando">Bản đồ</p>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.482570608979!2d105.52510551489026!3d21.01336868600672!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313454b32ca5086d%3A0xa3c62e29d8ab37e4!2sFPT%20University!5e0!3m2!1sen!2s!4v1570458999036!5m2!1sen!2s"  frameborder="0" style="border:0;" allowfullscreen=""></iframe>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3 spzero mb-5" style="padding-top: 50px ">
            <div class=>
                <h3 class="card-text">Bản tin</h3>
                <% if (session.getAttribute("username") == null) {%>
                <a href="Dangnhap.jsp">Đăng nhập</a>
                <p >Đăng kí để nhận ưu đãi</p>
                <a href="Dangky.jsp">Đăng ký</a>
                <%}else{%>
                <p>Welcome <%=session.getAttribute("username") %></p>
                <%}%>
            </div>
        </div>
    </div>
</div>
