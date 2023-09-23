<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Entrar"%>
<%@ page import="java.util.ArrayList"%>
<%
@SuppressWarnings("unchecked")
ArrayList<Entrar> lista = (ArrayList<Entrar>) request.getAttribute("user");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Loja</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Loja de Doces especiais para Festas!</h1>
	<h1>Veja os serviços oferecidos por essas empresas!</h1>
	<a href="maim" class="Botao2">Relatório</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Senha</th>
				
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getId_usuario()%></td>
				<td><%=lista.get(i).getNome_user()%></td>
				<td><%=lista.get(i).getSenha_user()%></td>
				<td></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<script src="scripts/confirmador.js"></script>
	<h1>Página do Cliente</h1>
	<a title="Voltar" onclick="voltar()" class="Botao1">Voltar página</a>

	<script>
		function voltar() {
			window.history.back();
		}
	</script>

</body>
</html>