<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <%String ctxPath = request.getContextPath(); %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>购物车</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Play-Offs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
		<script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!--bootstrap-->
		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
		<!--coustom css-->
		<link href="<%=ctxPath%>/css/style.css" rel="stylesheet" type="text/css"/>
		<!--script-->
		<script src="js/jquery-2.1.4.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
<!--loading页结束-->
<body>
	     <%@include file="/WEB-INF/NewNav.jsp" %>

    	<!--Begin 商品分类详情 Begin-->    
     <form action="<%=ctxPath%>/evaluate?pid=${pid}" method="post">
            
             <table border="0" style="width:880px; margin-top:20px;"  cellspacing="0" cellpadding="0">
              <tr height="45">
                <td width="80" align="right">留言类型 &nbsp; &nbsp;</td>
                <td>                            
                	<label class="r_rad"><input type="checkbox" name="type" checked="checked" /></label><label class="r_txt">留言</label>
                    <label class="r_rad"><input type="checkbox" name="type" /></label><label class="r_txt">投诉</label>
                    <label class="r_rad"><input type="checkbox" name="type" /></label><label class="r_txt">询问</label>
                    <label class="r_rad"><input type="checkbox" name="type" /></label><label class="r_txt">售后</label>
                    <label class="r_rad"><input type="checkbox" name="type" /></label><label class="r_txt">求购</label>
                </td>
              </tr>
              <tr height="45">
                <td align="right">主题 &nbsp; &nbsp;</td>
                <td><input type="text" name="title" value="" class="add_ipt" style="width:290px;" /></td>
              </tr>
              <tr valign="top" height="110">
                <td align="right">留言内容 &nbsp; &nbsp;</td>
                <td style="padding-top:5px;"><textarea class="add_txt" name="message"></textarea></td>
              </tr>
            
             
              <tr height="50" valign="bottom">
                <td>&nbsp;</td>
                <td><input type="submit" value="提交" class="btn_tj" /></td>
              </tr>
            </table>
            
            
            
            
            
            
            
      </form>
            

            <label> <div style="color:red">${message}</div></label>

	
	<div class="b_btm_bg bg_color">
        <div class="b_btm">
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="72"><img src="images/b1.png" width="62" height="62" /></td>
                <td><h2>正品保障</h2>正品行货  放心购买</td>
              </tr>
            </table>
			<table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="72"><img src="images/b2.png" width="62" height="62" /></td>
                <td><h2>满38包邮</h2>满38包邮 免运费</td>
              </tr>
            </table>
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="72"><img src="images/b3.png" width="62" height="62" /></td>
                <td><h2>天天低价</h2>天天低价 畅选无忧</td>
              </tr>
            </table>
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="72"><img src="images/b4.png" width="62" height="62" /></td>
                <td><h2>准时送达</h2>收货时间由你做主</td>
              </tr>
            </table>
        </div>
    </div>
	<br/>
	<br/>
		<br/>
	<br/>
	<br/>
		<br/>
	<br/>
	<br/>
		<br/>
		<br/>
		<br/>
		<br/>
	
	</div>
	
	<%@include file="/WEB-INF/NewFooter.jsp" %>
	
</body>
</html>