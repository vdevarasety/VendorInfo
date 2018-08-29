<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find the Vendor Information</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
<style>
#search {
    width: 15em;  height: 40em;
}
</style>
</head>
<body>

<div id="page">
   
 <%-- <%
   String vId = {vendorId}"; //%{vendorId};
  %>  --%>
<s:form action="UpdateVendorInfo" >
	 <s:textfield label="Vendor Id" value="%{vendorId}" readonly="true" tooltip="Not Editable field" key="vendorId" size="40" />  
	<%--  <s:hidden name="vendorId" value="%{vendorId}"/> --%> 
	<s:textfield label="Vendor Name" value="%{vendorName}"  key="vendorName"  size="40" />
    <%-- <s:hidden name="vendorName"  />  --%>  
 	<s:textfield label="Vendor Type" value="%{vendorType}"  key="vendorType"  size="40"/>
 	<%-- <s:hidden name="vendorType" value="%{vendorType}"/> --%>
 	<s:textfield label="Vendor City" value="%{vendorCity}"  key="vendorCity"  size="40"/>
 	<%-- <s:hidden name="vendorCity" value="%{vendorCity}"/>  --%>
 	 
 	 <s:submit class="button" value="Update"  name="update" align="center"/> 
    <%--<s:submit class="button" value="Delete" name="delete"  />   --%>
 </s:form>

<%--  <s:form action="UpdateVendorInfo" name="regform" id="regform" theme="simple">
<table style="width:75%;" cellspacing="0" cellpadding="0" border="0">
  <tr style="white-space:nowrap;">
    <td style="width:50%;" valign="top" align="right" >
        <s:submit value="Update"  name="update" id="search" style="height:25px; width:80px" />
    </td>
    <td style="width:50%;" valign="top" align="left" >
        <s:submit value="Insert" name="delete" id="search" style="height:25px; width:80px" />
    </td>
  </tr>
</table>
</s:form>  --%> 
 <%-- <s:form action="UpdateVendorInfo">
    <s:submit class="button" value="Update"  name="update" align="center"/> 
    <s:submit class="button" value="Delete" name="delete"  />  
</s:form> --%>

    
</div>
  
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script src="script.js"></script>
</body>
	</html>