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
		    <div class="row">
		        <div class="col-md-offset-4 col-md-4">
		            <div class="form-login">
		            	<form action="Ingreso"  method="post">
			            	<h4>Ingresar</h4>
				           	<input type="text" name="userName" class="form-control input-sm chat-input" placeholder="usuario" />
				            <br>
				            <input type="password" name="userPassword" class="form-control input-sm chat-input" placeholder="contraseña" />
				            </br>
				            <div class="wrapper">
				            <span class="group-btn">     
				                <button type="submit" id="login" class="btn btn-primary btn-md">login</button>
				            </span>
				            </div>
				        </form>
		            </div>
		        </div>
		    </div>
		    <div class="row">
		    	<div class="col-md-12">
					<h1 class="text-center page-header">
					<% if(request.getAttribute("result") != null){%>
						<%=request.getAttribute("result")%>
					<%} else {%>
					<%=""%>
					<%}%>
					</h1>
				</div>
		    </div>
		</div>
	</body>
</html>