<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product Entry Form</title>
</head>
<body>
    <form action="ProductEntryServlet" method="post">
    	<label for="productId">Product ID:</label>
        <input type="text" id="productId" name="productId" required><br><br>
    
        <label for="productName">Product Name:</label>
        <input type="text" id="productName" name="productName" required><br><br>
        
        <label for="price">Price:</label>
        <input type="number" id="price" name="price" required><br><br>
        
        <input type="submit" value="Add Product">
    </form>
</body>
</html>
