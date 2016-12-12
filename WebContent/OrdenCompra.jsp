<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<% ResultSet productos = (ResultSet)session.getAttribute("productos"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<meta name="viewport" content="width=device-width, initial-scale=1"></meta>
		<title>Orden de Compra</title>
		<link href="css/bootstrap.min.css" rel="stylesheet"></link>
    	<link href="css/style.css" rel="stylesheet"></link>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<h1 class="text-center">
						Ferretería el Ferretero
					</h1>
					<h2 class="text-center">
						Orden de compra
					</h2>
					<div class="page-header">
						<h3>
							Datos de la transacción 
						</h3>
					</div>
				</div>
			</div>
		<div class="row">
			<div class="col-md-6">
				<form name="ordenCompra" class="form-horizontal">
					<div class="form-group">
						 
						<label class="col-sm-2 control-label" for="numOrden">
							Orden de compra
						</label>
						<div class="col-sm-10">
							<input class="form-control" name="numOrden" id="numOrden" type="text" value="" disabled>
						</div>
					</div>
					<div class="form-group">
						 
						<label class="col-sm-2 control-label" for="fechaOrden">
							Fecha
						</label>
						<div class="col-sm-10">
							<input class="form-control" name="fechaOrden" id="fechaOrden" type="date" value="<%=session.getAttribute("fecha")%>" disabled>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label" for="empleadoOrden">
							Empleado
						</label>
						<div class="col-sm-10">
							<input class="form-control" name="empleadoOrden" id="empleadoOrden" type="text" value="<%=session.getAttribute("conectado")%>" disabled>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-6">
				<form action="OrdenCompra" method="post" class="form-horizontal">
					<div class="form-group">
						 
						<label class="col-sm-2 control-label" for="proveedor">
							Proveedor
						</label>
						<div class="col-sm-10">
							<input class="form-control" name="proveedor" id="proveedor" type="text" value="<%=session.getAttribute("nombre")%>">
						</div>
					</div>
					<div class="form-group">
						 
						<label class="col-sm-2 control-label" for="cedulaP">
							Documento
						</label>
						<div class="col-sm-10">
							<input class="form-control" name="cedulaP" id="cedulaP" type="text" value="<%=session.getAttribute("nit")%>">
							<input class="btn btn-default" type="submit" name="orden" value="Buscar"></input>
						</div>
							
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label" for="direccionP">
							Dirección
						</label>
						<div class="col-sm-10">
							<input class="form-control" name="direccionP" id="direccionP" type="text" value="<%=session.getAttribute("direccion")%>">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label" for="telP">
							Telefono
						</label>
						<div class="col-sm-10">
							<input class="form-control" name="telP" id="telP" type="text" value="<%=session.getAttribute("telefono")%>">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input class="btn btn-default" type="button" name="orden" value="Agregar Proveedor"></input>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<form action="OrdenCompra" method="post">
			<div class="col-md-12">
				<table class="table table-bordered" id="detalleOrden">
					<thead>
						<tr>
							<th>
								Numero de item
							</th>
							<th>
								Producto
							</th>
							<th>
								Valor
							</th>
							<th>
								cantidad
							</th>
							<th>
								Acciones
							</th>
						</tr>
					</thead>
					<tbody>
						<tr id="fila1">
							
							<td>
								<input class="form-control" name="item" id="item" type="text" oncreate="countRows(this);" disabled>
							</td>
							<td>
								<select class="form-control" >
									<option value="0">Seleccione uno</option>
									<% if (productos != null) { %>
									<% while(productos.next()) {%>
										<option value="<%=productos.getInt("id_producto")%>"><%=productos.getString("producto")%></option>
									<% } %>
									<% } %>
								</select>
							</td>
							<td>
								<input class="form-control" name="valor" id="valor" type="text" value="" disabled>
							</td>
							<td>
								<input class="form-control" name="proveedor" id="proveedor" type="number" min="0"></input>
							</td>
							<td>
								<div class="btn-group">
								  <button type="button" class="btn btn-primary" onclick="addField(this);">agregar</button>
								  <button type="button" class="btn btn-danger" onclick="">eliminar</button>
								</div>
							</td>
						</tr>	
					</tbody>
				</table> 
				<input class="btn btn-default btn-block" name="orden" type="button" value="Agregar Producto"></input>
				<input class="btn btn-success btn-block" name="orden" type="button" value="Enviar"></input>
			</div>
			</form>
		</div>
	</div>
	
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
	</body>
</html>