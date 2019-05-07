<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/28 0028
  Time: 上午 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<<<<<<< Updated upstream
   <%--头部--%>
=======
   %--头部--%>
>>>>>>> Stashed changes
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
            <div class="row" style="width: 600px;">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           抄电表
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
<<<<<<< Updated upstream
                                    <form action="${pageContext.request.contextPath}/ele/updateOne.do?electricid=${chElectricMeter.electricid}" method="post">
=======
                                    <form action="${pageContext.request.contextPath}/electric/insertOne.do" method="post">
>>>>>>> Stashed changes
                                        <input  type="hidden" class="form-control" placeholder="" value="" name=""  >


                                        <div class="form-group">
                                            <label>房屋ID</label>
                                            <select class="form-control" placeholder="" name="houseid">
<<<<<<< Updated upstream
                                                <option selected="selected" value="${chElectricMeter.houseid}">${chElectricMeter.houseid}</option>
=======
>>>>>>> Stashed changes
                                                <c:forEach items="${myHouseList}" var="mh" >
                                                    <option value="${mh.hid}">${mh.hid}----${mh.hbulidingname}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <span style="position: absolute;padding-left: 260px;padding-top: 30px">度</span>
                                        <div  >
                                            <label>用电量</label>
<<<<<<< Updated upstream
                                            <input class="form-control" placeholder="用电量" value="${chElectricMeter.electric}" name="electric" >
=======
                                            <input class="form-control" placeholder="用电量" value="139" name="electric" >
>>>>>>> Stashed changes

                                        </div>

                                        <div  >
                                            <label>抄表时间</label>
<<<<<<< Updated upstream
                                            <input class="form-control" placeholder="年月份" value="<fmt:formatDate value='${chElectricMeter.month}' pattern='yyyy-MM-dd'/>" id="dateid"  name="month">
=======
                                            <input class="form-control" placeholder="年月份" id="dateid"  name="month">
>>>>>>> Stashed changes
                                        </div>




                                        <br>
                                        <div>

<<<<<<< Updated upstream
                                           <button type="submit" class="btn btn-success"><i class=""></i> 确认修改 </button>
=======
                                           <button type="submit" class="btn btn-success"><i class=""></i> 确认增加 </button>
>>>>>>> Stashed changes

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
                $('#date').datepicker({
                    format : "yyyy-mm-dd",
                    autoclose: true,
                    language: 'zh-CN'
                });
            });
        </script>



</body>
</html>

