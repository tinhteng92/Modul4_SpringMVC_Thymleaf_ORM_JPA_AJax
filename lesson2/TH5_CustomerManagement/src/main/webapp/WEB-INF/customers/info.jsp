
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Management Application</title>
</head>
<body>
<h1>Edit Customer Information</h1>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<form method="post" action="/customers">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>ID: </td>
                <td><input type="text" name="id" id="id" value="${customer.id}" readonly></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${customer.name}"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" id="email" value="${customer.email}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${customer.address}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update information"></td>
            </tr>

        </table>
    </fieldset>
</form>
</body>
</html>
