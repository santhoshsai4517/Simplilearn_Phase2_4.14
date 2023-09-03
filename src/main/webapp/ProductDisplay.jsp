<%@page import="com.ecommerce.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h1>Product Details</h1>
    <%
        // Retrieve product details from the session
        ProductBean product = (ProductBean) session.getAttribute("product");
    %>
    <%
        if (product != null) {
    %>
    <p><strong>Product Description:</strong> <%= product.getProductId() %></p>
    <p><strong>Product Name:</strong> <%= product.getProductName() %></p>

    <p><strong>Price:</strong> $<%= product.getPrice() %></p>
    <%
        } else {
    %>
    <p>No product data available.</p>
    <%
        }
    %>
</body>
</html>
