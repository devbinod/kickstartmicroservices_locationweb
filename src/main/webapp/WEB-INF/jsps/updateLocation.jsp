<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 4/18/19
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="saveLocation" method="post">

    Id: <input type="text" name="id" value="${location.id}" readonly/>
    Code: <input type="text" name="code" value="${location.code}"/>
    Name: <input type="text" name="name" value="${location.name}"/>
    Type: Urban <input type="radio" name="type" value="Urban" ${location.type=='Urban'?'Urban':''}/>
    Rural <input type="radio" name="type" value="Rural" ${location.type=='Rural'?'Rural':''}/>
    <input type="submit" value="Update"/>
</form>
</body>
</html>
