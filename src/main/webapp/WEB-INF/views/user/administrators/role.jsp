<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="layui-card layadmin-header">
    <div class="layui-breadcrumb" lay-filter="breadcrumb">
        <a lay-href="">主页</a>
        <a><cite>组件</cite></a>
        <a><cite>栅格</cite></a>
        <a><cite>按移动端排列</cite></a>
    </div>
</div>


<div class="layui-fluid" id="LAY-component-grid-mobile">

 <div class="layui-form toolbar">
        搜索：
        <select id="searchKey">
            <option value="">-请选择-</option>
            <option value="role_id">ID</option>
            <option value="role_name">角色名</option>
            <option value="comments">备注</option>
        </select>&emsp;
        <input id="searchValue" class="layui-input search-input" type="text" placeholder="输入搜索内容" />&emsp;
        <button id="searchBtn" class="layui-btn search-btn"><i class="layui-icon">&#xe615;</i>搜索</button>&emsp;
        <button id="addBtn" class="layui-btn search-btn"><i class="layui-icon">&#xe654;</i>添加</button>
    </div>


      <!-- 数据表格 -->
    <table class="layui-table" id="table" lay-filter="table"></table>
</div>

<!-- 表单弹窗 -->
<script type="text/html" id="addModel">
    <form id="editForm" class="layui-form model-form" action="">
        <input name="roleId" type="hidden" />
        <div class="layui-form-item">
            <label class="layui-form-label">角色名</label>
            <div class="layui-input-block">
                <input name="roleName" placeholder="请输入角色名" type="text" class="layui-input" maxlength="100" lay-verify="required" required />
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">备注</label>
            <div class="layui-input-block">
                <textarea name="comments" placeholder="请输入内容" class="layui-textarea" maxlength="200"></textarea>
            </div>
        </div>
        <div class="layui-form-item model-form-footer">
            <button class="layui-btn layui-btn-primary" type="button" id="btnCancel">取消</button>
            <button class="layui-btn" lay-filter="btnSubmit" lay-submit>保存</button>
        </div>
    </form>
</script>
<!-- 表格操作列 -->
<script type="text/html" id="barTpl">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    <a class="layui-btn layui-btn-xs" lay-event="detail">管理权限</a>
</script>
<!-- 表格状态列 -->
<script type="text/html" id="statusTpl">

    {{#  if(d.isDelete == 0){ }}
    <input type="checkbox"  value="{{d.isDelete}}" lay-filter="statusCB" lay-skin="switch" lay-text="正常|停用" checked />
    {{#  } else { }}
    <input type="checkbox"  value="{{d.isDelete}}" lay-filter="statusCB" lay-skin="switch" lay-text="正常|停用"/>
    {{#  } }}



</script>


<script type="text/javascript" src="statics/js/dist/controller/role.js"></script>
