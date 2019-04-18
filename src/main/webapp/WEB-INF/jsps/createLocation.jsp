<%--
  Created by IntelliJ IDEA.
  User: binod
  Date: 4/18/19
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Location</title>
</head>
<body>
<pre>
    <form action="saveLocation" method="post">

        Id: <input type="text" name="id"/>
        Code: <input type="text" name="code"/>
        Name: <input type="text" name="name"/>
        Type: Urban <input type="radio" name="type" value="Urban"/>
                Rural <input type="radio" name="type" value="Rural"/>
        <input type="submit" value="save"/>
    </form>
</pre>
${msg}

<a href="displayLocation">Display All Location</a>
</body>

</html>
