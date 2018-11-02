package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.*;
import java.sql.Connection;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("        ");

            String sid="AM.EN.U4CSE15252";
            String spasswd="";
                    
            String id=request.getParameter("Username");
            String passd=request.getParameter("Password");           
          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placeinfo","root","");
            
            String q="select password from student where username=?";
             PreparedStatement pss=con.prepareStatement(q);
             pss.setString(1,id);
             
             out.println("hello 1");
             ResultSet r =pss.executeQuery();
           
       
             if(r.next())
             {
                 response.sendRedirect(request.getContextPath() + "/index.html");
             }
             {
            out.println("hello 2");
             }
                
      out.write("\n");
      out.write("                <!--\n");
      out.write("                spasswd=r.getString(1);                 \n");
      out.write("              if(spasswd.equals(passd))\n");
      out.write("              {\n");
      out.write("                 response.sendRedirect(request.getContextPath() + \"/index.html\");\n");
      out.write("              }\n");
      out.write("              else\n");
      out.write("              {\n");
      out.write("                  response.sendRedirect(request.getContextPath() + \"/signin.html\");\n");
      out.write("              }\n");
      out.write("\n");
      out.write("             \n");
      out.write("%> --->");
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
