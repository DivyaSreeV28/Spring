<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mail Page</title>
</head>
<body>

	<h2>Send Mail</h2>
	<form action="click.odc" method="post">
		
		<pre>
			
			From: <input type="text" name="from" />
			
			To: <input type="text" name="to" />
			
			Subject: <input type="text" name="subject" />
			
			Body: <input type="text" name="body" />
			
			<input type="submit" value="Send" />
			
		</pre>
		
	</form> 
</body>
</html>