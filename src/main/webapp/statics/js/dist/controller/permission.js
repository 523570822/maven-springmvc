var $=layui.$;
layui.use(['form', 'table'], function(){
    var $=layui.$;

    //渲染下拉
    layui.form.render('select');
    //渲染表格
	layui.table.render({
		elem : '#table',
        url : 'permission/list',
		page: true,

		cols: [[
            {type:'numbers'},
            {field:'id', sort: true, title: 'ID'},
            {field:'parentName', sort: true, title: '父级'},
            {field:'name', sort: true, title: '名称'},
            {field:'value', sort: true, title: '权限值'},
            {field:'orderNumber', sort: true,title: '排序号'},
            {field:'type', sort: true, templet:function(d){ return d.type==0?'菜单':'按钮'; }, title: '类型'},
            {field:'createTime', sort: true, templet:function(d){ return layui.util.toDateString(d.createTime); }, title: '创建时间'},
            {field:'isDelete', sort: true, templet: '#statusTpl',width: 80, title: '状态'},
            {align:'center', toolbar: '#barTpl', minWidth: 110, title: '操作'}
    	]]
	});
	
	//添加按钮点击事件
	$("#addBtn").click(function(){
		showEditModel(null);
	});
	
	//表单提交事件
	layui.form.on('submit(btnSubmit)', function(data){
		data.field.token = getToken();
		data.field._method = $("#editForm").attr("method");
		layer.load(1);
		$.post("api/role", data.field, function(data){
			layer.closeAll('loading');
			if(data.code==200){
				layer.msg(data.msg,{icon: 1});
				layer.closeAll('page');
				layui.table.reload('table', {});
			}else{
				layer.msg(data.msg,{icon: 2});
			}
		}, "JSON");
		return false;
	});
	
	//工具条点击事件
	layui.table.on('tool(table)', function(obj){
		var data = obj.data;
		var layEvent = obj.event;
 
		if(layEvent === 'edit'){ //修改
			showEditModel(data);
		} else if(layEvent === 'del'){ //删除
			doDelete(obj);
		} else if(layEvent == 'detail'){
			showPermDialog(data.roleId);
		}
	});
	
	//监听状态开关操作
	layui.form.on('switch(statusCB)', function(obj){
		//console.info(obj);
		updateStatus(obj);
	});
	
	//搜索按钮点击事件
	$("#searchBtn").click(function(){
		doSearch();
	});
});


//显示表单弹窗
function showEditModel(data){
    layer.open({
        type: 1,
        title: data==null?"添加权限":"修改权限",
        area: '450px',
        offset: '120px',
        content: $("#addModel").html()
    });
    $("#editForm")[0].reset();
    $("#editForm").attr("method","POST");
    var selectItem = "";
    var type = 0;
    if(data!=null){
        $("#editForm input[name=permissionId]").val(data.permissionId);
        $("#editForm input[name=permissionName]").val(data.permissionName);
        $("#editForm input[name=permissionValue]").val(data.permissionValue);
        $("#editForm input[name=orderNumber]").val(data.orderNumber);
        $("#editForm").attr("method","PUT");
        selectItem = data.parentId;
        type = data.type;
        if(0==data.type){
            $("#type0").attr("checked","checked");
            $("#type1").removeAttr("checked");
        }else{
            $("#type0").removeAttr("checked");
            $("#type1").attr("checked","checked");
        }
        layui.form.render('radio');
    }
    $("#btnCancel").click(function(){
        layer.closeAll('page');
    });

    getParents(selectItem,type);
    //
    layui.form.on('radio(permissionType)', function(data){
        getParents(selectItem, data.value);
    });
}
//获取所有父级菜单
var parents1 = null;
var parents2 = null;
function getParents(selectItem,type){
    var parents = (type==0?parents1:parents2);
    if(parents!=null) {
        layui.laytpl(parentsSelect.innerHTML).render(parents, function(html){
            $("#parent-select").html(html);
            $("#parent-select").val(selectItem);
            layui.form.render('select');
            layer.closeAll('loading');
        });
    }else{
        layer.load(1);
        $.get("permission/parent/"+type,{
            token: getToken()
        }, function(data){
            if (type==0) {
                parents1 = data;
            }else{
                parents2 = data;
            }
            getParents(selectItem,type);
        });
    }
}
//删除
function doDelete(obj){
	layer.confirm('确定要删除吗？', function(index){
		layer.close(index);
		layer.load(1);
		$.ajax({
			url: "api/role/"+obj.data.roleId+"?token="+getToken(), 
			type: "DELETE", 
			dataType: "JSON", 
			success: function(data){
				layer.closeAll('loading');
				if(data.code==200){
					layer.msg(data.msg,{icon: 1});
					obj.del();
				}else{
					layer.msg(data.msg,{icon: 2});
				}
			}
		});
	});
}

//更改状态
function updateStatus(obj){
	layer.load(1);
	//得到input并判断当前状态
	var newStatus = obj.elem.checked?0:1;
	$.post("api/role/status", {
		roleId: obj.elem.value,
		status: newStatus,
		_method: "PUT",
		token: getToken()
	}, function(data){
		layer.closeAll('loading');
		if(data.code==200){
			layui.table.reload('table', {});
		}else{
			layer.msg(data.msg,{icon: 2});
			layui.table.reload('table', {});
		}
	});
}

//搜索
function doSearch(){
	var key = $("#searchKey").val();
	var value = $("#searchValue").val();
	if (value=='') {
		key = '';
	}
	layui.table.reload('table', {where: {searchKey: key,searchValue: value}});
}

//管理权限
function showPermDialog(roleId){
	layer.open({
		type: 1,
		title: '管理权限',
		area: '450px',
		offset: '120px',
		content: '<ul id="treeAuth" class="ztree" style="padding: 25px 80px;"></ul>',
		btn: ['保存','关闭'],
		btnAlign: 'c', 
		yes: function(index){
			saveRolePerm(roleId,index);
		}
	});
	layer.load(1);
	var setting = {
		check: {enable: true},
	    data: {
	    	simpleData:{enable: true}
	    }
	};
	$.get("api/permission/tree/"+roleId,{
		token: getToken()
	},function(data) {
    	$.fn.zTree.init($("#treeAuth"), setting, data);  
		layer.closeAll('loading');
	},"json");
}

//保存权限
function saveRolePerm(roleId,index){
	layer.load(1);
	var treeObj = $.fn.zTree.getZTreeObj("treeAuth");
	var nodes = treeObj.getCheckedNodes(true);
	var ids = new Array();
	for(var i=0;i<nodes.length;i++){
		ids[i] = nodes[i].id;
	}
	$.post("api/permission/tree",{
		roleId: roleId,
		permIds: JSON.stringify(ids),
		token: getToken(),
		_method: "PUT"
	},function(data){
		layer.closeAll('loading');
		if(200==data.code){
			layer.msg(data.msg, {icon: 1});
			layer.close(index);
		}else{
			layer.msg(data.msg, {icon: 2});
		}
	},"json");


}
