<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Product</title>
<style type="text/css">
form{
    text-align: center;
}
body{
    background-image:url('buycou.jpg');
    background-repeat: no-repeat;
    background-size: 100% 200%;
}
</style>
</head>
<body>
<h1>Create Product</h1>
<form action="products" method="post">
<pre>
Name: <input type="text" name="name" /><br>
Description: <input type="text" name="description" /><br>
Price: <input type="text" name="price" /><br>
Coupon Code: <input type="text" name="couponCode" /><br>
<input type="submit" value="Save"><br>
</pre>
</form>
</body>
</html>