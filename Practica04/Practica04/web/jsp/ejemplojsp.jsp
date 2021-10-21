<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Collections" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplos de JSP</title>
        <style type="text/css">
            <%@include file="../css/estilo_tareas.css" %>
        </style>
    </head>
    <body>
        <h1>Ejemplos de JSP</h1>
        <%="<h2>Instanciamos un objeto Date y lo mostramos</h2>" %>
        <% Date date = new Date(); %>
        <p>Hoy es: <%= date %></p>
        
        <%= "<h2>Imprimimos nombres de números en orden aleatorio</h2>" %>
        <% ArrayList<String> numeros = new ArrayList<>();
           numeros.add("uno");
           numeros.add("dos");
           numeros.add("tres");
           numeros.add("cuatro");
           numeros.add("cinco");
           Collections.shuffle(numeros); %>
        
        <ol>
        <% for (String num: numeros) { %>
        <li class="claro"> <%= num %> </li>
        <% } %>
        </ol>
        
        <%= "<h2>Imprimimos los números pares hasta el 20 usando for e if</h2>" %>
        <ol>
        <% for (int i=0; i<=20; i++) { 
            if (i % 2 == 0) { %>
                <li class="claro"> <%= i %> </li>
            <% }
        } %>
        </ol> 
    </body>
</html>
