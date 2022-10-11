<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.ResultSet" %>
    <%@ page import="courierform.CourierDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<% String fullname= (String) session.getAttribute("fullname");
int cid=CourierDao.getid(fullname);
int cid1=cid+1;

%>

<%
   
   try{
	   ResultSet rs=CourierDao.getAllStatement(cid1);
	   while(rs.next()){ 
		   System.out.println(rs.getString(2));%>
		  
		   <div>
		   <h1>shipment details</h1>
		   <p>customer id:<%=rs.getInt(1) %></p>
		   <p>customer name:<%=rs.getString(2) %></p>
		   <p>customer city:<%=rs.getString(3) %></p>
		   <p>Delivery area:<%=rs.getString(4) %></p>
		   <p>Package weight:<%=rs.getString(5) %>g</p>
		   <p>Shipment date:<%=rs.getString(6) %></p>
		   <p>Delivery date:<%=rs.getString(7) %></p>
		   <p>Total payment:<%=rs.getInt(8) %></p>
		   <p>Tracking id:<%=rs.getInt(9) %></p>
		   
		   </div>
	 <%} 
	   
   }
catch(Exception e){
	   e.printStackTrace();
}
	   
%>

</div>

</body>
</html>