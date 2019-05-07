<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6 0006
  Time: 上午 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--头部-->
<div class="top_bg" id="top_bg">
    <div class="top_gang">
        <div class="tou_zj">
            <div class="hy">
                <span>欢迎来到贵州国贸物业管理有限公司!</span>
            </div>
            <div class="soucang">
                <c:if test="${ower eq null}"><a href="pages/gitqian/login.jsp">业主登入</a></c:if>
                <c:if test="${ower ne null}"><img src="${ower.olheadimg}">&nbsp;${ower.olname}&nbsp;|&nbsp;<a href="ower/logout.do">注销</a></c:if>
            </div>
        </div>
    </div>
    <div class="top_main">
        <div class="top_logo">
            <a href="#"><img src="${pageContext.request.contextPath}/pages/gitqian/images/logo.png"></a>
        </div>
        <!--导航-->
        <div class="daohang">
            <div class="header_nav">
                <div class="main clearBoth">
                    <ul class="nav right">
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="${pageContext.request.contextPath}/pages/gitqian/index.jsp">
                                网站首页
                                <b></b>
                            </a>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="pages/gitqian/about.html">
                                房屋租售
                                <b></b>
                                <div></div>
                            </a>
                            <div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="ohtc/qtcxhstate.do?pageNum=1">房屋出售</a>
                                    </li>
                                    <li>
                                        <a href="ohtc/qtcxloan.do?pageNum=1">房屋出租</a>
                                    </li>

                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="pages/gitqian/products.html">
                                项目展示
                                <b></b>
                                <div></div>
                            </a>
                            <div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="#">经典案例</a>
                                    </li>
                                    <li>
                                        <a href="#">公司项目</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="javascript:;">
                                公司动态
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <c:forEach var="news" items="${newstypeList}">
                                        <li>
                                            <a href="nt/searchnes.do?ntid=${news.ntid}&pageNum=1">${news.ntypename}</a>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="javascript:;">
                                业主信息
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="ower/query.do?olid=${ower.olid}">个人信息</a>
                                    </li>
                                    <li>
                                        <a href="ower/of.do?olid=${ower.olid}">家庭成员</a>
                                    </li>
                                    <li>
                                        <a href="ower/of.do?olid=${ower.olid}">增加家人</a>
                                    </li>
                                    <li>
                                        <a href="ower/ckhouse.do?olid=${ower.olid}">房屋信息</a>
                                    </li>
                                    <li>
                                        <a href="parking/pk_list.do?olid=${ower.olid}">车位信息</a>
                                    </li>
                                    <li>
                                        <a href="#">缴费信息</a>
                                    </li>

                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="javascript:;">
                                联系我们
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="recruit/refenye.do?">招聘信息</a>
                                    </li>
                                    <li>
                                        <a href="pages/gitqian/parking_carinfo.jsp">外来车辆</a>
                                    </li>
                                    <li>
                                        <a href="#">在线留言</a>
                                    </li>
                                    <li>
                                        <a href="#">联系我们</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>