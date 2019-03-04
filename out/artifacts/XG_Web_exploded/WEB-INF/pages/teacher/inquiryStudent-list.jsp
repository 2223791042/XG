<%--
  Created by IntelliJ IDEA.
  User: Mr.S
  Date: 2019/2/22
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" />
    <script src="${pageContext.request.contextPath}/static/script/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
    <title>贫困生认定列表</title>
</head>
<body>
<script type="text/html" id="unExaminedOperator">
    <a class="layui-btn  layui-btn-xs" lay-event="examine">审核</a>
    <a class="layui-btn  layui-btn-danger layui-btn-xs" lay-event="return">退回</a>
</script>
<script type="text/html" id="examinedOperator">
    <a class="layui-btn  layui-btn-xs" lay-event="look">查看</a>
</script>
<div class="layui-tab layui-tab-brief">
    <ul class="layui-tab-title">
        <li class="layui-this">未审核</li>
        <li>已审核</li>
    </ul>
    <div class="layui-tab-content" style="height: 200px;">
        <div class="layui-tab-item layui-show">
            <div style="margin-top: 15px;">
                <label class="layui-form-label">学号</label>
                <div class="layui-input-inline">
                    <input type="text" id="unExaminedStuID" name="stuID" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-input-inline">
                    <button class="layui-btn layui-btn-radius" onclick="searchStuID('unExamined')"><i class="layui-icon">&#xe615;</i>搜索</button>
                </div>
                <div class="layui-input-inline" style="margin-left: 64%;">
                    <button class="layui-btn layui-btn-normal layui-btn-sm layui-btn-radius" onclick="searchStuID('unExamined')"><i class="layui-icon">&#xe669;</i>刷新</button>
                </div>
            </div>
            <table id="unExaminedTable" lay-filter="unExamined"></table>
        </div>
        <div class="layui-tab-item">
            <div style="margin-top: 15px;">
                <label class="layui-form-label">学号</label>
                <div class="layui-input-inline">
                    <input type="text" id="examinedStuID" name="stuID" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-input-inline">
                    <button class="layui-btn layui-btn-radius" onclick="searchStuID('examined')"><i class="layui-icon">&#xe615;</i>搜索</button>
                </div>
                <div class="layui-input-inline" style="margin-left: 64%;">
                    <button class="layui-btn layui-btn-normal layui-btn-sm layui-btn-radius" onclick="searchStuID('examined')"><i class="layui-icon">&#xe669;</i>刷新</button>
                </div>
            </div>
            <table id="examinedTable" lay-filter="examined"></table>
        </div>
    </div>
</div>
<script type="text/html" id="homeTypeTemplet">
    {{# if(d.homeType == 1){ }}
    <button class="layui-btn layui-btn-xs">孤儿</button>
    {{# } else if(d.homeType == 2){ }}
    <button class="layui-btn layui-btn-xs">单亲</button>
    {{# } else if(d.homeType == 3){ }}
    <button class="layui-btn layui-btn-xs">残疾</button>
    {{# } else if(d.homeType == 4){ }}
    <button class="layui-btn layui-btn-xs">烈士或优抚对象子女</button>
    {{# } else if(d.homeType == 5){ }}
    <button class="layui-btn layui-btn-xs">低保家庭</button>
    {{# } else if(d.homeType == 6){ }}
    <button class="layui-btn layui-btn-xs">建档立卡贫困户</button>
    {{# } else if(d.homeType == 7){ }}
    <button class="layui-btn layui-btn-xs">其他</button>
    {{# } }}
</script>
<script type="text/html" id="statusTemplet">
    {{# if(d.status == 1){ }}
    <button class="layui-btn layui-btn-disabled layui-btn-xs">未审核</button>
    {{# } else if(d.status == 2){ }}
    <button class="layui-btn layui-btn-xs">已审核</button>
    {{# } }}
</script>
<script>
    var unExaminedTable, examinedTable;
    layui.use(["table","form", "layedit", "laydate","element"], function(){
        var $ = layui.jquery
            ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块
        var table = layui.table;
        var form = layui.form,
            layer = layui.layer,
            layedit = layui.layedit,
            laydate = layui.laydate;
        //表格渲染
        unExaminedTable = table.render({
            elem: '#unExaminedTable'
            ,id: 'unExamined'
            ,height: 'full-140'
            ,cellMinWidth: 80
            ,url: '${pageContext.request.contextPath}/inquiryStudent/list/unExamined' //数据接口
            ,page: true //开启分页
            ,where: { stuID: $("#unExaminedStuID").val()}
            ,cols: [[ //表头
                {checkbox: true}
                ,{field: 'stuID', title: '学号',align:'center', sort: true}
                ,{field: 'stuName', title: '姓名',align:'center'}
                ,{field: 'instBelong', title: '学院',align:'center'}
                ,{field: 'enrolYear', title: '年级',align:'center'}
                ,{field: 'personNum', title: '家庭人口数',align:'center',sort: true}
                ,{field: 'homeType', title: '家庭类型',align:'center', templet:'#homeTypeTemplet'}
                ,{field: 'homeIncome', title: '家庭收入',align:'center',sort: true}
                ,{field: 'debt', title: '欠债情况',align:'center'}
                ,{field: 'status', title: '审核情况',align:'center', templet:'#statusTemplet'}
                ,{field: 'operate', title: '操作',align:'center',toolbar:'#unExaminedOperator'}
            ]]
        });
        examinedTable = table.render({
            elem: '#examinedTable'
            ,id: 'examined'
            ,height: 'full-140'
            ,cellMinWidth: 80
            ,url: '${pageContext.request.contextPath}/inquiryStudent/list/examined' //数据接口
            ,page: true //开启分页
            ,where: { stuID: $("#examinedStuID").val()}
            ,cols: [[ //表头
                {checkbox: true}
                ,{field: 'stuID', title: '学号',align:'center', sort: true}
                ,{field: 'stuName', title: '姓名',align:'center'}
                ,{field: 'instBelong', title: '学院',align:'center'}
                ,{field: 'enrolYear', title: '年级',align:'center'}
                ,{field: 'personNum', title: '家庭人口数',align:'center',sort: true}
                ,{field: 'homeType', title: '家庭类型',align:'center', templet:'#homeTypeTemplet'}
                ,{field: 'homeIncome', title: '家庭收入',align:'center',sort: true}
                ,{field: 'status', title: '审核情况',align:'center', templet:'#statusTemplet'}
                ,{field: 'auditor', title: '审核人',align:'center'}
                ,{field: 'auditorTime', title: '审核时间',align:'center',sort: true}
                ,{field: 'operate', title: '操作',align:'center',toolbar:'#examinedOperator'}
            ]]
        });

        //监听行工具事件
        table.on('tool(unExamined)', function(obj){
            var data = obj.data;
            if(obj.event === 'return'){
                layer.confirm('真的退回这个家庭调查表申请么', function(index){
                    $.ajax({
                        async: true,
                        type: "PUT",
                        url: '${pageContext.request.contextPath}/inquiryStudent/return/'+data['stuID'],
                        dataType: "json",
                        success: function (result) {
                            obj.del();
                            layer.close(index);
                            searchStuID("unExamined");
                        }
                    })
                });
            } else if(obj.event === 'examine'){
                layer.open({
                    type: 2,
                    skin: 'layui-layer-rim', //加上边框
                    area: ['100%','100%'], //宽高
                    content: '${pageContext.request.contextPath}/inquiryStudent/examine/'+data['stuID'],
                    end: function () {
                        searchStuID("unExamined");
                        searchStuID("examined");
                    }
                });
            }
        });
        //监听行工具事件
        table.on('tool(examined)', function(obj){
            var data = obj.data;
            if(obj.event === 'look') {
                layer.open({
                    type: 2,
                    skin: 'layui-layer-rim', //加上边框
                    area: ['100%','100%'], //宽高
                    content: '${pageContext.request.contextPath}/inquiryStudent/look/'+data['stuID'],
                });
            }
        });
    });
    //搜素
    function searchStuID(e){
        if(e.toString() == 'unExamined'){
            unExaminedTable.reload({
                where: { stuID: $("#unExaminedStuID").val()}
            });
        }
        if(e.toString() == 'examined') {
            examinedTable.reload({
                where: { stuID: $("#examinedStuID").val()}
            });
        }
    }
</script>
</body>
</html>