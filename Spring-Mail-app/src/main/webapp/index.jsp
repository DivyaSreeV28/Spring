<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<form action="send.odc" method="post">
		 <!-- <div class="form-group">
			<label for="emailId">Email Id:</label> <input type="email"
				class="form-control" id="emailId">
		</div>
		<div class="form-group">
			<label for="subject">Subject:</label> <input type="text"
				class="form-control" id="subject">
		</div>
		<div class="form-group">
			<label for="body">Body:</label> <input type="text"
				class="form-control" id="body">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>  -->
		
		<pre>
			 Email Id: <input type="email" name="emailId" />
			
			Subject: <input type="text" name="subject" />
			
			Body: <input type="text" name="body" />
			
			<input type="submit" value="Send" /> 
			
		</pre>
	</form>
</body>
</html>