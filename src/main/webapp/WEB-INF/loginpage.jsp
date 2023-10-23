<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vizag Municipal Corporation</title>
</head>
<body>
<form:form method="post" modelAttribute="logindata" action="${pageContext.request.contextPath}/homepage">
<center>
<h2>Vizag Municipal Corporation</h2>
<form:label path="userName">Username</form:label>
<form:input path="userName" maxlength="30" size="30"/>
<form:errors path="userName" cssClass="error"/><br>
<form:label path="password">Password</form:label>
<form:password path="password" maxlength="30" size="30"/>
<form:errors path="password" cssClass="error"/>
<br>
<input type="submit" value="login"/>
<input type="reset" value="reset"/>
</center>
</form:form>
</body>
</html>