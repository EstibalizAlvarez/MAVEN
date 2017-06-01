<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>CabeceraUsuario</title>
<link rel="stylesheet" href="css/estilos.css" />
<script src="js/funciones.js"></script>
</head>
<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!-- es la biblioteca de C:if o c: foreach.. -->
	<header>
		<h1>Bienvenido.</h1>
		<p>Aqui puedes acceder a:</p>
	</header>
	<nav>
		<ul>
			<li><a href="login?opcion=logout">Salir</a></li>
			<c:if test="${usuario.nombre =='admin'}"><!-- si usuario introducido es admin que te salga el boton Mantenmiento de productos. -->
			<li><a href="ListadoProductosServlet">Mantenimiento productos</a></li><!-- aqui le pones el vinculo a la servlet y el titulos del boton. -->
			</c:if>
			<c:if test="${usuario.nombre !='admin'}"><!-- si usuario introducido es admin que te salga el boton Mantenmiento de productos. -->
			<li><a href="ProductosListaServlet">lista productos</a></li><!-- aqui le pones el vinculo a la jsp y el titulos del boton. -->
			</c:if>
		</ul>
	</nav>