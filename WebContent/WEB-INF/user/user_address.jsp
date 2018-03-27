<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <%String ctxPath = request.getContextPath(); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>DeathGhost-用户中心</title>
<meta name="keywords" content="DeathGhost,DeathGhost.cn,web前端设,移动WebApp开发" />
<meta name="description" content="DeathGhost.cn::H5 WEB前端设计开发!" />
<meta name="author" content="DeathGhost"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Play-Offs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
		<script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!--bootstrap-->
		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<!--
Author: DeathGhost
Author URI: http://www.deathghost.cn
-->
</head>
<body>
<%@include file="/WEB-INF/NewNav.jsp" %>

  <div class="section fl">
    <div class="location tr">
     <a href="<%=ctxPath%>/User?action=self">我的资料</a>
    
    <a href="<%=ctxPath%>/User?action=order" class="current">我的订单</a>
    <a href="<%=ctxPath%>/User?action=sign">修改密码</a>
    <a href="<%=ctxPath%>/User?action=address">地址管理</a></div>
    <div class="pd20">
     <form action="<%=ctxPath%>/User?action=goAddressSubmit" method="post">
      <table class="baseinfo">
        <tr>
          <th>账号：</th>
          <td>${user.email }</td>
        </tr>
     
        <tr>
          <th valign="top">头像：</th>
          <td>
            <div class="user-photo img fl"><img src="./uploads/10.jpg" ></div>
            <div class="upfilebox mt20">
              <a href="javascript:;" class="button btn-upfile" id="user-photo">选择照片</a>
              <p class="mt10">支持jpg,gif,png格式，建议尺寸大于100*100。</p>
            </div>
          </td>
        </tr>
   
        <tr>
          <th>收货人姓名</th>
          <td><input type="text" name="rname" value="${listAddress.rname }" class="baseipt"></td>
        </tr>
          <tr>
          <th>收货人电话</th>
          <td><input type="text" name="rphone" value="${listAddress.rphone}" class="baseipt"></td>
        </tr>
            <tr>
          <th>收货人的地址</th>
          <td><input type="text" name="local" value="${listAddress.local}" class="baseipt"></td>
        </tr>
            <tr>
          <th>收货人的详细地址</th>
          <td><input type="text" name="address" value="${listAddress.address}" class="baseipt"></td>
        </tr>
      </table>
                  <label> <div style="color:red">${message}</div></label>
                        <p class="mt30 tc"><button type="submit" class="button btn-save">保存</button>
      
      </form>
      
    </div>
  </div>

<%@include file="/WEB-INF/NewFooter.jsp" %>
</body>
</html>
