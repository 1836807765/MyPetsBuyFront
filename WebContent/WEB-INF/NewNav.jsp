<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!--header-part-->
		<div class="banner-background" id="to-top">
			<div class="container">
				<div class="nav-back">
					<div class="navigation">
						<nav class="navbar navbar-default">
							<!-- Brand and toggle get grouped for better mobile display -->
							<div class="navbar-header">
							  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							  </button>
							</div>
							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
									<li><a class="active" href="./Index?action=index">主页 <span class="sr-only">(current)</span></a></li>
									<li class="dropdown">
									  <a href="./Index?action=show" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">分类查询<span class="caret"></span></a>
									  <ul class="dropdown-menu">
									<li><a href="./Index?action=show">显示所有</a></li>
									  
										<li><a href="./Index?action=showCat"">显示猫类信息</a></li>
										<li><a href="./Index?action=showDog">显示犬类信息</a></li>
										<li><a href="./Index?action=showPlay">显示所有宠物周边</a></li>
									  </ul>
									</li>
									  <li class="dropdown">
									  <a href="./User?action=self" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">用户信息<span class="caret"></span></a>
									  <ul class="dropdown-menu">
									<li><a href="./User?action=self">我的资料</a></li>
									<li><a href="./User?action=order">我的订单</a></li>
									
									<li><a href="./User?action=address">收货地址</a></li>
									  
									  </ul>
									</li>
									
									
									<li><a href="./User?action=shopcar">购物车</a></li>
									<li><a href="./User?action=message">萌宠专区</a></li>
									
									
									
								<li><a href="../PetsBuyAdmin/">后台管理</a></li>
								
								</ul>
							</div><!-- /.navbar-collapse -->
								<div class="clearfix"></div>	
							<div class="clearfix"></div>
						</nav>
						<div class="clearfix"></div>
					</div>
					<div class="logo">
						<h1><a href="./Index?action=showCat">PET<span class="hlf"> 网上宠物店</span></a></h1>
					</div>