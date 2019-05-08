<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\4\26 0026
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
                        Forms Page <small></small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row" style="width: 600px; display: inline">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            更新新闻详情
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                                  <%--${pageContext.request.contextPath}/nt/htnewstypeupda.do?ntid=${newsType.ntid}--%>
                                    <form action="${pageContext.request.contextPath}/news/htnUpate.do?ncid=${upnews.ncid}" method="post">

                                        <div >
                                            <label>新闻ID</label>
                                            <input class="form-control" placeholder="类型ID" readonly value="${upnews.ncid}">
                                        </div>

                                        <div>
                                            <label>新闻标题</label>
                                            <input class="form-control" placeholder="类型名字" name="nctitle" value="${upnews.nctitle}">
                                        </div>

                                       <div class="form-group">

                                                <label>新闻内容</label>
                                                <textarea class="form-control" rows="5" name="nccontent" >${upnews.nccontent}</textarea>
                                        </div>

                                        <div>
                                            <%--<fmt:formatDate value="${upnews.nctime}" pattern="yyyy-MM-dd"/>--%>
                                            <label>年月份</label>
                                            <input class="form-control" placeholder="年月份" id="dateid" value="${upnews.nctime}" name="nctime">
                                        </div>
                                            <div class="form-group" >
                                                <label>类型ID</label>
                                                <select class="form-control" name="ntid" >
                                                    <c:forEach items="${newsTypes}" var="newsTypes">
                                                    <option  value="${newsTypes.ntid}"> ${newsTypes.ntypename}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        <br>
                                            <div>

                                            <button type="submit" class="btn btn-success"><i class="fa fa-save "></i> 保存</button>

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


            <div class="row" style="width: 600px; display: inline;"   >
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            添加新闻
                        </div>
                        <div class="panel-body" >
                            <div class="row">
                                <div class="col-lg-6">

                                    <form action="${pageContext.request.contextPath}/news/htn_add.do" method="post">


                                        <div>
                                            <label>新闻标题</label>
                                            <input class="form-control" placeholder="新闻标题" name="nctitle" value="">
                                        </div>

                                       <div class="form-group">

                                                <label>新闻内容</label>
                                                <textarea class="form-control" rows="5" name="nccontent" ></textarea>
                                        </div>

                                        <div>
                                            <%--<fmt:formatDate value="${upnews.nctime}" pattern="yyyy-MM-dd"/>--%>
                                            <label>年月份</label>
                                            <input class="form-control" placeholder="年月份" id="dateid1" value="${upnews.nctime}" name="nctime">
                                        </div>
                                            <div class="form-group" >
                                                <label>类型ID</label>
                                                <select class="form-control" name="ntid" >
                                                    <c:forEach items="${newsTypes}" var="newsTypes">
                                                    <option  value="${newsTypes.ntid}"> ${newsTypes.ntypename}</option>
                                                    </c:forEach>
                                                </select>

                                            </div>


                                        <br>
                                            <div>

                                            <button type="submit" class="btn btn-success"><i class="fa fa-save "></i> 添加</button>

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
    $(document).ready(function() {
        $('#dateid1').datepicker({
            format : "yyyy-mm-dd",
            autoclose: true,
            language: 'zh-CN'
        });
    });
</script>



</body>
</html>

