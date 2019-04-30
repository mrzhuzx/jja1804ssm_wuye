<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
                        表格页面 <small>响应表</small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->

            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           新闻详情
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>新闻ID</th>
                                        <th>新闻标题</th>
                                        <th>新闻内容</th>
                                        <th>发布时间</th>
                                        <th>类型ID</th>
                                        <th>操作</th>

                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${news}" var="news">

                                        <tr class="odd gradeX">
                                            <td>${news.ncid}</td>
                                            <td>
                                                    ${fn:length(news.nctitle) > 10 ? fn:substring(news.nctitle,0,10) : news.nctitle}${fn:length(news.nctitle) > 10 ? '...' : ''}</td>
                                            <td>
                                                    ${fn:length(news.nccontent) >20 ? fn:substring(news.nccontent,0,20) : news.nccontent}${fn:length(news.nccontent) > 20 ? '...' : ''}
                                            </td>
                                            <td>
                                                <fmt:formatDate value="${news.nctime}" pattern="yyyy年MM月dd日" /></td>
                                            <td>${news.nctypeid}</td>

                                            <td><button class="btn btn-primary"><i class="fa fa-edit " onclick="location.href='${pageContext.request.contextPath}/news/htnupdate.do?ncid=${news.ncid}'"></i>编辑</button>
                                                <button class="btn btn-danger"><i class="fa fa-pencil"  onclick="location.href='${pageContext.request.contextPath}/news/htndelet.do?ncid=${news.ncid}'"></i> 删除</button>
                                            <%--<button class="btn btn-success"><i class="fa fa-save " onclick="location.href='${pageContext.request.contextPath}/nt/htntidadd.do?ntid=${htnestype.ntid}'"></i> 保存</button>--%>
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
