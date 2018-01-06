<html>
<head>
<title>Welcome</title>
</head>
<title>Login Form</title>
</head>
<body>
<form action="LoginController" method="post">
<table>
<tr>
<td>UserName</td>
<td><input type="text" name="userName"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="passWord"></td>
</tr>
<tr>
<td>Select City</td>
<td><select name="Select City">
<option>--Select City--</option>
<option id="Ahmedabad">Ahmedabad</option>
<option id="Surat">Surat</option>
<option id="Vadodara">Vadodara</option>
</select></td>
</tr>
<tr>
<td>Select Hobbies</td>
<td><select name="Select Hobbies" multiple="multiple">
<option>--Select Hobbies--</option>
<option id="Games">Games</option>
<option id="Music">Music</option>
<option id="Movies">Movies</option>
<option id="TVSeries">TVSeries</option>
</select></td>
</tr>
<tr>
<td>Gender</td>
<td>
<input type="radio" name="gender" id="Male" value="Male">Male
<input type="radio" name="gender" id="Female" value="Female">Female
</td>
</tr>
<tr>
<td>Games</td>
<td>
<input type="checkbox" name="games" value="Cricket">Cricket
<input type="checkbox" name="games" value="Football">Football
<input type="checkbox" name="games" value="Volleyball">Volleyball
<input type="checkbox" name="games" value="Basketball">Basketball
</td>
</tr>
<tr>
<td>Address</td>
<td><textarea rows="3" cols="50" name="address"></textarea></td>
<tr>
<td><input type="submit"></td>
</tr>
</table>
</form>
</body>
</html>