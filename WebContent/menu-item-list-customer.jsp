<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.cognizant.truyum.dao.*"
    		 import="java.util.*"		
    		 import="com.cognizant.truyum.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<link rel="stylesheet" href="style/style.css">

</head>

<body>

<header> truYum 
<img src = "images/img.png" alt = "image_logo" />
<nav>
<a class="a2" href="/Servlet-TruYum/ShowMenuItemListCustomer"><u>Menu</u></a>
<a class="a1" href="cart.html"><u>Cart</a></u>
</nav>
</header>
<div> 


<h2>Menu Items</h2>
<table cellpadding="4" >
<tr>
<td width=40%><b>Name</b></td>
<td><center><b>Free Delivery</b></center></td>
<td><b>Price</b></td>
<td><b>Category</b></td>
<td><b>Action</b></td>
</tr>
<tr>
<td>Sandwich</td>
<td><center>Yes</center></td>
<td>Rs.99.00</td>
<td>Main Course</td>
<td><u><a href="menu-item-list-customer-notification.html">Add to Cart</a></u></td>

</tr>
<tr>
<td>Burger</td>
<td><center>No</center></td>
<td>Rs.129.00</td>
<td>Main Course</td>
<td><u><a href="menu-item-list-customer-notification.html">Add to Cart</a></u></td>

</tr>
<tr>
<td>Pizza</td>
<td><center>No</center></td>
<td>Rs.149.00</td>
<td>Main Course</td>
<td><u><a href="menu-item-list-customer-notification.html">Add to Cart</a></u></td>

</tr>

<% ArrayList<MenuItem> list = (ArrayList<MenuItem>)request.getAttribute("x1");
if(list==null)
{
	out.println(" ");
}
else
{
	for(MenuItem x:list)
		{
		 out.println(x);
		}

}
%>




</table></div>
<footer>
Copyright &copy; 2019 
</footer>
</body>




</html>