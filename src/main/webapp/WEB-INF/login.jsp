<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- shiro头引入 -->
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>

<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>--%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

    pageContext.setAttribute("basePath",basePath);

/*    String basePathS =request.getServerName()+":"+request.getServerPort()+path+"/";
    String scheme=request.getScheme();

    pageContext.setAttribute("basePathS",basePathS);
    pageContext.setAttribute("scheme",scheme);*/

%>
<!DOCTYPE html>
<html>

<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>H+ 11后台主题UI框架 - 登录</title>
    <link rel="stylesheet" href="statics/css/init.css">
    <link rel="stylesheet" href="statics/layui/css/layui.css">
    <link rel="stylesheet" href="statics/css/login.css">
    <link rel="stylesheet" href="statics/css/style/admin.css">
    <link rel="shortcut icon" href="statics/img/favicon.ico">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->







    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>



</head>

<body class="layui-layout-body">
<script src="statics/js/plugins/canvas/canvas-nest.min.js" count="200" zindex="-2" opacity="0.8" color="47,135,193" type="text/javascript"></script>
<div id="LAY_app" class="layadmin-tabspage-none">
    <div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">
        <div class="layadmin-user-login-main">
          <div class="layadmin-user-login-box layadmin-user-login-header">.
              <h1 class="logo-name">任性猫</h1>
              <h3>欢迎使用</h3>
          </div>

            <form class="layadmin-user-login-box layadmin-user-login-body layui-form" role="form" action="admin/login"   method="post">
            <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>

                    <input type="text" name="username" id="LAY-user-login-username" autocomplete="off" lay-verify="required" placeholder="用户名" class="layui-input">

                </div>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
                    <input type="password" name="password" id="LAY-user-login-password" autocomplete="off" lay-verify="required" placeholder="密码" class="layui-input">
                </div>
                <div class="layui-form-item" id="vcode">
                    <div class="layui-row" >
                        <div class="layui-col-xs7">
                            <label class="layadmin-user-login-icon layui-icon layui-icon-vercode" for="LAY-user-login-vercode"></label>
                            <input type="text" name="vcode" autocomplete="off" id="LAY-user-login-vercode" lay-verify="required" placeholder="图形验证码" class="layui-input">
                        </div>
                        <div class="layui-col-xs5" >
                            <div style="margin-left: 10px;" >
                                <img   src="${basePath}/open/getGifCode.shtml" />
                            </div>
                        </div>
                    </div>
                </div>
                <div class="layui-form-item" style="margin-bottom: 20px;">
                    <input type="checkbox" name="remember" lay-skin="primary" title="记住密码"><div class="layui-unselect layui-form-checkbox" lay-skin="primary"><span>记住密码</span><i class="layui-icon"></i></div>
                    <a lay-href="/user/forget" class="layadmin-user-jump-change layadmin-link" style="margin-top: 7px;">忘记密码？</a>
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn layui-btn-fluid" lay-submit="" lay-filter="LAY-user-login-submit">登 入</button>
                </div>
                <div class="layui-trans layui-form-item layadmin-user-login-other">
                    <label>社交账号登入</label>
                    <a href="javascript:;"><i class="layui-icon layui-icon-login-qq"></i></a>
                    <a href="javascript:;"><i class="layui-icon layui-icon-login-wechat"></i></a>
                    <a href="javascript:;"><i class="layui-icon layui-icon-login-weibo"></i></a>

                    <a lay-href="/user/reg" class="layadmin-user-jump-change layadmin-link">注册帐号</a>
                </div>
            </div>

<%--
admin/login

            <div class="layui-form-item">
                <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="username"></label>
                <input type="text" id="username" name ="username"  class="form-control" placeholder="用户名" required="" value="admin">
            </div>
            <div class="layui-form-item">
                <input type="password" name="password" class="form-control" placeholder="密码" required="" value="sojson">
            </div>
            <div class="layui-form-item" id="vcode">
                <input type="text" name="vcode"   placeholder="Verification code" style="width: 110px; margin-left: -8px; margin-right: 8px;">
                <img src="${basePath}/open/getGifCode.shtml" />
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>


            <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
            </p>
--%>

        </form>
        </div>
    </div>
</div>
<!-- 全局js -->

<script src="statics/layui/layui.js"></script>

<script type="text/javascript">

    layui.use('form', function(){
        var $ = layui.$ //重点处

            if("${massages}"=="0"){

            }else{

                layer.msg("${massages}");
            }

       $(function(){


            //验证码
            $("#vcode").on("click","img",function(){


                /**动态验证码，改变地址，多次在火狐浏览器下，不会变化的BUG，故这样解决*/
                var i = new Image();
                i.src = '${basePath}/open/getGifCode.shtml?'  + Math.random();
                $(i).replaceAll(this);
                //$(this).clone(true).attr("src",'${basePath}/open/getGifCode.shtml?'  + Math.random()).replaceAll(this);
            });
        });


    });








</script>



</body>

</html>

