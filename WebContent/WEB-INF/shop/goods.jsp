<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//Dtd XHTML 1.0 Transitional//EN" "http://www.w3.org/tr/xhtml1/Dtd/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="x-ua-compatible" content="IE=edge, chrome=1">
    <title>萌宠专区</title>
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link href="css/public.css" type="text/css" rel="stylesheet"/>
    <link href="css/show.css" type="text/css" rel="stylesheet"/>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/slide.js"></script>
     <%@include file="/WEB-INF/NewHeader.jsp" %>
</head>
<script>
    $(function(){
        $('.nav ul li').hover(function(){
            $(this).children(".details").show();
        },function(){
            $(this).children(".details").hide();
        });
        $('#my').hover(function(){
            $(this).find("div").show();
        },function(){
            $(this).find("div").hide();
        });
    });
</script>
<body>
				     <%@include file="/WEB-INF/NewNav.jsp" %>

<!---------------------导航完--------------------->

<script type="text/javascript" src="js/jquery.imagezoom.min.js"></script>
<script type="text/javascript" src="js/owl.carousel.min.js"></script>
<div class="wt1080">
    <!----------------位置--------------------->
    <div class="place">
        当前位置：<span class="check">Aptamil 德国爱他美 婴儿奶粉 2段 800克/罐 3罐装 6-10个月</span>
    </div>
    <!-------------商品详细----------------->
    <div class="property">
        <div class="left">
            <div class="left_top">
                <img src="${petsDto.image }" class="jqzoom" >
                <a href="#" class="search"></a>
            </div>
          
        </div>
        <script>
            $(function() {
                $(".jqzoom").imagezoom();

                $('#scroll').owlCarousel({
                    items: 4,
                    autoPlay: false,
                    navigation: true,
                    navigationText: ["",""],
                    scrollPerPage: true
                });
            });
        </script>
        <div class="right">
            <a href="#" class="title">${petsDto.name}</a>
            <div class="aa">
                <span class="a">促销价</span>
                <span class="b">￥ ${petsDto.sale}</span>
                <span class="c">6.5折</span>
                <span class="c">包邮</span>
                <span class="d">国内参考价 ￥ ${petsDto.sale+500}</span>
            </div>
            <table>
                <tr>
                    <td class="one">运费</td>
                    <td>免运费</td>
                </tr>
                <tr>
                    <td class="one">关税</td>
                    <td>本商品实用税率为10%，若订单关税<50元则免征</td>
                </tr>
                <tr>
                    <td class="one">数量</td>
                    <td>
                        <div class="change">
                            <span class="zuo">-</span>
                            <input name="" type="text" value="1">
                            <span class="you">+</span>
                        </div>
                        <span class="tishi">库存充足</span>
                    </td>
                </tr>
            </table>
            <!-----------------购买按钮--------------->
            <div class="shopping">
                <a href="<%=ctxPath%>/shop?action=detailSubmit&&id=${petsDto.id}" class="buy">立即购买</a>
                <a href="<%=ctxPath%>/shop?action=detailSubmit&&id=${petsDto.id}" class="shop_car">加入购物车</a>
                <div class="clear"></div>
            </div>
            <!-----------保障---------------->
            <div class="b_baozhang">
                <ul>
                    <li>
                        <img src="image/u1.png">
                        <p>全球正品货源</p>
                    </li>
                    <li>
                        <img src="image/u2.png">
                        <p>一件代发</p>
                    </li>
                    <li>
                        <img src="image/u3.png">
                        <p>全球直邮</p>
                    </li>
                    <li>
                        <img src="image/u4.png">
                        <p>售后无忧</p>
                    </li>
                </ul>
            </div>
        </div>
        <div class="clear"></div>
    </div>

    <!-----------------下半部分------------------->
    <div class="details">
        <div class="details_left">
            <div class="d_l_t">
                <div class="d_l_t_t">
                    <a href="" class="current">商品详情</a>
                    <a href="">买家口碑(1600)</a>
                </div>
             
                <!----------评价---------->
            </div>
            <div class="pingjia">
                <div class="pingjia_t">
                    <span>买家口碑</span>本商品由Aptamil/爱他美发货并提供售后服务
                </div>
                <!----------评价----------->
                <div class="pingjia_d">
                    <div class="pingjia_d_t">
                        <span class="current"><img src="image/d1.png">全部评价（5884）</span>
                        <span><img src="image/d2.png">好评（5750）</span>
                        <span><img src="image/d2.png">好评（48）</span>
                        <span><img src="image/d2.png">差评（86）</span>
                        <span><img src="image/d2.png">晒单（227）</span>
                    </div>
                    <!----------留言----------->
                    <div class="pingjia_d_l">
                        <ul>
                            <li>
                                <p class="title"><span>月夜花香</span>（2015-10-03 21:47:13）</p>
                                <p class="pic"><img src="${petsDto.image}" style="width:100px"></p>
                                 <br/> <br/> <br/> <br/> <br/>
                                <p class="mess">大家都说不错<</p>
                                <p class="admin">管理员：亲爱的用户，已返现到您的会员账户，感谢你对德贝的支持，我们会继续坚持给您带来最极致的服务。</p>
                            </li>

                            <li>
                                <p class="title"><span>月夜花香</span>（2015-10-03 21:47:13）</p>
                                <p class="pic"><img src="${petsDto.image}" style="width:100px"> </p>
                                <br/> <br/> <br/> <br/> <br/>
                                <p class="mess">大家都说不错<</p>
                                <p class="admin">管理员：亲爱的用户，已返现到您的会员账户，感谢你对德贝的支持，我们会继续坚持给您带来最极致的服务。</p>
                            </li>
                 <c:forEach items="${eva}" var="e"> 

                            <li>
                                <p class="title"><span>${e.username }</span>（2015-10-03 21:47:13）</p>
                                <p class="pic"><img src="${petsDto.image}" style="width:100px"></p>
                                <br/> <br/> <br/> <br/> <br/>
                                <p class="mess">${e.title }:${e.message }</p>
                                <p class="admin">管理员：${e.answer}</p>
                            </li>
                                                     </c:forEach>
                            
                        </ul>
                    </div>
                    <!---------------分页--------------->
                    <div class="page"><a href="#">上一页</a><a href="#">1</a><a href="#">2</a><a href="#">下一页</a></div>
                </div>
            </div>
            <!---------------------常见问题------------------->
            <div class="problem">
                <h1>常见问题</h1>
                <div class="problem_c">
                    <div class="problem_c_t">
                        <div class="title">
                            <span>Q</span>
                            <font>商品来自哪里？</font>
                            <div class="clear"></div>
                        </div>
                        <div class="answer">
                            <span>A</span>
                            <font>我们的专业招商团队，确保所有的品牌均为海外优质品牌，主要是由海外品牌入住商或品牌代理经销商等品牌入驻商提供，让你轻松享受到国外优质原装进口商品。</font>
                            <div class="clear"></div>
                        </div>

                        <div class="title">
                            <span>Q</span>
                            <font>我还要额外缴纳关税么？</font>
                            <div class="clear"></div>
                        </div>
                        <div class="answer">
                            <span>A</span>
                            <font>依据《中华人民共和国进境物品归类表》，以商品实际销售价格作为完税价格（征税基数），参照行邮税税率征收进境物品进口税，应征税在50元以下（含50元），海关予以免征。</font>
                            <div class="clear"></div>
                        </div>
                    </div>
                    <!------------------->
                    <p>联系在线客服，或拨打客户电话：028-6133 8882。<p>
                    <p>客户工作时间：周一到周日9：00-22：00，法定假日除外。<p>
                </div>
            </div>
        </div>



        
        <div class="clear"></div>
    </div>



</div>







<!---------------------保障------------------->
<div class="baozhang">
    <div class="wt1080">
        <ul>
            <li>
                <img src="image/c1.png">
                <p>全球正品货源</p>
            </li>
            <li>
                <img src="image/c2.png">
                <p>一件代发</p>
            </li>
            <li>
                <img src="image/c3.png">
                <p>全球直邮</p>
            </li>
            <li>
                <img src="image/c5.png">
                <p>售后无忧</p>
            </li>
        </ul>
        <div class="clear"></div>
    </div>
</div>
<!---------------底部--------------->
<div class="footer">
    <div class="wt1080" style="position: relative">
        <div class="a_footer">
            <div class="left">
                <a href="#"><img src="image/logo.png"></a>
                <p class="lianxi">
                    <a href="#"><img src="image/weixin.png"></a>
                    <a href="#"><img src="image/weibo.png"></a>
                    <a href="#"><img src="image/QQ.png"></a>
                    <span>028-6133 8882</span>
                </p>
            </div>
            <div class="right">
                <ul>
                    <li>
                        <dl>
                            <dt><a href="#">新手指南</a></dt>
                            <dd><a href="#">购物流程</a></dd>
                            <dd><a href="#">支付方式</a></dd>
                            <dd><a href="#">通关关税</a></dd>
                            <dd><a href="#">常见问题</a></dd>
                        </dl>
                    </li>
                    <li>
                        <dl>
                            <dt><a href="#">新手指南</a></dt>
                            <dd><a href="#">购物流程</a></dd>
                            <dd><a href="#">支付方式</a></dd>
                            <dd><a href="#">通关关税</a></dd>
                            <dd><a href="#">常见问题</a></dd>
                        </dl>
                    </li>
                    <li>
                        <dl>
                            <dt><a href="#">新手指南</a></dt>
                            <dd><a href="#">购物流程</a></dd>
                            <dd><a href="#">支付方式</a></dd>
                            <dd><a href="#">通关关税</a></dd>
                        </dl>
                    </li>
                    <li>
                        <dl>
                            <dt><a href="#">新手指南</a></dt>
                            <dd><a href="#">购物流程</a></dd>
                            <dd><a href="#">支付方式</a></dd>
                            <dd><a href="#">通关关税</a></dd>
                            <dd><a href="#">常见问题</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>
        <div class="clear"></div>
        <div class="weixin"><img src="image/weixin1.png"><p>扫描二维码下载APP</p></div>
        <!------------------------>
        <p class="beian">Copyright © 2016 洋店网.版权所有.备案号：京ICP证35124521号.技术支持：西部网络</p>
    </div>
</div>
</body>
</html>
