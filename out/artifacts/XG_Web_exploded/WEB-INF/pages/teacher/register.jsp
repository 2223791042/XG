<%--
  Created by IntelliJ IDEA.
  User: Mr.S
  Date: 2019/2/10
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/lay/modules/laydate.js">
    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/static/script/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/kindeditor/themes/default/default.css" type="text/css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/kindeditor/kindeditor-all-min.js"></script>
    <script src="${pageContext.request.contextPath}/static/kindeditor/lang/zh-CN.js"></script>
    <title>教师注册</title>
    <style>
        #content-right {
            margin-top: 20px;
            margin-left: 4%;
            margin-bottom: 50px;
            border: 1px solid;
            text-align: center;
            float: left;
            width: 44%;
        }

        #content-left {
            margin-top: 20px;
            margin-left: 4%;
            margin-bottom: 50px;
            border: 1px solid;
            text-align: center;
            float: left;
            width: 44%;
        }

        #content-rightMiddle {
            border-top: 1px solid;
        }

        #content-rightDown {
            border-top: 1px solid;
            padding-bottom: 19px;
        }
        .ke-container.ke-container-default{
            width: 98%!important;
            margin-left: 0.8%!important;
        }
    </style>
</head>

<body>
<form class="layui-form" action="" id="myForm">
    <div id="content-left">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>个人信息</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label" for="teaName">职工姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="teaName" id="teaName" lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="namePinyin">姓名拼音</label>
            <div class="layui-input-inline">
                <input type="text" name="namePinyin" id="namePinyin" lay-verify="required" placeholder="请输入拼音" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="oldName">曾用名</label>
            <div class="layui-input-inline">
                <input type="text" name="oldName" id="oldName" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="sex">性别</label>
            <div class="layui-input-inline">
                <input type="radio" name="sex" id="sex" value="M" title="男" checked="">
                <input type="radio" name="sex" value="F" title="女">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">健康状态</label>
            <div class="layui-input-inline">
                <select name="health" lay-verify="required">
                    <option value="">请选择健康状态</option>
                    <option value="1">健康</option>
                    <option value="2">一般</option>
                    <option value="3">较差</option>
                </select>
            </div>
            <label class="layui-form-label" for="birthday">出生日期</label>
            <div class="layui-input-inline">
                <input type="text" name="birthday" id="birthday" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="originAdd">籍贯</label>
            <div class="layui-input-inline">
                <input type="text" name="originAdd" id="originAdd" lay-verify="required" placeholder="请输入籍贯" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="nation">民族</label>
            <div class="layui-input-inline">
                <input type="text" name="nation" id="nation" placeholder="请输入民族" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="political">政治面貌</label>
            <div class="layui-input-inline">
                <input type="text" name="political" id="political" placeholder="请输入面貌" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="marry">婚姻状态</label>
            <div class="layui-input-inline">
                <input type="radio" name="marry" id="marry" value="Y" title="已婚" checked="">
                <input type="radio" name="marry" value="N" title="未婚">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">证件类型</label>
            <div class="layui-input-inline">
                <select name="certType" lay-verify="required">
                    <option value="">请选择证件类型</option>
                    <option value="0">身份证</option>
                </select>
            </div>
            <label class="layui-form-label" for="certID">证件号码</label>
            <div class="layui-input-inline">
                <input type="text" name="certID" id="certID" lay-verify="identity" placeholder="请输入号码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="QQID">QQ号码</label>
            <div class="layui-input-inline">
                <input type="text" name="QQID" id="QQID" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="email">电子邮箱</label>
            <div class="layui-input-inline">
                <input type="text" name="email" id="email" lay-verify="myEmail" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="telePhone">联系电话</label>
            <div class="layui-input-inline">
                <input type="text" name="telePhone" id="telePhone" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="hobby">兴趣爱好</label>
            <div class="layui-input-inline">
                <input type="text" name="hobby" id="hobby" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="belief">宗教信仰</label>
            <div class="layui-input-inline">
                <input type="text" name="belief" id="belief" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="overseas">港澳台侨</label>
            <div class="layui-input-inline">
                <input type="text" name="overseas" id="overseas" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
            <legend>个人简介</legend>
        </fieldset>
        <div class="layui-form-item">
            <textarea name="perProfile" id="perProfile" lay-verify="perProfile" style="height: 382px"></textarea>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="memo">备注</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="memo" id="memo"></textarea>
            </div>
        </div>
    </div>
    <div id="content-right">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>教师资格信息</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label" for="graduate">最高学历</label>
            <div class="layui-input-inline">
                <input type="text" name="graduate" id="graduate" lay-verify="required" placeholder="请输入学历" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="graTime">获得时间</label>
            <div class="layui-input-inline">
                <input type="text" name="graTime" id="graTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="diploma">最高学位</label>
            <div class="layui-input-inline">
                <input type="text" name="diploma" id="diploma" lay-verify="required" placeholder="请输入学位" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="dipTime">获得时间</label>
            <div class="layui-input-inline">
                <input type="text" name="dipTime" id="dipTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="graSchool">毕业院校</label>
            <div class="layui-input-inline">
                <input type="text" name="graSchool" id="graSchool" lay-verify="required" placeholder="请输入院校" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="major">毕业专业</label>
            <div class="layui-input-inline">
                <input type="text" name="major" id="major" lay-verify="required" placeholder="请输入专业" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="position">职称</label>
            <div class="layui-input-inline">
                <input type="text" name="position" id="position" lay-verify="required" placeholder="请输入职称" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="posTime">获得时间</label>
            <div class="layui-input-inline">
                <input type="text" name="posTime" id="posTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="officer">职务</label>
            <div class="layui-input-inline">
                <input type="text" name="officer" id="officer" lay-verify="required" placeholder="请输入职务" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="offTime">获得时间</label>
            <div class="layui-input-inline">
                <input type="text" name="offTime" id="offTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="schPost">校聘岗位</label>
            <div class="layui-input-block">
                <input type="text" name="schPost" id="schPost" lay-verify="required" placeholder="请输入岗位" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="perStatus">人员状态</label>
            <div class="layui-input-inline">
                <input type="radio" name="perStatus" id="perStatus" value="Y" title="在岗" checked="">
                <input type="radio" name="perStatus" value="N" title="下岗">
            </div>
            <label class="layui-form-label" for="isTeaCert">教师资格证</label>
            <div class="layui-input-inline">
                <input type="radio" name="isTeaCert" id="isTeaCert" value="Y" title="已获得" checked="">
                <input type="radio" name="isTeaCert" value="N" title="未获得">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="teaCert">教师证号</label>
            <div class="layui-input-inline">
                <input type="text" name="teaCert" id="teaCert" lay-verify="required" placeholder="请输入证号" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="currMajor">现从事专业</label>
            <div class="layui-input-inline">
                <input type="text" name="currMajor" id="currMajor" lay-verify="required" placeholder="请输入专业" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="instBelong">所在院系</label>
            <div class="layui-input-inline">
                <input type="text" name="instBelong" id="instBelong" lay-verify="required" placeholder="请输入院系" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="research">研究方向</label>
            <div class="layui-input-inline">
                <input type="text" name="research" id="research" placeholder="请输入研究方向" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="comeTime">来校年月</label>
            <div class="layui-input-inline">
                <input type="text" name="comeTime" id="comeTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="workTime">工作年月</label>
            <div class="layui-input-inline">
                <input type="text" name="workTime" id="workTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="teachTime">从教年月</label>
            <div class="layui-input-inline">
                <input type="text" name="teachTime" id="teachTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div id="content-rightMiddle">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>家庭信息</legend>
            </fieldset>
            <div class="layui-form-item">
                <label class="layui-form-label" for="contactAdd">通信地址</label>
                <div class="layui-input-inline">
                    <input type="text" name="contactAdd" id="contactAdd" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="contactZip">通信邮编</label>
                <div class="layui-input-inline">
                    <input type="text" name="contactZip" id="contactZip" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label" for="homeAdd">家庭住址</label>
                <div class="layui-input-inline">
                    <input type="text" name="homeAdd" id="homeAdd" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="homeZip">家庭邮编</label>
                <div class="layui-input-inline">
                    <input type="text" name="homeZip" id="homeZip" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label" for="regType">户口性质</label>
                <div class="layui-input-inline">
                    <input type="radio" name="regType" id="regType" value="1" title="非农业" checked="">
                    <input type="radio" name="regType" value="2" title="农业">
                </div>
                <label class="layui-form-label" for="regAdd">户口所在地</label>
                <div class="layui-input-inline">
                    <input type="text" name="regAdd" id="regAdd" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div id="content-rightDown">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>账号信息</legend>
            </fieldset>
            <div class="layui-form-item">
                <label class="layui-form-label" for="teacherID">职工号</label>
                <div class="layui-input-inline">
                    <input type="text" name="teacherID" id="teacherID" lay-verify="required|checkTeacherID" placeholder="请输入职工号" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label" for="password">密码</label>
                <div class="layui-input-inline">
                    <input type="password" name="password" id="password" lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="repassword">确认密码</label>
                <div class="layui-input-inline">
                    <input type="password" name="repassword" id="repassword" lay-verify="required|repassword" placeholder="请确认密码" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <a class="layui-btn layui-btn-radius layui-btn-warm" href='${pageContext.request.contextPath}/login'><i class="layui-icon">&#xe603;</i>返回登录 </a>
            <button class="layui-btn layui-btn-radius" lay-submit="" lay-filter="sub">注册</button>
            <input type="reset" class="layui-btn layui-btn-danger layui-btn-radius" value="重置">
        </div>
    </div>
</form>
</body>
<script>
    var editor;
    KindEditor.ready(function(K) {
        editor = K.create('#perProfile',{
            //配置kindeditor编辑器的工具栏菜单项
            items: ["undo", "redo", "|", "preview", "print", "cut", "copy", "paste", "plainpaste",
                "|", "justifyleft", "justifycenter", "justifyright", "justifyfull", "insertorderedlist",
                "insertunorderedlist", "indent", "outdent", "subscript", "superscript", "|", "fullscreen",
                "/", "formatblock", "fontname", "fontsize", "|", "forecolor", "hilitecolor", "bold", "italic",
                "underline", "strikethrough", "lineheight","removeformat", "|", "table", "hr", "link", "unlink"],
        });
    });
    layui.use(['form', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , laydate = layui.laydate;
        //日期
        laydate.render({
            elem: '#birthday'
        });
        laydate.render({
            elem: '#graTime'
        });
        laydate.render({
            elem: '#dipTime'
        });
        laydate.render({
            elem: '#posTime'
        });
        laydate.render({
            elem: '#offTime'
        });
        laydate.render({
            elem: '#comeTime'
        });
        laydate.render({
            elem: '#workTime'
        });
        laydate.render({
            elem: '#teachTime'
        });

        //提交表单
        form.on('submit(sub)', function (data) {
            $.ajax({
                async: true,
                type: "POST",
                url: "${pageContext.request.contextPath}/teacher/register",
                data:  $("#myForm").serialize(),
                dataType: "json",
                success: function (result) {
                    if (result.code == 0) {
                        var id = layer.msg('注册成功',{
                            icon:1,
                            time:false,
                            btn:['知道了'],
                            yes:function () {
                                layer.close(id);
                                location.href="${pageContext.request.contextPath}/login";
                            }
                        });
                    }
                    if (result.code == 100) {
                        layer.msg("注册失败", {icon:5});
                    }
                }
            });
            return false;
        });

        //自定义验证规则
        form.verify({
            perProfile:function(value){
                editor.sync();
            },
            myEmail: function (value) {
                if (value.length > 0) {
                    var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
                    if (!reg.test(value)) {
                        return '邮箱格式不正确';
                    }
                }
            },
            myPhone: function (value) {
                if (value.length > 0) {
                    var reg = new RegExp("[0-9]{11}");
                    if (!reg.test(value)) {
                        return '手机号码不正确';
                    }
                }
            },
            repassword: function (value) {
                var password = document.getElementById("password").value;
                if (password != value) {
                    return '两次密码不一致';
                }
            },
            checkStuID:function (value) {
                var exist = false;
                $.ajax({
                    async: false,
                    type: "GET",
                    url: '${pageContext.request.contextPath}/teacher/checkTeacherID/' + value,
                    dataType: "json",
                    success: function (result) {
                        if (result.code == 0) {
                            exist = true;
                        }
                    }
                });
                if(exist)
                    return "该职工号已被注册";
            }
        });

    });
</script>

</html>