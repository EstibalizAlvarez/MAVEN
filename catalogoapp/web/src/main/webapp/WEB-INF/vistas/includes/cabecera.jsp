<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Ejemplo MVC</title>
<link rel="stylesheet" href="css/estilos.css" />
<script src="js/funciones.js"></script>
</head>
<body>
	<header>
		<h1>Ejemplo MVC</h1>
		<p>Ejemplos de uso de MVC con diferentes técnicas</p>
	</header>
	<nav>
		<ul>
			<li><a href="login">Login</a></li>
			
			<li><a href="login?opcion=logout">Salir</a></li>
			<li><a href="ListadoProductosServlet">Mantenimiento productos</a></li><!-- aqui le pones el vinculo a la servlet y el titulos del boton. -->
		</ul>
	</nav>