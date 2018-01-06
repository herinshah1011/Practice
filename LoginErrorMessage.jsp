<html>
<head>
<title>Login</title>
</head>
<body>
<form action="ValidateErrorMessageController" method="post">
<%
String UsernameError = (String) request.getAttribute("UsernameError");
String PasswordError = (String) request.getAttribute("PasswordError");
%>
<table>
<tr>
<td>Username</td>
<td><input type ="text" name ="userName">
	<%=UsernameError != null ? UsernameError : " " %></td>
</tr>
<tr>
<td>Password</td>
<td><input type ="password" name ="passWord">
	<%=PasswordError != null ? PasswordError : " " %></td>
</tr>
<tr>
<td><input type="submit"></td>
</tr>
</table>
</form>
</body>
</html>
