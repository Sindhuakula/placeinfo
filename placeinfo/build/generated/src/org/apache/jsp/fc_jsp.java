package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.*;
import java.sql.Connection;

public final class fc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>Sign-In</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("    <div class=\"w3-bar w3-black w3-card w3-padding-large\">\n");
      out.write("\n");
      out.write("      <div class=\"w3-display-left w3-small\" style=\"padding:16px 16px\">\n");
      out.write("      \t<a href=\"index.html\" class=\"w3-bar-item w3-padding-large\"><img src=\"./images/logo.png\" style=\"width:170px\"></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-display-middle w3-large\">\n");
      out.write("      \t<a href=\"index.html\" class=\"w3-bar-item w3-padding-large\"><b>PlaceInfo</b></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-right w3-large\">\n");
      out.write("        <a href=\"about.jsp\" class=\"w3-bar-item w3-button\">About</a>\n");
      out.write("      <a href=\"resources.php\" class=\"w3-bar-item w3-button\">Resources</a>\n");
      out.write("      <a href=\"filter_companies.jsp\" class=\"w3-bar-item w3-button\">Companies</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button\">");
String name=(String)session.getAttribute("user");  
out.print(name);  
      out.write("</a>\n");
      out.write("      <a href=\"logout.jsp\" class=\"w3-bar-item w3-button\">Logout</a>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"container\" style=\"font-size:15px\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\" style= \"padding-top: 70px\" >\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <form class=\"w3-container w3-card-4\" style = \" width:300px\">\n");
      out.write("            <h3>Job Profile</h3>\n");
      out.write("            <p>\n");
      out.write("              <input class=\"w3-check\" type=\"checkbox\" >\n");
      out.write("              <label> Software Developer </label></p>\n");
      out.write("              <p>\n");
      out.write("                <input class=\"w3-check\" type=\"checkbox\" >\n");
      out.write("              <label> Tester </label></p>\n");
      out.write("                <p>\n");
      out.write("                  <input class=\"w3-check\" type=\"checkbox\" >\n");
      out.write("                  <label>Data Analyst </label></p>\n");
      out.write("                  <input class=\"w3-check\" type=\"checkbox\">\n");
      out.write("                  <label> Computer Network Engineer </label></p>\n");
      out.write("                  <input class=\"w3-check\" type=\"checkbox\">\n");
      out.write("                  <label> Network Engineer </label></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                  <h3>Status</h3>\n");
      out.write("                  <p>\n");
      out.write("                    <input class=\"w3-radio\" type=\"radio\" name=\"status\" value=\"yettocome\">\n");
      out.write("                    <label> Yet to come</label></p>\n");
      out.write("                    <p>\n");
      out.write("                      <input class=\"w3-radio\" type=\"radio\" name=\"status\" value=\"active\">\n");
      out.write("                      <label> Active</label></p>\n");
      out.write("                      <p>\n");
      out.write("                        <input class=\"w3-radio\" type=\"radio\" name=\"status\" value=\"done\">\n");
      out.write("                        <label> Done</label></p>\n");
      out.write("\n");
      out.write("                        <h3>CTC</h3>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                          <input class=\"w3-check\" type=\"checkbox\" >\n");
      out.write("                          <label> 1 l.p.a - 3 l.p.a </label></p>\n");
      out.write("                          <p>\n");
      out.write("                            <input class=\"w3-check\" type=\"checkbox\" >\n");
      out.write("                          <label> 3 l.p.a - 7 l.p.a </label></p>\n");
      out.write("                            <p>\n");
      out.write("                              <input class=\"w3-check\" type=\"checkbox\" >\n");
      out.write("                              <label>7 l.p.a - 10 l.p.a </label></p>\n");
      out.write("                              <input class=\"w3-check\" type=\"checkbox\">\n");
      out.write("                              <label> above 10 l.p.a </label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                          \n");
      out.write("\n");
      out.write("                        <center><p>\n");
      out.write("                        <button class=\"w3-btn w3-blue\">Apply</button></p></center>\n");
      out.write("\n");
      out.write("                      </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
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
