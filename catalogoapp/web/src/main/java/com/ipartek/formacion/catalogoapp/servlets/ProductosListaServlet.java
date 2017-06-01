package com.ipartek.formacion.catalogoapp.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.catalogoapp.dal.ProductosDal;
import com.ipartek.formacion.catalogoapp.tipos.Productos1;

@WebServlet("/ProductosListaServlet")
public class ProductosListaServlet extends HttpServlet {
	static final String RUTA_PRODUCTOSLISTA = "/WEB-INF/vistas/Productoslista.jsp";
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();// creando la bolsa comun, guarda en application el contenido que se envia de a la servlet.

		ProductosDal accionesProductos = (ProductosDal) application.getAttribute("accionesProductos"); // acciones primero se le llama al conjunto de ProductosDal.el conjunto de productos guardame un producto de la clase ProductosDal, sino lo meteria en algo global.
		Productos1[] listaProductos = accionesProductos.buscarTodos();// mete en lista de productos todos los productos con el metodo buscar todos de acciones de la dal.
		request.setAttribute("listaProductos", listaProductos);
		request.getRequestDispatcher(RUTA_PRODUCTOSLISTA).forward(request, response);
	}

}
