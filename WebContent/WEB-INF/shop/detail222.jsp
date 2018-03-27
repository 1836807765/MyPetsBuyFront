<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    			     <%@include file="/WEB-INF/NewHeader.jsp" %>

</head>
				     <%@include file="/WEB-INF/NewNav.jsp" %>

            
            <div class="des_border" id="p_details">
                <div class="des_t">宠物详情</div>
                <div class="des_con">
                	<table border="0" align="center" style="width:745px; font-size:14px; font-family:'宋体';" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="500"><img src="${petsDto.image }" width="312" height="312" /></td>
                        <td>
                        	<b>宠物名称${petsDto.name}</b><br />
                            【宠物年龄】${petsDto.age}岁 【宠物质地】【宠物产地】：${petsDto.description}<br />
                            【适用人群】：气质是友好、温和,但也不失机警、热情、聪明、温顺、热心,饲养的城乡均可,宽敞为佳。最好是住在郊区,有一个有围栏的院子更好<br />
                            【价格】 ${petsDto.sale}
                        </td>
                      </tr>
                    </table>
                    
                </div>
          	</div>  
            
            <div class="des_border" id="p_comment">
            	<div class="des_t">宠物评论</div>
                
                <table border="0" class="jud_tab" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="175" class="jud_per">
                    	<p>80.0%</p>好评度
                    </td>
                    <td width="300">
                    	<table border="0" style="width:100%;" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="90">好评<font color="#999999">（80%）</font></td>
                            <td><img src="images/pl.gif" align="absmiddle" /></td>
                          </tr>
                          <tr>
                            <td>中评<font color="#999999">（20%）</font></td>
                            <td><img src="images/pl.gif" align="absmiddle" /></td>
                          </tr>
                          <tr>
                            <td>差评<font color="#999999">（0%）</font></td>
                            <td><img src="images/pl.gif" align="absmiddle" /></td>
                          </tr>
                        </table>
                    </td>
                    <td class="jud_bg">您可对已购买宠物进行评价<br />
			      <a href="<%=ctxPath%>/shop?action=detailSubmit&&id=${petsDto.id}" class="go-car">			
                <img src="images/j_car.png" /></a></td>
                  </tr>
                </table>
                
                
                				
                <table border="0" class="jud_list" style="width:100%; margin-top:30px;" cellspacing="0" cellpadding="0">
                  <tr valign="top">
                    <td width="160"><img src="images/peo1.jpg" width="20" height="20" align="absmiddle" />&nbsp;向死而生</td>
                    <td width="180">
                    	颜色分类：<font color="#999999">粉色</font> <br />
                        年龄：<font color="#999999">1岁</font>
                    </td>
                    <td>
                    	产品很好，很喜欢，必须给赞。 <br />
                        <font color="#999999">2015-09-24</font>
                    </td>
                  </tr>
                  <tr valign="top">
                    <td width="160"><img src="images/peo2.jpg" width="20" height="20" align="absmiddle" />&nbsp;就是这么想的</td>
                    <td width="180">
                    	颜色分类：<font color="#999999">粉色</font> <br />
                        年龄：<font color="#999999">1岁</font>
                    </td>
                    <td>
                    	送朋友，她很喜欢，大爱。 <br />
                        <font color="#999999">2015-09-24</font>
                    </td>
                  </tr>
                  <tr valign="top">
                    <td width="160"><img src="images/peo3.jpg" width="20" height="20" align="absmiddle" />&nbsp;墨镜墨镜</td>
                    <td width="180">
                    	颜色分类：<font color="#999999">粉色</font> <br />
                        年龄：<font color="#999999">1岁</font>
                    </td>
                    <td>
                    	大家都说不错<br />
                        <font color="#999999">2015-09-24</font>
                    </td>
                  </tr>
                  <tr valign="top">
                    <td width="160"><img src="images/peo4.jpg" width="20" height="20" align="absmiddle" />&nbsp;那*****洋 <br /><font color="#999999">（匿名用户）</font></td>
                    <td width="180">
                    	颜色分类：<font color="#999999">粉色</font> <br />
                        年龄：<font color="#999999">1岁</font>
                    </td>
                    <td>
                    	下次还会来买，推荐。<br />
                        <font color="#999999">2015-09-24</font>
                    </td>
                  </tr>

                 <c:forEach items="${eva}" var="e"> 
               <tr valign="top">
                    <td width="160"><img src="images/peo4.jpg" width="20" height="20" align="absmiddle" />&nbsp;${e.username } <br /><font color="#999999">（匿名用户）</font></td>
                    <td width="180">
                    	主题：<font color="#999999">${e.title }</font> <br />
                        年龄：<font color="#999999">无</font>
                    </td>
                    <td>
                    	${e.message }<br />
                        <font color="#999999">卖家回复:${e.answer}</font>
                    </td>
                  </tr>
                  </c:forEach>
                  
                  
                  
                </table>

                	
            
            
        </div>
    </div>
				     <%@include file="/WEB-INF/NewFooter.jsp" %>

	
<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	$(window).scroll(function() {
	    if ($(".detail-header").offset().top > 50) {
        $(".detail-header").addClass("change");
    } else {
        $(".detail-header").removeClass("change");
    }
	});
</script>
<script src="js/swiper.min.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			var mySwiper = new Swiper('.swiper-container',{
				    loop: true,
				    speed:1000,
					autoplay: 2000,
					pagination: '.swiper-pagination',
				  });
		})
	</script>
</body>
</html>