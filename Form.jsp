<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leave Apply Form</title>
</head>
<body>
 <spring:url value="/leave/save" var="saveURL" />
 
 <form:form action="${saveURL }" method="POST" modelAttribute="leaveForm">
  <form:hidden path="id"/>
  <table>
   <tr>
    <td>FullName</td>
    <td><form:input path="fullname"/></td>
   </tr>
   <tr>
    <td>LeaveType: </td>
    <td>
     <form:radiobutton path="leavetype" value="Casualleave" /> Casual_Leave
     <form:radiobutton path="leavetype" value="normalleave" /> Prublic_Holiday
    </td>
   </tr> 
   <tr>
    <td>Duration</td>
    <td><form:input path="duration"/></td>
   </tr>  
   
   <tr>
    <td>Reason</td>
    <td><form:textarea path="reason" rows="3" /></td>
   </tr>
   <tr>
    <td></td>
    <td><button type="submit">Save</button></td>
   </tr>
  </table>
 </form:form>
</body>
</html>