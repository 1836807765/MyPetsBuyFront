<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
         <meta name="format-detection" content="telephone=no" />
    <title>收货地址管理</title>
     <%@include file="/WEB-INF/header.jsp" %>
    
  
<!--loading页结束-->
<body>
	<header class="top-header fixed-header">
		<a class="icona" href="javascript:history.go(-1)">
				<img src="images/left.png"/>
			</a>
		<h3>收货地址</h3>
			
			<a class="text-top" href="<%=ctxPath%>/User?action=goAddress">
				添加
			</a>
	</header>
	
<div class="contaniner fixed-conta">
<c:forEach items="${listAddress}" var="address">

		<dl class="address">
			<a href="<%=ctxPath%>/User?action=ShowAddress">
				<dt>
					<p></p>
					<span>${address.rname}${address.rphone}</span>
					<c:if test="${address.isEnable}">
					<small>
					启用
					</small>
					</c:if>
					<c:if test="${address.isEnable==null}">
					<small>
					禁用
					</small>
					</c:if>
				</dt>
				<dd>${address.local} ${address.address}</dd>
			</a>
		</dl>
</c:forEach>
</div>

	
	

	
	

</body>
</html>