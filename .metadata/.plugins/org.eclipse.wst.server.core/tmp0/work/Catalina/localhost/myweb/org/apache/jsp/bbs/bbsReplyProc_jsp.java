/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-04-17 03:11:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bbs;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import net.utility.*;
import net.bbs.*;

public final class bbsReplyProc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/bbs/ssi.jsp", Long.valueOf(1681442006139L));
    _jspx_dependants.put("/bbs/../footer.jsp", Long.valueOf(1681350153695L));
    _jspx_dependants.put("/bbs/../header.jsp", Long.valueOf(1681375177289L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("net.utility");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_packages.add("net.bbs");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      net.bbs.BbsDAO dao = null;
      dao = (net.bbs.BbsDAO) _jspx_page_context.getAttribute("dao", jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new net.bbs.BbsDAO();
        _jspx_page_context.setAttribute("dao", dao, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      net.bbs.BbsDTO dto = null;
      dto = (net.bbs.BbsDTO) _jspx_page_context.getAttribute("dto", jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dto == null){
        dto = new net.bbs.BbsDTO();
        _jspx_page_context.setAttribute("dto", dto, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
request.setCharacterEncoding("UTF-8");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head profile=\"http://www.w3.org/2005/10/profile\">\r\n");
      out.write("  <title>My Web</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"http://example.com/myicon.png\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;0,800;0,900;1,400;1,500;1,600;1,700;1,800;1,900&family=Song+Myung&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <script src=\"../js/myscript.js\" type=\"text/javascript\"></script>\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <!-- layout.css import -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/layout.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onunload=\"killtime()\">\r\n");
      out.write("\r\n");
      out.write("<!-- 메인 카테고리 시작 -->\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>                        \r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">HOME</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"../bbs/bbsList.jsp\">게시판</a></li>\r\n");
      out.write("        <li><a href=\"#\">공지사항</a></li>\r\n");
      out.write("        <li><a href=\"#\">로그인</a></li>\r\n");
      out.write("        <li><a href=\"#\">포토갤러리</a></li>\r\n");
      out.write("        <li><a href=\"#\">메일보내기</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav><!-- 메인 카테고리 끝 -->\r\n");
      out.write("\r\n");
      out.write("<!-- Content 시작 -->\r\n");
      out.write("<!-- Second Container -->\r\n");
      out.write("<div class=\"container-fluid bg-3 text-center\">    \r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-xs-12\">\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("        <!-- 본문 시작 bbsReplyProc.jsp -->\r\n");
      out.write("          ");
 
          	int bbsno=Integer.parseInt(request.getParameter("bbsno"));
          	String wname=request.getParameter("wname").trim();
          	String subject=request.getParameter("subject").trim();
          	String content=request.getParameter("content").trim();
          	String passwd=request.getParameter("passwd").trim();
          	String ip=request.getRemoteAddr();
          	
          	dto.setBbsno(bbsno);
          	dto.setWname(wname);
          	dto.setSubject(subject);
          	dto.setContent(content);
          	dto.setPasswd(passwd);
          	dto.setIp(ip);
          	
          	int cnt=dao.reply(dto);
          	if(cnt==0){
          		out.println("<p>답글 업로드에 실패하였습니다.</p>");
          		out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
          	}else{
          		out.println("<script>");
          		out.println("alert('답글 업로드에 성공하였습니다.');");
          		out.println("location.href='bbsList.jsp';");
          		out.println("</script>");
          	}
          
      out.write("\r\n");
      out.write("        <!-- 본문 끝 -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div><!-- col-xs-12 끝 -->\r\n");
      out.write("  </div><!-- row 끝-->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer class=\"container-fluid bg-4 text-center\">\r\n");
      out.write("    Copyright &copy; 2023 MyWeb\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
