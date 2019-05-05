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
                            修改房屋详情
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                                  <%--${pageContext.request.contextPath}/nt/htnewstypeupda.do?ntid=${newsType.ntid}--%>
                                    <form action="${pageContext.request.contextPath}/house/addhouse.do?" method="post">

                                        <div >
                                            <label>房屋编号</label>
                                            <input class="form-control" placeholder="房屋编号"  name="hnumber" value="XM4403030001">
                                        </div>
                                        <div>
                                            <label>楼宇名称</label>
                                            <input class="form-control" placeholder="楼宇名称" name="hbulidingname" value="清华楼B座12055">
                                        </div>
                                       <div >
                                           <label>楼宇编号</label>
                                           <input class="form-control" placeholder="楼宇编号" name="hunitnumber" value="1">
                                        </div>
                                        <div >
                                            <label>房屋楼层</label>
                                            <input class="form-control"  placeholder="房屋楼层" name="hfloor"  value="11">
                                        </div>
                                        <div >
                                            <label>房屋朝向</label>
                                            <input class="form-control" placeholder="房屋朝向" name="hdirection"  value="面向大海">
                                        </div>
                                        <div >
                                            <label>房屋面积</label>
                                            <input class="form-control" placeholder="房屋面积" name="harea" value="501平">
                                        </div>
                                        <div >
                                            <label>房屋描述</label>
                                            <input class="form-control"  placeholder="房屋描述" name="hremarks"  value="沙漠海景房">
                                        </div>

                                        <div>
                                            <label>房屋出租</label>
                                            <input class="form-control" placeholder="房屋出租" name="loan" value="1">
                                        </div>

                                        <div class="form-group" >
                                            <label>房屋状态</label>
                                            <select class="form-control" name="hstate" >
                                                <option  selected="selected" value="代售">代售</option>
                                                <option  value="入住">入住</option>
                                            </select>
                                        </div>

                                        <div class="form-group" >
                                            <label>房屋出租</label>
                                            <select class="form-control" name="loan" >
                                                <option selected="selected" value="0">不租</option>
                                                <option  value="1">已租</option>
                                                <option  value="2">待租</option>
                                            </select>
                                        </div>

                                        <div class="form-group" >
                                            <label>房屋类型:${myhouse.htypeid}</label>
                                            <select class="form-control" name="htypeid" >
                                                <c:forEach items="${myHouseTypeList}" var="mht">
                                                    <option  value="${mht.htypeid}">${mht.htypename}</option>
                                                </c:forEach>
                                            </select>
                                        </div>

                                            <div class="form-group" >
                                                <label>业主名字:,${myhouse.olid}</label>
                                                <select class="form-control" name="olid" >
                                                    <c:forEach items="${ower}" var="ower">
                                                    <option  value="${ower.olid}"> ${ower.olname}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        <br>
                                            <div>
                                            <button type="submit" class="btn btn-success"><i class="fa fa-save "></i> 确定增加</button>
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
</script>



</body>
</html>

