<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>个人中心</title>
     <%@include file="/WEB-INF/header.jsp" %>

<!--loading页结束-->
<body>
	<!--<header class="self-header">
		<figure><img src="images/self-tou.png"/></figure>
		<dl>
			<dt>瑾晨</dt>
			<dd>
				<img src="images/self-header.png"/>
				<span>5684</span>
				<span>炒饭大湿</span>
			</dd>
		</dl>
		<button>签到</button>
	</header>-->

	<div class="p-top  clearfloat">
		<a href="personal.html">
			<div class="tu">
				<img src="images/detail-tou.png"/>
			</div>
			<p class="name">${user.name}</p>
		</a>
		<div class="p-bottom p-bottom1 clearfloat">
			<ul class="clearfloat">
				
				<a href="#">
					<li class="box-s">
						<span class="opa6"></span>
						<p class="bt">我的积分</p>
						<p class="price">${user.score}</p>
					</li>
					<li class="box-s">
						<span class="opa6"></span>
						<p class="bt">我的余额</p>
						<p class="price">${user.money}</p>
					</li>
				</a>
			
			</ul>
		</div>
	</div>
	
	
	
	
	<div class="contaniner fixed-contb">
		<section class="self">
			<dl>
				<dt>
					<a href="<%=ctxPath%>/User?action=order">
						<img src="images/self-icon.png"/>
						<b>全部订单</b>
						<span><img src="images/right.png"/></span>
					</a>
				</dt>
				
			
			
			
			</dl>
			<ul class="self-icon">
				<li>
					<a href="<%=ctxPath%>/User?action=datum">
						<img src="images/self-icon01.png"/>
						<p>个人信息</p>
						<span><img src="images/right.png"/></span>
					</a>
				</li>
		
				<li>
					<a href="<%=ctxPath%>/User?action=address">
						<img src="images/self-icon04.png"/>
						<p>地址管理</p>
						<span><img src="images/right.png"/></span>
					</a>
				</li>
			</ul>
			<ul class="self-icon">
			
				<li>
					<a href="<%=ctxPath%>/User?action=sign">
						<img src="images/self-icon011.png"/>
						<p>修改密码</p>
						<span><img src="images/right.png"/></span>
					</a>
				</li>
				
			</ul>
			<a href="<%=ctxPath%>/User?action=reset"><input type="button" value="退出" /></a>
			
		</section>
		
		
	</div>
	
	<%@include file="/WEB-INF/footer.jsp"%>

	
	
</body>
</html>