<%--
  Created by IntelliJ IDEA.
  User: Mr.S
  Date: 2019/2/10
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
    <title>学生个人信息编辑</title>
    <style>
        .ke-container.ke-container-default{
            width: 98%!important;
            margin-left: 1%!important;
        }
    </style>
</head>

<body>
<form class="layui-form" action="" id="myForm">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend style="text-align: center;">个人信息</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label">学号</label>
            <div class="layui-input-inline">
                <input type="text" value="${student.stuID}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="stuName">姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="stuName" value="${student.stuName}" id="stuName" lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="namePinyin">姓名拼音</label>
            <div class="layui-input-inline">
                <input type="text" name="namePinyin" value="${student.namePinyin}" id="namePinyin" lay-verify="required" placeholder="请输入拼音" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="oldName">曾用名</label>
            <div class="layui-input-inline">
                <input type="text" name="oldName" value="${student.oldName}" id="oldName" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="sex">性别</label>
            <div class="layui-input-inline">
                <input type="radio" name="sex" id="sex" value="M" <c:if test="${student.sex == 'M'}">checked=""</c:if> title="男">
                <input type="radio" name="sex" value="F" <c:if test="${student.sex == 'F'}">checked=""</c:if> title="女">
            </div>
            <label class="layui-form-label" for="originAdd">籍贯</label>
            <div class="layui-input-inline">
                <input type="text" name="originAdd" value="${student.originAdd}" id="originAdd" lay-verify="required" placeholder="请输入籍贯" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="birthday">出生日期</label>
            <div class="layui-input-inline">
                <input type="text" name="birthday" value="<fmt:formatDate value="${student.birthday}" type='time' pattern='yyyy-MM-dd'/>" id="birthday" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="soldier">现役军人</label>
            <div class="layui-input-inline">
                <input type="radio" name="soldier" id="soldier" value="Y" <c:if test="${student.soldier == 'Y'}">checked=""</c:if> title="是">
                <input type="radio" name="soldier" value="N" <c:if test="${student.soldier == 'N'}">checked=""</c:if> title="否">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="marry">婚姻状态</label>
            <div class="layui-input-inline">
                <input type="radio" name="marry" id="marry" value="Y" <c:if test="${student.marry == 'Y'}">checked=""</c:if> title="已婚">
                <input type="radio" name="marry" value="N" <c:if test="${student.marry == 'N'}">checked=""</c:if> title="未婚">
            </div>
            <label class="layui-form-label" for="nation">民族</label>
            <div class="layui-input-inline">
                <input type="text" name="nation" value="${student.nation}" id="nation" placeholder="请输入民族" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="political">政治面貌</label>
            <div class="layui-input-inline">
                <input type="text" name="political" value="${student.political}" id="political" placeholder="请输入面貌" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">证件类型</label>
            <div class="layui-input-inline">
                <select name="certType" lay-verify="required">
                    <option value="">请选择证件类型</option>
                    <option value="1" <c:if test="${student.certType == '1'}">selected</c:if>>身份证</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="certID">证件号码</label>
            <div class="layui-input-inline">
                <input type="text" name="certID" value="${student.certID}" id="certID" lay-verify="identity" placeholder="请输入号码" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="QQID">QQ号码</label>
            <div class="layui-input-inline">
                <input type="text" name="QQID" value="${student.QQID}" id="QQID" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="email">电子邮箱</label>
            <div class="layui-input-inline">
                <input type="text" name="email" value="${student.email}" id="email" lay-verify="myEmail" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="hobby">兴趣爱好</label>
            <div class="layui-input-inline">
                <input type="text" name="hobby" value="${student.hobby}" id="hobby" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="telePhone">手机号</label>
            <div class="layui-input-inline">
                <input type="text" name="telePhone" value="${student.telePhone}" id="telePhone" lay-verify="myPhone" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="bank">银行卡名称</label>
            <div class="layui-input-inline">
                <input type="text" name="bank" value="${student.bank}" id="bank" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="bankcard">银行卡号</label>
            <div class="layui-input-inline">
                <input type="text" name="bankcard" value="${student.bankcard}" id="bankcard" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
            <legend style="text-align: center;">个人简介</legend>
        </fieldset>
        <div class="layui-form-item">
            <textarea name="perProfile" id="perProfile" lay-verify="perProfile" style="height: 400px">${student.perProfile}</textarea>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend style="text-align: center;">学校信息</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label" for="stuTestID">考生编号</label>
            <div class="layui-input-inline">
                <input type="text" name="stuTestID" value="${student.stuTestID}" id="stuTestID" lay-verify="required" placeholder="请输入编号" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="enrolYear">录取年份</label>
            <div class="layui-input-inline">
                <input type="text" name="enrolYear" value="${student.enrolYear}" id="enrolYear"  lay-verify="required|myEnrolYear" placeholder="请输入年份" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="fresh">应届毕业生</label>
            <div class="layui-input-inline">
                <input type="radio" name="fresh" id="fresh" value="Y" <c:if test="${student.fresh == 'Y'}">checked=""</c:if> title="是">
                <input type="radio" name="fresh" value="N" <c:if test="${student.fresh == 'N'}">checked=""</c:if> title="否">
            </div>
            <label class="layui-form-label" for="highSchool">高中学校</label>
            <div class="layui-input-inline">
                <input type="text" name="highSchool" value="${student.highSchool}" id="highSchool" lay-verify="required" placeholder="请输入学校" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="school">现在学校</label>
            <div class="layui-input-inline">
                <input type="text" name="school" value="${student.school}" id="school" lay-verify="required" placeholder="请输入学校" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="stuFrom">生源所在地</label>
            <div class="layui-input-inline">
                <input type="text" name="stuFrom" value="${student.stuFrom}" id="stuFrom" lay-verify="required" placeholder="请输入地点" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="enrolTime">入学时间</label>
            <div class="layui-input-inline">
                <input type="text" name="enrolTime" value="<fmt:formatDate value="${student.enrolTime}" type='time' pattern='yyyy-MM-dd'/>" id="enrolTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="instBelong">院系</label>
            <div class="layui-input-inline">
                <input type="text" name="instBelong" value="${student.instBelong}" id="instBelong" lay-verify="required" placeholder="请输入院系" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="major">专业</label>
            <div class="layui-input-inline">
                <input type="text" name="major" value="${student.major}" id="major" lay-verify="required" placeholder="请输入专业" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="classe">班级</label>
            <div class="layui-input-inline">
                <input type="text" name="classe" value="${student.classe}" id="classe" lay-verify="required" placeholder="请输入班级" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="dormitory">现住宿舍</label>
            <div class="layui-input-inline">
                <input type="text" name="dormitory" value="${student.dormitory}" id="dormitory" lay-verify="required" placeholder="请输入宿舍" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="dormTel">宿舍电话</label>
            <div class="layui-input-inline">
                <input type="text" name="dormTel" value="${student.dormTel}" id="dormTel" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="stuCadreYN">学生干部</label>
            <div class="layui-input-inline">
                <input type="radio" name="stuCadreYN" id="stuCadreYN" value="Y" <c:if test="${student.stuCadreYN == 'Y'}">checked=""</c:if> title="是">
                <input type="radio" name="stuCadreYN" value="N" <c:if test="${student.stuCadreYN == 'N'}">checked=""</c:if> title="否">
            </div>
            <label class="layui-form-label" for="stuCadre">干部职务</label>
            <div class="layui-input-inline">
                <input type="text" name="stuCadre" value="${student.stuCadre}" id="stuCadre" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">学历证书</label>
            <div class="layui-input-inline">
                <input type="text" value="${student.graduateID}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">学位证书</label>
            <div class="layui-input-inline">
                <input type="text" value="${student.diplomaID}" readonly autocomplete="off" class="layui-input">
            </div>
        </div>
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend style="text-align: center;">家庭信息</legend>
            </fieldset>
        <div class="layui-form-item">
                <label class="layui-form-label" for="homeAdd">家庭住址</label>
                <div class="layui-input-inline">
                    <input type="text" name="homeAdd" value="${student.homeAdd}" id="homeAdd" placeholder="" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="homeZip">家庭邮编</label>
                <div class="layui-input-inline">
                    <input type="text" name="homeZip" value="${student.homeZip}" id="homeZip" placeholder="" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="fatherName">父亲姓名</label>
                <div class="layui-input-inline">
                    <input type="text" name="fatherName" value="${student.fatherName}" id="fatherName" placeholder="" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="fatherTele">父亲电话</label>
                <div class="layui-input-inline">
                    <input type="text" name="fatherTele" value="${student.fatherTele}" id="fatherTele" placeholder="" autocomplete="off" class="layui-input">
                </div>
        </div>
        <div class="layui-form-item">
                <label class="layui-form-label" for="motherName">母亲姓名</label>
                <div class="layui-input-inline">
                    <input type="text" name="motherName" value="${student.motherName}" id="motherName" placeholder="" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="motherTele">母亲电话</label>
                <div class="layui-input-inline">
                    <input type="text" name="motherTele" value="${student.motherTele}" id="motherTele" placeholder="" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="homeTele">家庭电话</label>
                <div class="layui-input-inline">
                    <input type="text" name="homeTele" value="${student.homeTele}" id="homeTele" placeholder="" autocomplete="off" class="layui-input">
                </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block" style="margin-left: 47%;margin-bottom: 40px;">
                <button class="layui-btn" lay-submit="" lay-filter="sub"><i class="layui-icon">&#xe63c;</i>修改</button>
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
            elem: '#enrolTime'
        });

        //提交表单
        form.on('submit(sub)', function (data) {
            $.ajax({
                async: true,
                type: "PUT",
                url: "${pageContext.request.contextPath}/student/personalInfo",
                data:  $("#myForm").serialize(),
                dataType: "json",
                success: function (result) {
                    if (result.code == 0) {
                        var id = layer.alert('修改成功',{
                            icon: 1,
                            offset: '150px'
                        });
                    }
                    if (result.code == 100) {
                        layer.alert("修改失败", {icon:5, offset: '150px'});
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
            myEnrolYear:function (value) {
                if (value.length > 4)
                    return '入学日期超过四个字符';
            }
        });

    });
</script>

</html>
