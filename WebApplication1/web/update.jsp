<%-- 
    Document   : update
    Created on : Nov 14, 2021, 5:46:15 PM
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
         <form method="POST" action="updateStudent">
            ID : <input type="number" name="id" value="" />
            New Name : <input type="text" name="name" value="" />
            New GPA : <input type="number" name="gpa" value="" />
            <input type="submit" value="Update" />
        </form>
    </body>
</html>
