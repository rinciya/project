package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ngoregform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/JSP/header.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("tr.spaceunder > td\n");
      out.write("{\n");
      out.write("  padding-bottom: 1em;\n");
      out.write("}\n");
      out.write(".div1 {\n");
      out.write(" border-radius: 25px;\n");
      out.write("background-color:#FFFFCC;\n");
      out.write(" width: 800px;\n");
      out.write("    margin: auto; \n");
      out.write("    height: 850px;\n");
      out.write("    padding: 50px;\n");
      out.write("    border: 5px solid orange;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function validateForm() {\n");
      out.write("    var x = document.forms[\"myform\"][\"email\"].value;\n");
      out.write("    if (x == null || x == \"\") {\n");
      out.write("        alert(\"Email must be filled out\");\n");
      out.write("        return false;\n");
      out.write("         var x = document.forms[\"myform\"][\"regno\"].value;\n");
      out.write("    if (x == null || x == \"\") {\n");
      out.write("        alert(\"Registration number must be filled out\");\n");
      out.write("        return false;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("}</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function myFunction() {\n");
      out.write("String captcha = (String) session.getAttribute(\"captcha\");\n");
      out.write("  String code = (String) request.getParameter(\"code\");\n");
      out.write("\n");
      out.write("  if (captcha != null && code != null) {\n");
      out.write("\n");
      out.write("    if (!captcha.equals(code)) \n");
      out.write("    {alert(\"Incorrect\");\n");
      out.write("    return false;}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<title>abc</title>\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <body>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta charset=\"utf-8\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"bbbp/CSS/style.css\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<a href=\"\" id=\"logo\"><img src=\"/bbbp/images/Beti Bachao Beti Padhao_Logo_1.jpg\" alt=\"logo\"></a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"current\">\n");
      out.write("\t\t\t\t\t<a href=\"/bbbp/JSP/index.jsp\">Home</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\".../ExperienceServlet.do\">view experiences</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"/bbbp/JSP/shareexperiences.jsp\">share experiences</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"/bbbp/JSP/feedback.jsp\">feedback</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\t\n");
      out.write("\n");
      out.write(" <center><h7><b>NGO REGISTRATION FORM</b></h7></center>\n");
      out.write("        <div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<center><div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<form name=\"myform\" onsubmit=\"return validateForm()\" method=\"post\" action=\"../NGORegisterServlet.do\" >\n");
      out.write("<table>\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td><b>ID</b>:</td><td><input type=\"text\" name=\"ngoid\"></td></tr>\n");
      out.write("     \n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td><b>State:</b></td><td><input type=\"text\" name=\"state\"></td></tr>\n");
      out.write("<tr class=\"spaceunder\"><td><b>District:</b></td><td><input type=\"text\" name=\"district\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td><b>Registration number:</b></td><td><input type=\"text\" name=\"regno\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td><b>Name of Organization:</b></td><td><input type=\"text\" name=\"noo\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("    <td><b>Email Address:</b></td><td><input type=\"email\" name=\"email\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("    <td><b>Password:</b></td><td><input class=\"password\" type=\"password\" name=\"password\"></td>\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td><b>Phone number:</b></td><td><input type=\"text\" name=\"phno\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td><b>Address:</b></td><td><input type=\"text\" name=\"address\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td><b>Activities:</b></td><td><input type=\"text\" name=\"acti\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td><b>Enter the characters in the image below:</b></td>\n");
      out.write("<td><input type=\"text\" name=\"code\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("    <br>\n");
      out.write("<center><img src=\"http://localhost:8080/bbbp/Captcha.do\"> </center>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<br>\n");
      out.write("<input type=\"submit\" value=\"Submit\" class=\"btn btn-success\" name=\"s\"></center>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\t\t\t</div></center></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
