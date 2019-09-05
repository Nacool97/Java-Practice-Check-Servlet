<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><link rel="stylesheet" href="style/style.css"> </head>
<body>
<header> truYum 
<img src = "images/img.png" alt = "image_logo" />
<nav >
<a class = "a2" href="menu-item-list-customer.html"><u>Menu</u></a>
<a class = "a1" href="cart.html" ><u>Cart</a></u>
</nav>
</header>

<div>
<h2> Cart </h2>
<center><p style=color:green;>Item removed from cart successfully</p></center>
<table cellpadding="4">
<tr>
<td width=40%> <b> Name </b> </td>
<td> <b> Free Delivery </b> </td> 
<td> <b> Price </b> </td>
</tr>
<tr> <td> Sandwich </td> 
<td><center> Yes </center></td>
<td> Rs.99.00 </td>
<td><u><a href= "cart-empty.html"> Delete </a> </u> </td>
</tr>
<tr> <td> Burger </td> 
<td><center> No </center></td>
<td> Rs.129.00 </td>
<td><u><a href= "cart-empty.html"> Delete </a> </u> </td>
</tr>

<tr>
<td> </td>
<td> <center> <b>  Total </b> </center> </td>
<td> <b> Rs.228.00 </b> </td>
</tr>
</table>

</div>
<footer>
Copyright &copy; 2019 
</footer>
</body>
</html>
