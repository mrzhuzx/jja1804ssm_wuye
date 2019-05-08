<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../appcomm/basePath.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
    <!-- Bootstrap Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->

    <!-- Custom Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <!-- TABLE STYLES-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
</head>
<body>
<div id="wrapper">
    <jsp:include page="toubu.jsp"></jsp:include>
    <!--/. NAV TOP  -->
    <%--导航栏--%>
    <jsp:include page="daohanglan.jsp"></jsp:include>
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->

            <div class="row">
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
                                        <td>id</td>
                                        <th>车辆号牌</th>
                                        <th>进入时间</th>
                                        <th>出去时间</th>
                                        <th>停车花费</th>
                                        <th>收费方式</th>
                                        <th>收费状态</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${parkingCarinfos}" var="pk">

                                        <tr class="odd gradeX">
                                            <td>${pk.parkingid}</td>

                                            <td>${pk.parkingcards}</td>
                                            <td><fmt:formatDate value="${pk.parkingintime}" pattern="yyyy-MM-dd:mm" /></td>
                                            <td><fmt:formatDate value="${pk.parkingouttime}" pattern="yyyy-MM-dd:mm" /></td>
                                            <td>${pk.parkingcost}￥</td>
                                            <td>
                                                <c:if test="${pk.paymentmethod  eq  1}">支付宝</c:if>
                                                <c:if test="${pk.paymentmethod  eq  2}">微信</c:if>
                                                <c:if test="${pk.paymentmethod  eq  3}">现金</c:if>

                                            </td>
                                            <td>
                                                    <c:if test="${pk.paymentstatus  eq 1}">已支付</c:if>
                                                    <c:if test="${pk.paymentstatus  eq null}">待支付</c:if>
                                                    </td>

                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
            <!-- /. ROW  -->

        </div>
    </div>
    <!-- /. ROW  -->
</div>

</div>
<!-- /. PAGE INNER  -->
</div>
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


</body>
</html>
