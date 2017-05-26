package org.apache.jsp.WEB_002dINF.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductosForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/vistas/includes/cabeceraproductos.jsp");
    _jspx_dependants.add("/WEB-INF/vistas/includes/pieproductos.jsp");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("<!-- para que codifique bien la jsp. -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- <meta charset=\"UTF-8\"> -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilos.css\" />\r\n");
      out.write("<title>LISTA DE PRODUCTOS</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<h1>LISTA DE PRODUCTOS</h1>\r\n");
      out.write("\t\t</header> \r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>FORMULARIO DE PRODUCTOS:</h2>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"ProductosFormServlet\" method=\"post\"><!-- llama a la servlet. -->\r\n");
      out.write("\r\n");
      out.write("\t<fieldset>\r\n");
      out.write("\t\t<label for=\"id\">ID:</label>\r\n");
      out.write("\t\t\t<input id=\"id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t<label for=\"nombre\">Nombre:</label>\r\n");
      out.write("\t\t\t<input id=\"nombre\" name=\"nombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos1.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t<label for=\"descripción\">Descripción:</label>\r\n");
      out.write("\t\t\t<input id=\"descripcion\" name=\"descripcion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos1.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<label for=\"precio\">Precio:</label>\r\n");
      out.write("\t\t<input id=\"precio\" name=\"precio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos1.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("<fieldset>\r\n");
      out.write("\t<input type =\"submit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.op}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><!-- me coge el valor del dato \"modificar, borrar,alta\" de la lista de productos y lo pone en el boton actual.-->\r\n");
      out.write("\t<input type=\"hidden\" name=\"op\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.op}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\r\n");
      out.write("</fieldset>\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t<p>&copy;2017. ESTIBALIZ ALVAREZ.\r\n");
      out.write("\t</footer> \r\n");
      out.write("</body>\r\n");
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
