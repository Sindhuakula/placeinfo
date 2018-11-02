package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.*;
import java.sql.Connection;

public final class companies_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>Guide</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <style>\n");
      out.write("  body {font-family: \"Lato\", sans-serif}\n");
      out.write("  .mySlides {display: none}\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("<!-- Navbar -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-black w3-card w3-padding-large\">\n");
      out.write("\n");
      out.write("    <div class=\"w3-display-left w3-small\" style=\"padding:16px 16px\">\n");
      out.write("    \t<a href=\"index.html\" class=\"w3-bar-item w3-padding-large\"><img src=\"./images/logo.png\" style=\"width:170px\"></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-display-middle w3-large\">\n");
      out.write("    \t<a href=\"index.html\" class=\"w3-bar-item w3-padding-large\"><b>PlaceInfo</b></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-right w3-large\">\n");
      out.write("      <a href=\"about.html\" class=\"w3-bar-item w3-button\">About</a>\n");
      out.write("      <a href=\"resources.php\" class=\"w3-bar-item w3-button\">Resources</a>\n");
      out.write("      <a href=\"companies.jsp.html\" class=\"w3-bar-item w3-button\">Companies</a>\n");
      out.write("      <a href=\"signin.html\" class=\"w3-bar-item w3-button\">Sign-in</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");

            Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placeinfo","root","");
                                     String qp="select * from companies";
                                                  PreparedStatement p=con.prepareStatement(qp);
       
                                                  ResultSet r=p.executeQuery();
      out.write("<br>\n");
      out.write("                                                  \n");
      out.write("  <center>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("table, th, td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    text-align: center;\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("             <table>\n");
      out.write("  <tr>\n");
      out.write("    <th>Company Name</th>\n");
      out.write("    <th>     Job Profile </th>\n");
      out.write("    <th>   CTC    </th>\n");
      out.write("    <th> Status</th>\n");
      out.write("  </tr>\n");
      out.write("   ");

             while(r.next())
             {
                 String cname = r.getString(1);
                   String jp = r.getString(2);
                   String ctc = r.getString(3);
                   String status = r.getString(4);
                   
   
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td>");
      out.print(cname);
      out.write("</td>\n");
      out.write("   \n");
      out.write("    <td> ");
      out.print(jp);
      out.write(" </td>\n");
      out.write("    <td> ");
      out.print(ctc);
      out.write(" </td>\n");
      out.write("    <td> ");
      out.print(status);
      out.write(" </td>\n");
      out.write("  </tr>       \n");
      out.write(" ");
 }
    
      out.write("     \n");
      out.write("    \n");
      out.write("    \n");
      out.write("       \n");
      out.write("<style>\n");
      out.write("table, th, td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<br><br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
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
