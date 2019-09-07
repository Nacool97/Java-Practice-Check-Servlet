<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<link rel="stylesheet" href="style/style.css">

</head>

<body>

<header> truYum 
<img src = "images/img.png" alt = "image_logo" />
<nav >
<a class="a2" href="/ShowMenuItemListCustomer"><u>Menu</u></a>
<a class="a1" href="/ShowCart" ><u>Cart</a></u></nav>
</nav>
</header>

<div> 


<h2>Menu Items</h2>
<center><p style="color:green;">Item added to Cart Successfully</p></center>
<table cellpadding="4">
<tr>
<td width=40%><b>Name</b></td>
<td><center><b>Free Delivery</b></center></td>
<td><b>Price</b></td>
<td><b>Category</b></td>
<td><b>Action</b></td>
</tr>
<c:forEach items="${x1}" var="list" >
<tr>
  <td id="t11">${list.name}</td>
  <td id="t12">${list.price}</td>
  <c:if test="${list.active==true}">
  <td id="t13">Yes</td>
  </c:if>
   <c:if test="${list.active==false}">
  <td id="t13">No</td>
  </c:if>
  <td id="t15">${list.category}</td>
  <c:if test="${list.freeDelivery==true}">
  <td id="t16">Yes</td>
  </c:if>
   <c:if test="${list.freeDelivery==false}">
  <td id="t16">No</td>
  </c:if>
  <td id="t17"><a href="menu-item-list-customer-notification.jsp?id=${list.id}">Add to Cart</a></td>
</tr>
</c:forEach>
</table></div>
<footer>
Copyright &copy; 2019 
</footer>
</body>
</html>