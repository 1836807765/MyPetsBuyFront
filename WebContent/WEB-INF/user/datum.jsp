<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>萌宠专区</title>
     <%@include file="/WEB-INF/header.jsp" %>

<!--loading页结束-->
<body>
	<header class="top-header">
			<a class="icona" href="javascript:history.go(-1)">
					<img src="images/left.png"/>
				</a>
			<h3>我的资料</h3>
			<a class="iconb" href="shopcar.html">
			</a>
	</header>
	
	<div class="contaniner">
		<ul class="self-data">
			<li>
				<a href="#">
					<p>头像</p>
					<span><img src="images/right.png"/></span>					
					<figure><img src="images/detail-tou.png"/></figure>
				</a>
			</li>
			<li>
				<a href="./User?action=namechange">
					<p>昵称</p>
					<span><img src="images/right.png"/></span>
					<small>${user.name}</small>
					
				</a>
			</li>
			<li>
				<a href="#">
					<p>性别</p>
					<span><img src="images/right.png"/></span>
					<select>
						<option>男</option>
						<option>女</option>
					</select>
					
				</a>
			</li>
			
		</ul>
	</div>
	
	
	
	

</body>
</html>