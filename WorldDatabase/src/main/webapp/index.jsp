<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>Example</title>
</head>
<body>
  <form class="searchbox" action="city" method="get">
     <input type="text" placeholder="Type to search" oninput="filterStates(this)" name="district" id="inp">
     <input type="submit" value="submit">
  </form>
   <div class="container">
       
    </div>
</body>
<script src="getcountry.js"></script>
</html>