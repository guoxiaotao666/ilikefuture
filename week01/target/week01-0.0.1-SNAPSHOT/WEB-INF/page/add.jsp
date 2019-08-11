<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<c:set var="path" value="${pageContext.request.contextPath }" scope="page"></c:set>
<link rel="stylesheet" href="${path }/resource/css/index_work.css">
<script type="text/javascript" src="${path}/resource/jquery/jquery-3.2.1.js"></script>
<script type="text/javascript" src="${path}/resource/js/list.js"></script>
</head>
<body>
	<h1>添加</h1>
	<input type="button" value="添加">
</body>
</html>