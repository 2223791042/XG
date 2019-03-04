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
    <title>高等学校学生及家庭情况调查表-编辑</title>
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
                <label class="layui-form-label" for="registered">入学前户口</label>
                <div class="layui-input-inline">
                    <input type="radio" name="registered" id="registered" value="T" title="城镇" lay-verify="registered" <c:if test="${inquiryStudent.registered=='T'}">checked=""</c:if>>
                    <input type="radio" name="registered" value="C" title="农村" lay-verify="registered" <c:if test="${inquiryStudent.registered=='C'}">checked=""</c:if>>
                </div>
                <label class="layui-form-label">毕业学校</label>
                <div class="layui-input-inline">
                    <input type="text" value="${inquiryStudent.highSchool}" readonly autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label" for="personNum">家庭人口数</label>
                <div class="layui-input-inline">
                    <input type="text" name="personNum" id="personNum" value="${inquiryStudent.personNum}" lay-verify="required|number" placeholder="请输入数字" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label">家庭类型</label>
                <div class="layui-input-inline">
                    <select name="homeType" lay-verify="required">
                        <option value="">请选择家庭类型</option>
                        <option value="1" <c:if test="${inquiryStudent.homeType == '1'}">selected</c:if>>孤儿</option>
                        <option value="2" <c:if test="${inquiryStudent.homeType == '2'}">selected</c:if>>单亲</option>
                        <option value="3" <c:if test="${inquiryStudent.homeType == '3'}">selected</c:if>>残疾</option>
                        <option value="4" <c:if test="${inquiryStudent.homeType == '4'}">selected</c:if>>烈士或优抚对象子女</option>
                        <option value="5" <c:if test="${inquiryStudent.homeType == '5'}">selected</c:if>>低保家庭</option>
                        <option value="6" <c:if test="${inquiryStudent.homeType == '6'}">selected</c:if>>建档立卡贫困户</option>
                        <option value="7" <c:if test="${inquiryStudent.homeType == '7'}">selected</c:if>>其他</option>
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
                        <td><input type="text" name="familyName" value="${inquiryHome.familyName}" lay-verify="required"></td>
                        <td><input type="text" name="age" value="${inquiryHome.age}" lay-verify="number|required"></td>
                        <td><input type="text" name="relation" value="${inquiryHome.relation}" lay-verify="required"></td>
                        <td><input type="text" name="workPlace" value="${inquiryHome.workPlace}" lay-verify="required"></td>
                        <td><input type="text" name="occupation" value="${inquiryHome.occupation}" lay-verify="required"></td>
                        <td><input type="text" name="income" value="${inquiryHome.income}" lay-verify="number|required"></td>
                        <td style="height: 15px">
                            <select name="bodyStatus">
                                <option value="1" <c:if test="${inquiryHome.bodyStatus == '1'}">selected</c:if>>良好</option>
                                <option value="2" <c:if test="${inquiryHome.bodyStatus == '2'}">selected</c:if>>一般</option>
                                <option value="3" <c:if test="${inquiryHome.bodyStatus == '3'}">selected</c:if>>良好</option>
                            </select>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td><input type="text" name="familyName" lay-verify="required"></td>
                    <td><input type="text" name="age" lay-verify="number|required"></td>
                    <td><input type="text" name="relation" lay-verify="required"></td>
                    <td><input type="text" name="workPlace" lay-verify="required"></td>
                    <td><input type="text" name="occupation" lay-verify="required"></td>
                    <td><input type="text" name="income" lay-verify="number|required"></td>
                    <td style="height: 15px">
                        <select name="bodyStatus">
                            <option value="1">良好</option>
                            <option value="2">一般</option>
                            <option value="3">良好</option>
                        </select>
                    </td>
                </tr>
                <tr style="text-align: center">
                    <td colspan="7">
                        <span class="layui-btn layui-btn-sm" onclick="addTr(this)"><i class="layui-icon">&#xe608;</i> 添加一行</span>
                        <span class="layui-btn layui-btn-sm layui-btn-danger" onclick="subTr()"><i class="layui-icon">&#xe640;</i> 删除一行</span>
                    </td>
                </tr>
                </tbody>
            </table>
            <fieldset class="layui-elem-field layui-field-title" style="text-align: center">
                <legend>家庭有关信息</legend>
            </fieldset>
            <div class="layui-form-item">
                <label class="layui-form-label" for="homeIncome">家庭年收入</label>
                <div class="layui-input-inline">
                    <input type="text" id="homeIncome" name="homeIncome" value="${inquiryStudent.homeIncome}" lay-verify="required|number" placeholder="请输入数字" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label" for="support">学生本学年已获资助情况</label>
                <div class="layui-input-inline">
                    <textarea class="layui-textarea" id="support" name="support">${inquiryStudent.support}</textarea>
                </div>
                <label class="layui-form-label" for="accident">家庭遭受突发意外事件</label>
                <div class="layui-input-inline">
                    <textarea class="layui-textarea" id="accident" name="accident">${inquiryStudent.accident}</textarea>
                </div>
                <label class="layui-form-label" for="unemploy">家庭成员失业情况</label>
                <div class="layui-input-inline">
                    <textarea class="layui-textarea" id="unemploy" name="unemploy">${inquiryStudent.unemploy}</textarea>
                </div>
                <label class="layui-form-label" for="debt">家庭欠债情况及原因</label>
                <div class="layui-input-inline">
                    <textarea class="layui-textarea" id="debt" name="debt">${inquiryStudent.debt}</textarea>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label" for="other">其他情况</label>
                <div class="layui-input-block" style="width: 85%">
                    <textarea class="layui-textarea" id="other" name="other">${inquiryStudent.other}</textarea>
                </div>
            </div>
            <fieldset class="layui-elem-field layui-field-title" style="text-align: center">
                <legend>本人承诺以上所填内容真实无误，并予以认可，如不真实，本人愿意承担相应后果。</legend>
            </fieldset>
            <div class="layui-form-item">
                <label class="layui-form-label" for="studentSign">学生本人</label>
                <div class="layui-input-inline">
                    <input type="text" id="studentSign" name="studentSign" value="${inquiryStudent.studentSign}" placeholder="请输入姓名"lay-verify="required" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="parentSign">学生家长</label>
                <div class="layui-input-inline">
                    <input type="text" id="parentSign" name="parentSign" value="${inquiryStudent.parentSign}" placeholder="请输入姓名" lay-verify="required" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="parentDate">签字日期</label>
                <div class="layui-input-inline">
                    <input type="text" lay-verify="date" id="parentDate" name="parentDate" value="<fmt:formatDate value="${inquiryStudent.parentDate}" type='time' pattern='yyyy-MM-dd'/>" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                </div>
            </div>
            <fieldset class="layui-elem-field layui-field-title" style="text-align: center">
                <legend>学生家庭所在地乡镇（街道）民政部门、村（居）委会、原就读高中确认签章</legend>
            </fieldset>
            <div class="layui-form-item">
                <label class="layui-form-label" for="agentSign">经办人</label>
                <div class="layui-input-inline">
                    <input type="text" id="agentSign" name="agentSign" value="${inquiryStudent.agentSign}" lay-verify="required"  placeholder="请输入姓名" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="agentUnit">单位名称</label>
                <div class="layui-input-inline">
                    <input type="text" id="agentUnit" name="agentUnit" value="${inquiryStudent.agentUnit}" lay-verify="required" placeholder="请输入名称" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label">是否盖章</label>
                <div class="layui-input-inline">
                    <input type="radio" value="Y" name="seal" lay-verify="seal" title="是" <c:if test="${inquiryStudent.seal == 'Y'}">checked=""</c:if>>
                    <input type="radio" value="N" name="seal" lay-verify="seal" title="否" <c:if test="${inquiryStudent.seal == 'N'}">checked=""</c:if>>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label" for="agentTel">联系电话</label>
                <div class="layui-input-inline">
                    <input type="text" id="agentTel" name="agentTel" value="${inquiryStudent.agentTel}" lay-verify="required" placeholder="请输入电话" autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label" for="agentDate">签字日期</label>
                <div class="layui-input-inline">
                    <input type="text" id="agentDate" name="agentDate" value="<fmt:formatDate value="${inquiryStudent.agentDate}" type='time' pattern='yyyy-MM-dd'/>" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div style="text-align: center;margin-bottom: 50px">
                <span class="layui-btn layui-btn-warm" onclick="save()"><i class="layui-icon">&#xe600;</i>保存</span>
                <button class="layui-btn" lay-submit="" lay-filter="sub"><i class="layui-icon">&#xe63c;</i>提交</button>
                <input type="reset" class="layui-btn layui-btn-danger" value="重置">
            </div>
        </form>
    </div>
</body>
<script>
    var form,layer;
    layui.use(['form', 'laydate'], function () {
        var laydate = layui.laydate;
        layer = layui.layer
        form = layui.form;
        //日期
        laydate.render({
            elem: '#agentDate'
        });
        laydate.render({
            elem: '#parentDate'
        });
        //提交表单
        form.on('submit(sub)', function (data) {
            var con = layer.confirm('提交之后就不允许修改了',{
                icon:1,
                btn:['确定了','再想想'],
                btn1:function () {
                    layer.close(con);
                    $.ajax({
                        async: true,
                        type: "POST",
                        url: "${pageContext.request.contextPath}/inquiryStudent/submit",
                        data:  $("#myForm").serialize(),
                        dataType: "json",
                        success: function (result) {
                            if (result.code == 0) {
                                var id = layer.msg('提交成功',{
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
                                layer.msg("提交失败", {icon:5});
                            }
                        }
                    });
                },
                btn2:function () {

                }
            });
            return false;
        });
        //自定义验证规则
        form.verify({
            registered:function (value) {
                var val = $("input:radio[name='registered']:checked").val();
                if(val == null){
                    return "入学前户口选项必须选中";
                }
            },
            seal:function (value) {
                var val = $("input:radio[name='seal']:checked").val();
                if(val == null){
                    return "是否盖章选项必须选中";
                }
            }
        });
    });
    function addTr(e) {
        $(e.parentNode.parentNode).before(
            "<tr>\n" +
            "                    <td><input type=\"text\" name=\"familyName\" lay-verify=\"required\"></td>\n" +
            "                    <td><input type=\"text\" name=\"age\" lay-verify=\"number|required\"></td>\n" +
            "                    <td><input type=\"text\" name=\"relation\" lay-verify=\"required\"></td>\n" +
            "                    <td><input type=\"text\" name=\"workPlace\" lay-verify=\"required\"></td>\n" +
            "                    <td><input type=\"text\" name=\"occupation\" lay-verify=\"required\"></td>\n" +
            "                    <td><input type=\"text\" name=\"income\" lay-verify=\"number|required\"></td>\n" +
            "                    <td style=\"height: 15px\">\n" +
            "                        <select name=\"bodyStatus\">\n" +
            "                            <option value=\"1\">良好</option>\n" +
            "                            <option value=\"2\">一般</option>\n" +
            "                            <option value=\"3\">良好</option>\n" +
            "                        </select>\n" +
            "                    </td>\n" +
            "                </tr>"
    );
        form.render();
    }
    function subTr() {
        var trs = $("input[name='familyName']");
        if(trs.length >= 1){
            $(trs[trs.length-1].parentNode.parentNode).remove();
        }
    }
    function save() {
        $.ajax({
            async: true,
            type: "POST",
            url: "${pageContext.request.contextPath}/inquiryStudent/save",
            data:  $("#myForm").serialize(),
            dataType: "json",
            success: function (result) {
                if (result.code == 0) {
                    var id = layer.msg('保存成功',{
                        icon:1,
                        time:false,
                        btn:['知道了'],
                        yes:function () {
                            layer.close(id);
                        }
                    });
                }
                if (result.code == 100) {
                    layer.msg("保存失败", {icon:5});
                }
            }
        });
    }
</script>
</html>
