<%--
  Created by IntelliJ IDEA.
  User: Mr.S
  Date: 2019/2/10
  Time: 11:34
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
    <title>教师个人信息编辑</title>
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
            <label class="layui-form-label">职工号</label>
            <div class="layui-input-inline">
                <input type="text" value="${teacher.teacherID}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="teaName">职工姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="teaName" value="${teacher.teaName}" id="teaName" lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="namePinyin">姓名拼音</label>
            <div class="layui-input-inline">
                <input type="text" name="namePinyin" value="${teacher.namePinyin}" id="namePinyin" lay-verify="required" placeholder="请输入拼音" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="oldName">曾用名</label>
            <div class="layui-input-inline">
                <input type="text" name="oldName" value="${teacher.oldName}" id="oldName" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="sex">性别</label>
            <div class="layui-input-inline">
                <input type="radio" name="sex" <c:if test="${teacher.sex == 'M'}">checked=""</c:if> id="sex" value="M" title="男">
                <input type="radio" name="sex" <c:if test="${teacher.sex == 'F'}">checked=""</c:if> value="F" title="女">
            </div>
            <label class="layui-form-label">健康状态</label>
            <div class="layui-input-inline">
                <select name="health" lay-verify="required">
                    <option value="">请选择健康状态</option>
                    <option value="1" <c:if test="${teacher.health == '1'}">selected</c:if>>健康</option>
                    <option value="2" <c:if test="${teacher.health == '2'}">selected</c:if>>一般</option>
                    <option value="3" <c:if test="${teacher.health == '3'}">selected</c:if>>较差</option>
                </select>
            </div>
            <label class="layui-form-label" for="birthday">出生日期</label>
            <div class="layui-input-inline">
                <input type="text" name="birthday" value="<fmt:formatDate value="${teacher.birthday}" type='time' pattern='yyyy-MM-dd'/>" id="birthday" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="originAdd">籍贯</label>
            <div class="layui-input-inline">
                <input type="text" name="originAdd" value="${teacher.originAdd}" id="originAdd" lay-verify="required" placeholder="请输入籍贯" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="nation">民族</label>
            <div class="layui-input-inline">
                <input type="text" name="nation" value="${teacher.nation}" id="nation" placeholder="请输入民族" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="political">政治面貌</label>
            <div class="layui-input-inline">
                <input type="text" name="political" value="${teacher.political}" id="political" placeholder="请输入面貌" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="marry">婚姻状态</label>
            <div class="layui-input-inline">
                <input type="radio" name="marry"  id="marry" value="Y" <c:if test="${teacher.marry == 'Y'}">checked=""</c:if> title="已婚" checked="">
                <input type="radio" name="marry" value="N" <c:if test="${teacher.marry == 'N'}">checked=""</c:if> title="未婚">
            </div>
            <label class="layui-form-label">证件类型</label>
            <div class="layui-input-inline">
                <select name="certType" lay-verify="required">
                    <option value="">请选择证件类型</option>
                    <option value="0" <c:if test="${teacher.certType == '0'}">selected</c:if>>身份证</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="certID">证件号码</label>
            <div class="layui-input-inline">
                <input type="text" name="certID" value="${teacher.certID}" id="certID" lay-verify="identity" placeholder="请输入号码" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="QQID">QQ号码</label>
            <div class="layui-input-inline">
                <input type="text" name="QQID" value="${teacher.QQID}" id="QQID" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="email">电子邮箱</label>
            <div class="layui-input-inline">
                <input type="text" name="email" value="${teacher.email}" id="email" lay-verify="myEmail" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="telePhone">联系电话</label>
            <div class="layui-input-inline">
                <input type="text" name="telePhone" value="${teacher.telePhone}" id="telePhone" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="hobby">兴趣爱好</label>
            <div class="layui-input-inline">
                <input type="text" name="hobby" value="${teacher.hobby}" id="hobby" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="belief">宗教信仰</label>
            <div class="layui-input-inline">
                <input type="text" name="belief" value="${teacher.belief}" id="belief" placeholder="" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="overseas">港澳台侨</label>
            <div class="layui-input-inline">
                <input type="text" name="overseas" value="${teacher.overseas}" id="overseas" placeholder="" autocomplete="off" class="layui-input">
            </div>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
            <legend style="text-align: center;">个人简介</legend>
        </fieldset>
        <div class="layui-form-item">
            <textarea name="perProfile" id="perProfile" lay-verify="perProfile" style="height: 382px">${teacher.perProfile}</textarea>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="memo">备注</label>
            <div class="layui-input-block" style="width: 90%;">
                <textarea class="layui-textarea" name="memo" id="memo">${teacher.memo}</textarea>
            </div>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend style="text-align: center;">教师资格信息</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label" for="graduate">最高学历</label>
            <div class="layui-input-inline">
                <input type="text" name="graduate" value="${teacher.graduate}" id="graduate" lay-verify="required" placeholder="请输入学历" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="graTime">获得时间</label>
            <div class="layui-input-inline">
                <input type="text" name="graTime" value="<fmt:formatDate value="${teacher.graTime}" type='time' pattern='yyyy-MM-dd'/>" id="graTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="diploma">最高学位</label>
            <div class="layui-input-inline">
                <input type="text" name="diploma" value="${teacher.diploma}" id="diploma" lay-verify="required" placeholder="请输入学位" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="dipTime">获得时间</label>
            <div class="layui-input-inline">
                <input type="text" name="dipTime" value="<fmt:formatDate value="${teacher.dipTime}" type='time' pattern='yyyy-MM-dd'/>" id="dipTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="graSchool">毕业院校</label>
            <div class="layui-input-inline">
                <input type="text" name="graSchool" value="${teacher.graSchool}" id="graSchool" lay-verify="required" placeholder="请输入院校" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="major">毕业专业</label>
            <div class="layui-input-inline">
                <input type="text" name="major" value="${teacher.major}" id="major" lay-verify="required" placeholder="请输入专业" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="position">职称</label>
            <div class="layui-input-inline">
                <input type="text" name="position" value="${teacher.position}" id="position" lay-verify="required" placeholder="请输入职称" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="posTime">获得时间</label>
            <div class="layui-input-inline">
                <input type="text" name="posTime" value="<fmt:formatDate value="${teacher.posTime}" type='time' pattern='yyyy-MM-dd'/>" id="posTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="officer">职务</label>
            <div class="layui-input-inline">
                <input type="text" name="officer" value="${teacher.officer}" id="officer" lay-verify="required" placeholder="请输入职务" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="offTime">获得时间</label>
            <div class="layui-input-inline">
                <input type="text" name="offTime" value="<fmt:formatDate value="${teacher.offTime}" type='time' pattern='yyyy-MM-dd'/>" id="offTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="schPost">校聘岗位</label>
            <div class="layui-input-inline">
                <input type="text" name="schPost" value="${teacher.schPost}" id="schPost" lay-verify="required" placeholder="请输入岗位" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="perStatus">人员状态</label>
            <div class="layui-input-inline">
                <input type="radio" name="perStatus" id="perStatus" value="Y" <c:if test="${teacher.perStatus == 'Y'}">checked=""</c:if> title="在岗">
                <input type="radio" name="perStatus" value="N" <c:if test="${teacher.perStatus == 'N'}">checked=""</c:if>  title="下岗">
            </div>
        </div>
    <div class="layui-form-item">
            <label class="layui-form-label" for="isTeaCert">教师资格证</label>
            <div class="layui-input-inline">
                <input type="radio" name="isTeaCert" id="isTeaCert" value="Y" <c:if test="${teacher.isTeaCert == 'Y'}"> checked=""</c:if> title="已获得" checked="">
                <input type="radio" name="isTeaCert" value="N" <c:if test="${teacher.isTeaCert == 'N'}"> checked=""</c:if> title="未获得">
            </div>
            <label class="layui-form-label" for="teaCert">教师证号</label>
            <div class="layui-input-inline">
                <input type="text" name="teaCert" value="${teacher.teaCert}" id="teaCert" lay-verify="required" placeholder="请输入证号" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="currMajor">现从事专业</label>
            <div class="layui-input-inline">
                <input type="text" name="currMajor" value="${teacher.currMajor}" id="currMajor" lay-verify="required" placeholder="请输入专业" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="instBelong">所在院系</label>
            <div class="layui-input-inline">
                <input type="text" name="instBelong" value="${teacher.instBelong}" id="instBelong" lay-verify="required" placeholder="请输入院系" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="research">研究方向</label>
            <div class="layui-input-inline">
                <input type="text" name="research" value="${teacher.research}" id="research" placeholder="请输入研究方向" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="comeTime">来校年月</label>
            <div class="layui-input-inline">
                <input type="text" name="comeTime" value="<fmt:formatDate value="${teacher.comeTime}" type='time' pattern='yyyy-MM-dd'/>" id="comeTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="workTime">工作年月</label>
            <div class="layui-input-inline">
                <input type="text" name="workTime" value="<fmt:formatDate value="${teacher.workTime}" type='time' pattern='yyyy-MM-dd'/>" id="workTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="teachTime">从教年月</label>
            <div class="layui-input-inline">
                <input type="text" name="teachTime" value="<fmt:formatDate value="${teacher.teachTime}" type='time' pattern='yyyy-MM-dd'/>" id="teachTime" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend style="text-align: center;">家庭信息</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label" for="contactAdd">通信地址</label>
            <div class="layui-input-inline">
                <input type="text" name="contactAdd" value="${teacher.contactAdd}" id="contactAdd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="contactZip">通信邮编</label>
            <div class="layui-input-inline">
                <input type="text" name="contactZip" value="${teacher.contactZip}" id="contactZip" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="homeAdd">家庭住址</label>
            <div class="layui-input-inline">
                <input type="text" name="homeAdd" value="${teacher.homeAdd}" id="homeAdd" autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label" for="homeZip">家庭邮编</label>
            <div class="layui-input-inline">
                <input type="text" name="homeZip" value="${teacher.homeZip}" id="homeZip" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label" for="regType">户口性质</label>
            <div class="layui-input-inline">
                <input type="radio" name="regType" id="regType" value="1" <c:if test="${teacher.regType == '1'}">checked=""</c:if> title="非农业">
                <input type="radio" name="regType" value="2" <c:if test="${teacher.regType == '2'}">checked=""</c:if> title="农业">
            </div>
            <label class="layui-form-label" for="regAdd">户口所在地</label>
            <div class="layui-input-inline">
                <input type="text" name="regAdd" value="${teacher.regAdd}" id="regAdd" autocomplete="off" class="layui-input">
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
    layui.use(['form','laydate'], function () {
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
                type: "PUT",
                url: "${pageContext.request.contextPath}/teacher/personalInfo",
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
            }
        });

    });
</script>

</html>