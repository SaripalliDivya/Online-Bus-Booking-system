<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<title>Add Booking</title>
<style type="text/css">
<%@include file="css/style.css" %>
</style>
</head>
<body>
<div id="main-holder">
		<h2>Add Booking Details</h2>
		<form action="addCon" method="post" id="login-form">
			<table style="with: 100%">
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" class="login-form-field" /></td>
				</tr>
				<tr>
					<td>MobileNO</td>
					<td><input type="text" name="mobile" class="login-form-field" /></td>
				</tr>
				<tr>
					<td>AadharId</td>
					<td><input type="text" name="date" class="login-form-field" /></td>
				</tr>
				<tr>
					<td>EmailId</td>
					<td><input type="text" name="seatno" class="login-form-field" /></td>
				</tr>
				
			</table>
			<input type="submit" value="add" id="login-form-submit" />
		</form>
	</div>
</body>
</html>