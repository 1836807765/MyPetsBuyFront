$(function() {
	var len = $("#focus ul li").length; //获取焦点图个数
	var index = 0;
	var picTimer;
	
	//以下代码添加数字按钮和按钮后的半透明条，还有上一页、下一页两个按钮
	var btn = "<div class='btnBg'><div class='btn'>";
	for(var i=0; i < len; i++) {
		btn += "<span></span>";
	}
	btn += "</div></div><div class='preNext pre'></div><div class='preNext next'></div>";
	$("#focus").append(btn);
	//$("#focus .btnBg").css("opacity",0.5);

	//为小按钮添加鼠标滑入事件，以显示相应的内容
	$("#focus .btn span").addClass("on").mouseover(function() {
		index = $("#focus .btn span").index(this);
		showPics(index);
	}).eq(0).trigger("mouseover");
	
	//上一页、下一页按钮透明度处理
	$("#focus .preNext").css("opacity",0.5).hover(function() {
		$(this).stop(true,false).animate({"opacity":"0.9"},300);
	},function() {
		$(this).stop(true,false).animate({"opacity":"0.5"},300);
	});

	//上一页按钮
	$("#focus .pre").click(function() {
		index -= 1;
		if(index == -1) {index = len - 1;}
		showPics(index);
	});

	//下一页按钮
	$("#focus .next").click(function() {
		index += 1;
		if(index == len) {index = 0;}
		showPics(index);
	});
	
	//鼠标滑上焦点图时停止自动播放，滑出时开始自动播放
	$("#focus").hover(function() {
		clearInterval(picTimer);
	},function() {
		picTimer = setInterval(function() {
			showPics(index);
			index++;
			if(index == len) {index = 0;}
		},4000); //此4000代表自动播放的间隔，单位：毫秒
	}).trigger("mouseleave");
	
	//显示图片函数，根据接收的index值显示相应的内容
	function showPics(index) { //普通切换
		$("#focus li").stop(true,false).animate({"opacity":"0"},500); 
		$("#focus li:eq("+index+")").stop(true,false).animate({"opacity":"1"},500);
		$("#focus .btn span").removeClass("on").eq(index).stop(true,false).addClass("on"); //为当前的按钮切换到选中的效果
	}

    /*登陆框隐藏*/
    $('.close').click(function(){
        $('.login').hide(200);
        $('#screen').remove();
    });


});
