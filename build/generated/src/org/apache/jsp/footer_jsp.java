package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <div class=\"container-fluid\" style=\"margin-top: 100px\">\n");
      out.write("    <div class=\"row\" style=\"background-color: black;color: white\" >\n");
      out.write("      <div class=\"card col-e2 col-md-6 col-lg-3 spzero mb-5\" style=\"background-color: black;color: white\">\n");
      out.write("        <div >\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Ramus</a>\n");
      out.write("          <p >Địa chỉ : Đại học FPT,Km29,Đại lộ Thăng Long,Khu công nghệ cao Hoà Lạc</p>\n");
      out.write("          <p >Sđt : 0988888888</p>\n");
      out.write("          <p >Email : ShopRamus@gmail.com</p>\n");
      out.write("          <a href=\"\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("          <a href=\"\" ><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("          <a href=\"#\" ><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("        <div class=>\n");
      out.write("          <h3 class=\"card-text\">Liên kết nhanh</h3>\n");
      out.write("          <a href=\"Trangchu.jsp\" class=\"Trangchu\">Trang chủ</a><br>\n");
      out.write("          <a href=\"ProductListController\" class=\"sanpham\">Sản phẩm</a><br>\n");
      out.write("          <a href=\"http://genk.vn/do-choi-so.chn\" class=\"tintuc\">Tin tức</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("        <div class=>\n");
      out.write("          <h3 class=\"card-text\">Thông tin</h3><br>\n");
      out.write("          <p  class=\"bando\">Bản đồ</p>\n");
      out.write("          <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.482570608979!2d105.52510551489026!3d21.01336868600672!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313454b32ca5086d%3A0xa3c62e29d8ab37e4!2sFPT%20University!5e0!3m2!1sen!2s!4v1570458999036!5m2!1sen!2s\"  frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("        <div class=>\n");
      out.write("          <h3 class=\"card-text\">Bản tin</h3>\n");
      out.write("          <a href=\"Dangnhap.jsp\">Đăng nhập</a>\n");
      out.write("          <p >Đăng kí để nhận ưu đãi</p>\n");
      out.write("          <a href=\"Dangky.jsp\">Đăng ký</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
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
