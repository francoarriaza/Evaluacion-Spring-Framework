<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ingresar Pago</h1>
    
<form name="payForm" onsubmit="return validate()" method="post">
   <label for="mont">Monto</label><br>
   <input type="text" id=error name="mont"><br>
   <label for="email">Mes:</label><br>
   <select name="month_list">
        <option>Enero</option>
	    <option>Febrero</option>
        <option>Marzo</option>
        <option>Abril</option>
	    <option>Mayo</option>
        <option>Junio</option>
        <option>Julio</option>
	    <option>Agosto</option>
        <option>Septiembre</option>
        <option>Octubre</option>
	    <option>Noviembre</option>
	    <option>Diciembre</option>
    </select><br>
   <label for="year">Año:</label><br>
   <select name="year_list">
        <option selected="yes">2020</option>
        <option>2019</option>
        <option>2018</option>
   </select><br>
   <label for="rut">Rut cliente:</label><br>
   <input type="text" name="rut" id=error><br>
   <input type="submit" value="Submit"><br>
</form> 

   <label id="fecha" for="fecha">fecha :</label><br>
   <script>
        var d = new Date();
        document.getElementById("fecha").innerHTML = d;
    </script> 
</body>
</html>