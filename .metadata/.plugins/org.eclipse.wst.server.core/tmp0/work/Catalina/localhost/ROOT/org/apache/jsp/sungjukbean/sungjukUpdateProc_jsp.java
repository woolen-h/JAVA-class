/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-04-12 06:21:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sungjukbean;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import net.sungjuk.*;

public final class sungjukUpdateProc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/sungjukbean/ssi.jsp", Long.valueOf(1681261976907L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_packages.add("net.sungjuk");
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
      out.write("        ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      net.sungjuk.SungjukDAO dao = null;
      dao = (net.sungjuk.SungjukDAO) _jspx_page_context.getAttribute("dao", jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new net.sungjuk.SungjukDAO();
        _jspx_page_context.setAttribute("dao", dao, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      net.sungjuk.SungjukDTO dto = null;
      dto = (net.sungjuk.SungjukDTO) _jspx_page_context.getAttribute("dto", jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dto == null){
        dto = new net.sungjuk.SungjukDTO();
        _jspx_page_context.setAttribute("dto", dto, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
request.setCharacterEncoding("UTF-8");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>sungjukUpdateProc</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3>성적 수정 결과</h3>\r\n");
      out.write("<p>\r\n");
      out.write("<a href=\"sungjukForm.jsp\">[성적쓰기]</a>\r\n");
      out.write("<a href=\"sungjukList.jsp\">[성적목록]</a>\r\n");
      out.write("</p>\r\n");

int sno=Integer.parseInt(request.getParameter("sno"));
String uname = request.getParameter("uname").trim();
int kor = Integer.parseInt(request.getParameter("kor").trim());
int eng = Integer.parseInt(request.getParameter("eng").trim());
int mat = Integer.parseInt(request.getParameter("mat").trim());
String addr = request.getParameter("addr").trim();
int aver = (kor+eng+mat)/3;

dto.setUname(uname);
dto.setKor(kor);
dto.setEng(eng);
dto.setMat(mat);
dto.setAver(aver);
dto.setAddr(addr);
dto.setSno(sno);

int cnt=dao.update(dto);

if(cnt==0){
	out.println("<p>성적 수정이 실패했습니다.</p>");
	out.println("<p><a href='javascript:history.back()'>[다시 시도]</a></p>");
}else{
	out.println("<script>");
	out.println("alert('성적이 수정되었습니다.');");
	out.println("location.href='sungjukList.jsp';");
	out.println("</script>");
}

      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>이름</th>\r\n");
      out.write("<td>");
      out.print(dto.getUname() );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>국어</th>\r\n");
      out.write("<td>");
      out.print(dto.getKor() );
      out.write("</td> \r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>영어</th>\r\n");
      out.write("<td>");
      out.print(dto.getEng() );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>수학</th>\r\n");
      out.write("<td>");
      out.print(dto.getMat() );
      out.write("</td> \r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>평균</th>\r\n");
      out.write("<td>");
      out.print(dto.getAver() );
      out.write("</td> \r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>주소</th>\r\n");
      out.write("<td>");
      out.print(dto.getAddr() );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
