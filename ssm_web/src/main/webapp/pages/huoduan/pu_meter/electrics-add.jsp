<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\4\26 0026
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                        Forms Page <small>最好的表单元素</small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row" style="width: 600px;">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            基本表单元素
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form action="${pageContext.request.contextPath}/puelectric/add.do" method="post">
                                        <input  type="hidden" class="form-control" placeholder="电表编号" value="${electrics.electricid+1}" name="electricid"  >

                                        <div  >

                                            <label>电表编号</label>
                                            <c:if test="${electrics.electricid+1<10}">
                                            <input class="form-control" placeholder="电表编号"  name="enumber" value="electric000${electrics.electricid+1}" readonly="readonly">
                                            </c:if>
                                            <c:if test="${electrics.electricid+1<100&&electrics.electricid+1>10}">
                                                <input class="form-control" placeholder="电表编号"  name="enumber" value="electric00${electrics.electricid+1}" readonly="readonly">
                                            </c:if>
                                            <c:if test="${electrics.electricid+1<1000&&electrics.electricid+1>100}">
                                                <input class="form-control" placeholder="电表编号"  name="enumber" value="electric0${electrics.electricid+1}" readonly="readonly">
                                            </c:if>
                                            <c:if test="${electrics.electricid+1>1000}">
                                                <input class="form-control" placeholder="电表编号"  name="enumber" value="electric${electrics.electricid+1}" readonly="readonly">
                                            </c:if>
                                        </div>
                                        <%--<div  >--%>
                                            <%--<label>房屋号</label>--%>
                                            <%--<input class="form-control" placeholder="房屋号" >--%>
                                        <%--</div>--%>

                                            <%--<div class="房屋号">--%>
                                                <%--<label>Selects</label>--%>
                                                <%--<select  class="form-control"   name="houseid">--%>
                                                    <%--<c:forEach items="allhouseid" var="id">--%>
                                                    <%--<option>${id}</option>--%>
                                                    <%--</c:forEach>--%>
                                                <%--</select>--%>
                                            <%--</div>--%>

                                        <div>
                                            <label>用电量/度</label>
                                            <input class="form-control" placeholder="用电量/度" name="electric">
                                        </div>
                                        <div>
                                            <label>年月份</label>
                                            <input class="form-control" placeholder="年月份" id="dateid"  name="month">
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



</body>
</html>

