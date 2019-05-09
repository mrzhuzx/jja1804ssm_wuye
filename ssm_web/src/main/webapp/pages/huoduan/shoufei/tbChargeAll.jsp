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
            <a href="${pageContext.request.contextPath}/pages/huoduan/shoufei/tbChargeAdd.jsp" class="btn btn-success">&nbsp;添&nbsp;加&nbsp;新&nbsp;收&nbsp;费&nbsp;标&nbsp;准&nbsp;</a>

            <form   style="display: inline-block;" action="${pageContext.request.contextPath}/tbch/searchAll.do">
                <label style="margin-left: 100px;">年份：</label>
                <select class="form-control" style="display: inline-block; width: 200px" placeholder="" name="year">
                    <option value="${createdate}">${createdate}</option>
                <c:forEach items="${tbCharges}" var="tchs" >
                <option value="${tchs.chargeyear}">${tchs.chargeyear}</option>
                </c:forEach>
                </select>

            <input type="submit" style="margin-left: 20px" value="查询" class="btn btn-success" >
            </form>
            <div style="padding-top: 20px" class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">

                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" STYLE="text-align: center" id="dataTables-example">
                                    <thead>
                                    <tr >
                                        <th>收费名</th>
                                        <th>收费标准</th>

                                        <th>操作</th>

                                    </tr>
                                    </thead>

                                    <tbody>
                            <c:forEach  items="${tbChargessearch}" var="tc">
                                    <tr class="gradeA" STYLE="text-align: center">
                                        <td>${tc.chargename}</td>
                                        <td>${tc.chargedescription}</td>

                                        <td><button class="btn btn-primary"onclick=" location.href='${pageContext.request.contextPath}/tbch/searchOne.do?id=${tc.chargeid}'"><i class="fa fa-edit " ></i> 修改</button>

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

