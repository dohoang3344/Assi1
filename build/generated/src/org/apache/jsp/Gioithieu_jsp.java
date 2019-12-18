package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Gioithieu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Giới thiệu</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dancing+Script&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"Trangchu.jsp\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Ramus</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Trangchu.jsp\">Trang chủ <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Gioithieu.jsp\">Giới thiệu</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Sanpham.jsp\">Sản phẩm</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"http://genk.vn/do-choi-so.chn\">Tin tức</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Liên hệ</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div align=\"center\" style=\"margin-top: 100px\">\n");
      out.write("            <h1>Giới thiệu về Shop Ramus</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\" container text-center mt-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-8 m-auto\">\n");
      out.write("                    <h1 class=\"mt-5\"style=\"font-style: italic;font-family: 'Dancing Script', cursive;\" align=\"center\"> Về chúng tôi</h1><br>\n");
      out.write("                    <p> Là một cửa hàng chuyên cung cấp các mặt hàng về linh kiện điện tử, linh kiện máy tính, linh kiện laptop,... nhằm đáp ứng nhu cầu sử dụng của người tiêu dùn. Chúng tôi luôn luôn đem lại những sản phẩm tốt nhất, mẫu mã đa dạng, chất lượng tốt và giá cả hợp lí với người tiêu dùng.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mt-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-8 m-auto\">\n");
      out.write("                    <h1 class=\"mt-5\" align=\"left\"> </h1><br>\n");
      out.write("                    <h3>1. GIỚI THIỆU CHUNG</h3>\n");
      out.write("                    -Shop Ramus được thành lập ngày 29/9/2019. Sau hơn những ngày thán hoạt động, hiện nay quy mô shop đã phát triển lớn mạnh với trung tâm phân phối, trung tâm dự án và siêu thị bán lẻ máy tính tại Hà Nội.</br>\n");
      out.write("                    </br>\n");
      out.write("                    Trong suốt những năm hoạt động, Ramus luôn là một trong những shop được rất nhiều bạn trẻ lựa chọn trong lĩnh vực công nghệ thông tin. Shop luôn có phương châm “Lấy chữ tín làm thước đo sự tồn tại và phát triển của Shop”.</br>\n");
      out.write("                    </br>\n");
      out.write("                    -Ramus tham gia phân phối, đại lý chính thức các hãng nổi tiếng : Intel, Samsung, Acbel, LG, Canon, HP, Dell, Epson, Lenovo, Acer, Zotac, Kingston, Kingmax, Gigabyte, ASUS, Creative, Draytek, Totolink, Seagate, WD, Cisco, Ubiquiti, Huntkey, Dintel, Voltek ...</br>\n");
      out.write("                    </br>\n");
      out.write("                    -Shop có tính chuyên nghiệp cao trong kinh doanh và dịch vụ, những chính sách ưu đãi hấp dẫn, giao nhận đảm bảo khách hàng được sử dụng sản phẩm tốt nhất, phù hợp với nhu cầu nhất, đồng thời nhận được sự hỗ trợ kịp thời nhất & chuyên nghiệp nhất. Do đó, Ramus luôn nhận được sự tin tưởng từ khách hàng trong nước cũng như nước ngoài.\n");
      out.write("                    </br>\n");
      out.write("                    <h3>2. TẦM NHÌN</h3>\n");
      out.write("                    - Mục tiêu trở thành Shop bán máy tính có quy mô, chuyên nghiệp và trải rộng khắp các miền, đem đến sự tiện lợi cho khách hàng.\n");
      out.write("                    </br></br>\n");
      out.write("                    - Xây dựng Ramus trở thành một môi trường làm việc chuyên nghiệp nơi mà mọi cá nhân phát huy tối đa sức sáng tạo, năng lực của bản thân.\n");
      out.write("                    </br></br>\n");
      out.write("                    - Xây dựng Ramus trở thành ngôi nhà chung cho mọi cán bộ nhân viên cùng nhau phát triên, chia sẻ quyền lợi, trách nhiệm và nghĩa vụ công bằng, minh bạch nhất.\n");
      out.write("                    </br>\n");
      out.write("                    <h3>3. TRIẾT LÝ</h3>\n");
      out.write("                    - Thấu hiểu: Mỗi khách hàng là một con người – một cá thể riêng biệt, cần được tôn trọng, quan tâm và lắng nghe, thấu hiểu và phục vụ một cách riêng biệt. Ramus sẽ là nơi hiểu được nhu cầu của khách hàng hơn bất kỳ shop nào khác.\n");
      out.write("                    </br></br>\n");
      out.write("                    - Tập trung:Mỗi nhân viên cần làm tốt những việc đã đề ra, tập trung giải quyết chia sẻ những vấn đề khó khăn, vướng mắc.\n");
      out.write("                    </br></br>\n");
      out.write("                    - Áp đặt: Ramus có những quy định phải chấp hành, thực hiện đúng để hướng tới sự chuyên nghiệp, hướng tới toàn cầu hóa.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\" style=\"margin-top: 100px\" >\n");
      out.write("            <div class=\"row\" style=\"background-color: black;color: white\" >\n");
      out.write("                <div class=\"card col-e2 col-md-6 col-lg-3 spzero mb-5\" style=\"background-color: black;color: white\">\n");
      out.write("                    <div >\n");
      out.write("                        <a class=\"navbar-brand\" href=\"Trangchu.jsp\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Ramus</a>\n");
      out.write("                        <p >Địa chỉ : Đại học FPT,Km29,Đại lộ Thăng Long,Khu công nghệ cao Hoà Lạc</p>\n");
      out.write("                        <p >Sđt : 0988888888</p>\n");
      out.write("                        <p >Email : ShopRamus@gmail.com</p>\n");
      out.write("                        <a href=\"\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"\" ><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\" ><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("                    <div class=>\n");
      out.write("                        <h3 class=\"card-text\">Liên kết nhanh</h3>\n");
      out.write("                        <a href=\"Trangchu.jsp\" class=\"Trangchu\">Trang chủ</a><br>\n");
      out.write("                        <a href=\"Sanpham.jsp\" class=\"sanpham\">Sản phẩm</a><br>\n");
      out.write("                        <a href=\"http://genk.vn/do-choi-so.chn\" class=\"tintuc\">Tin tức</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("                    <div class=>\n");
      out.write("                        <h3 class=\"card-text\">Thông tin</h3><br>\n");
      out.write("                        <p  class=\"bando\">Bản đồ</p>\n");
      out.write("                        <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.482570608979!2d105.52510551489026!3d21.01336868600672!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313454b32ca5086d%3A0xa3c62e29d8ab37e4!2sFPT%20University!5e0!3m2!1sen!2s!4v1570458999036!5m2!1sen!2s\"  frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("                    <div class=>\n");
      out.write("                        <h3 class=\"card-text\">Bản tin</h3>\n");
      out.write("                        <button name=\"dangnhap\">Đăng nhập</button>\n");
      out.write("                        <p >Đăng kí để nhận ưu đãi</p>\n");
      out.write("                        <button name=\"dangki\">Đăng kí</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"scrip.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
