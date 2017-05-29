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

@WebFilter(dispatcherTypes = { DispatcherType.REQUEST }, urlPatterns = { "/usuariocrud" })
public class FiltroAcceso implements Filter {

	/* package */static final String RUTA = "/WEB-INF/vistas/";
	private static final String RUTA_LOGIN = RUTA + "login.jsp";

	public FiltroAcceso() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// mandar de principio a login:
		request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
