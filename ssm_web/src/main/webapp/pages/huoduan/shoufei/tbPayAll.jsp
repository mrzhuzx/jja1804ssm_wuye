<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/24 0024
  Time: 下午 4:51
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":"+ request.getServerPort() + path + "/";
%>
<base href="<%=basePath%>">

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>

    <!-- Bootstrap Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/font-awesome.css" rel="stylesheet" />

    <!-- Custom Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <!-- Morris Chart Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />


    <head><base href="${pageContext.request.contextPath}">
<body>
<div id="wrapper">
   <%--头部--%>
    <jsp:include page="../toubu.jsp"></jsp:include>
    <!--/. NAV TOP  -->
    <%--导航栏--%>
    <jsp:include page="../daohanglan.jsp"></jsp:include>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                         <small></small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <form   style="display: inline-block;" action="${pageContext.request.contextPath}/tbpa/searchFeiByHou.do" method="post">
                <label style="margin-left: 0px;">收费项：</label>
                <select class="form-control" style="display: inline-block; width: 200px" placeholder="" name="chargename">
                    <option value="水费">水费</option>
                    <option value="电费">电费</option>
                    <option value="燃气费">燃气费</option>

                </select>

                <label style="margin-left: 0px;">缴费状态：</label>
                <select class="form-control" style="display: inline-block; width: 200px" placeholder="" name="paystate">
                    <option value="0">未缴费</option>
                    <option value="1">已缴费</option>


                </select>

                <label style="margin-left: 0px;">房屋：</label>
                <select class="form-control" style="display: inline-block; width: 200px" placeholder="" name="hid">

                    <c:forEach items="${myHouseList}" var="mhl" >
                        <option value="${mhl.hid}">${mhl.hid}---${mhl.hbulidingname}</option>
                    </c:forEach>
                </select>

                <input type="submit"  value="查询" class="btn btn-success" >
            </form>

            <div style="padding-top: 20px;" class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">

                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>房屋号</th>
                                        <th>缴费项</th>
                                        <th>缴费金额</th>
                                        <th>缴费月份</th>
                                        <th>缴费时间</th>
                                        <th>缴费状态</th>
                                        <th>缴费人</th>

                                    </tr>
                                    </thead>

                                    <tbody>
                            <c:forEach  items="${payCharges}" var="pc">
                                    <tr class="gradeA">
                                        <td>${pc.payid}</td>
                                        <td>${pc.houseid}</td>
                                        <td>${pc.chargename}</td>
                                        <td>${pc.chargestandard}</td>
                                        <td>${pc.paymonth}</td>
                                        <td><fmt:formatDate value='${pc.chargetime}' pattern='yyyy-MM-dd hh:mm:ss'/></td>
                                        <c:if test="${pc.paystate eq 0}">
                                            <td>
                                                未交费
                                            </td>
                                        </c:if>
                                        <c:if test="${pc.paystate eq 1}">
                                            <td>
                                                已缴费
                                            </td>
                                        </c:if>
                                        <td>${pc.payname}</td>


                                    </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</div>



</body>

<!-- /. PAGE WRAPPER  -->
<!-- /. WRAPPER  -->
<!-- JS Scripts-->
<!-- jQuery Js -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/jquery.metisMenu.js"></script>
<!-- DATA TABLE SCRIPTS -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/dataTables/jquery.dataTables.js"></script>
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/dataTables/dataTables.bootstrap.js"></script>
<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>
<!-- Custom Js -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/custom-scripts.js"></script>

</html>

