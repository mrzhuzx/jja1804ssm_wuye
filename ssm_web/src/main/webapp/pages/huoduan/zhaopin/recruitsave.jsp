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

    <link href="../assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="../assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="../assets/css/custom-styles.css" rel="stylesheet" />
    <link rel="stylesheet" href="../plugins/datepicker3.css">
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
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
            <div class="row" style="width: 600px;">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            增加一条招聘讯息
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form action="${pageContext.request.contextPath}/recruit/resave.do" method="post">
                                        <div  >
                                            <label>公司名称</label>
                                            <input class="form-control" placeholder="" value="国贸物业" name="companyname" >
                                        </div>
                                        <div  >
                                            <label>岗位名称</label>
                                            <input class="form-control" placeholder="" value="文员" name="postname" >
                                        </div>
                                        <div class="form-group">
                                            <label>招聘要求</label>
                                            <textarea class="form-control" rows="5"  name="recruitdes">1、年龄在30周岁以下，女性优先
2、文秘、行政管理及相关专业大专以上学历，有一定的公文写作能力 
3、一年以上相关工作经验 
4、熟悉前台工作流程，熟练使用各种办公自动化设备
5、性格开朗，待人热诚，形象气质佳
6、工作热情积极、细致耐心，具有良好的沟通协调能力
7、有较强的服务意识，懂得基本的商务礼仪</textarea>
                                        </div>
                                        <div class="form-group">
                                            <label>岗位职责</label>
                                            <textarea class="form-control" rows="5"  name="duty">1、协助将来完成各部门的资料整理，撰写，协调，分发工作
2、完成经理分派的内部文档的撰写工作
3、做好公司的内勤和行政管理</textarea>
                                        </div>
                                        <div>
                                            <label>招聘人数</label>
                                            <input class="form-control" placeholder="" value="20" name="recruitnum">
                                        </div>
                                        <div class="form-group">
                                            <label>薪资待遇</label>
                                            <textarea class="form-control" rows="5"  name="salary">在大厦上班加班另算、有工龄工资，服装公司提供，8小时待遇2500元--3500元</textarea>
                                        </div>
                                        <div>
                                            <label>截止时间</label>
                                            <input class="form-control" placeholder="" id="date" value="2019-10-10" name="recruitend">
                                        </div>
                                        <div  >
                                            <label>联系电话</label>
                                            <input class="form-control" placeholder="" value="88735555" name="recruitnumber" >
                                        </div>
                                        <div  >
                                            <label>地址</label>
                                            <input class="form-control" placeholder="联系方式" value="厦门市思明区" name="address" >
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
    <script src="../assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="../assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="../assets/js/jquery.metisMenu.js"></script>
    <!-- Custom Js -->
    <script src="../assets/js/custom-scripts.js"></script>
    <script src="./assets/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
    <script src="./assets/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>

    <script src="./assets/datatables/jquery.dataTables.min.js"></script>
    <script src="./assets/datatables/dataTables.bootstrap.min.js"></script>
    <script src="../plugins/jquery-2.2.3.min.js"></script>
    <script src="../plugins/bootstrap-datepicker.js"></script>
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


