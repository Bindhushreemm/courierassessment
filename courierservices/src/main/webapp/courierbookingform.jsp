<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
label{
font-weight:900;}
.head{
background-color:#AA336A;
text-align:center;
font-weight:900;
height:100px;


}
</style>
<link rel="stylesheet" href="registerstyle.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class="head">Welcome to courier services</h1>
<div>
<form action="courierservlet">
<div class="abcde">
        <div class="container">
          <h1 text-align="center">Courier your packages</h1><br><br>
          

<label>Enter Fullname</label>
<input type="text" placeholder="enter the name" name="fullname" required><br><br>
<label> Select the current city</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select name="city" placeholder="select the current city" required="required">
				
				<option value="Bangalore">Bangalore</option>
				<option value="Bagalkote">Bagalkote</option>
				<option value="Dharwad">Dharwad</option>
				<option value="Davangere">Davangere</option>
				<option value="Gadag">Gadag</option>
				<option value="Udupi">Udupi</option>
</select><br><br>
				
<label>Enter the phone number</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="tel" name="phono"><br><br>
<label>Enter courier deivery area</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select name="city1" placeholder="select the delivery location" required="required">
				<option value="Bangalore">Bangalore</option>
				<option value="Bagalkote">Bagalkote</option>
				<option value="Dharwad">Dharwad</option>
				<option value="Davangere">Davangere</option>
				<option value="Gadag">Gadag</option>
				<option value="Udupi">Udupi</option>
				
</select><br><br>
<label>enter packet weight in grams</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="number" name="pgrams" min="10" max="25000"><br><br>

          
          
      
      
           <div class="buttonbox"> <div class="buttons"><button type="submit" class="button1">confirm</button></div></div>
           
        </div>
  </div>
      </form>







<!--  <form action="courierservlet">

<label>Fullname</label>
<input type="text" value="enter the name" name="fullname" required><br><br>
<label> select the city</label>
<select name="city" required="required">
				
				<option value="Bangalore">Bangalore</option>
				<option value="Bagalkote">Bagalkote</option>
				<option value="Dharwad">Dharwad</option>
				<option value="Davangere">Davangere</option>
				<option value="Gadag">Gadag</option>
				<option value="Udupi">Udupi</option>
</select><br><br>
				
<label>enter the phone number</label>
<input type="tel" name="phono"><br><br>
<label>enter courier deivery area</label>
<select name="city1" required="required">
				<option value="Bangalore">Bangalore</option>
				<option value="Bagalkote">Bagalkote</option>
				<option value="Dharwad">Dharwad</option>
				<option value="Davangere">Davangere</option>
				<option value="Gadag">Gadag</option>
				<option value="Udupi">Udupi</option>
				
</select><br><br>
<label>enter packet weight in grams</label>
<input type="number" name="pgrams" min="10" max="25000"><br><br>
<button type="submit">confirm</button>

</form>
</div>-->

</body>
</html>