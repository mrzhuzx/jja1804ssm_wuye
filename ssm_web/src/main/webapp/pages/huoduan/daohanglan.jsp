<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/28 0028
  Time: 下午 3:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!--/. NAV TOP  -->
<nav class="navbar-default navbar-side" role="navigation">
    <div id="sideNav" href=""><i class="fa fa-caret-right"></i></div>
    <div class="sidebar-collapse">
        <ul class="nav" id="main-menu">
            <li>
                <a href="#"><i class="fa fa-desktop"></i> 人事管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 收费管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/water/searchAll.do">水务管理</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/ele/searchAll.do">电力管理</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/gas/searchAll.do">燃气管理</a>
                    </li>
                    <li>
                        <a href="#">收费管理</a>
                    </li>
                    <li>
                        <a href="#">收费标准管理</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 能耗管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 新闻管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/nt/htnewstype.do">新闻类别</a>
                    </li>

                    <li>
                        <a href="${pageContext.request.contextPath}/news/htnews.do">新闻详情</a>
                    </li>


                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 房屋管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>


            <li>
                <a href="#"><i class="fa fa-desktop"></i> 业主管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 项目管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 后勤管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/ai/infosearch.do">后勤人员</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/pages/huoduan/adniminfotianjia.jsp">人员添加</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 设备管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/fantai/search.do">防台物资</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/pages/huoduan/typhoonadd.jsp">购买公共用品</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 合同管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/con/consearch.do">合同查询</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/pages/huoduan/hetongadd.jsp">合同添加</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/cont/ctsearch.do">类别管理</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/pages/huoduan/htsave.jsp">类型添加</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-fw fa-file"></i> 客户反馈 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>
                    <li>
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>




            <li>
                <a class="active-menu" href="index.jsp"><i class="fa fa-dashboard"></i> 图表 </a>
            </li>
            <li>
                <a href="ui-elements.jsp"><i class="fa fa-desktop"></i> UI 元素 </a>
            </li>
            <li>
                <a href="chart.jsp"><i class="fa fa-bar-chart-o"></i> 数据图表 </a>
            </li>

            <li>
                <a href="tab-panel.jsp"><i class="fa fa-qrcode"></i> 标签 & 面板 </a>
            </li>

            <li>
                <a href="table.jsp"><i class="fa fa-table"></i> 响应表 </a>
            </li>

            <li>
                <a href="form.jsp"><i class="fa fa-edit"></i> 表单 </a>
            </li>
            <li>
                <a href="empty.html"><i class="fa fa-fw fa-file"></i> 空白页</a>
            </li>
        </ul>

    </div>

</nav>
