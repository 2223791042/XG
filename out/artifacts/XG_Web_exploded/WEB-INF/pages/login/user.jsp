<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" />
    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/static/script/jquery-3.3.1.min.js"></script>
    <title>学工登录</title>
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
    <script>
        function change() {
            $('#kaptchaImage').click(function () {
                $(this).attr('src', '${pageContext.request.contextPath}/getVerifyCode?' + Math.floor(Math.random() * 100));
            })
        }
    </script>
</head>

<body>
<div id="main">
    <div id="content">
        <div style="margin-bottom: 30px;">
            <h1>学工系统登录</h1>
        </div>
        <div style="margin-bottom: 10px;">
            <h2 id="loginError" style="color: red;font-size: 22px;"></h2>
        </div>
        <form class="layui-form" id="loginForm" style="margin-left: 27%;">
            <div class="layui-form-item">
                <label class="layui-form-label">用户名</label>
                <div class="layui-input-inline">
                    <input type="text" name="userName" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码</label>
                <div class="layui-input-inline">
                    <input type="password" name="password" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-row">
                    <div class="layui-col-xs6 layui-col-sm6 layui-col-md6">
                    <label class="layui-form-label">验证码</label>
                    <div class="layui-input-inline">
                        <input type="text" name="verifyCode"  required  lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input">
                    </div>
                    </div>
                    <div class="layui-col-xs1 layui-col-sm1 layui-col-md1">
                        <img id="kaptchaImage" src="${pageContext.request.contextPath}/getVerifyCode" onclick="change();">
                    </div>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">角色</label>
                <div class="layui-input-inline">
                    <input type="radio" name="userType" value="student" title="学生" checked>
                    <input type="radio" name="userType" value="teacher" title="教师">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-inline" style="margin-left: 15%">
                    <button class="layui-btn layui-btn-radius" lay-submit="" lay-filter="sub">登录</button>
                    <a id="register" class="layui-btn layui-btn-danger layui-btn-radius">注册</a>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    $("#register").click(function () {
        var jump = $("input[name='userType']:checked").val();
        window.location.href="${pageContext.request.contextPath}/"+jump+"/register";
    });
    layui.use('form', function(){
        var form = layui.form;
        //提交表单
        form.on('submit(sub)', function (data) {
            $.ajax({
                type: "POST",
                url: '${pageContext.request.contextPath}/login',
                data: $("#loginForm").serialize(),
                dataType: "json",
                success: function (result) {
                    if (result.code == 0) {
                        var jump = $("input[name='userType']:checked").val();
                        window.location.href="${pageContext.request.contextPath}/"+jump+"/index";
                    } else {
                        $('#loginError').html(result.msg);
                    }
                }
            });
            return false;
        });
    });
</script>
</body>
</html>