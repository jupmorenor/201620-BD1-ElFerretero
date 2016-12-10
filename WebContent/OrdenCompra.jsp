<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<form class="form-horizontal" id="ordenCompra">
					<div class="form-group">
						 
						<label class="col-sm-2 control-label" for="numOrden">
							Orden de compra
						</label>
						<div class="col-sm-10">
							<input class="form-control" id="numOrden" type="text" value="" disabled>
						</div>
					</div>
					<div class="form-group">
						 
						<label class="col-sm-2 control-label" for="fechaOrden">
							Fecha
						</label>
						<div class="col-sm-10">
							<input class="form-control" id="fechaOrden" type="date" value="" disabled>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label" for="empleadoOrden">
							Empleado
						</label>
						<div class="col-sm-10">
							<input class="form-control" id="empleadoOrden" type="text" value="" disabled>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-6">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						 
						<label class="col-sm-2 control-label" for="proveedor">
							Proveedor
						</label>
						<div class="col-sm-10">
							<input class="form-control" id="proveedor" type="text">
						</div>
					</div>
					<div class="form-group">
						 
						<label class="col-sm-2 control-label" for="cedulaP">
							Documento
						</label>
						<div class="col-sm-10">
							<input class="form-control" id="cedulaP" type="text">
							<button class="btn btn-default" type="submit">
								Buscar
							</button>
						</div>
							
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label" for="direccionP">
							Dirección
						</label>
						<div class="col-sm-10">
							<input class="form-control" id="direccionP" type="text">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label" for="telP">
							Telefono
						</label>
						<div class="col-sm-10">
							<input class="form-control" id="telP" type="text">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button class="btn btn-default" type="submit">
								Agregar Proveedor
							</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-bordered">
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
						<tr>
							<!-- #TODO -->
							<td>
								
							</td>
							<td>
								
							</td>
							<td>
								
							</td>
							<td>
								
							</td>
							<td>
								
							</td>
						</tr>	
					</tbody>
				</table> 
				<button class="btn btn-default btn-block" type="button">
					Agregar Producto
				</button>
				<button class="btn btn-success btn-block" type="button">
					Enviar
				</button>
			</div>
		</div>
	</div>
	
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
	</body>
</html>