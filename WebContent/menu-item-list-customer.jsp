<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cognizant.truyum.dao.*"
    		 import="java.util.*"		
    		 import="com.cognizant.truyum.model.*" %>
    		  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@page isELIgnored="false" %>
<!doctype html>
<head>
	<link rel="stylesheet" href="style/style.css">
	
</head>
<body>

<header>truYum <img src="images/img.png"/>
<nav>
<a class="a2"  href="/Servlet-TruYum/ShowMenuItemListCustomer">Menu</a>
<a class="a1" href="/Servlet-TruYum/ShowCart">Cart</a>
</nav>
</header>
<div>
<h2 id="m1">Menu Items</h2>
<c:if test="${ carts==true}">
<center><p style="color:green">Item added to Cart Successfully</p></center>
</c:if>
<table id="t1">
<tr>
  <th>Name</th>
  <th>Price</th>
  <th>Active</th>
  <th>Category</th>
  <th>Free Delivery</th>
  <th>Action</th>
</tr>

	  
<c:forEach items="${x}" var="list" >
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
  <td id="t17"><a href="AddToCart?id=${list.id}">Add to Cart</a></td>
</tr>
</c:forEach>
	
	</table>
</div>

<footer>
Copyright &copy; 2019 
</footer>

</body>
</html>