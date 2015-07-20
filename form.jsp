<%@ page contentType="text/html; encoding=utf-8"%>
<%@ page import="com.gmail.fedorenko.kostia.ApplicantArray"%>
<html>
  <head>
    <title>Hello App Engine</title>
  </head>
  <body>
    <h1>Welcome to My form test!</h1>
    	<%! ApplicantArray list = ApplicantArray.getInstance(); %>
    	<%= list %>
    	<%= list.getStat() %>
		<form action="/input" method="POST">
			<input type="text" name="name"> 
			<input type="text" name="surname">
			<p>Please select gender</p>
			<input type="radio" name="gender" value="1">Male<br>
			<input type="radio" name="gender" value="0">Female<br>
			<p>Are you from Ukraine?</p>
			<input type="radio" name="citizenship" value="1">Yes<br>
			<input type="radio" name="citizenship" value="0">No<br>
			<button>Send</button>
		</form>
  </body>
</html>