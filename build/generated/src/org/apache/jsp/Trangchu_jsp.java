package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Trangchu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Trang chủ</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dancing+Script&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"fontawesome-free-5.11.2-web/css/all.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"Trangchu.html\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Ramus</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"Trangchu.jsp\">Trang chủ <span class=\"sr-only\">(current)</span></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Gioithieu.jsp\">Giới thiệu</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"ProductListController\">Sản phẩm</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"http://genk.vn/do-choi-so.chn\">Tin tức</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Liên hệ</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"Login?command=logout\">");
      out.print((session.getAttribute("username"))!=null?session.getAttribute("username"):"");
      out.write("</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a href=\"#\" class=\"fas fa-cart-plus\" style=\"font-size: 22px;margin-top: 10px;padding: 0 10px;color: black;text-decoration: none;\"></a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\r\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("            <ol class=\"carousel-indicators\">\r\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("                <div class=\"carousel-item active\">\r\n");
      out.write("                    <img src=\"img/trangchu1.jpg\" style=\"height: 700px\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img src=\"img/trangchu2.jpg\"style=\"height: 700px\"  class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img src=\"img/trangchu3.jpg\" style=\"height: 700px\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img src=\"img/trangchu4.jpg\" style=\"height: 700px\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img src=\"img/trangchu5.jpg\" style=\"height: 700px\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"sr-only\">Previous</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"sr-only\">Next</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" container text-center mt-5\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-8 m-auto\">\r\n");
      out.write("                    <h1 class=\"mt-5\"style=\"font-style: italic;font-family: 'Dancing Script', cursive;\" align=\"center\"> Về chúng tôi</h1><br>\r\n");
      out.write("                    <p> Là một cửa hàng chuyên cung cấp các mặt hàng về linh kiện điện tử, linh kiện máy tính, linh kiện laptop,... nhằm đáp ứng nhu cầu sử dụng của người tiêu dùn. Chúng tôi luôn luôn đem lại những sản phẩm tốt nhất, mẫu mã đa dạng, chất lượng tốt và giá cả hợp lí với người tiêu dùng.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"text-center mt-5\" >\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-8 m-auto\">\r\n");
      out.write("                    <h1 class=\"mt-5\"style=\"font-style: italic;font-family: 'Dancing Script', cursive;\" align=\"center\">Sản phẩm nổi bật</h1><br>\r\n");
      out.write("                    <div >\r\n");
      out.write("                        <div class=\"card-deck\">\r\n");
      out.write("                            <div class=\"card col-12 col-md-6 col-lg-3 spzero mb-5\">\r\n");
      out.write("                                <img src=\"img/Hang1.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">PC Asus ROG Strix GL10CS-VN005T i5-9400 / 8GB DDR4 / 1TB / RTX 2060 / Win 10</p>\r\n");
      out.write("                                    <p id=\"gia\">23.989.000 đ</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer m-auto\" style=\"background-color: white\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-outline-dark\">Mua ngay</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card col-12 col-md-6 col-lg-3 spzero mb-5\">\r\n");
      out.write("                                <img src=\"img/Hang2.jpeg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Laptop MSI Gaming GF63 Thin 8SC 022VN model mới nhất/ Win 10</p>\r\n");
      out.write("                                    <p id=\"gia\">25.499.000 đ</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer m-auto\" style=\"background-color: white\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-outline-dark\">Mua ngay</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card col-12 col-md-6 col-lg-3 spzero mb-5\">\r\n");
      out.write("                                <img src=\"img/Hang3.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                                <div class=\"card-body m-auto\">\r\n");
      out.write("                                    <p class=\"card-text\">Vga Card Gigabyte GTX 1660 OC - 6GD</p>\r\n");
      out.write("                                    <p id=\"gia\">6.399.000 đ</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer m-auto\" style=\"background-color: white\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-outline-dark\">Mua ngay</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card col-12 col-md-6 col-lg-3 spzero mb-5\">\r\n");
      out.write("                                <img src=\"img/Hang4.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Mainboard Asus TUF GAMING X570-PLUS</p>\r\n");
      out.write("                                    <p id=\"gia\">5.859.000 đ</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer m-auto\" style=\"background-color: white\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-outline-dark\">Mua ngay</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>        \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"Sanpham.jsp\" class=\"btn btn-primary allproduct\" style=\"border-color: green;background-color: white;color: green;\">Tất cả sản phẩm</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" container text-center mt-5\" >\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-8 m-auto\">\r\n");
      out.write("                    <h1 class=\"mt-5\"style=\"font-style: italic;font-family: 'Dancing Script', cursive;\" align=\"center\">Tin tức</h1><br>\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"card-deck\">\r\n");
      out.write("                            <div class=\"card col-12 col-md-6 col-lg-4 spzero mb-5\">\r\n");
      out.write("                                <img src=\"img/TinTuc1.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Intel ra mắt bộ vi xử lý Core X-series thế hệ thứ 10, model mạnh nhất với 18 nhân có giá dưới 1.000 USD, cú đấm trả đòn vào AMD</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer m-auto\" style=\"background-color: white\">\r\n");
      out.write("                                    <a href=\"http://genk.vn/intel-ra-mat-bo-vi-xu-ly-core-x-series-the-he-thu-10-model-manh-nhat-voi-18-nhan-co-gia-duoi-1000-usd-20191002102541311.chn\" class=\"btn btn-outline-dark\">Xem thêm</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card col-12 col-md-6 col-lg-4 spzero mb-5\">\r\n");
      out.write("                                <img src=\"img/TinTuc2.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">AMD ra mắt dòng chip xử lý Ryzen PRO 3000 Series và Athlon PRO, tích hợp Radeon Vega</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer m-auto\" style=\"background-color: white\">\r\n");
      out.write("                                    <a href=\"http://genk.vn/amd-ra-mat-dong-chip-xu-ly-ryzen-pro-3000-series-va-athlon-pro-tich-hop-radeon-vega-20191001111140483.chn\" class=\"btn btn-outline-dark\">Xem thêm</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card col-12 col-md-6 col-lg-4 spzero mb-5\">\r\n");
      out.write("                                <img src=\"img/TinTuc3.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Razer Blade Pro 17 nâng cấp với màn hình 4K, tần số quét 120 Hz</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer m-auto\" style=\"background-color: white\">\r\n");
      out.write("                                    <a href=\"http://genk.vn/razer-blade-pro-17-nang-cap-voi-man-hinh-4k-tan-so-quet-120-hz-20190925034644061.chn\" class=\"btn btn-outline-dark\">Xem thêm</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>      \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 100px\">\n");
      out.write("    <div class=\"row\" style=\"background-color: black;color: white\" >\n");
      out.write("        <div class=\"card col-e2 col-md-6 col-lg-3 spzero mb-5\" style=\"background-color: black;color: white\">\n");
      out.write("            <div >\n");
      out.write("                <a class=\"navbar-brand\" href=\"Trangchu.jsp\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Ramus</a>\n");
      out.write("                <p >Địa chỉ : Đại học FPT,Km29,Đại lộ Thăng Long,Khu công nghệ cao Hoà Lạc</p>\n");
      out.write("                <p >Sđt : 0988888888</p>\n");
      out.write("                <p >Email : ShopRamus@gmail.com</p>\n");
      out.write("                <a href=\"https://www.facebook.com/profile.php?id=100014495745790\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("                <a href=\"https://twitter.com/hoang_doduc_3\" ><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                <a href=\"https://www.instagram.com/hoang.doduc/\" ><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("            <div class=>\n");
      out.write("                <h3 class=\"card-text\">Liên kết nhanh</h3>\n");
      out.write("                <a href=\"Trangchu.jsp\" class=\"Trangchu\">Trang chủ</a><br>\n");
      out.write("                <a href=\"ProductListController\" class=\"sanpham\">Sản phẩm</a><br>\n");
      out.write("                <a href=\"http://genk.vn/do-choi-so.chn\" class=\"tintuc\">Tin tức</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("            <div class=>\n");
      out.write("                <h3 class=\"card-text\">Thông tin</h3><br>\n");
      out.write("                <p  class=\"bando\">Bản đồ</p>\n");
      out.write("                <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.482570608979!2d105.52510551489026!3d21.01336868600672!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313454b32ca5086d%3A0xa3c62e29d8ab37e4!2sFPT%20University!5e0!3m2!1sen!2s!4v1570458999036!5m2!1sen!2s\"  frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("            <div class=>\n");
      out.write("                <h3 class=\"card-text\">Bản tin</h3>\n");
      out.write("                <a href=\"Dangnhap.jsp\">Đăng nhập</a>\n");
      out.write("                <p >Đăng kí để nhận ưu đãi</p>\n");
      out.write("                <a href=\"Dangky.jsp\">Đăng ký</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"scrip.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
