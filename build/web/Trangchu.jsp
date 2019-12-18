<%-- 
    Document   : Trangchu.jsp
    Created on : Oct 8, 2019, 9:36:56 AM
    Author     : HuongHoang
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Trang chủ</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            ArrayList<Products> products
                    = (ArrayList<Products>) session.getAttribute("products");
        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="img/trangchu1.jpg" style="height: 700px" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="img/trangchu2.jpg"style="height: 700px"  class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="img/trangchu3.jpg" style="height: 700px" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="img/trangchu4.jpg" style="height: 700px" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="img/trangchu5.jpg" style="height: 700px" class="d-block w-100" alt="...">
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <div class=" container text-center mt-5">
            <div class="row">
                <div class="col-8 m-auto">
                    <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center"> Về chúng tôi</h1><br>
                    <p> Là một cửa hàng chuyên cung cấp các mặt hàng về linh kiện điện tử, linh kiện máy tính, linh kiện laptop,... nhằm đáp ứng nhu cầu sử dụng của người tiêu dùn. Chúng tôi luôn luôn đem lại những sản phẩm tốt nhất, mẫu mã đa dạng, chất lượng tốt và giá cả hợp lí với người tiêu dùng.</p>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="text-center mt-5" >
                <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center">Những sản phẩm bên chúng tôi</h1><br>
                <div class="row">
                    <% for (int j = 0; j < 4; j++) {%>                
                    <div class="col-3 mb-5">
                        <div class="card" style="height: 100%;">
                            <img src="<%=products.get(j).getProduct_image()%>" class="card-img-top" alt="...">
                            <div class="card-body">
                                <p class="card-text"><%=products.get(j).getProduct_name()%></p>
                                <%
                                    BigDecimal d = new BigDecimal(products.get(j).getProduct_price());
                                    String a = d.toPlainString();
                                    String res = "";
                                    int count = 0;
                                    for (int i = a.length() - 1; i >= 0; i--) {
                                        count++;
                                        res = a.charAt(i) + res;
                                        if (count % 3 == 0) {
                                            res = "." + res;
                                        }
                                    }
                                    if (res.startsWith(".")) {
                                        res = res.substring(1);
                                    }

                                %>
                                <p id="gia"><%=res%> đ</p>
                            </div>
                            <div class="card-footer" style="background-color: white" align="center">
                                <form action="<%=session.getAttribute("username") != null ? "ShoppingCartController" : "Dangnhap.jsp"%>" method="post">
                                    <input type="hidden" name="product_id" value="<%=products.get(j).getProduct_id()%>" />
                                    <input type="submit" class="btn btn-outline-dark" value="Thêm vào giỏ hàng"  />
                                </form>
                                <a href="Chitietsanpham.jsp?product_id=<%=products.get(j).getProduct_id()%>" style="padding:5px 8px" class="btn btn-outline-dark mt-3">Chi tiết sản phẩm</a>
                            </div>
                        </div>
                    </div> 
                    <%}%> 
                </div>
            </div>
        </div>
        <div class=" container text-center mt-5" >
            <div class="row">
                <div class="col-8 m-auto">
                    <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center">Tin tức</h1><br>
                    <div class="container">
                        <div class="card-deck">
                            <div class="card col-12 col-md-6 col-lg-4 spzero mb-5">
                                <img src="img/TinTuc1.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <p class="card-text">Intel ra mắt bộ vi xử lý Core X-series thế hệ thứ 10, model mạnh nhất với 18 nhân có giá dưới 1.000 USD, cú đấm trả đòn vào AMD</p>
                                </div>
                                <div class="card-footer m-auto" style="background-color: white">
                                    <a href="http://genk.vn/intel-ra-mat-bo-vi-xu-ly-core-x-series-the-he-thu-10-model-manh-nhat-voi-18-nhan-co-gia-duoi-1000-usd-20191002102541311.chn" class="btn btn-outline-dark">Xem thêm</a>
                                </div>
                            </div>
                            <div class="card col-12 col-md-6 col-lg-4 spzero mb-5">
                                <img src="img/TinTuc2.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <p class="card-text">AMD ra mắt dòng chip xử lý Ryzen PRO 3000 Series và Athlon PRO, tích hợp Radeon Vega</p>
                                </div>
                                <div class="card-footer m-auto" style="background-color: white">
                                    <a href="http://genk.vn/amd-ra-mat-dong-chip-xu-ly-ryzen-pro-3000-series-va-athlon-pro-tich-hop-radeon-vega-20191001111140483.chn" class="btn btn-outline-dark">Xem thêm</a>
                                </div>
                            </div>
                            <div class="card col-12 col-md-6 col-lg-4 spzero mb-5">
                                <img src="img/TinTuc3.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <p class="card-text">Razer Blade Pro 17 nâng cấp với màn hình 4K, tần số quét 120 Hz</p>
                                </div>
                                <div class="card-footer m-auto" style="background-color: white">
                                    <a href="http://genk.vn/razer-blade-pro-17-nang-cap-voi-man-hinh-4k-tan-so-quet-120-hz-20190925034644061.chn" class="btn btn-outline-dark">Xem thêm</a>
                                </div>
                            </div>      
                        </div>
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
