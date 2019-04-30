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
    <link href="./assets/css/custom-styles.css" rel="stylesheet" />

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
                 <input type="hidden" class="form-control" placeholder="" value="" name="">
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">名字</label>
                         <input type="text" class="form-control" id="inputSuccess" value="张三" name="username"></h4>
                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">密码</label>
                         <input type="text" class="form-control" id="inputError" value="123123" name="userpass"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">电话</label>
                         <input type="text" class="form-control" id="easypiechart-orange" value="13960012580" name="userphone"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">邮箱</label>
                         <input type="text" class="form-control" id="easypiechart-red" value="12580@qq.com" name="usermail"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">头像</label>
                         <input type="text" class="form-control" id="easypiechart-blue" value="img/face/qq (11).jpg" name="userqqface"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">状态</label>
                         <select class="form-control" placeholder="" name="contracttype" value="启用" name="userflag">
                             <option>请选择类型</option>
                             <option>启用</option>
                             <option>禁用</option>
                         </select>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">个性签名</label>
                         <input type="text" class="form-control" id="" value="是个弟弟" name="userstyle"></h4>

                 </div>
                 <div class="form-group has-success">
                     <h4><label class="control-label" for="inputSuccess">类型ID</label>
                         <select class="form-control" placeholder="" name="contracttype" value="" name="roleid">
                             <option>请选择类型</option>
                             <option>6保洁</option>
                             <option>7保安</option>
                             <option>8保安队长</option>
                         </select>
                     </h4>

                 </div>
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

                <!-- /. PAGE INNER  -->
            </div>
<!-- /. PAGE WRAPPER  -->
        </div>

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

