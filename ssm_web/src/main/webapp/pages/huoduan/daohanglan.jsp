<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/28 0028
  Time: 下午 3:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
   li ul li:hover{background-color: #1CC09F}
    li:hover{background-color: #1ab1ff}
</style>

<!--/. NAV TOP  -->
<nav class="navbar-default navbar-side" role="navigation">
    <div id="sideNav" href=""><i class="fa fa-caret-right"></i></div>
    <div class="sidebar-collapse">
        <ul class="nav" id="main-menu">
            <li style="">
                <a href="#"><i class="fa fa-desktop"></i> 人事管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signq">
                        <a href="${pageContext.request.contextPath}/ai/houqinsearch.do">职员管理</a>
                    </li>
                    <li id="signw">
                        <a href="${pageContext.request.contextPath}/ai/searchRole.do">新人入职</a>
                    </li>
                    <li id="signe">
                        <a href="${pageContext.request.contextPath}/role/rolesearch.do">职位查询</a>
                    </li>
                    <li id="signr">
                        <a href="${pageContext.request.contextPath}/pages/huoduan/sysroleadd.jsp">职位设立</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 收费管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signt">
                        <a href="${pageContext.request.contextPath}/water/searchAll.do">水务管理</a>
                    </li>
                    <li id="signy">
                        <a href="${pageContext.request.contextPath}/ele/searchAll.do">电力管理</a>
                    </li>
                    <li id="signu">
                        <a href="${pageContext.request.contextPath}/gas/searchAll.do">燃气管理</a>
                    </li>
                    <li id="signi">
                        <a href="#">收费管理</a>
                    </li>
                    <li id="signo">
                        <a href="#">收费标准管理</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 能耗管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signp">
                        <a href="${pageContext.request.contextPath}/puelectric/findAll.do">开户配表</a>
                    </li>
                    <li id="signg">
                        <a href="${pageContext.request.contextPath}/puelectric/findAll.do">公共电表</a>
                    </li>
                    <li id="signh">
                        <a href="${pageContext.request.contextPath}/puwater/findAll.do">公共水表</a>
                    </li>
                    <li id="signj">
                        <a href="${pageContext.request.contextPath}/pugas/findAll.do">公共天然气表</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 信息发布 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signkk">
                        <a href="${pageContext.request.contextPath}/nt/htnewstype.do">新闻类别</a>
                    </li>

                    <li id="signl">
                        <a href="${pageContext.request.contextPath}/news/htnews.do">新闻详情</a>
                    </li>
                    <li id="signz">
                        <a href="${pageContext.request.contextPath}/activity/findall.do">社区活动</a>
                    </li>
                    <li id="signx">
                        <a href="${pageContext.request.contextPath}//.do">活动信息记录</a>
                    </li>
                    <li id="signc">
                        <a href="${pageContext.request.contextPath}/recruit/research.do">招聘信息记录</a>
                    </li>
                    <li id="signv">
                        <a href="${pageContext.request.contextPath}/pages/huoduan/zhaopin/recruitsave.jsp">新建招聘信息</a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 房屋管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signb">
                        <a href="${pageContext.request.contextPath}/house/querht.do">房屋信息</a>
                    </li>
                    <li id="signn">
                        <a href="${pageContext.request.contextPath}/house/tzaddhouse.do">添加房屋</a>
                    </li>
                    <li id="signm">
                        <a href="${pageContext.request.contextPath}/mht/querymht.do">房屋类型</a>
                    </li>
                    <li id="signqq">
                        <a href="${pageContext.request.contextPath}/pages/huoduan/tjhousetype.jsp">增加类型</a>
                    </li>

                </ul>
            </li>


            <li>
                <a href="#"><i class="fa fa-desktop"></i> 业主管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signww">
                        <a href="${pageContext.request.contextPath}/ower/querower.do">业主信息</a>
                    </li>
                    <li id="signee">
                        <a href="${pageContext.request.contextPath}/ower/querof.do">业主家庭信息</a>
                    </li>
                    <li id="signrr">
                        <a href="${pageContext.request.contextPath}/pages/huoduan/oweradd.jsp">增加业主</a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 项目管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signtt">
                        <a href="#">Second Level Link</a>
                    </li>
                    <li id="signyy">
                        <a href="#">Second Level Link</a>
                    </li>
                    <li id="signuu">
                        <a href="#">Second Level Link</a>
                    </li>
                    <li id="signii">
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 后勤管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signoo">
                        <a href="${pageContext.request.contextPath}/ai/houqinsearch.do">后勤人员</a>
                    </li>
                    <li id="signpp">
                        <a href="${pageContext.request.contextPath}/pages/huoduan/adniminfotianjia.jsp">人员添加</a>
                    </li>
                    <li id="signaa">
                        <a href="#">Second Level Link</a>
                    </li>
                    <li id="signss">
                        <a href="#">Second Level Link</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-desktop"></i> 设备管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signdd">
                        <a href="${pageContext.request.contextPath}/fantai/search.do">防台物资</a>
                    </li>
                    <li id="signff">
                        <a href="${pageContext.request.contextPath}/fantai/catchadd.do">购买公共用品</a>
                    </li>

                    <li id="signdde">
                        <a href="${pageContext.request.contextPath}/type/search.do">物资类型</a>
                    </li>
                    <li id="signffe">
                        <a href="${pageContext.request.contextPath}/pages/huoduan/typhonadd.jsp">增加物资类型</a>
                    </li>
                    <li id="signgg">
                        <a href="${pageContext.request.contextPath}/repair/findall.do">设备维修</a>
                    </li>


                </ul>
            </li>





            <li>
                <a href="#"><i class="fa fa-desktop"></i> 合同管理 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="sign">
                        <a href="${pageContext.request.contextPath}/con/consearch.do">合同查询</a>
                    </li>
                    <li  id="signa">
                        <a href="${pageContext.request.contextPath}/con/searchType.do">合同添加</a>
                    </li>
                    <li  id="signs">
                        <a href="${pageContext.request.contextPath}/cont/ctsearch.do">类别管理</a>
                    </li>
                    <li id="signf">
                        <a href="${pageContext.request.contextPath}/pages/huoduan/hetong/htsave.jsp">类型添加</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-fw fa-file"></i> 客户反馈 <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li id="signd">
                        <a href="${pageContext.request.contextPath}/complain/findall.do">客户投诉</a>
                    </li>


                </ul>
            </li>
        </ul>

    </div>


</nav>
