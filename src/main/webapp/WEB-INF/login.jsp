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
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="img/favicon.ico">
    <link href="statics/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="statics/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="statics/css/animate.css" rel="stylesheet">
    <link href="statics/css/style.css?v=4.1.0" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->


    <script src="http://open.sojson.com/common/js/canvas-nest.min.js" count="200" zindex="-2" opacity="0.8" color="47,135,193" type="text/javascript"></script>




    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>



    <!-- 全局js -->
    <script src="statics/js/jquery.min.js?v=2.1.4"></script>
    <script src="statics/js/bootstrap.min.js?v=3.3.6"></script>
    <style type="text/css">
        .middle-box h1 {
            font-size: 100px;
        }
    </style>



</head>

<body class="gray-bg">
<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <div>

            <h1 class="logo-name">任性猫</h1>

        </div>
        <h3>欢迎使用</h3>
<%--admin/login--%>
        <form class="m-t" role="form" action="admin/login"   method="post">
            <div class="form-group">
                <input type="text" name ="username"  class="form-control" placeholder="用户名" required="" value="admin">
            </div>
            <div class="form-group">
                <input type="password" name="password" class="form-control" placeholder="密码" required="" value="sojson">
            </div>
            <div class="form-group">
                <input type="text" name="rememberMe" class="form-control" placeholder="验证码" required="" value="123">
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>


            <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
            </p>

        </form>
    </div>
</div>




</body>

</html>

