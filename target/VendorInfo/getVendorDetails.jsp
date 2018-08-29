<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find the Vendor Information</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>

<div id="page">
   
 
<s:form action="GetVendorInfo" >
 	
	<input id="s" name="vendorId" type="text" placeholder="Enter Vendor Id" />
            
    <input type="submit" value="Search" id="submitButton" />
</s:form>

<div id="resultsDiv"></div>
    
</div>
  
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script src="script.js"></script>
</body>
	</html>