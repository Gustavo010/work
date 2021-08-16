<%@page import="ctr.NameProcess"%>
<%@page import="vo.Name"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TESTE PARA TIME</title>
</head>
<body>
<%
	NameProcess.testes();
	out.print("<table style='border: solid 1px'>");
	for (Name c : NameProcess.names) {
		out.print(c.toHTML());
	}
	out.print("</table>");
	out.print(NameProcess.salvar());
	%>

</body>
</html>