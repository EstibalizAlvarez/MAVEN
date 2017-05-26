package com.ipartek.formacion.catalogoapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.catalogoapp.dal.ProductosDal;
import com.ipartek.formacion.catalogoapp.tipos.Productos1;

@WebServlet("/ProductosFormServlet")
public class ProductosFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		String op = request.getParameter("op");// opform son las operaciones de formulario.
		// estos son los datos que recibes y te saldria en el formulario:
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String descripcion = request.getParameter("descripcion");
		int precio = Integer.parseInt(request.getParameter("precio"));
		System.out.println("al principio");
		// rutas para ir o al formulario o a la lista de productos.
		RequestDispatcher IrLista = request.getRequestDispatcher(ListadoProductosServlet.LISTADO_PRODUCTOS);// Esto te va a productoscrud, el listado.
		RequestDispatcher IrFormulario = request.getRequestDispatcher(ListadoProductosServlet.RUTA_FORMULARIO);// Esto te va a productosform, el formulario.

		// crear la bolsa comun:
		ServletContext application = request.getServletContext();
		// crear al bibliotecario:
		ProductosDal dal = (ProductosDal) application.getAttribute("acciones");

		// creamos un nuevo objeto con todos los datos(nombre, descripcion....)para poder utilizarlo todos a la vez y no uno a uno.
		Productos1 datos = new Productos1(id, nombre, descripcion, precio);

		request.setAttribute("Productos1", datos);

		if (op == null) {// si la op es nula.
			IrFormulario.forward(request, response);// te manda al formulario
			return;
		}
		switch (op) {
		case "alta":// si es alta le pides al bibliotecario que le da de alta.
			dal.alta(datos);
			response.sendRedirect("ListadoProductosServlet");// una vez que te de alta te envie a la pagina de productosCrud.
			break;
		case "modificar":
			dal.modificar(datos);
			response.sendRedirect("ListadoProductosServlet");// una vez que te modificar te envie a la pagina de productosCrud.
			break;
		case "borrar":
			dal.baja(datos);
			response.sendRedirect("ListadoProductosServlet");// una vez que te de baja te envie a la pagina de productosCrud.
			break;
		default:
			IrLista.forward(request, response);// que te mande a la lista de productos.
		}

	}// dopost
}// productosFormServlet
