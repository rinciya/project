package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ngo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ngo Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("      <body>\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("                    <h1>Ngo</h1>>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h2><form action=\"/bbbp/AppDonation.do\"method=\"post\">\n");
      out.write("    <input type=\"hidden\" value=\"");
      out.print(request.getAttribute("email"));
      out.write("\" name=\"email\"/>\n");
      out.write("    <input type=\"submit\" value=\"click here for donation details\"/>\n");
      out.write("</form></h2>\n");
      out.write("    <a href=\"\" class=\"figure\"><img src=\"/bbbp/images/doctors.jpg\" alt=\"Image\"></a>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\tThe donation provivded can help the needy girls .Check the net balance available in the account.\n");
      out.write("                                                <form action=\"/bbbp/AmountServlet.do\"method=\"post\">\n");
      out.write("    <input type=\"hidden\" value=\"");
      out.print(request.getAttribute("email"));
      out.write("\" name=\"email\"/>\n");
      out.write("    <input type=\"submit\" value=\"click here for balance\"/>\n");
      out.write("</form>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<h2><a href=\"/bbbp/JSP/addcampaign.jsp\">add campaign</a></h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tAdd the recent campaign so that the volunteers can view it and register for the event.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<h2><a href=\"/bbbp/JSP/ngogirl.jsp\">add girls</a></h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tYou can replace all this text with your own text. You can remove any link to our website from this website template, you&#39;re free to use this website template without linking back to us.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<h2><form action=\"/bbbp/AppCampServlet.do\"method=\"post\">\n");
      out.write("    <input type=\"hidden\" value=\"");
      out.print(request.getAttribute("email"));
      out.write("\" name=\"email\"/>\n");
      out.write("    <input type=\"submit\" value=\"click here for participation \"/>\n");
      out.write("</form></h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tCheck the list of volunteers registered for the event.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("    <h2><form action=\"/bbbp/ParentServlet.do\"method=\"post\">\n");
      out.write("    <input type=\"hidden\" value=\"");
      out.print(request.getAttribute("email"));
      out.write("\" name=\"email\"/>\n");
      out.write("    <input type=\"submit\" value=\"click here for adoption details\"/>\n");
      out.write("</form></</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tcheck the list of users applied for a girl adoption.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"sidebar\">\n");
      out.write("\t\t\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
