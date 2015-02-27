<%-- 
    Document   : index
    Created on : 24/02/2015, 09:58:15
    Author     : thomazpicelli
--%>

<%@page import="com.br.lp2.model.Distribuidora"%>
<%@page import="com.br.lp2.model.Filme"%>
<%@page import="com.br.lp2.model.Genero"%>
<%@page import="com.br.lp2.model.Diretor"%>
<%@page import="com.br.lp2.model.ListaAtores"%>
<%@page import="com.br.lp2.model.Ator"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            
        Ator a = new Ator(1, "Johnny Depp", "EUA", new Date());
        ListaAtores listaAtores = new ListaAtores();
        listaAtores.adicionaAtor(a, "Jack", "principal");
                    
        Filme f = new Filme(1, new Diretor(213, "Tim Buron", 1), new Genero (1, "terror"), listaAtores, new Distribuidora(1, "Wwarner"), "A lenda do cavaleiro sem cabeça", 18, 1990, 120, "CARTAZ", "EN", true);
        
        out.println(f.toString());
        %>
    </body>
</html>
