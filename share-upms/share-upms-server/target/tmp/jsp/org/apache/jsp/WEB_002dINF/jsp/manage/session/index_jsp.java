/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.7.v20150116
 * Generated at: 2018-07-05 04:13:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("jar:file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/apache/shiro/shiro-web/1.3.2/shiro-web-1.3.2.jar", Long.valueOf(1523774692374L));
    _jspx_dependants.put("jar:file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/springframework/spring-webmvc/4.3.7.RELEASE/spring-webmvc-4.3.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1488328488000L));
    _jspx_dependants.put("file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1523774921834L));
    _jspx_dependants.put("jar:file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/fmt.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/springframework/spring-webmvc/4.3.7.RELEASE/spring-webmvc-4.3.7.RELEASE.jar", Long.valueOf(1523774686890L));
    _jspx_dependants.put("jar:file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/fn.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("jar:file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/springframework/spring-webmvc/4.3.7.RELEASE/spring-webmvc-4.3.7.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1488328488000L));
    _jspx_dependants.put("jar:file:/D:/Program%20Files/Java/apache-maven-3.5.3/repository/org/apache/shiro/shiro-web/1.3.2/shiro-web-1.3.2.jar!/META-INF/shiro.tld", Long.valueOf(1473414826000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<title>会话管理</title>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/inc/head.jsp", out, true);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("\t<div id=\"toolbar\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table id=\"table\"></table>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/inc/footer.jsp", out, true);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var $table = $('#table');\r\n");
      out.write("$(function() {\r\n");
      out.write("\t// bootstrap table初始化\r\n");
      out.write("\t$table.bootstrapTable({\r\n");
      out.write("\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/session/list',\r\n");
      out.write("\t\theight: getHeight(),\r\n");
      out.write("\t\tstriped: true,\r\n");
      out.write("\t\tsearch: false,\r\n");
      out.write("\t\tshowRefresh: true,\r\n");
      out.write("\t\tshowColumns: true,\r\n");
      out.write("\t\tminimumCountColumns: 2,\r\n");
      out.write("\t\tclickToSelect: true,\r\n");
      out.write("\t\tdetailView: true,\r\n");
      out.write("\t\tdetailFormatter: 'detailFormatter',\r\n");
      out.write("\t\tpagination: true,\r\n");
      out.write("\t\tpaginationLoop: false,\r\n");
      out.write("\t\tsidePagination: 'server',\r\n");
      out.write("\t\tsilentSort: false,\r\n");
      out.write("\t\tsmartDisplay: false,\r\n");
      out.write("\t\tescape: true,\r\n");
      out.write("\t\tsearchOnEnterKey: true,\r\n");
      out.write("\t\tidField: 'id',\r\n");
      out.write("\t\tmaintainSelected: true,\r\n");
      out.write("\t\ttoolbar: '#toolbar',\r\n");
      out.write("\t\tcolumns: [\r\n");
      out.write("\t\t\t{field: 'ck', checkbox: true},\r\n");
      out.write("\t\t\t{field: 'id', title: '编号', sortable: true, align: 'center'},\r\n");
      out.write("\t\t\t{field: 'startTimestamp', title: '创建时间', sortable: true, align: 'center'},\r\n");
      out.write("\t\t\t{field: 'lastAccessTime', title: '最后访问时间'},\r\n");
      out.write("\t\t\t{field: 'expired', title: '是否过期', align: 'center'},\r\n");
      out.write("\t\t\t{field: 'host', title: '访问者IP', align: 'center'},\r\n");
      out.write("\t\t\t{field: 'userAgent', title: '用户标识', align: 'center'},\r\n");
      out.write("\t\t\t{field: 'status', title: '状态', align: 'center', formatter: 'statusFormatter'}\r\n");
      out.write("\t\t]\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("// 格式化状态\r\n");
      out.write("function statusFormatter(value, row, index) {\r\n");
      out.write("\tif (value == 'on_line') {\r\n");
      out.write("\t\treturn '<span class=\"label label-success\">在线</span>';\r\n");
      out.write("\t}\r\n");
      out.write("\tif (value == 'off_line') {\r\n");
      out.write("\t\treturn '<span class=\"label label-default\">离线</span>';\r\n");
      out.write("\t}\r\n");
      out.write("\tif (value == 'force_logout') {\r\n");
      out.write("\t\treturn '<span class=\"label label-danger\">踢离</span>';\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("// 强制退出\r\n");
      out.write("var forceoutDialog;\r\n");
      out.write("function forceoutAction() {\r\n");
      out.write("\tvar rows = $table.bootstrapTable('getSelections');\r\n");
      out.write("\tif (rows.length == 0) {\r\n");
      out.write("\t\t$.confirm({\r\n");
      out.write("\t\t\ttitle: false,\r\n");
      out.write("\t\t\tcontent: '请至少选择一条记录！',\r\n");
      out.write("\t\t\tautoClose: 'cancel|3000',\r\n");
      out.write("\t\t\tbackgroundDismiss: true,\r\n");
      out.write("\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\tcancel: {\r\n");
      out.write("\t\t\t\t\ttext: '取消',\r\n");
      out.write("\t\t\t\t\tbtnClass: 'waves-effect waves-button'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tforceoutDialog = $.confirm({\r\n");
      out.write("\t\t\ttype: 'red',\r\n");
      out.write("\t\t\tanimationSpeed: 300,\r\n");
      out.write("\t\t\ttitle: false,\r\n");
      out.write("\t\t\tcontent: '确认强制退出该会话吗？',\r\n");
      out.write("\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\tbtnClass: 'waves-effect waves-button',\r\n");
      out.write("\t\t\t\t\taction: function () {\r\n");
      out.write("\t\t\t\t\t\tvar ids = new Array();\r\n");
      out.write("\t\t\t\t\t\tfor (var i in rows) {\r\n");
      out.write("\t\t\t\t\t\t\tids.push(rows[i].id);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\ttype: 'get',\r\n");
      out.write("\t\t\t\t\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/session/forceout/' + ids.join(\",\"),\r\n");
      out.write("\t\t\t\t\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif (result.code != 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (result.data instanceof Array) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$.each(result.data, function(index, value) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcontent: value.errorMsg,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcontent: result.data.errorMsg,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tforceoutDialog.close();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$table.bootstrapTable('refresh');\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\terror: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcontent: textStatus,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcancel: {\r\n");
      out.write("\t\t\t\t\ttext: '取消',\r\n");
      out.write("\t\t\t\t\tbtnClass: 'waves-effect waves-button'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/manage/session/index.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("basePath");
    // /WEB-INF/jsp/manage/session/index.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f0.setParent(null);
    // /WEB-INF/jsp/manage/session/index.jsp(21,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f0.setName("upms:session:forceout");
    int _jspx_eval_shiro_005fhasPermission_005f0 = _jspx_th_shiro_005fhasPermission_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a class=\"waves-effect waves-button\" href=\"javascript:;\" onclick=\"forceoutAction()\"><i class=\"zmdi zmdi-run\"></i> 强制退出</a>");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
    return false;
  }
}
