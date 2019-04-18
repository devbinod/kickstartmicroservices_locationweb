<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 4/18/19
  Time: 9:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="100%" border="1">
    <tr>
        <td>Id</td>
        <td>Code</td>
        <td>Name</td>
        <td>Type</td>
        <td>Action</td>

    </tr>
    <c:forEach items="${location}" var="l">
        <tr>
            <td>${l.id}</td>
            <td> ${l.code}</td>
            <td>${l.name}</td>
            <td>${l.type}</td>
            <td><a href="deleteLocation?id=${l.id}">Delete</a> </td>
            <td><a href="updateLocation?id=${l.id}">Update</a> </td>


        </tr>



    </c:forEach>

</table>

<a href="createLocation">Add Location</a>
</body>
</html>
