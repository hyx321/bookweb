<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'category.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	
	<h1>${book.name}</h1>
  	类别：${book.category.name}<br/>
  	作者：${book.author}&nbsp;&nbsp;
  	价格：${book.price}<br/><br/>
  	简介：<br/>${book.desc}<br/>


  	<s:if test="is_addfavor">
  		<a href="user_cancelfavor?bookid=${param.bookid}">取消收藏</a>
  	</s:if>
  	<s:else>
  		<a href="user_addfavor?bookid=${param.bookid}">收藏本书</a>
  	</s:else>
  	<a href="${pageContext.request.contextPath}/entry">返回主页</a>
  </body>
</html>
