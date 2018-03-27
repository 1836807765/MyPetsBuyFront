<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html>
	<head>
			     <%@include file="/WEB-INF/NewHeader.jsp" %>
		
	</head>
	<body>
				     <%@include file="/WEB-INF/NewNav.jsp" %>

		<!--services-->
			<div class="services">
				<div class="container">
					<div class="service-list">
						<h3>GALLERY</h3>
						
						<div class="col-md-8">
							<link rel="stylesheet" href="css/swipebox.css">
							<script src="js/jquery.swipebox.min.js"></script> 
							<script type="text/javascript">
								jQuery(function($) {
									$(".swipebox").swipebox();
								});
							</script>
								
							<div class="gallery-grids">
					            <c:forEach items="${listPets}" var="pets">					
								<div class="col-md-4 gal-settings">
						       <a href=" <%=ctxPath%>/shop?action=detail&&id=${pets.id}">
						       <img src="${pets.image}" width="200px" height="200px" alt="${pets.description}">
						      	</a>

                              	<dd>${pets.name}</dd> 
					            <b>价格${pets.sale}</b>
								</div>
					             </c:forEach>
								
								
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		<!--services-->
				     <%@include file="/WEB-INF/NewFooter.jsp" %>

	</body>
</html>