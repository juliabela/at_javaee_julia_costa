<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>App Pet Shop | Animal | Detalhe </title>
</head>

<body>

	<h1>Detalhe Animal</h1>
	<div class="container">
		
		<form action="/animal/incluir" method="post">
			
			<div class="form-group">
				<label>Infome o nome do animal:</label>
				<input type="text" name="nome" class="form-control"><br>
			</div>
			<div class="form-group">
				<label>Infome a raça do animal:</label>
				<input type="text" name="raca" class="form-control"><br>
			</div>
			<div class="form-group">
				<label>Infome o nome do responsavel:</label>
				<input type="text" name="responsavel" class="form-control"><br>
			</div>
			
			<input type="submit" value="Salvar" class="botao">
			
		</form>
		
		<c:if test="${not empty animais}">
			<div class="container">
			  <h2>Listagem de Animais</h2>
			  <table class="table">
			    <thead>
			      <tr>
			        <th>Nome</th>
			        <th>Raça</th>
			        <th>Responsavel</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="a" items="${animais}">
				    	<tr>
				        	<td>${a.nome}</td>
				        	<td>${a.raca}</td>
				        	<td>${a.responsavel}</td>
				        	<td><a href="/animal/${a.id}/excluir">excluir</a></td>
				      	</tr>
			    	</c:forEach>
			     
			    </tbody>
			  </table>
			 </div>
		 </c:if>
		 
		 <c:if test="${empty animais}">
		 	<h2>Nenhum animal cadastrado</h2>
		 </c:if>
		 
	</div>
	<form action="/" method="get">			
			<input type="submit" value="Voltar" class="botao">			
	</form>
	
</body>
</html>