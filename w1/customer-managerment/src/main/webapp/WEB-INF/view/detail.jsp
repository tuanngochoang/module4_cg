<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Customer Detail</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h2>Customer Detail</h2>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
        <tr>
            <td>
                <c:out value="${customer.id}"/>
            </td>
            <td>
                <c:out value="${customer.name}"/>
            </td>
            <td>
                <c:out value="${customer.email}"/>
            </td>
            <td>
                <c:out value="${customer.address}"/>
            </td>
        </tr>
</table>
</body>
</html>

