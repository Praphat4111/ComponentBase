<%-- 
    Document   : index
    Created on : Nov 7, 2021, 1:16:48 AM
    Author     : PRAPHAT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Temperature Converter</title>
    </head>
    <body>
        <h1>Temperature Converter</h1><br>
         <form  method="post">
            <input type="number" name="temp" value="" size="16" />
            <input type="submit"  formaction="CtoF" value="Celsius to Fahrenheit" name="CtoF" />
            <input type="submit" formaction="FtoC" value="Fahrenheit to Celsius" name="FtoC" />
        </form>
       
    </body>
</html>
