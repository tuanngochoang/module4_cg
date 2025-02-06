<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Trang chi tiết sản phẩm</title>
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
<h2>Chi tiết sản phẩm</h2>

<table>
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Mô tả</th>
        <th>Giá</th>
        <th>Số lượng</th>
        <th>
            <button>Thêm</button>
        </th>
    </tr>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.description}</td>
        <td>${product.price}</td>
        <td>${product.quantity}</td>
        <td>
            <a href="/products">Quay lại</a>
            <a href="/products/remove/${product.id}">Xóa</a>
        </td>
    </tr>
</table>
</body>
</html>
