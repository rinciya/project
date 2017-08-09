package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ngogirl_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
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
      out.write("    height:500px;\n");
      out.write("    padding: 50px;\n");
      out.write("    border: 5px solid orange;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>  \n");
      out.write("function validate(){  \n");
      out.write("var name=document.user.NAME.value;  \n");
      out.write("var password=document.user.PASSWORD.value;  \n");
      out.write("var status=false;  \n");
      out.write("  \n");
      out.write("if(name.length<1){  \n");
      out.write("JSP/userreg.getElementById(\"nameloc\").innerHTML=  \n");
      out.write("\"<img src='unchecked.gif'/> Please enter your name\";  \n");
      out.write("status=false;  \n");
      out.write("}else{  \n");
      out.write("JSP/userreg.getElementById(\"nameloc\").innerHTML=\"<img src='checked.gif'/>\";  \n");
      out.write("status=true;  \n");
      out.write("}  \n");
      out.write("if(password.length<6){  \n");
      out.write("document.getElementById(\"passwordloc\").innerHTML=  \n");
      out.write("\"<img src='unchecked.gif'/> Password must be at least 6 char long\";  \n");
      out.write("status=false;  \n");
      out.write("}else{  \n");
      out.write("document.getElementById(\"passwordloc\").innerHTML=\"<img src='checked.gif'/>\";  \n");
      out.write("status=true;  \n");
      out.write("}  \n");
      out.write("return status;  \n");
      out.write("} \n");
      out.write("\n");
      out.write("</script>  \n");
      out.write("\n");
      out.write("<title>User</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<center><h4>Enter Girls' Details</h4></center>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<center><div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("  \n");
      out.write("\n");
      out.write(" \n");
      out.write("       <form name=\"user\" action=\"../NgogirlServlet.do\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>Name of the girl:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"gname\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>Age:</td> \n");
      out.write("                        <td><input type=\"text\" name=\"gage\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>Pursuing:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"pursuing\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>Details:</td> \n");
      out.write("                        <td><input type=\"text\" name=\"about\" value=\"\" size=\"40\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>NGO: </td>  \n");
      out.write("                        <td><input type=\"text\" name=\"noo\" value=\"\" size=\"40\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("           <br>\n");
      out.write("            <center><input type=\"submit\" value=\"Submit\" name=\"add\" /> </center>\n");
      out.write("        </form>\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("\t\t\t</div></center></div>\n");
      out.write("\t\t\t</div>\n");
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
