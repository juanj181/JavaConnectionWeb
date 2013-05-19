<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String myName=(String)request.getAttribute("myName");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mi nombre es <%=myName %> </h1>
    </body>
</html>
