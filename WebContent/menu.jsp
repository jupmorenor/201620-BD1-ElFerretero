<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<title>Ferreteria el Ferretero</title>
		<link href="css/bootstrap.min.css" rel="stylesheet"></link>
    	<link href="css/style.css" rel="stylesheet"></link>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<h1 class="text-center page-header">
						Ferreteria el Ferretero
					</h1>
				</div>
			</div>
			<form name="" action="Menu" method="post">
			    <div class="row">
			        <div class="col-md-12">
						<h2 class="text-center page-header">
							<input type="submit" class="btn btn-primary btn-block" name="dir" value="Generar Orden de compra"></input>
						</h2>
			        </div>
			    </div>
			    <div class="row">
			        <div class="col-md-12">
						<h2 class="text-center page-header">
							<input type="submit" class="btn btn-primary btn-block" name="dir" value="Generar Factura de compra"></input>
						</h2>
			        </div>
			    </div>
			</form>
		</div>
	</body>
</html>