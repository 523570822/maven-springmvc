
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

    pageContext.setAttribute("basePath",basePath);



%>
<!DOCTYPE html>
<html>
<head>
    <base>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>layuiAdmin pro - 通用后台管理模板系统（单页面专业版）</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">

  <%--  <link rel="stylesheet" href="statics/css/init.css">--%>
    <link rel="stylesheet" href="statics/layui/css/layui.css"  media="all">
    <script>
        /^http(s*):\/\//.test(location.href) || alert('请先部署到 localhost 下再访问');
    </script>
</head>
<body>
<div id="LAY_app"></div>
<%--<script src="//res.layui.com/layui/rc/layui.js?t=20180323-1"></script>--%>
<%--<script src="../statics/js/plugins/jquery.min.js"></script>--%>
<script src="statics/layui/layui.js"></script>
<script>
    layui.config({
        base: 'statics/js/' //指定 layuiAdmin 项目路径
        ,version: '1.0.0-beta7'
    }).use('index', function(){
        /*var layer = layui.layer, admin = layui.admin;
        layer.ready(function(){
            admin.popup({
                content: '单页面专业版默认未开启“多标签”功能，实际运用时，你可以自定义是否开启'
                ,area: '300px'
                ,btnAlign: 'c'
                ,shade: false
            });
        });*/
    });
</script>

<script type="text/javascript"  src="statics/js/dist/controller/cphp.js"  />

</body>
</html>