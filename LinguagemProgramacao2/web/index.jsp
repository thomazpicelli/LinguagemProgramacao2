<%-- 
    Document   : index
    Created on : 24/02/2015, 09:58:15
    Author     : thomazpicelli
--%>

<%@page import="com.br.lp2.model.javabeans.Filme.tiposituacao"%>
<%@page import="com.br.lp2.model.javabeans.Distribuidora"%>
<%@page import="com.br.lp2.model.javabeans.Filme"%>
<%@page import="com.br.lp2.model.javabeans.Genero"%>
<%@page import="com.br.lp2.model.javabeans.Diretor"%>
<%@page import="com.br.lp2.model.javabeans.ListaAtores"%>
<%@page import="com.br.lp2.model.javabeans.Ator"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/padrao.css"/> <!-- CSS PADRAO -->
        <link rel="stylesheet" type="text/css" href="css/acesso.css"/> <!-- CSS ACESSO DE PRODUTOS -->
    </head>
    <body>
        <header>
           <%@include file="headerIn.jsp"%>
        </header>
        <section>
            <div class="login">
                <p>Já tenho cadastro</p></br>
                    <form action = "menuPrincipal.lsp" method = "post">
			Login:<input type="text" placeholder="Login" name="login"/></br>
			Senha:<input type="password" placeholder="Senha" name="camposenha"/></br></br>
                        Deseja salvar os seus dados?<input name="salvar" type="checkbox"/>
			<input type="image" src="img/enviar.png" alt="Submit Form"/>
                    </form>
            </div>
        </section>
        <footer>
            
            
        </footer>
        <%
        
        Ator a = new Ator(1, "Johnny Depp", "EUA", new Date());
        ListaAtores listaAtores = new ListaAtores();
        listaAtores.adicionaAtor(a, "Jack", "principal");
                    
        Filme f = new Filme(1, new Diretor(213, "Tim Buron", 1), new Genero (1, "terror"), listaAtores, new Distribuidora(1, "Wwarner"), "A lenda do cavaleiro sem cabeça", 18, 1990, 120, tiposituacao.CARTAZ, "EN");
        
        out.println(f.toString());
        %>
    </body>
</html>    
