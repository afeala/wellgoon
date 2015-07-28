<%--
  Created by www.wellgoon.com.
  User: Rocky
  Date: 2015/7/25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>We'll Go On Manager</title>
</head>
<body>
<s:iterator value="userList" id="item">
    <s:property value="#item.id" /><br/>
    <s:property value="#item.username" /><br/>
    <s:property value="#item.password" /><br/>
</s:iterator>
</body>
</html>
