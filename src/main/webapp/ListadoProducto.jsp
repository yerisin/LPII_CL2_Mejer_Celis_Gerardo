
<%@page import="model.TblProductocl2"%>
<%@page import="java.util.List"%>
<%@page import="Dao.ClassProductoImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Clientes</title>
</head>
<body bgcolor="#c5dec9">
	<h1 align="center">Registrar Producto</h1>
	
	<form action="ControladorProducto" method="post">
    <table border="2" align="center">
    <tr>
    <td>Nombre</td>
    <td><input type="text" name="nombre"></td>
    </tr>
    <tr>
    <td>Precio</td>
    <td><input type="number" name="precio"></td>
    </tr>
    <tr>
    <td>PrecioVen</td>
    <td><input type="number" name="precioventa"></td>
    </tr>
    <tr>
    <td>Estado</td>
    <td><input type="text" name="estado"></td>
    </tr>
    <tr>
    <td>Descrip</td>
    <td><input type="text" name="descripcion"></td>
    </tr>
    <tr>
    <td  align="center">
    <input type="submit" value="Registrar">
    </td>
    </tr>
    </table>
</form>
	
	<table align ="center" border="2" >
	<tr>
	<td>Codigo</td>
	<td>Nombre</td>
	<td>pv</td>
	<td>pc</td>
	<td>Estado</td>
	<td>Descri</td>
	</tr>
	<%
	ClassProductoImp lista = new ClassProductoImp();
	List<TblProductocl2> pro= lista.ListadoProducto();
	for(
		TblProductocl2 indexPro	: pro) {
		 %>
		 <tr>
		  <td><%=indexPro.getIdproductocl2()%></td>
		  <td><%=indexPro.getNombrecl2()%></td>
		  <td><%=indexPro.getPreciocompcl2()%></td>
		  <td><%=indexPro.getPrecioventacl2()%></td>
		  <td><%=indexPro.getEstadocl2()%></td>
		  <td><%=indexPro.getDescripcl2()%></td>           
		 </tr>
		<%		
	}
	%>
	</table>


</body>
</html>