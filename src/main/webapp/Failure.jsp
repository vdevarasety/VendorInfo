<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaction Failed</title>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>
    <body>
    <div id="page">
      <s:form>
	    <h4>Some thing went wrong while processing request</h4>
	    <s:textfield name="vendorId" value="%{vendorId}"/> 
	    </s:form>
      </div>
    </body>
</html>
