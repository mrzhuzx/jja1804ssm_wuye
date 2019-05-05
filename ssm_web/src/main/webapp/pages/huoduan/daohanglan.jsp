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
                        <a href="${pageContext.request.contextPath}/ai/houqinsearch.do">职员管理</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/ai/searchRole.do">新人入职</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/role/rolesearch.do">职位查询</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/pages/huoduan/sysroleadd.jsp">职位设立</a>
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
                <a href="#"><i class="fa fa-desktop"></i> 信息发布 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/nt/htnewstype.do">新闻类别</a>
                    </li>

                    <li>
                        <a href="${pageContext.request.contextPath}/news/htnews.do">新闻详情</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}//.do">建立新活动</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}//.do">活动信息记录</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/recruit/research.do">招聘信息记录</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/pages/houduan/recruitsave.jsp">新建招聘信息</a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 房屋管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/house/querht.do">房屋信息</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/house/tzaddhouse.do">添加房屋</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/mht/querymht.do">房屋类型</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/pages/huoduan/tjhousetype.jsp">增加类型</a>
                    </li>

                </ul>
            </li>


            <li>
                <a href="#"><i class="fa fa-desktop"></i> 业主管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="${pageContext.request.contextPath}/ower/querower.do">业主信息</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/ower/querof.do">业主家庭信息</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/pages/huoduan/oweradd.jsp">增加业主</a>
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
                        <a href="${pageContext.request.contextPath}/ai/houqinsearch.do">后勤人员</a>
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
                        <a href="${pageContext.request.contextPath}/complain/findall">客户投诉表</a>
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
        </ul>

    </div>

</nav>
