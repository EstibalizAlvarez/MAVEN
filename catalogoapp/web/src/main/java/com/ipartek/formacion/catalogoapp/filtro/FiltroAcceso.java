package com.ipartek.formacion.catalogoapp.filtro;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ipartek.formacion.catalogoapp.tipos.Usuario;

@WebFilter(dispatcherTypes = { DispatcherType.REQUEST }, urlPatterns = { "/ListadoProductosServlet" })
public class FiltroAcceso implements Filter {

	/* package */static final String RUTA = "/WEB-INF/vistas/";
	private static final String RUTA_LOGIN = RUTA + "login.jsp";
	private static final String RUTA_LISTA = RUTA + "Productoslista.jsp";

	public FiltroAcceso() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// mandar de principio a login:
		System.out.println("pajaritoooooooooooooo");
		// para hacer el filtro:
		HttpSession session = ((HttpServletRequest) request).getSession();
		Usuario usuarioLogeado = (Usuario) session.getAttribute("usuario");
		if ("admin".equals(usuarioLogeado.getNombre()))//
			request.getRequestDispatcher("ListadoProductosServlet").forward(request, response);
		else
			request.getRequestDispatcher("ProductosListaServlet").forward(request, response);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
