<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>App TP3</title>
</head>
<body>	

	<h1>Login</h1>
	<div class="container">
	
		<c:if test="${not empty alerta}">		
			<div class="alert alert-warning">
				<strong>Erro ao logar!</strong> ${alerta}
			</div>
		</c:if>
		<div class="panel-body">
			<form action="/usuario" method="get">
				<h3>Cadastro de usuarios</h3>
				<button type="submit" class="btn-link">Cadastrar Usuario</button>			
			</form>
		</div> 
		
		<form action="/usuario/login" method="post">
			
			<div class="form-group">
				<label>Infome o E-mail:</label>
				<input type="email" name="email" class="form-control"><br>
			</div>
			<div class="form-group">
				<label>Informe sua senha:</label>
				<input type="password" name="senha" class="form-control"><br>
			</div>
			
			<input type="submit" value="Logar" class="botao">
			
		</form>		
	</div>
	
	
</body>
</html>