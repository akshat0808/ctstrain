<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>CD</title>
</head>
<body>

<table border="3">
 <tr>
<td><h2>CD CD CD: Add A New CD</h2></td>
 </tr>
</table>

 
 <form action="processForm" method="post">
  <div class="form-group">
    <label >Cd Title</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label>Cd Type</label>
    <select class="form-control" name="type">
      <option value="Unknown">Select...</option>
      <option value="ab">ab</option>
      <option value="bc">bc</option>
      <option value="cd">cd</option>
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Cd date</label>
    <input type="date" class="form-control" id="exampleFormControlInput1" placeholder="date" name="date">
  </div>
 <input type="submit"/> 
 <input type="reset"/> 
</form>
 



</body>
</html>