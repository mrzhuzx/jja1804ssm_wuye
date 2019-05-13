<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!doctype html>
<html>
<head>
 <head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/pages/gitqian/css/index.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/pages/gitqian/css/zym.css" type="text/css">

<script type="text/javascript" src="${pageContext.request.contextPath}/pages/gitqian/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/gitqian/js/global.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/gitqian/js/hm.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/gitqian/js/script.js"></script>



 </head>
<body>
<jsp:include page="toubu.jsp"/>
<!--子页-->
<div class="ziye_bj">
	<div class="ziye_tu">
		<img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_02.jpg">
	</div>
</div>
<!--关于我们-->
<div class="zy_gywm">
	<%--<div class="ejdh" style="height: 1050px;">--%>
		<%--<div class="shang_g"></div>--%>
		<%--<div class="women">--%>
			<%--<div class="btmc">--%>
				<%--<h1>Z</h1>--%>
				<%--<p>客户投诉<span>hao</span></p>--%>
			<%--</div>--%>
			<%--<ul class="skb">--%>
				<%--<li style="background: #005bac; width: 25%;"></li>--%>
				<%--<li style="background: #ff8400; width: 20%;"></li>--%>
				<%--<li style="background: #d3d3d3; width: 55%;"></li>--%>
			<%--</ul>--%>
		<%--</div>--%>
		<%--<div class="zy_dh_lb">--%>
			<%--<ul>--%>
				<%--<li id="women"><img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_08.png"><a id="wenzidangq" href="${pageContext.request.contextPath}/pages/gitqian/complainsave.jsp">添加</a></li>--%>
			<%--</ul>--%>
		<%--</div>--%>
	<%--</div>--%>
	<div class="touyin"></div>
	<div class="zynr_db" style="height: 1000px;">
		<div class="lujing">
			<h2>设备报修</h2>
			<p>您的位置：联系我们 > 设备报修</p>
		</div>
		<ul class="skb" style="margin-bottom: 20px;">
			<li style="background: #005bac; width: 12%;"></li>
			<li style="background: #ff8400; width: 15%;"></li>
			<li style="background: #d3d3d3; width: 73%;"></li>
		</ul>

		<!--内容-->

		<div class="gsjj_nr">

			<ul class="xwlb_bj">

				<form action="${pageContext.request.contextPath}/repair/insertq.do" method="post">
					<input  type="hidden" class="form-control" placeholder="" value="" name=""  >
<table>
	<tr>
	<div  >
		<th><label>业主</label></th>
		<th><input class="form-control" placeholder="repairname"  value="" name="repairname" ></th>
	</div>
	</tr>

	<tr>
	<div>
		<th><label>业主电话</label></th>
		<th><input class="form-control" placeholder="repairphone" value="" name="repairphone"></th>
	</div>
	</tr>

	<tr>
	<div>
		<th><label>问题描述</label></th>
		<th><input class="form-control" placeholder="repdesc" value="" name="repdesc"></th>
	</div>
	</tr>

	<tr>
	<div>
		<th><label>反馈时间</label></th>
		<th><input class="form-control" placeholder="reportdate"id="dateid1" value="" name="reportdate"></th>
	</div>
	</tr>

	<tr>
	<div>
		<th><label>安排维修时间</label></th>
		<th><input class="form-control" placeholder="repairdate" id="dateid" value="" name="repairdate"></th>
	</div>
	</tr>

	<tr>
	<div>
		<th><label>修理工</label></th>
		<th><input class="form-control" placeholder="principal" value="" name="principal"></th>
	</div>
	</tr>



</table>

					<br>
					<div>

						<button type="submit" class="btn btn-success"><i class="fa fa-save "></i> 保存</button>

						<button type="button" class="btn btn-primary" onclick="history.back(-1);"><i class="fa fa-reply "></i>返回</button>

					</div>



				</form>


			</ul>


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
				<li><a href="http://connect.qq.com/widget/shareqq/index.html?url=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-sqq-1-12217-9737f6f9e09dfaf5d3fd14d775bfee85&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&desc=&summary=&site=baidu" target="_black"><img src="${pageContext.request.contextPath}/pages/gitqian/images/dibu_06.png"></a></li>
				<li><a href="http://service.weibo.com/share/share.php" target="_black"><img src="${pageContext.request.contextPath}/pages/gitqian/images/dibu_08.png"></a></li>
				<li><a href="http://widget.renren.com/dialog/share?resourceUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&srcUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&description=" target="_black"><img src="${pageContext.request.contextPath}/pages/gitqian/images/dibu_10.png"></a></li>
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
			<img class="dibu_logo" src="${pageContext.request.contextPath}/pages/gitqian/images/dibu_03.png">
		</div>
	</div>
</div>
<div class="dibu_1">
	<p>版权所有 贵州天能物业管理有限公司 黔ICP备10001741号<br>
技术支持：WangID 驰通网络</p>
</div>

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
