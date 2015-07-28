<%--
  Created by www.wellgoon.com.
  User: Rocky
  Date: 2015/7/25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Wellcome We'll go on</title>
  </head>
  <body>
    <s:iterator value="userList" id="item">
      <s:property value="#item.id" />
      <s:property value="#item.username" />
      <s:property value="#item.password" />
    </s:iterator>
  </body>
</html>
