<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>购物车</title>
	     <%@include file="/WEB-INF/NewHeader.jsp" %>

<!--loading页结束-->
<body>
	     <%@include file="/WEB-INF/NewNav.jsp" %>

    	<!--Begin 商品分类详情 Begin-->    
    	
    	<div class="nav">
        	<div class="nav_t">我的订单</div>
            <div class="leftNav none">
                <ul>      
                    <li>
                    
                        <div class="zj">
                            <div class="zj_l">
                                
	        	                <c:forEach items="${petsList}" var="pets">
	                            <span>待发货</span>
                                <div class="zj_l_c">
                                  
                             <img src="${pets.image}" width="236" height="200" /></a>                     
                                 <h3>${pets.name}</h3>
                                
                                    <p>${pets.name}</p>
                                    <strong>年龄${pets.age}</strong>
					       			<small>${pets.description}</small>	
                                    <b>商品价格:${pets.sale}元</b>
                                    </div>
          <a href="<%=ctxPath%>/User?action=orderdelete&&id=${pets.tid}">
					<input type="button" value="确认收货" class="order-que"/>
					</a>
			<a href="<%=ctxPath%>/User?action=evaluate&&id=${pets.id}">
					<input type="button" value="立刻评价" onclick="javascript:location.href='wuliu.html'" />
			</a>
			<a href="<%=ctxPath%>/User?action=orderdelete&&id=${pets.tid}">
				
					<input type="button" value="取消订单" />
			</a>
					
                                </c:forEach>
                               
				

                            </div>
                            
                            <br/>
                            <br/>
                           	<br/>
		<br/>
		<br/>
		<br/>
		<br/><br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/> 

         

                        </div>

	</li>
	</ul>
	</div>
	
	
	<br/>
	<br/>
		<br/>
	
		<br/>
	
	</div>
	
	<%@include file="/WEB-INF/NewFooter.jsp" %>
	
</body>
</html>