<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/28 0028
  Time: 上午 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
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
                            修改合同
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form action="${pageContext.request.contextPath}/con/conupdate.do" method="post">


                                        <div  >
                                            <label>合同ID</label>
                                            <input class="form-control" placeholder="" value="${contract.contractid}" name="contractid" readonly="readonly" >
                                        </div>
                                        <div  >
                                            <label>合同编号</label>
                                            <input class="form-control" placeholder="" value="${contract.contractnum}" name="contractnum" >
                                        </div>
                                        <div  >
                                            <label>合同名字</label>
                                            <input class="form-control" placeholder="" value="${contract.contractname}" name="contractname" >
                                        </div>
                                        <div class="form-group">
                                            <label>合同描述</label>
                                            <textarea class="form-control" rows="3"  name="contractdes" >${contract.contractdes}</textarea>
                                        </div>
                                        <div class="form-group">
                                            <label>合同类型</label>
                                            <select class="form-control" placeholder="" name="contracttype">
                                                <option selected="selected" value="${contract.contracttype}">${contract.contracttype}</option>
                                                <c:forEach var="st" items="${types}">
                                                    <option value="${st.contypeid}">${st.contypeid}----${st.contracttype}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div>
                                            <label>签约人</label>
                                            <input class="form-control" placeholder="" value="${contract.signingpeople}" name="signingpeople">
                                        </div>
                                        <div>
                                            <label>合同起始时间</label>
                                            <input class="form-control" placeholder="" value="<fmt:formatDate value='${contract.contractstart}' pattern='yyyy-MM-dd'/>"name="contractstart" >
                                        </div>
                                        <div>
                                            <label>合同终止时间</label>
                                            <input class="form-control" placeholder="" value="<fmt:formatDate value='${contract.contractend}' pattern='yyyy-MM-dd'/>"name="contractstart" >
                                        </div>
                                        <div  >
                                            <label>联系方式</label>
                                            <input class="form-control" placeholder="" value="${contract.signatorytelephone}" name="signatorytelephone" >
                                        </div>
                                        <br>
                                        <div>

                                            <button type="submit" class="btn btn-success"><i class=""></i> 确认修改 </button>

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

