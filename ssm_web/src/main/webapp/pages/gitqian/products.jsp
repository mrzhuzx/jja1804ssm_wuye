<%@ include file="../../appcomm/basePath.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
        <title>天能物业管理</title>
        <link rel="stylesheet" href="pages/gitqian/css/index.css" type="text/css">
        <link rel="stylesheet" href="pages/gitqian/css/zym.css" type="text/css">

        <script type="text/javascript" src="pages/gitqian/js/jquery.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/global.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/hm.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/script.js"></script>



    </head>
<body>
<%--头部--%>
<jsp:include page="toubu.jsp"></jsp:include>
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
                <c:forEach var="programTypes" items="${programTypes}">
                    <li id="women"><img src="pages/gitqian/images/zy1_08_z.png"><a id="wenzidangq" href="pr/xmlxsearch.do?ptid=${programTypes.ptid}&pageNum=1">${programTypes.ptypename}</a></li>
                </c:forEach>
            </ul>

        </div>
    </div>
    <div class="touyin"></div>
    <div class="zynr_db" style="height: 1000px;">
        <div class="lujing">

            <h2>${programType.ptypename}</h2>
            <p>您的位置：首页 >
                    ${programType.ptypename}

            </p>
        </div>
        <ul class="skb" style="margin-bottom: 20px;">
            <li style="background: #005bac; width: 12%;"></li>
            <li style="background: #ff8400; width: 15%;"></li>
            <li style="background: #d3d3d3; width: 73%;"></li>
        </ul>

        <!--内容-->
        <div class="gsjj_nr">
            <ul class="xwlb_bj">

                <c:forEach var="xiangmus"  items="${xiangmus}">
                    <li>

                        <h1><img src="pages/gitqian/images/zy1_12.jpg"></h1>
                        <dl>

                            <dt><a href="pr/proidsearch.do?pid=${xiangmus.pid}&&ptid=${xiangmus.ptid}">${xiangmus.pname}</a></dt>


                            <dd>${fn:length(xiangmus.pintroduce) > 100 ? fn:substring(xiangmus.pintroduce,0,100) : xiangmus.pintroduce}${fn:length(xiangmus.pintroduce) > 100 ? '...' : ''}</dd>


                                <span>来源：${xiangmus.ptypename}</span>



                            <%--<span>日期：<fmt:formatDate value="${news.nctime}" pattern="yyyy年MM月dd日" /> </span>--%>

                        </dl>
                    </li>
                </c:forEach>
            </ul>
            <div class="webdiyerCss">
                <a href="pr/xmlxsearch.do?ptid=${programType.ptid}&&pageNum=1" style="margin-right:5px;">首页</a>
                <a href="pr/xmlxsearch.do?ptid=${programType.ptid}&&pageNum=${pageNum-1}" style="margin-right:5px;">上一页</a>
                <a href="pr/xmlxsearch.do?ptid=${programType.ptid}&&pageNum=${pageNum+1}" style="margin-right:5px;">下一页</a>
                <a href="pr/xmlxsearch.do?ptid=${programType.ptid}&&pageNum=${pageAll}" style="margin-right:5px;">尾页</a>
            </div>
        </div>
    </div>
</div>


<!--底部-->
<div class="dibu">
    <div class="dibu_jz">
        <div class="dibu_zuo">
            <p>联系地址：厦门市软件园观日路128号401室<br>
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
            <img class="dibu_logo" src="">
        </div>
    </div>
</div>
<div class="dibu_1">
    <p>版权所有 厦门国贸物业管理有限公司 黔ICP备10001741号<br>
        技术支持：WangID 驰通网络</p>
</div>


</body>
</html>