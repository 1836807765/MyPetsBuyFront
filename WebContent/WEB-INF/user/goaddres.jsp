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
	<header class="top-header fixed-header">
		<a class="icona" href="javascript:history.go(-1)">
				<img src="images/left.png"/>
			</a>
		<h3>萌宠专区</h3>
			
			<a class="text-top" >
			</a>
	</header>
	
	<div class="contaniner fixed-conta">
	<form action="<%=ctxPath%>/User?action=goAddressSubmit" method="post" class="change-address" id="save">
		
			<ul>
				<li>
					<label class="addd">收货人：</label>
					<input type="text" value="" id ="rname" name="rname" placeholder="请输入收货人" required="required"/>
				</li>
				<li>
					<label class="addd">手机号：</label>
					<input type="tel" value="" id ="rphone" name="rphone" placeholder="请输入手机号" required="required"/>
				</li>
				<li>
					<label class="addd">所在地区：</label>
				    <input type="tel" value="" id ="local" name="local" placeholder="请输入地区"required="required"/>

				</li>
				<li>
					<label class="addd">详细地址：</label>
					<textarea required="required" id ="address" name="address" placeholder="请输入详细地址"></textarea>
				</li>
			</ul>
			
			
			<ul>
				<li>
					<h3>删除此地址</h3>
				</li>
			</ul>
			<input type="submit"  value="保存" />
	</form>

	</div>
	<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		$(".checkboxa label").on('touchstart',function(){
			if($(this).hasClass('checkd')){
				$(".checkboxa label").removeClass("checkd");
			}else{
				$(".checkboxa label").addClass("checkd");
			}
		})
	</script>
	


</body>
</html>