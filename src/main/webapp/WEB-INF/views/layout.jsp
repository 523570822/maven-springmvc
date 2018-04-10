<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%--<script type="text/javascript"  src="statics/js/dist/controller/common.js"  />--%>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <!-- 头部区域 -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item layadmin-flexible" lay-unselect>
                <a href="javascript:;" layadmin-event="flexible" title="侧边伸缩">
                    <i class="layui-icon layui-icon-shrink-right" id="LAY_app_flexible"></i>
                </a>
            </li>
            <!--<li class="layui-nav-item layui-this layui-hide-xs layui-hide-sm layui-show-md-inline-block">
              <a lay-href="" title="">
                控制台
              </a>
            </li>-->
            <li class="layui-nav-item layui-hide-xs" lay-unselect>
                <a href="http://www.layui.com/admin/" target="_blank" title="前台">
                    <i class="layui-icon layui-icon-website"></i>
                </a>
            </li>
            <li class="layui-nav-item" lay-unselect>
                <a href="javascript:;" layadmin-event="refresh" title="刷新">
                    <i class="layui-icon layui-icon-refresh-3"></i>
                </a>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right" lay-filter="layadmin-layout-right">

            <li class="layui-nav-item" lay-unselect>
                <a lay-href="app/message/" layadmin-event="message">
                    <i class="layui-icon layui-icon-notice"></i>

                    <!-- 如果有新消息，则显示小圆点 -->
                    <script type="text/html" template lay-url="statics/json/new.json">
                        {{# if(d.data.newmsg){ }}
                        <span class="layui-badge-dot"></span>
                        {{# } }}
                    </script>

                </a>
            </li>
            <li class="layui-nav-item layui-hide-xs" lay-unselect>
                <a href="javascript:;" layadmin-event="theme">
                    <i class="layui-icon layui-icon-theme"></i>
                </a>
            </li>
            <li class="layui-nav-item layui-hide-xs" lay-unselect>
                <a href="javascript:;" layadmin-event="note">
                    <i class="layui-icon layui-icon-note"></i>
                </a>
            </li>
            <li class="layui-nav-item" lay-unselect>
                <script type="text/html" template lay-url="statics/json/session.json"
                        lay-done="layui.element.render('nav', 'layadmin-layout-right');">
                    <a href="javascript:;">
                        <cite>{{ d.data.username }}</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a lay-href="set/user/info">基本资料</a></dd>
                        <dd><a lay-href="set/user/password">修改密码</a></dd>
                        <hr>
                        <dd  style="text-align: center;"><a  href="javascript:logout();" >退出</a></dd>
                    </dl>
                </script>
            </li>

            <li class="layui-nav-item layui-hide-xs" lay-unselect>
                <a href="javascript:;" layadmin-event="about"><i class="layui-icon layui-icon-more-vertical"></i></a>
            </li>
            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-unselect>
                <a href="javascript:;" layadmin-event="more"><i class="layui-icon layui-icon-more-vertical"></i></a>
            </li>
        </ul>
    </div>

    <!-- 侧边菜单 -->

    <div class="layui-side layui-side-menu">
        <div class="layui-side-scroll">
            <ul class="layui-nav layui-nav-tree" id="index-nav" lay-filter="index-nav" style="margin-top: 25px;">
            </ul>
        </div>
    </div>

    <script type="text/javascript" src="statics/js/loyout.js"></script>

    <!-- 侧导航渲染模板 -->
    <!-- 侧导航渲染模板 -->
    <script id="sideNav" type="text/html">
        {{#  layui.each(d, function(index, item){ }}
        <li class="layui-nav-item">


            <a class=""    href="javascript:openNavItem();"    ><i class="layui-icon">{{ item.icon }}</i>&emsp;<span>{{ item.name }}</span></a>
            {{# if(item.subMenus!=null&&item.subMenus.length>0){ }}
            <dl class="layui-nav-child">
                {{#  layui.each(item.subMenus, function(index, subItem){ }}
                <dd>
                    <a href="javascript:;"  lay-href="{{ subItem.value }}">{{ subItem.name }}</a>
                </dd>
                {{#  }); }}
            </dl>

            {{#  };  }}
        </li>
        {{#  }); }}
    </script>
    <!-- 页面标签 -->
    <script type="text/html" template lay-done="layui.element.render('nav', 'layadmin-pagetabs-nav')">
        {{# if(layui.setter.pageTabs){ }}
        <div class="layadmin-pagetabs" id="LAY_app_tabs">
            <div class="layui-icon layadmin-tabs-control layui-icon-prev" layadmin-event="leftPage"></div>
            <div class="layui-icon layadmin-tabs-control layui-icon-next" layadmin-event="rightPage"></div>
            <div class="layui-icon layadmin-tabs-control layui-icon-down">
                <ul class="layui-nav layadmin-tabs-select" lay-filter="layadmin-pagetabs-nav">
                    <li class="layui-nav-item" lay-unselect>
                        <a href="javascript:;"></a>
                        <dl class="layui-nav-child layui-anim-fadein">
                            <dd layadmin-event="closeThisTabs"><a href="javascript:;">关闭当前标签页</a></dd>
                            <dd layadmin-event="closeOtherTabs"><a href="javascript:;">关闭其它标签页</a></dd>
                            <dd layadmin-event="closeAllTabs"><a href="javascript:;">关闭全部标签页</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
            <div class="layui-tab" lay-unauto lay-allowClose="true" lay-filter="layadmin-layout-tabs">
                <ul class="layui-tab-title" id="LAY_app_tabsheader">
                    <li lay-id="/"><i class="layui-icon layui-icon-home"></i></li>
                </ul>
            </div>
        </div>
        {{# } }}
    </script>


    <!-- 主体内容 -->
    <div class="layui-body" id="LAY_app_body">
        <div class="layadmin-tabsbody-item layui-show"></div>
    </div>

    <!-- 辅助元素，一般用于移动设备下遮罩 -->
    <div class="layadmin-body-shade" layadmin-event="shade"></div>

</div>
