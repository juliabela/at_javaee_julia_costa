<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>App PET Shop | Home</title>
</head>
<body>
	<h1>Tela Inicial</h1>
	
	
	<div class="container">
	
		<h3>${nome}</h3>
		<h4>${email}</h4>
		<h4><a href="${git}">GIT</a></h4>
		
		
		<div class="panel-body">
			<form action="/animal" method="get">
				<h3>Cadastro de animal</h3>
				<button type="submit" class="btn-link">Novo Animal</button>			
			</form>
		</div>
		
		<div class="panel-body">
			<form action="/venda" method="get">
				<h3>Cadastro de venda</h3>
				<button type="submit" class="btn-link">Nova Venda</button>			
			</form>
		</div> 
	</div>
</body>
</html>