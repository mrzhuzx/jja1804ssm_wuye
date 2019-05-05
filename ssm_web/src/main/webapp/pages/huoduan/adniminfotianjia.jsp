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
             <form action="${pageContext.request.contextPath}/ai/infosave.do" method="post">
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">名字</label>
                         <input type="text" class="form-control" id="inputSuccess" value="王五" name="username"></h4>

                 </div>
                 <%--<div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">名字</label>
                         <input type="text" class="form-control" id="easypiechart-teal" value="王五" name="username"></h4>
                 </div>--%>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">密码</label>
                         <input type="text" class="form-control" id="inputError" value="123123" name="userpass"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">电话</label>
                         <input type="text" class="form-control" id="easypiechart-orange" value="139600912580" name="userphone"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">邮箱</label>
                         <input type="text" class="form-control" id="easypiechart-red" value="sd123sd4@qq.com" name="usermail"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">头像</label>
                         <input type="text" class="form-control" id="easypiechart-blue" value="img/face/qq (17).jpg" name="userqqface"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">状态</label>
                         <select class="form-control" placeholder=""  name="userflag">
                             <%--<option SELECTED="selected">${saif.userflag}</option>--%>
                             <option value="工作中">工作中</option>
                             <option value="休假">休假</option>
                         </select></h4>
                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">个性签名</label>
                         <input type="text" class="form-control" id="" value="我很能干" name="userstyle"></h4>

                     <%--</div>
                         <div class="form-group has-success">
                             <h4><label class="control-label" for="inputSuccess">职位</label>
                                 <input type="text" class="form-control" id="wrapper" value="${saif.rolename}" name="rolename"></h4>

                         </div>--%>
                     <div class="form-group has-success">
                         <h4><label class="control-label" for="inputSuccess">职位</label>
                             <select class="form-control" placeholder="" name="roleid">
                                 <c:forEach var="sr" items="${sysRoles}">
                                     <option value="${sr.roleid}">${sr.rolename}</option>
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

