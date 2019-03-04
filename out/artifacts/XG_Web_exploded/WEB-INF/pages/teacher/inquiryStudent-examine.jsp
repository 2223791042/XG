<%--
  Created by IntelliJ IDEA.
  User: Mr.S
  Date: 2019/2/13
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" />
    <script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/static/script/jquery-3.3.1.min.js"></script>
    <title>高等学校学生及家庭情况调查表-审核</title>
    <style>
        table input[type="text"]{
            text-align: center;
            margin: 0px;
            border: 0px;
            width: 100%;
            display: flex;
            resize: none;
        }
        #family th{
            text-align: center;
        }
        #family .layui-input.layui-unselect{
            height: 20px!important;
        }
    </style>
</head>
<body>
<div id="container">
    <form class="layui-form" action="" id="myForm">
        <fieldset class="layui-elem-field layui-field-title" style="text-align: center">
            <legend>学生基本情况</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label">学校</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.school}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">院系</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.instBelong}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">专业</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.major}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">年级</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.enrolYear}" readonly autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.stuName}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">性别</label>
            <div class="layui-input-inline">
                <input type="radio" title="男" <c:if test="${inquiryStudent.sex == 'M'}">checked=""</c:if>>
                <input type="radio" title="女" <c:if test="${inquiryStudent.sex == 'F'}">checked=""</c:if>>
            </div>
            <label class="layui-form-label">出生年月</label>
            <div class="layui-input-inline">
                <input type="text" value="<fmt:formatDate value="${inquiryStudent.birthday}" type='time' pattern='yyyy-MM-dd'/>" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">民族</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.nation}" readonly autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">身份证号码</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.certID}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">政治面貌</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.political}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">入学前户口</label>
            <div class="layui-input-inline">
                <input type="radio"  title="城镇"  <c:if test="${inquiryStudent.registered=='T'}">checked=""</c:if>>
                <input type="radio"  title="农村" <c:if test="${inquiryStudent.registered=='C'}">checked=""</c:if>>
            </div>
            <label class="layui-form-label">毕业学校</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.highSchool}" readonly autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">家庭人口数</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.personNum}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">家庭类型</label>
            <div class="layui-input-inline">
                <select>
                    <option <c:if test="${inquiryStudent.homeType == '1'}">selected</c:if>>孤儿</option>
                    <option <c:if test="${inquiryStudent.homeType == '2'}">selected</c:if>>单亲</option>
                    <option <c:if test="${inquiryStudent.homeType == '3'}">selected</c:if>>残疾</option>
                    <option <c:if test="${inquiryStudent.homeType == '4'}">selected</c:if>>烈士或优抚对象子女</option>
                    <option <c:if test="${inquiryStudent.homeType == '5'}">selected</c:if>>低保家庭</option>
                    <option <c:if test="${inquiryStudent.homeType == '6'}">selected</c:if>>建档立卡贫困户</option>
                    <option <c:if test="${inquiryStudent.homeType == '7'}">selected</c:if>>其他</option>
                </select>
            </div>
            <label class="layui-form-label">家庭地址</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.homeAdd}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">邮政编码</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.homeZip}" readonly autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">联系电话</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.telePhone}" readonly autocomplete="off" class="layui-input">
            </div>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="text-align: center">
            <legend>家庭主要成员情况</legend>
        </fieldset>
        <table class="layui-table" id="family">
            <colgroup>
                <col width="5%"><col width="5%"><col width="10%">
                <col width="10%"><col width="8%"><col width="5%"><col width="10%">
            </colgroup>
            <thead>
            <tr>
                <th>姓名</th>
                <th>年龄</th>
                <th>与学生关系</th>
                <th>工作(学习)单位</th>
                <th>职业</th>
                <th>年收入(元)</th>
                <th>健康状态</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${inquiryStudent.inquiryHomeList}" var="inquiryHome">
                <tr>
                    <td><input type="text" value="${inquiryHome.familyName}" readonly></td>
                    <td><input type="text" value="${inquiryHome.age}" readonly></td>
                    <td><input type="text" value="${inquiryHome.relation}" readonly></td>
                    <td><input type="text" value="${inquiryHome.workPlace}" readonly></td>
                    <td><input type="text" value="${inquiryHome.occupation}" readonly></td>
                    <td><input type="text" value="${inquiryHome.income}" readonly></td>
                    <td style="height: 15px">
                        <select>
                            <option  <c:if test="${inquiryHome.bodyStatus == '1'}">selected</c:if>>良好</option>
                            <option  <c:if test="${inquiryHome.bodyStatus == '2'}">selected</c:if>>一般</option>
                            <option  <c:if test="${inquiryHome.bodyStatus == '3'}">selected</c:if>>良好</option>
                        </select>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <fieldset class="layui-elem-field layui-field-title" style="text-align: center">
            <legend>家庭有关信息</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label">家庭年收入</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.homeIncome}" readonly autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">学生本学年已获资助情况</label>
            <div class="layui-input-inline">
                <textarea class="layui-textarea" readonly>${inquiryStudent.support}</textarea>
            </div>
            <label class="layui-form-label">家庭遭受突发意外事件</label>
            <div class="layui-input-inline">
                <textarea class="layui-textarea" readonly>${inquiryStudent.accident}</textarea>
            </div>
            <label class="layui-form-label">家庭成员失业情况</label>
            <div class="layui-input-inline">
                <textarea class="layui-textarea" readonly>${inquiryStudent.unemploy}</textarea>
            </div>
            <label class="layui-form-label">家庭欠债情况及原因</label>
            <div class="layui-input-inline">
                <textarea class="layui-textarea" readonly>${inquiryStudent.debt}</textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">其他情况</label>
            <div class="layui-input-block" style="width: 85%">
                <textarea class="layui-textarea" readonly>${inquiryStudent.other}</textarea>
            </div>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="text-align: center">
            <legend>本人承诺以上所填内容真实无误，并予以认可，如不真实，本人愿意承担相应后果。</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label">学生本人</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.studentSign}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">学生家长</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.parentSign}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">签字日期</label>
            <div class="layui-input-inline">
                <input type="text" readonly value="<fmt:formatDate value="${inquiryStudent.parentDate}" type='time' pattern='yyyy-MM-dd'/>" autocomplete="off" class="layui-input">
            </div>
        </div>
        <fieldset class="layui-elem-field layui-field-title" style="text-align: center">
            <legend>学生家庭所在地乡镇（街道）民政部门、村（居）委会、原就读高中确认签章</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label">经办人</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.agentSign}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">单位名称</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.agentUnit}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">是否盖章</label>
            <div class="layui-input-inline">
                <input type="radio" title="是" <c:if test="${inquiryStudent.seal == 'Y'}">checked=""</c:if>>
                <input type="radio" title="否" <c:if test="${inquiryStudent.seal == 'N'}">checked=""</c:if>>
            </div>
        </div>
        <div class="layui-form-item" style="margin-bottom: 20px;">
            <label class="layui-form-label">联系电话</label>
            <div class="layui-input-inline">
                <input type="text" value="${inquiryStudent.agentTel}" readonly autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">签字日期</label>
            <div class="layui-input-inline">
                <input type="text" value="<fmt:formatDate value="${inquiryStudent.agentDate}" type='time' pattern='yyyy-MM-dd'/>" readonly autocomplete="off" class="layui-input">
            </div>
        </div>
    </form>
    <div>
        <div class="layui-input-block" style="margin-bottom: 40px;margin-left: 45%;">
            <button class="layui-btn layui-btn-radius" onclick="examine()"><i class="layui-icon">&#xe605;</i>审核通过</button>
        </div>
    </div>
</div>
</body>
<script>
    var form,layer;
    layui.use(['form', 'laydate'], function () {
        var laydate = layui.laydate;
        layer = layui.layer
        form = layui.form;
    });
    function examine() {
        $.ajax({
            async: true,
            type: "PUT",
            url: "${pageContext.request.contextPath}/inquiryStudent/examine/" + ${inquiryStudent.stuID},
            dataType: "json",
            success: function (result) {
                if (result.code == 0) {
                    var id = layer.msg('审核成功',{
                        icon:1,
                        time:false,
                        btn:['知道了'],
                        yes:function () {
                            layer.close(id);
                            location.reload();
                        }
                    });
                }
                if (result.code == 100) {
                    layer.msg("审核失败", {icon:5});
                }
            }
        });
    }
</script>
</html>
