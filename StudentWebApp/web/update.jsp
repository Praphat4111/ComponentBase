<%-- 
    Document   : update
    Created on : Nov 7, 2021, 11:17:02 AM
    Author     : PRAPHAT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
        <h1>Update</h1>
        <form name="update" action="update">
            ID : <input type="text" name="name" value="" size="20" /><br><br>
            New Name : <input type="text" name="name" value="" size="20" /><br><br>
            New GPA : <input type="text" name="GPA" value="" size="10" /><br><br>
            <input type="submit" value="UPDATE" name="submit" />
        </form>
    </body>
</html>
