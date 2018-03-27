<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>购物车</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/shopping-mall-index.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/zhonglin.js"></script>
</head>

<body style="position:relative;">

	<!--top 开始-->
    <div class="top">
    	<div class="top-con w1200">
        	<p class="t-con-l f-l">您好，欢迎来到宅客微购</p>
            <ul class="t-con-r f-r">
            	<li><a href="#">我 (个人中心)</a></li>
            	<li><a href="#">我的购物车</a></li>
            	<li><a href="#">我的订单</a></li>
            	<li class="erweima">
                	<a href="#">扫描二维码</a>
                    <div class="ewm-tu">
                    	<a href="#"><img src="images/erweima-tu.jpg" /></a>
                    </div>
                </li>
                <div style="clear:both;"></div>
            </ul>
            <div style="clear:both;"></div>
        </div>
    </div>
    
    <!--logo search 开始-->
    <div class="hd-info1 w1200">
    	<div class="logo f-l">
        	<h1><a href="#" title="中林网站"><img src="images/logo.jpg" /></a></h1>
        </div>
        <div class="search f-r">
        	<ul class="sp">
            	<li class="current" ss-search="sp"><a href="JavaScript:;">商品</a></li>
                <li ss-search="dp"><a href="JavaScript:;">店铺</a></li>
                <div style="clear:both;"></div>
            </ul>
            <div class="srh">
            	<div class="ipt f-l">
                	<input type="text" placeholder="搜索商品..." ss-search-show="sp" />
                    <input type="text" placeholder="搜索店铺..." ss-search-show="dp" style="display:none;" />
                </div>
                <button class="f-r">搜 索</button>
                <div style="clear:both;"></div>
            </div>
            <ul class="sp2">
                <li><a href="#">绿豆</a></li>
                <li><a href="#">大米</a></li>
                <li><a href="#">驱蚊</a></li>
                <li><a href="#">洗面奶</a></li>
                <li><a href="#">格力空调</a></li>
                <li><a href="#">洗发护发</a></li>
                <li><a href="#">葡萄 </a></li>
                <li><a href="#">脉动</a></li>
                <li><a href="#">海鲜水产</a></li>
                <div style="clear:both;"></div>
            </ul>
        </div>
        <div style="clear:both;"></div>
    </div>
    
    <!--切换城市-->
    <div class="switch-city w1200">
    	<a href="#" class="dianji-qh">切换城市</a>
        <span class="dqm">重庆市</span>
        <div class="select-city">
        	<div class="sl-city-top">
            	<p class="f-l">切换城市</p>
                <a class="close-select-city f-r" href="#">
                	<img src="images/close-select-city.gif" />
                </a>
            </div>
            <div class="sl-city-con">
            	<p>西北</p>
                <dl>
                	<dt>重庆市</dt>
                    <dd>
                    	<a href="#">长寿区</a>
                        <a href="#">巴南区</a>
                        <a href="#">南岸区</a>
                        <a href="#">九龙坡区</a>
                        <a href="#">沙坪坝区</a>
                        <a href="#">北碚</a>
                        <a href="#">江北区</a>
                        <a href="#">渝北区</a>
                        <a href="#">大渡口区</a>
                        <a href="#">渝中区</a>
                        <a href="#">万州</a>
                        <a href="#">武隆</a>
                        <a href="#">晏家</a>
                        <a href="#">长寿湖</a>
                        <a href="#">云集</a>
                        <a href="#">华中</a>
                        <a href="#">林封</a>
                        <a href="#">双龙</a>
                        <a href="#">石回</a>
                        <a href="#">龙凤呈祥</a>
                        <a href="#">朝天门</a>
                        <a href="#">中华</a>
                        <a href="#">玉溪</a>
                        <a href="#">云烟</a>
                        <a href="#">红塔山</a>
                        <a href="#">真龙</a>
                        <a href="#">天子</a>
                        <a href="#">娇子</a>
                    </dd>
                    <div style="clear:both;"></div>
                </dl>
                <dl>
                	<dt>新疆</dt>
                    <dd>
                    	<a href="#">齐乌鲁木</a>
                        <a href="#">昌吉</a>
                        <a href="#">巴音</a>
                        <a href="#">郭楞</a>
                        <a href="#">伊犁</a>
                        <a href="#">阿克苏</a>
                        <a href="#">喀什</a>
                        <a href="#">哈密</a>
                        <a href="#">克拉玛依</a>
                        <a href="#">博尔塔拉</a>
                        <a href="#">吐鲁番</a>
                        <a href="#">和田</a>
                        <a href="#">石河子</a>
                        <a href="#">克孜勒苏</a>
                        <a href="#">阿拉尔</a>
                        <a href="#">五家渠</a>
                        <a href="#">图木舒克</a>
                        <a href="#">库尔勒</a>
                    </dd>
                    <div style="clear:both;"></div>
                </dl>
                <dl>
                	<dt>甘肃</dt>
                    <dd>
                    	<a href="#">兰州</a>
                        <a href="#">天水</a>
                        <a href="#">巴音</a>
                        <a href="#">白银</a>
                        <a href="#">庆阳</a>
                        <a href="#">平凉</a>
                        <a href="#">酒泉</a>
                        <a href="#">张掖</a>
                        <a href="#">武威</a>
                        <a href="#">定西</a>
                        <a href="#">金昌</a>
                        <a href="#">陇南</a>
                        <a href="#">临夏</a>
                        <a href="#">嘉峪关</a>
                        <a href="#">甘南</a>
                    </dd>
                    <div style="clear:both;"></div>
                </dl>
                <dl>
                	<dt>宁夏</dt>
                    <dd>
                    	<a href="#">银川</a>
                        <a href="#">吴忠</a>
                        <a href="#">石嘴山</a>
                        <a href="#">中卫</a>
                        <a href="#">固原</a>
                    </dd>
                    <div style="clear:both;"></div>
                </dl>
                <dl>
                	<dt>青海</dt>
                    <dd>
                    	<a href="#">西宁</a>
                        <a href="#">海西</a>
                        <a href="#">海北</a>
                        <a href="#">果洛</a>
                        <a href="#">海东</a>
                        <a href="#">黄南</a>
                        <a href="#">玉树</a>
                        <a href="#">海南</a>
                    </dd>
                    <div style="clear:both;"></div>
                </dl>
            </div>
        </div>
    </div>
    
    <!--内容开始-->
    <div class="cart-content w1200">
    	<ul class="cart-tit-nav">
        	<li class="current"><a href="#">全部商品   21</a></li>
        	<li><a href="#">降价商品   1</a></li>
        	<li><a href="#">进口商品   1</a></li>
            <div style="clear:both;"></div>
        </ul>
        <div class="cart-con-tit">
        	<p class="p1">
            	<input type="checkbox" value="" name="hobby"></input>
				<span>全选</span>
            </p>
            <p class="p2">商品信息</p>
            <p class="p3">规格</p>
            <p class="p4">数量</p>
            <p class="p5">单价（元）</p>
            <p class="p6">金额（元）</p>
            <p class="p7">操作</p>
        </div>
        <div class="cart-con-info">
        	<div class="info-top">
            	<input type="checkbox" value="" name="hobby"></input>
				<span>商家：向东服饰专卖店</span>
            </div>
            <div class="info-mid">
            	<input type="checkbox" value="" name="hobby" class="mid-ipt f-l"></input>
                <div class="mid-tu f-l">
                	<a href="#"><img src="images/dai1.gif" /></a>
                </div>
                <div class="mid-font f-l">
                	<a href="#">登高阁紫菜肉松鸡蛋卷 海苔蛋卷 糕点<br />江西特产小吃 休闲办公零食</a>
                    <span>满赠</span>
                </div>
                <div class="mid-guige f-l">
                	<p>颜色：蓝色</p>
                    <p>尺码：XL</p>
                    <a href="JavaScript:;" class="xg" xg="xg1">修改</a>
                    <div class="guige-xiugai" xg-g="xg1">
                    	<div class="xg-left f-l">
                        	<dl>
                            	<dt>颜  色</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">黑色</a>
                                    <a href="JavaScript:;">白色</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <dl>
                            	<dt>尺  码</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">M</a>
                                    <a href="JavaScript:;">L</a>
                                    <a href="JavaScript:;">XL</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <a href="JavaScript:;" class="qd">确定</a>
                            <a href="JavaScript:;" class="qx" qx="xg1">取消</a>
                        </div>
                    	<div class="xg-right f-l">
                        	<a href="#"><img src="images/dai2.gif" /></a>
                        </div>
                        <div style="clear:both;"></div>
                    </div>
                </div>
                <div class="mid-sl f-l">
                	<a href="JavaScript:;" class="sl-left">-</a>
                    <input type="text" value="1" />
                    <a href="JavaScript:;" class="sl-right">+</a>
                </div>
                <p class="mid-dj f-l">¥ 66.00</p>
                <p class="mid-je f-l">¥ 66.00</p>
                <div class="mid-chaozuo f-l">
                	<a href="#">移入收藏夹</a>
                    <a href="#">删除</a>
                </div>
                <div style="clear:both;"></div>
            </div>
        </div>
        <div class="cart-con-info">
        	<div class="info-top">
            	<input type="checkbox" value="" name="hobby"></input>
				<span>商家：向东服饰专卖店</span>
            </div>
            <div class="info-mid">
            	<input type="checkbox" value="" name="hobby" class="mid-ipt f-l"></input>
                <div class="mid-tu f-l">
                	<a href="#"><img src="images/dai1.gif" /></a>
                </div>
                <div class="mid-font f-l">
                	<a href="#">登高阁紫菜肉松鸡蛋卷 海苔蛋卷 糕点<br />江西特产小吃 休闲办公零食</a>
                    <span>满赠</span>
                </div>
                <div class="mid-guige f-l">
                	<p>颜色：蓝色</p>
                    <p>尺码：XL</p>
                    <a href="JavaScript:;" class="xg" xg="xg2">修改</a>
                    <div class="guige-xiugai" xg-g="xg2">
                    	<div class="xg-left f-l">
                        	<dl>
                            	<dt>颜  色</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">黑色</a>
                                    <a href="JavaScript:;">白色</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <dl>
                            	<dt>尺  码</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">M</a>
                                    <a href="JavaScript:;">L</a>
                                    <a href="JavaScript:;">XL</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <a href="JavaScript:;" class="qd">确定</a>
                            <a href="JavaScript:;" class="qx" qx="xg2">取消</a>
                        </div>
                    	<div class="xg-right f-l">
                        	<a href="#"><img src="images/dai2.gif" /></a>
                        </div>
                        <div style="clear:both;"></div>
                    </div>
                </div>
                <div class="mid-sl f-l">
                	<a href="JavaScript:;" class="sl-left">-</a>
                    <input type="text" value="1" />
                    <a href="JavaScript:;" class="sl-right">+</a>
                </div>
                <p class="mid-dj f-l">¥ 66.00</p>
                <p class="mid-je f-l">¥ 66.00</p>
                <div class="mid-chaozuo f-l">
                	<a href="#">移入收藏夹</a>
                    <a href="#">删除</a>
                </div>
                <div style="clear:both;"></div>
            </div>
        </div>
        <div class="cart-con-info">
        	<div class="info-top">
            	<input type="checkbox" value="" name="hobby"></input>
				<span>商家：向东服饰专卖店</span>
            </div>
            <div class="info-mid">
            	<input type="checkbox" value="" name="hobby" class="mid-ipt f-l"></input>
                <div class="mid-tu f-l">
                	<a href="#"><img src="images/dai1.gif" /></a>
                </div>
                <div class="mid-font f-l">
                	<a href="#">登高阁紫菜肉松鸡蛋卷 海苔蛋卷 糕点<br />江西特产小吃 休闲办公零食</a>
                    <span>满赠</span>
                </div>
                <div class="mid-guige f-l">
                	<p>颜色：蓝色</p>
                    <p>尺码：XL</p>
                    <a href="JavaScript:;" class="xg" xg="xg3">修改</a>
                    <div class="guige-xiugai" xg-g="xg3">
                    	<div class="xg-left f-l">
                        	<dl>
                            	<dt>颜  色</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">黑色</a>
                                    <a href="JavaScript:;">白色</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <dl>
                            	<dt>尺  码</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">M</a>
                                    <a href="JavaScript:;">L</a>
                                    <a href="JavaScript:;">XL</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <a href="JavaScript:;" class="qd">确定</a>
                            <a href="JavaScript:;" class="qx" qx="xg3">取消</a>
                        </div>
                    	<div class="xg-right f-l">
                        	<a href="#"><img src="images/dai2.gif" /></a>
                        </div>
                        <div style="clear:both;"></div>
                    </div>
                </div>
                <div class="mid-sl f-l">
                	<a href="JavaScript:;" class="sl-left">-</a>
                    <input type="text" value="1" />
                    <a href="JavaScript:;" class="sl-right">+</a>
                </div>
                <p class="mid-dj f-l">¥ 66.00</p>
                <p class="mid-je f-l">¥ 66.00</p>
                <div class="mid-chaozuo f-l">
                	<a href="#">移入收藏夹</a>
                    <a href="#">删除</a>
                </div>
                <div style="clear:both;"></div>
            </div>
        </div>
        <div class="cart-con-info">
        	<div class="info-top">
            	<input type="checkbox" value="" name="hobby"></input>
				<span>商家：向东服饰专卖店</span>
            </div>
            <div class="info-mid">
            	<input type="checkbox" value="" name="hobby" class="mid-ipt f-l"></input>
                <div class="mid-tu f-l">
                	<a href="#"><img src="images/dai1.gif" /></a>
                </div>
                <div class="mid-font f-l">
                	<a href="#">登高阁紫菜肉松鸡蛋卷 海苔蛋卷 糕点<br />江西特产小吃 休闲办公零食</a>
                    <span>满赠</span>
                </div>
                <div class="mid-guige f-l">
                	<p>颜色：蓝色</p>
                    <p>尺码：XL</p>
                    <a href="JavaScript:;" class="xg" xg="xg4">修改</a>
                    <div class="guige-xiugai" xg-g="xg4">
                    	<div class="xg-left f-l">
                        	<dl>
                            	<dt>颜  色</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">黑色</a>
                                    <a href="JavaScript:;">白色</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <dl>
                            	<dt>尺  码</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">M</a>
                                    <a href="JavaScript:;">L</a>
                                    <a href="JavaScript:;">XL</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <a href="JavaScript:;" class="qd">确定</a>
                            <a href="JavaScript:;" class="qx" qx="xg4">取消</a>
                        </div>
                    	<div class="xg-right f-l">
                        	<a href="#"><img src="images/dai2.gif" /></a>
                        </div>
                        <div style="clear:both;"></div>
                    </div>
                </div>
                <div class="mid-sl f-l">
                	<a href="JavaScript:;" class="sl-left">-</a>
                    <input type="text" value="1" />
                    <a href="JavaScript:;" class="sl-right">+</a>
                </div>
                <p class="mid-dj f-l">¥ 66.00</p>
                <p class="mid-je f-l">¥ 66.00</p>
                <div class="mid-chaozuo f-l">
                	<a href="#">移入收藏夹</a>
                    <a href="#">删除</a>
                </div>
                <div style="clear:both;"></div>
            </div>
        </div>
        <div class="cart-con-info">
        	<div class="info-top">
            	<input type="checkbox" value="" name="hobby"></input>
				<span>商家：向东服饰专卖店</span>
            </div>
            <div class="info-mid">
            	<input type="checkbox" value="" name="hobby" class="mid-ipt f-l"></input>
                <div class="mid-tu f-l">
                	<a href="#"><img src="images/dai1.gif" /></a>
                </div>
                <div class="mid-font f-l">
                	<a href="#">登高阁紫菜肉松鸡蛋卷 海苔蛋卷 糕点<br />江西特产小吃 休闲办公零食</a>
                    <span>满赠</span>
                </div>
                <div class="mid-guige f-l">
                	<p>颜色：蓝色</p>
                    <p>尺码：XL</p>
                    <a href="JavaScript:;" class="xg" xg="xg5">修改</a>
                    <div class="guige-xiugai" xg-g="xg5">
                    	<div class="xg-left f-l">
                        	<dl>
                            	<dt>颜  色</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">黑色</a>
                                    <a href="JavaScript:;">白色</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <dl>
                            	<dt>尺  码</dt>
                                <dd>
                                	<a href="JavaScript:;" class="current">M</a>
                                    <a href="JavaScript:;">L</a>
                                    <a href="JavaScript:;">XL</a>
                                </dd>
                                <div style="clear:both;"></div>
                            </dl>
                            <a href="JavaScript:;" class="qd">确定</a>
                            <a href="JavaScript:;" class="qx" qx="xg5">取消</a>
                        </div>
                    	<div class="xg-right f-l">
                        	<a href="#"><img src="images/dai2.gif" /></a>
                        </div>
                        <div style="clear:both;"></div>
                    </div>
                </div>
                <div class="mid-sl f-l">
                	<a href="JavaScript:;" class="sl-left">-</a>
                    <input type="text" value="1" />
                    <a href="JavaScript:;" class="sl-right">+</a>
                </div>
                <p class="mid-dj f-l">¥ 66.00</p>
                <p class="mid-je f-l">¥ 66.00</p>
                <div class="mid-chaozuo f-l">
                	<a href="#">移入收藏夹</a>
                    <a href="#">删除</a>
                </div>
                <div style="clear:both;"></div>
            </div>
        </div>
        <!--分页-->
        <div class="paging">
            	<div class="pag-left f-l">
                	<a href="#" class="about left-r f-l"><</a>
                    <ul class="left-m f-l">
                    	<li><a href="#">1</a></li>
                        <li class="current"><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">6</a></li>
                        <li><a href="#">...</a></li>
                        <li><a href="#">100</a></li>
                        <div style="clear:both;"></div>
                    </ul>
                	<a href="#" class="about left-l f-l">></a>
                    <div style="clear:both;"></div>
                </div>
            	<div class="pag-right f-l">
                	<div class="jump-page f-l">
                        到第<input type="text" />页
                    </div>
                    <button class="f-l">确定</button>
                    <div style="clear:both;"></div>
                </div>
                <div style="clear:both;"></div>
            </div>
       	<div class="cart-con-footer">
        	<input type="checkbox" value="" name="hobby"></input>
			<span>全选</span>
            <a href="#">删除</a>
            <a href="#">加入收藏夹</a>
            <p>（此处始终在屏幕下方）</p>
        </div>
    </div>
    
    <!--底部服务-->
    <div class="ft-service">
    	<div class="w1200">
        	<div class="sv-con-l2 f-l">
            	<dl>
                	<dt><a href="#">新手上路</a></dt>
                    <dd>
                    	<a href="#">购物流程</a>
                    	<a href="#">在线支付</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">配送方式</a></dt>
                    <dd>
                    	<a href="#">货到付款区域</a>
                    	<a href="#">配送费标准</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">购物指南</a></dt>
                    <dd>
                    	<a href="#">常见问题</a>
                    	<a href="#">订购流程</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">售后服务</a></dt>
                    <dd>
                    	<a href="#">售后服务保障</a>
                    	<a href="#">退款说明</a>
                    	<a href="#">新手选购商品总则</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">关于我们</a></dt>
                    <dd>
                    	<a href="#">投诉与建议</a>
                    </dd>
                </dl>
                <div style="clear:both;"></div>
            </div>
        	<div class="sv-con-r2 f-r">
            	<p class="sv-r-tle">187-8660-5539</p>
            	<p>周一至周五9:00-17:30</p>
            	<p>（仅收市话费）</p>
            	<a href="#" class="zxkf">24小时在线客服</a>
            </div>
            <div style="clear:both;"></div>
        </div>
    </div>
    
    <!--底部 版权-->
    <div class="footer w1200">
    	<p>
        	<a href="#">关于我们</a><span>|</span>
        	<a href="#">友情链接</a><span>|</span>
        	<a href="#">宅客微购社区</a><span>|</span>
        	<a href="#">诚征英才</a><span>|</span>
        	<a href="#">商家登录</a><span>|</span>
        	<a href="#">供应商登录</a><span>|</span>
        	<a href="#">热门搜索</a><span>|</span>
        	<a href="#">宅客微购新品</a><span>|</span>
        	<a href="#">开放平台</a>
        </p>
        <p>
        	沪ICP备13044278号<span>|</span>合字B1.B2-20130004<span>|</span>营业执照<span>|</span>互联网药品信息服务资格证<span>|</span>互联网药品交易服务资格证
        </p>
    </div>
</body>
</html>
