var $=layui.$;
layui.use(['form', 'table'], function(){
    var $=layui.$;
  initNav();
	//点击导航切换页面时不刷新导航,其他方式切换页面要刷新导航
	layui.element.on('nav(index-nav)', function(elem){
		refreshNav = false;
		if(document.body.clientWidth<=750){
			switchNav(true);
		}
	});

   function initNav(){
       // alert("www");
        var indexNavStr = sessionStorage.getItem("index-nav");
        var indexNav = JSON.parse(indexNavStr);
        if(indexNav==null){
            $.get("api/menu", {
                token : getToken()
            }, function (data) {

                if(200==data.code){
                    sessionStorage.setItem("index-nav",JSON.stringify(data.menus));
                    initNav();
                }else if(401==data.code){
                    console.log(data.message);
                    layer.msg(data.message,{icon: 2});
                    setTimeout(function() {
                        loginOut();
                    }, 1500);
                }else{
                    layer.msg("获取导航失败，请刷新页面",{icon: 2});
                }
            },"json");
        }else{
            layui.laytpl(sideNav.innerHTML).render(indexNav, function(html){


                $("#index-nav").html(html);
                layui.element.render('nav', 'index-nav');
            });
        }
    }

//获取当前token
    function getToken() {
        return localStorage.getItem("token");
    }

//折叠显示导航栏
    function switchNav(expand){
        var sideNavExpand = !$('body').hasClass('nav-mini');
        if(expand==sideNavExpand){
            return;
        }
        if (!expand) {
            //$('.layui-side .layui-nav .layui-nav-item.layui-nav-itemed').removeClass('layui-nav-itemed');
            $('body').addClass('nav-mini');
        }else{
            $('body').removeClass('nav-mini');
        }
        $('.nav-mini .layui-side .layui-nav .layui-nav-item').hover(function(){
            var tipText = $(this).find('span').text();
            if($('body').hasClass('nav-mini')&&document.body.clientWidth>750){
                layer.tips(tipText, this);
            }
        },function(){
            layer.closeAll('tips');
        });
    }
});

//导航栏展开
function openNavItem(){

    if($('body').hasClass('nav-mini')&&document.body.clientWidth>750){
        switchNav(true);
    }
}
function logout(){
    sessionStorage.setItem("index-nav",null);
    window.location.href="admin/logout.do " ;
}
/*
var $=layui.$;
$(function() {
    initNav();
});

function initNav(){
    // alert("www");
    var indexNavStr = sessionStorage.getItem("index-nav");
    var indexNav = JSON.parse(indexNavStr);
    if(indexNav==null){
        $.get("api/menu", {
            token : getToken()
        }, function (data) {

            if(200==data.code){
                sessionStorage.setItem("index-nav",JSON.stringify(data.menus));
                initNav();
            }else if(401==data.code){
                console.log(data.message);
                layer.msg(data.message,{icon: 2});
                setTimeout(function() {
                    loginOut();
                }, 1500);
            }else{
                layer.msg("获取导航失败，请刷新页面",{icon: 2});
            }
        },"json");
    }else{
        layui.laytpl(sideNav.innerHTML).render(indexNav, function(html){

            console.info(html);
            $("#index-nav").html(html);
            layui.element.render('nav', 'index-nav');
        });
    }
}

//获取当前token
function getToken() {
    return localStorage.getItem("token");
}
//导航栏展开
function openNavItem(){

     if($('body').hasClass('nav-mini')&&document.body.clientWidth>750){
    switchNav(true);
}
}
//折叠显示导航栏
function switchNav(expand){
    var sideNavExpand = !$('body').hasClass('nav-mini');
    if(expand==sideNavExpand){
        return;
    }
    if (!expand) {
        //$('.layui-side .layui-nav .layui-nav-item.layui-nav-itemed').removeClass('layui-nav-itemed');
        $('body').addClass('nav-mini');
    }else{
        $('body').removeClass('nav-mini');
    }
    $('.nav-mini .layui-side .layui-nav .layui-nav-item').hover(function(){
        var tipText = $(this).find('span').text();
        if($('body').hasClass('nav-mini')&&document.body.clientWidth>750){
            layer.tips(tipText, this);
        }
    },function(){
        layer.closeAll('tips');
    });
}*/
