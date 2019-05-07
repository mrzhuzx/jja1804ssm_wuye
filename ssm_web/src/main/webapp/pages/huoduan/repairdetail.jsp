<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\4\26 0026
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/huoduan/plugins/datepicker3.css">
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
<div id="wrapper">
    <%--头部--%>
    <jsp:include page="toubu.jsp"></jsp:include>
    <!--/. NAV TOP  -->
    <%--导航栏--%>
    <jsp:include page="daohanglan.jsp"></jsp:include>

    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                        设备维修详情页 <small></small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row" style="width: 600px;">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">

                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">

                                    <form action="${pageContext.request.contextPath}/repair/findall.do" method="post">
                                        <input  type="hidden" class="form-control" placeholder="" value="" name=""  >


                                        <div  >
                                            <label>业主</label>
                                            <input class="form-control" placeholder="repairname"  value="${rep.repairname}" name="repairname" >
                                        </div>

                                        <div>
                                            <label>问题描述</label>
                                            <input class="form-control" placeholder="repdesc" value="${rep.repdesc}" name="repdesc">
                                        </div>
                                        <div>
                                            <label>反馈时间</label>
                                            <input class="form-control" placeholder="reportdate"id="dateid3" value="<fmt:formatDate value='${rep.reportdate}' pattern='yyyy-MM-dd'/>"  name= "reportdate">
                                        </div>

                                        <div>
                                            <label>是否处理</label>
                                            <input class="form-control" placeholder="status" value="${rep.status}" name="status">
                                        </div>

                                        <div>
                                            <label>安排维修时间</label>
                                            <input class="form-control" placeholder="repairdate" id="dateid2" value="<fmt:formatDate value='${rep.repairdate}' pattern='yyyy-MM-dd'/>"  name= "repairdate">
                                        </div>
                                        <div>
                                            <label>修理工</label>
                                            <input class="form-control" placeholder="principal" value="${rep.principal}" name="principal">
                                        </div>
                                        <div>
                                            <label>材料</label>
                                            <input class="form-control" placeholder="material" value="${rep.material}" name="material">
                                        </div>
                                        <div>
                                            <label>费用</label>
                                            <input class="form-control" placeholder="upkeep" value="${rep.upkeep}" name="upkeep">
                                        </div>
                                        <div>
                                            <label>完成日期</label>
                                            <input class="form-control" placeholder="completedate"id="dateid" value="<fmt:formatDate value='${rep.completedate}' pattern='yyyy-MM-dd'/>"  name= "completedate" >
                                        </div>
                                        <div>
                                            <label>费用是否缴纳</label>
                                            <input class="form-control" placeholder="ispay" value="${rep.ispay}" name="ispay">
                                        </div>
                                        <div>
                                            <label>费用缴纳日期</label>
                                            <input class="form-control" placeholder="paydate" id="dateid1" value="<fmt:formatDate value='${rep.paydate}' pattern='yyyy-MM-dd'/>"  name= "paydate">
                                        </div>
                                        <br>
                                        <div>



                                            <button type="button" class="btn btn-primary" onclick="history.back(-1);"><i class="fa fa-reply "></i>返回</button>

                                        </div>



                                    </form>

                                </div>

                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <footer><p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p></footer>
        </div>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>
<!-- /. WRAPPER  -->
<!-- JS Scripts-->
<!-- jQuery Js -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/jquery.metisMenu.js"></script>
<!-- Custom Js -->
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/custom-scripts.js"></script>
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>

<script src="${pageContext.request.contextPath}/pages/huoduan/assets/datatables/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/pages/huoduan/assets/datatables/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/pages/huoduan/plugins/jquery-2.2.3.min.js"></script>
<script src="${pageContext.request.contextPath}/pages/huoduan/plugins/bootstrap-datepicker.js"></script>
<script>
    $(document).ready(function() {
        $('#dateid').datepicker({
            format : "yyyy-mm-dd",
            autoclose: true,
            language: 'zh-CN'
        });
    });
</script>
<script>
    $(document).ready(function() {
        $('#dateid1').datepicker({
            format : "yyyy-mm-dd",
            autoclose: true,
            language: 'zh-CN'
        });
    });
</script>
<script>
    $(document).ready(function() {
        $('#dateid2').datepicker({
            format : "yyyy-mm-dd",
            autoclose: true,
            language: 'zh-CN'
        });
    });
</script>
<script>
    $(document).ready(function() {
        $('#dateid3').datepicker({
            format : "yyyy-mm-dd",
            autoclose: true,
            language: 'zh-CN'
        });
    });
</script>



</body>
</html>

