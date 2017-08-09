package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userregform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"script.js\"></script>\n");
      out.write("\n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("          function validate()\n");
      out.write("          {\n");
      out.write("              \n");
      out.write("              \n");
      out.write("         if( document.user.NAME.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your name!\" );\n");
      out.write("            document.user.NAME.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          if( document.user.ADDRESS.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Address!\" );\n");
      out.write("            document.user.ADDRESS.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         if( document.user.GENDER.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your GENDER!\" );\n");
      out.write("            document.user.GENDER.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.user.AGE.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your AGE!\" );\n");
      out.write("            document.user.AGE.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.user.CONTACTNO.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your CONTACT NO!\" );\n");
      out.write("            document.user.CONTACTNO.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.user.EMAILID.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Email!\" );\n");
      out.write("            document.user.EMAILID.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          var letters = /^[A-Za-z ]+$/;  \n");
      out.write("         var phoneno = /^\\d{10}$/; \n");
      out.write("         var numbers = /^[0-9]+$/;\n");
      out.write("         var age = /^\\d{2}$/; \n");
      out.write("         var eid = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;  \n");
      out.write("         var alphanum = /^[0-9a-zA-Z  ]+$/;  \n");
      out.write("         \n");
      out.write("      if(!document.user.NAME.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Name Sholud Conatin Only Alphabets');  \n");
      out.write("      return false;  \n");
      out.write("      } if((document.user.GENDER.value)!=\"female\" && (document.GENDER.vname.value)!=\"male\" )\n");
      out.write("           {\n");
      out.write("                alert(\"You must select male or female\");\n");
      out.write("                return false;\n");
      out.write("           } \n");
      out.write("       if(!document.user.AGE.value.match(age)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter 2 digits\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("   \n");
      out.write("      if(!document.user.CONTACTNO.value.match(phoneno)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter 10 digits phone number\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("       if(!document.user.EMAILID.value.match(eid)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter valid email id\");  \n");
      out.write("        return false;  \n");
      out.write("        } \n");
      out.write("          }  \n");
      out.write("      </script>\n");
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
      out.write("    height:850px;\n");
      out.write("    padding: 50px;\n");
      out.write("    border: 5px solid orange;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>User</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("            <div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<center><h4>User Registration Form</h4></center><br><br><br>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<center><div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<form name=\"user\" action=\"../UserRegServlet.do\" method=\"POST\" onsubmit=\"return validate()\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("                   <tr class=\"spaceunder\">\n");
      out.write("                        <td>NAME</td>\n");
      out.write("                        <td><input type=\"text\" name=\"NAME\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>ADDRESS</td> \n");
      out.write("                        <td><input type=\"text\" name=\"ADDRESS\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>GENDER</td>\n");
      out.write("                        <td><input type=\"text\" name=\"GENDER\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>EMAIL ID</td> \n");
      out.write("                        <td><input type=\"text\" name=\"EMAILID\" value=\"\" size=\"40\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr class=\"spaceunder\">\n");
      out.write("                        <td>PASSWORD</td> \n");
      out.write("                        <td><input type=\"password\" name=\"PASSWORD\" value=\"\" size=\"40\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                            <tr class=\"spaceunder\">\n");
      out.write("                        <td>AGE</td>\n");
      out.write("                        <td><input type=\"text\" name=\"AGE\" value=\"\" size=\"40\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr class=\"spaceunder\">\n");
      out.write("                        <td>CONTACT NO</td>\n");
      out.write("                        <td><input type=\"text\" name=\"CONTACTNO\" value=\"\" size=\"40\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <center><input type=\"submit\" value=\"REGISTER\" name=\"REGISTER\" /> </center><br>\n");
      out.write("            <center> <input type=\"reset\" value=\"RESET\" name=\"RESET\" /> </center>\n");
      out.write("        </form>\n");
      out.write("</center>\n");
      out.write("  </div>\n");
      out.write("\t\t\t</div></center></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("</body>\n");
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
