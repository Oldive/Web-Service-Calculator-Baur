<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<form method="post" name="/ServletCalculator">
        first: <input type="text" name="a">
    <br />
    last: <input type="text" name="b">

    <input type="submit" name="minus">
    <input type="submit" name="plus">
    <input type="submit" name="mul">
    <input type="submit" name="div">

</form>

</body>
</html>