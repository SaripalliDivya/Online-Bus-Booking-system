<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<title>Delete Booking</title>
<style type="text/css">
<%@include file="css/style.css" %>
</style>
</head>
<body>
<div id="main-holder">
<h2>Delete Booking Details</h2>
		<form action="delController" method="post" id="login-form">
			<table style="with: 100%">
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="mobile" class="login-form-field" /></td>
				</tr>
				</table>
          <input type="submit" value="display" id="login-form-submit" />
		</form>
	</div>
</body>
</html>
