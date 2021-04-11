<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>App Pet Shop | Venda | Detalhe </title>
</head>
<body>	

	<h1>Detalhe Venda</h1>
	<div class="container">
		
		
		<form action="/venda/incluir" method="post">
				
			<div class="form-group">
				<label>Infome o nome do produto:</label>
				<input type="text" name="nome" class="form-control"><br>
			</div>
			<div class="form-group">
				<label>Infome o nome do comprador:</label>
				<select class="form-control" name="animal.id">
					<c:forEach var="c" items="${compradores}">
						<option value="${c.id}">${c.nome}</option>
					</c:forEach>					
				</select>
			</div>
			<div class="form-group">
				<label>Infome o valor do produto:</label>
				<input type="text" name="valor" class="form-control"><br>
			</div>
			<div class="form-group">
				<label>Infome quantidade de produtos:</label>
				<input type="text" name="qtde" class="form-control"><br>
			</div>
			
			<input type="submit" value="Salvar" class="botao">
			
		</form>
		
		<c:if test="${not empty alerta}">		
			<div class="alert alert-warning">
				<strong>Erro ao logar!</strong> ${alerta}
			</div>
		</c:if>
		<h2>Listagem de produtos</h2>
		<c:if test="${not empty vendas}">
			<div class="container">			  
			  <table class="table">
			    <thead>
			      <tr>
			        <th>Nome:</th>
			        <th>Valor:</th>
			        <th>Quantidade:</th>
			        <th>Vendedor:</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="v" items="${vendas}">
				    	<tr>
				        	<td>${v.nome}</td>
				        	<td>${v.valor}</td>
				        	<td>${v.qtde}</td>
				        	<td>${v.usuario.nome}</td>
				        	<td><a href="/venda/${v.id}/excluir">excluir</a></td>
				      	</tr>
			    	</c:forEach>
			     
			    </tbody>
			  </table>
			 </div>
		 </c:if>
		 
		 <c:if test="${empty vendas}">
		 	<h2>Nenhuma venda cadastrada</h2>
		 </c:if>
		 
	</div>
	
		<form action="/home" method="get">			
			<input type="submit" value="Voltar" class="botao">			
		</form>
	
</body>
</html>