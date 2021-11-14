<%-- 
    Document   : delete
    Created on : Nov 14, 2021, 5:46:25 PM
    Author     : praph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="deleteStudent">
            ID : <input type="number" name="id" value="" />
            <input type="submit" value="Delete"/>
        </form>
    </body>
</html>
