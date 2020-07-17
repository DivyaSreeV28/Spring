<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
</head>
<body>
	<h2>Information of natural Calamities</h2>
	<h3 style="color:red">${valid}</h3>
	
	<form action="register.odc" method="post">
		
		<pre>
			
			Enter Place: <input type="text" name="place" />
			
			Enter Date: <input type="date" name="date" />
			
			Enter Captured By: <input type="text" name="name" />
			
			Enter Calamity Type: <select name="types" style="width:150px">
							<option value="Flood">Flood</option>
							<option value="Rain">Rain</option>
							<option value="Cyclone">Cyclone</option>
							<option value="Earth Quake">Earth Quake</option>
							</select> 
			
			Enter Area: <input type="text" name="area" />
			
			Enter Average Loss: <input type="number" name="loss" />
			
			Enter Number of Deaths: <input type="number" name="deaths" />
			
			Enter Number of Injured: <input type="number" name="injured" />
			
			<input type="submit" value="Register" />
			
		</pre>
		
	</form> 
</body>
</html>