<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leave Management</title>
</head>
<body>
 <spring:url value="/leave/add" var="addURL" />
 <a href="${addURL }">Add new Leave Note</a>
 
 <table width="100%" border="1">
  <tr>
  
   <td>FullName</td>
   <td>LeaveType</td>
   <td>Duration</td>
   <td>Reason</td>
   <td colspan="2">Action</td>
  </tr>  
  <c:forEach items="${list }" var="leave" >
   <tr>
   
    <td>${leave.fullname }</td>
    <td>${leave.leavetype }</td>
    <td>${leave.duration }</td>
    <td>${leave.reason }</td>
    <td>
     <spring:url value="/leave/update/${leave.id }" var="updateURL" />
     <a href="${updateURL }">Update</a>
    </td>
    <td>
     <spring:url value="/leave/delete/${leave.id }" var="deleteURL" />
     <a href="${deleteURL }">Delete</a>
    </td>
   </tr>
  </c:forEach>
 </table>
</body>
</html>




