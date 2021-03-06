<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/28 0028
  Time: 上午 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
    <!-- Bootstrap Styles-->

    <link href="./assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="./assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="./assets/css/custom-styles.css" rel="stylesheet" />
    <link rel="stylesheet" href="./plugins/datepicker3.css">
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
                            增加房屋类型
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form action="${pageContext.request.contextPath}/mht/addmht.do" method="post">
                                        <div  >
                                            <label>房屋类型</label>
                                            <input class="form-control" placeholder="房屋类型" value="海景房" name="htypename" >
                                        </div>
                                        <div  >
                                            <label>房屋年限</label>
                                            <input class="form-control" placeholder="房屋年限" value="产权年限50年" name="htpropertyright" >
                                        </div>
                                        <br>
                                        <div>

                                           <button type="submit" class="btn btn-success"><i class=""></i> 确认增加 </button>

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
<script src="./assets/js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="./assets/js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="./assets/js/jquery.metisMenu.js"></script>
<!-- Custom Js -->
<script src="./assets/js/custom-scripts.js"></script>
<script src="./assets/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="./assets/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>

<script src="./assets/datatables/jquery.dataTables.min.js"></script>
<script src="./assets/datatables/dataTables.bootstrap.min.js"></script>
<script src="./plugins/jquery-2.2.3.min.js"></script>
<script src="./plugins/bootstrap-datepicker.js"></script>
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

