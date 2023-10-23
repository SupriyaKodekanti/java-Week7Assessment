<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vizag Municipal Corporation</title>
</head>
<body>
<form action="success" method="post">
<center>
UserName<input type="text" name="username" required="true"/><br>
ContactNumber<input type="text" name="mobileno"/><br>
Street<input type="text" name="street"/><br>
Village/Town<input type="text" name="village"/><br>
District<input type="text" name="district"/><br>
State<input type="text" name="state"/><br>
Pincode<input type="text" name="pincode"/><br>
Complaint<input type="textarea" name="complaint"/><br>
<input type="submit" name="submit"/>                  <input type="reset" name="reset"/>
</center>
</form>
</body>
</html>