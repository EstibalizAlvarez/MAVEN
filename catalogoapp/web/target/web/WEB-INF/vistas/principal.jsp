 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<!-- <title>Principal</title> -->
<!-- </head> -->
<!-- <body> -->
<%@ include file="includes/cabecerausuario.jsp" %>
	<h1>Esta es la pagina principal.jsp</h1>
	<jsp:useBean id="usuario" scope="session" class="com.ipartek.formacion.catalogoapp.tipos.Usuario"/> <!--de la clase usuario te coge el usuario.-->
	<h2>Bienvenido ${usuario.nombre}</h2>
	<h3><a href="login?opcion=logout">Cierra Sesión</a></h3> <!-- para que te salga el nombre de usuario. -->
	<%= new java.util.Date()%><!-- para que te aparezca la fecha. -->
<!-- </body> -->
<!-- </html> -->
<%@ include file="includes/pie.jsp" %>