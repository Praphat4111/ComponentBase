<%-- 
    Document   : insert
    Created on : Nov 14, 2021, 5:46:00 PM
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
        <form method="POST" action="insertStudent">
            ID : <input type="number" name="id" value="" /> 
            Name : <input type="text" name="name" value="" />
            GPA :  <input type="number" name="gpa" value="" />
            <input type="submit" value="Insert" />
        </form>
    </body>
</html>
