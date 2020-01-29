<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Add A Customer</title>
</head>
<body>
	<form id="form-1" action="controller.do" method="post">

		<table class="table">

			<tbody>
				<tr>

					<td><label>First Name:</label></td>
					<td><input placeholder="first name.." type="text" name="fName"
						required="required" /></td>

				</tr>
				<tr>

					<td><label>Last Name:</label></td>
					<td><input placeholder="last name.." type="text" name="lName"
						required="required" /></td>

				</tr>
				<tr>

					<td><label>email:</label></td>
					<td><input placeholder="email.." type="email" name="email"
						required="required" /><br /></td>

				</tr>
			</tbody>
		</table>
		<input type="submit" value="add" id="button-1" />
		 <input type="reset"
			value="reset" id="button-2" />
	</form>
	
	<a href="success.jsp" id="button-3" data-rel="back" class="ui-btn ui-btn-inline ui-corner-all">back</a>
</body>
</html>