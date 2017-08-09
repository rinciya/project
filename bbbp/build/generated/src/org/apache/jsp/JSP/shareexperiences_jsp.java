package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shareexperiences_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
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
      out.write("    height: 450px;\n");
      out.write("    padding: 50px;\n");
      out.write("    border: 5px solid orange;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("          function validate()\n");
      out.write("          {\n");
      out.write("              \n");
      out.write("              \n");
      out.write("         if( document.user.name.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your name!\" );\n");
      out.write("            document.user.name.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("        \n");
      out.write("         if( document.user.email.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Email!\" );\n");
      out.write("            document.user.email.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          if( document.user.comments.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please enter ur experiences!\" );\n");
      out.write("            document.user.comments.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          \n");
      out.write("             \n");
      out.write("         var letters = /^[A-Za-z ]+$/;  \n");
      out.write("         var phoneno = /^\\d{10}$/; \n");
      out.write("         var numbers = /^[0-9]+$/;\n");
      out.write("         var age = /^\\d{2}$/; \n");
      out.write("         var eid = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("\n");
      out.write("  \n");
      out.write("         if(!document.user.name.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Name Sholud Conatin Only Alphabets');  \n");
      out.write("      return false;  \n");
      out.write("      } \n");
      out.write("       if(!document.user.email.value.match(eid)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter valid email id\");  \n");
      out.write("        return false;  \n");
      out.write("        }   \n");
      out.write("    }    \n");
      out.write("      \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>Experiences</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("         <div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>TOGETHER WE CAN CHANGE THIS WORLD..!!</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<center><div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("<center><H4><b>SHARE YOUR EXPERIENCES WITH US</b></h2></center>\n");
      out.write("<br><br>\n");
      out.write("    <form name=\"user\" action=\"../ExperienceServlet.do\" method=\"POST\" onsubmit=\"return validate()\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td><b>Name: </b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td><b>Email ID:</b> </td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" value=\"\" size=\"40\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td><b>Comments:</b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"comments\" value=\"\" size=\"40\" class=\"resizedTextbox\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("<br>\n");
      out.write("         <center>   <input type=\"submit\" class=\"btn btn-success\" value=\"Submit\" name=\"SUBMIT\" />\n");
      out.write("            <input type=\"reset\" class=\"btn btn-success\" value=\"Clear\" name=\"Clear\" /></center>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\t\t\t</div></center></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("    \n");
      out.write("    </body>\n");
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
