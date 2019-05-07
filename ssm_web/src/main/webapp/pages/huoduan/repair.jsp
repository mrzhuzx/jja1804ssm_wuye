<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title></title>
    <!-- Bootstrap Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- FontAwesome Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/font-awesome.css" rel="stylesheet"/>
    <!-- Morris Chart Styles-->

    <!-- Custom Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/custom-styles.css" rel="stylesheet"/>
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
    <!-- TABLE STYLES-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/js/dataTables/dataTables.bootstrap.css"
          rel="stylesheet"/>
</head>
<body>
<div id="wrapper">
    <%--头部--%>
    <jsp:include page="toubu.jsp"></jsp:include>
    <!--/. NAV TOP  -->
    <%--导航栏--%>
    <jsp:include page="daohanglan.jsp"></jsp:include>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">

                        <small>设备维修</small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->

            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">

                            <td><button class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/pages/huoduan/repairsave.jsp'"><i class="fa fa-edit "></i> 添加</button>
                            <td><button class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/repair/findall.do'"><i class="fa fa-edit "></i> 刷新</button>


                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                    <tr>

                                        <th>业主</th>
                                        <th>业主电话</th>
                                        <th>报修描述</th>
                                        <th>报修日期</th>
                                        <th>维修时间</th>
                                        <th>维修负责人</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${repairInfos}" var="re">
                                        <tr class="odd gradeX">

                                            <td>${re.repairname}</td>
                                            <td>${re.repairphone}</td>
                                            <td>${re.repdesc}</td>
                                            <td>${re.reportdate}</td>
                                            <td>${re.repairdate}</td>
                                            <td>${re.principal}</td>




                                            <td>
                                                <button class="btn btn-primary"
                                                                                   onclick="location.href='${pageContext.request.contextPath}/repair/findone.do?id=${re.id}'"><i class="fa fa-edit "></i>
                                                    修改
                                                </button>
                                                <button class="btn btn-danger"
                                                                                  onclick="location.href='${pageContext.request.contextPath}/repair/delete.do?id=${re.id}'"><i class="fa fa-pencil"></i>
                                                    删除
                                                </button>
                                                <button class="btn btn-danger"
                                                        onclick="location.href='${pageContext.request.contextPath}/repair/finddetail.do?id=${re.id}'"><i class="fa fa-pencil"></i>
                                                    详情
                                                </button>
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
<footer><p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/"
                                                                                    target="_blank"
                                                                                    title="模板之家">模板之家</a> - Collect from
    <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p></footer>
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

