<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/24 0024
  Time: 下午 4:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/bootstrap.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/custom-styles.css" rel="stylesheet" />

</head>
<body>
<%--头部--%>
<jsp:include page="toubu.jsp"></jsp:include>
<!--/. NAV TOP  -->
<%--导航栏--%>
<jsp:include page="daohanglan.jsp"></jsp:include>
<div id="page-wrapper" >
    <div id="page-inner">
        <div class="row">
            <div class="col-md-12">
                <h2 class="page-header">添加页面</h2>
            </div>
        </div>

        <div class="col-lg-6">
            <form action="${pageContext.request.contextPath}/pr/xiangmusave.do" method="post">
                <div class="form-group has-success">
                    <h4><label class="control-label" for="inputSuccess">物业项目名字</label>
                        <input type="text" class="form-control" id="inputSuccess" value="收购万达" name="pname"></h4>
                </div>
                <div class="form-group has-success">
                    <h4><label class="control-label" for="inputSuccess">图片信息</label>
                        <input type="text" class="form-control" id="inputError" value="img/programpic/2014731152822714.jpg" name="ppicture"></h4>

                </div>
                <div class="form-group has-success">
                    <h4><label class="control-label" for="inputSuccess">描述</label>
                        <input type="text" class="form-control" id="easypiechart-orange" value="吴董以两千亿的小钱收购了万达，改为万达大保健" name="pintroduce"></h4>
                </div>
                <div class="form-group has-success">
                    <h4><label class="control-label" for="inputSuccess">项目所在地</label>
                        <input type="text" class="form-control" id="easypiechart-red" value="全国各地" name="padress"></h4>
                </div>
                    <div class="form-group has-success">
                        <h4><label class="control-label" for="inputSuccess">项目类型</label>
                            <select class="form-control" placeholder="" name="ptid">
                                <c:forEach var="pt" items="${programType}"> <%-- pt定义下面的 --%>
                                    <option value="${pt.ptid}">${pt.ptypename}</option>
                                </c:forEach>
                            </select></h4>
                    </div>

                    <div>

                        <button type="submit" class="btn btn-success"><i class=""></i> 确认添加 </button>

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

<!-- /. PAGE INNER  -->
</div>
<!-- /. PAGE WRAPPER  -->
</div>

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

