<%-- 
    Document   : Calculador
    Created on : 26/09/2020, 02:46:31
    Author     : dav
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Calculadora</title>
    </head>
    <body BGCOLOR="#3333CC" TEXT=   "WHITE"   LINK="green"   VLINK="brown">
    <CENTER>
        <form method="POST" action="MiServlet">
        <h1 >Calculadora Utilizando JSP</h1>
        <p>Ingrese lo que se le pide</p>
        Numero 1:  <input type="text" name="txtNum1" id="idNum1"/><br/>
        Numero 2: <input type="text" name="txtNum2" id="idNum2"/><br/>
        <p>Precione una opcion</p>
       Suma de los dos numeros:               <input type="submit" name="btnSumar" value="Sumar"/><br/>
       Multiplicacion:                        <input type="submit" name="btnMultiplicar" value="Multiplicar"/><br/>
       Obtener el número mayor de los dos:    <input type="submit" name="btnMayorMenor" value="MayorYMenor"/><br/>
       Obtener la potencia de n1^n2:          <input type="submit" name="btnPotencia" value="Potencia"/><br/>
       Mostrar ambos números en valor binario <input type="submit" name="btnBinario" value="Binario"/><br/>
     </CENTER>   
        </form>
     </body>
</html>
