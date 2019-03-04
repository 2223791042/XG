<%--
  Created by IntelliJ IDEA.
  User: Mr.S
  Date: 2019/3/4
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/lay/modules/laydate.js">
    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/static/script/jquery-3.3.1.min.js"></script>
    <title>密码修改</title>
    <style>
        #content {
            text-align: center;
            width: 900px;
            height: 500px;
            margin: auto;
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
        }
    </style>
</head>
<body>
<div id="main">
    <div id="content">
        <form class="layui-form" id="passwordForm" style="margin-left: 27%;">
            <div class="layui-form-item">
                <label class="layui-form-label">职工号</label>
                <div class="layui-input-inline">
                    <input type="text" value="${teacherID}" readonly autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">原始密码</label>
                <div class="layui-input-inline">
                    <input type="password" name="originalPassword" required  lay-verify="required" placeholder="请输入原始密码" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">重置密码</label>
                <div class="layui-input-inline">
                    <input type="password" id="password" name="password" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">确认密码</label>
                <div class="layui-input-inline">
                    <input type="password" required  lay-verify="required|repassword" placeholder="请输入确认密码" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-inline" style="margin-left: 15%">
                    <button class="layui-btn layui-btn-radius" lay-submit="" lay-filter="sub"><i class="layui-icon">&#xe642;</i>修改</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    layui.use('form', function(){
        var form = layui.form;
        //提交表单
        form.on('submit(sub)', function (data) {
            $.ajax({
                type: "PUT",
                url: '${pageContext.request.contextPath}/teacher/password',
                data: $("#passwordForm").serialize(),
                dataType: "json",
                success: function (result) {
                    if (result.code == 0) {
                        layer.alert(result.msg,{
                            icon: 1,
                            offset: '150px'
                        });
                    }else {
                        layer.alert(result.msg,{
                            icon: 5,
                            offset: '150px'
                        });
                    }
                }
            });
            return false;
        });
        form.verify({
            repassword: function (value) {
                var password = document.getElementById("password").value;
                if (password != value) {
                    return '两次密码不一致';
                }
            }
        });
    });
</script>
</body>
</html>
