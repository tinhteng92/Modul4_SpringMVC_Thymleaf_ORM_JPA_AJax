<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Simple Dictionary</title>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" >
  <input type="text" name="txtSearch" placeholder="Enter your word: "/>
  <input type="submit" id="submit" value="Search"/>
</form>
<p>${result}</p>
</body>
</html>
