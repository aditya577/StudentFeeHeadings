<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="ISO-8859-1">
<title>Fee Head | Home</title>
</head>
<body>
<h2>Fee Head</h2>
<a href="#">Delete</a> <a href="#">Add New</a> <a href="#">Set priority</a>
	<table>
		  <tr>
		  	<th> </th>
		    <th>Fee Name</th>
		    <th>Periodicity</th>
		    <th>Fine Applicable</th>
		    <th>Concession Applicable</th>
		    <th>Refundable</th>
		    <th>Payment Priority</th>
		    <th>Account Heads</th>
		  </tr>
		  <c:if test="${not empty lists}">
			  <c:forEach items="${lists}" var="lists">
			    <tr>
			       <td><input type="checkbox" name="itemId" value="${lists.getId()}"></td>	
			       <td>${lists.getFeeName()}</td>
			       <td>${lists.getPeriodicity()}</td>
			       <td>${lists.isFineApplicable()}</td>
			       <td>${lists.isConcessionApplicable()}</td>
			       <td>${lists.isRefundable()}</td>
			       <td>BOX</td>
			       <td>${lists.getAccountHead()} <a href="#">Save</a></td>
			     </tr>
			  </c:forEach>
		  </c:if>
	</table>
</body>
</html>