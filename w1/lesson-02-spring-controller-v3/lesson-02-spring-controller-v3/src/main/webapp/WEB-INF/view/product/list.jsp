<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Trang danh sách sản phẩm</title>
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
    <h2>Danh sách sản phẩm</h2>
    <form action="/products/search" method="get">
        <label>
            <input name="productName" placeholder="Nhập tên sản phẩm...">
        </label>
        <input type="submit" value="Tìm kiếm"/>
    </form>
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
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td>
                    <a href="/products/${product.id}">Xem</a>
                    <a href="/products/edit/${product.id}">Sửa</a>
                    <a href="/products/remove/${product.id}">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
