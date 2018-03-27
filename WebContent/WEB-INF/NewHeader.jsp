	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <%String ctxPath = request.getContextPath(); %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<title>网上宠物店</title>
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
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<!--fonts-->
		<link href='#css?family=Quicksand:300,400,700' rel='stylesheet' type='text/css'>
		<link href='#css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
		<!--script-->
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},900);
				});
			});
		</script>