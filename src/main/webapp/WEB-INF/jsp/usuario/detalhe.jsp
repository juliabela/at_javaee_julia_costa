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
	<div class="container">
		
		<form action="/usuario/incluir" method="post">
			
			<div class="form-group">
				<label>Infome seu nome:</label>
				<input type="text" name="nome" class="form-control"><br>
			</div>
			<div class="form-group">
				<label>Infome seu E-mail:</label>
				<input type="text" name="email" class="form-control"><br>
			</div>
			<div class="form-group">
				<label>Informe sua senha:</label>
				<input type="password" name="senha" class="form-control"><br>
			</div>
			
			<input type="submit" value="Salvar" class="botao">
			
		</form>
		
		<h2>Listagem de usuarios</h2>
		<c:if test="${not empty usuarios}">
			<div class="container">			  
			  <table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Nome</th>
			        <th>E-mail</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="u" items="${usuarios}">
				    	<tr>
				        	<td>${u.nome}</td>
				        	<td>${u.email}</td>
				        	<td><a href="/usuario/${u.id}/excluir">excluir</a></td>
				      	</tr>
			    	</c:forEach>			     
			    </tbody>
			  </table>
			 </div>
		 </c:if>
		 
		 <c:if test="${empty usuarios}">
		 	<h2>Nenhum usuário cadastrado</h2>
		 </c:if>
		 
	</div>
	<form action="/home" method="get">			
			<input type="submit" value="Voltar" class="botao">			
	</form>
	<form action="/" method="get">			
			<input type="submit" value="Fazer Login" class="botao">			
	</form>
	
</body>
</html>