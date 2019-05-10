
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../appcomm/basePath.jsp"%>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
        <title>缴费信息</title>
        <link rel="stylesheet" href="pages/gitqian/css/index.css" type="text/css">
        <link rel="stylesheet" href="pages/gitqian/css/zym.css" type="text/css">

        <script type="text/javascript" src="pages/gitqian/js/jquery.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/global.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/hm.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/script.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title></title>
        <!-- Bootstrap Styles-->
        <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FontAwesome Styles-->
        <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/font-awesome.css" rel="stylesheet" />
        <!-- Morris Chart Styles-->

        <!-- Custom Styles-->
        <%--<link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/custom-styles.css" rel="stylesheet" />--%>
        <!-- Google Fonts-->
        <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
        <!-- TABLE STYLES-->
        <link href="${pageContext.request.contextPath}/pages/huoduan/assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />


    </head>
<body>
<!--头部-->
<jsp:include page="toubu.jsp"></jsp:include>
<!--子页-->
<div class="ziye_bj">
    <div class="ziye_tu">
        <img src="pages/gitqian/images/zy1_02.jpg">
    </div>
</div>
<!--关于我们-->
<div class="zy_gywm">
    <div class="ejdh" style="height: 1050px;">
        <div class="shang_g"></div>
        <div class="women">
            <div class="btmc">
                <h1>N</h1>
                <p>公司动态<span>ews</span></p>
            </div>
            <ul class="skb">
                <li style="background: #005bac; width: 25%;"></li>
                <li style="background: #ff8400; width: 20%;"></li>
                <li style="background: #d3d3d3; width: 55%;"></li>
            </ul>
        </div>

        <div class="zy_dh_lb">
        <ul>
            <li><img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_08_z.png"><a href="ower/query.do?olid=${ower.olid}">个人信息</a></li>
            <li><img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_08_z.png"><a href="ower/of.do?olid=${ower.olid}">家庭成员</a></li>
            <li><img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_08_z.png"><a href="ower/tzzjof.do?olid=${ower.olid}">增加家人</a></li>
            <li><img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_08_z.png"><a href="ower/ckhouse.do?olid=${ower.olid}">房屋信息</a></li>
            <li><img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_08_z.png"><a href="parking/pk_list.do?olid=${ower.olid}">车位信息</a></li>
            <li id="women"><img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_08.png"><a id="wenzidangq"  href="${pageContext.request.contextPath}/tbpa/searchFei.do?olid=${ower.olid}">缴费信息</a></li>
        </ul>
    </div>
    </div>
    <div class="touyin"></div>
    <div class="zynr_db" style="height: 1000px;">
        <div class="lujing">
            <h2>缴费信息</h2>
            <p>您的位置：首页 > 业主信息</p>
        </div>
        <ul class="skb" style="margin-bottom: 20px;">
            <li style="background: #005bac; width: 12%;"></li>
            <li style="background: #ff8400; width: 15%;"></li>
            <li style="background: #d3d3d3; width: 73%;"></li>
        </ul>

            <form   style="display: inline-block;" action="${pageContext.request.contextPath}/tbpa/searchFeiBy.do?olid=${ower.olid}" method="post">
                <label style="margin-left: 0px;">收费项：</label>
                <select class="form-control" style="display: inline-block; width: 200px" placeholder="" name="chargename">
                    <option value="水费">水费</option>
                    <option value="电费">电费</option>
                    <option value="燃气费">燃气费</option>

                </select>

                <label style="margin-left: 0px;">缴费状态：</label>
                <select class="form-control" style="display: inline-block; width: 200px" placeholder="" name="paystate">
                    <option value="0">未缴费</option>
                    <option value="1">已缴费</option>


                </select>

                <label style="margin-left: 0px;">房屋：</label>
                <select class="form-control" style="display: inline-block; width: 200px" placeholder="" name="hid">

                    <c:forEach items="${owerHouseTypes}" var="tchs" >
                        <option value="${tchs.hid}">${tchs.hid}---${tchs.hbulidingname}</option>
                    </c:forEach>
                </select>

                <input type="submit"  value="查询" class="btn btn-success" >
            </form>

        <!--内容-->
        <div class="row">
            <div class="col-md-12">
                <!-- Advanced Tables -->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        缴费信息
                    </div>
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>

                                    <th>收费房屋编号</th>
                                    <th>收费项</th>
                                    <th>收费金额</th>
                                    <th>收费月份</th>
                                    <th>缴费时间</th>
                                    <th>收费状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${payCharges}" var="pc">
                                    <tr class="odd gradeX">

                                            <td>${pc.houseid}</td>
                                            <td>${pc.chargename}</td>
                                            <td>${pc.chargestandard}</td>
                                        <td>${pc.paymonth}</td>
                                        <td><fmt:formatDate value='${pc.chargetime}' pattern='yyyy-MM-dd hh:mm:ss'/></td>
                                        <c:if test="${pc.paystate eq 0}">
                                        <td>
                                            未交费
                                        </td>
                                        </c:if>
                                        <c:if test="${pc.paystate eq 1}">
                                            <td>
                                                已缴费
                                            </td>
                                        </c:if>
                                            <c:if test="${pc.paystate eq 1}">
                                             <td>
                                                 无操作！！
                                            </td>
                                            </c:if>
                                            <c:if test="${pc.paystate eq 0}">
                                             <td>
                                            <button onclick="location.href='${pageContext.request.contextPath}/tbpa/update.do?olid=${ower.olid}&olname=${ower.olname}&payid=${pc.payid}'" class="btn btn-success"><i class="fa fa-save " ></i> 缴费</button>
                                            </td>
                                            </c:if>
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
    </div>
</div>


<!--底部-->
<div class="dibu">
    <div class="dibu_jz">
        <div class="dibu_zuo">
            <p>联系地址：贵州省贵阳市市南路120号黔电发展楼6楼<br>
                电 话：0851-85594612   传 真：0851-85594612<br></p>
            <ul>
                <li><span>分享到：</span></li>
                <li><a href="http://connect.qq.com/widget/shareqq/index.html?url=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-sqq-1-12217-9737f6f9e09dfaf5d3fd14d775bfee85&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&desc=&summary=&site=baidu" target="_black"><img src="pages/gitqian/images/dibu_06.png"></a></li>
                <li><a href="http://service.weibo.com/share/share.php" target="_black"><img src="pages/gitqian/images/dibu_08.png"></a></li>
                <li><a href="http://widget.renren.com/dialog/share?resourceUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&srcUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&description=" target="_black"><img src="pages/gitqian/images/dibu_10.png"></a></li>
            </ul>
        </div>
        <div class="dibu_you">
            <ul>
                <li><a href="#">公司简介&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">企业文化&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">人才招聘&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">意见反馈&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">联系我们</a></li>
            </ul>
            <img class="dibu_logo" src="pages/gitqian/images/dibu_03.png">
        </div>
    </div>
</div>
<div class="dibu_1">
    <p>版权所有 贵州天能物业管理有限公司 黔ICP备10001741号<br>
        技术支持：WangID 驰通网络</p>
</div>
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
