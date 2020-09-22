<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>青软云盘</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${pageContext.request.contextPath }/lib/lightbox/css/lightbox.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath }/lib/bootstrap-3.4.1-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath }/lib/layer-v3.1.1/layer/theme/default/layer.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath }/css/index.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath }/lib/jquery/jquery-1.12.4.min.js"></script>
<script src="${pageContext.request.contextPath }/lib/lightbox/js/lightbox.min.js"></script>
<script src="${pageContext.request.contextPath }/lib/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/lib/layer-v3.1.1/layer/layer.js"></script>
<script
	src="${pageContext.request.contextPath }/lib/ckplayer6.8/ckplayer/ckplayer.js"></script>
<script src="http://static.bcedocument.com/reader/v2/doc_reader_v2.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/index.js"></script>
</head>
<body>
	<div class="content">
		<div class="top">
			<%@include file="top.jsp"%>
		</div>
		<div class="bottom" onclick="">
			<div class="left">
				<%@include file="menu.jsp"%>
			</div>
			<div class="right">
				<jsp:include page="main.jsp"></jsp:include>
			</div>
		</div>

	</div>
	<%@include file="tab.jsp"%>
</body>
</html>
