<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
        <title>天能物业管理</title>
        <link rel="stylesheet" href="css/index.css" type="text/css">
        <link rel="stylesheet" href="css/zym.css" type="text/css">

        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/global.js"></script>
        <script type="text/javascript" src="js/hm.js"></script>
        <script type="text/javascript" src="js/script.js"></script>



    </head>
<body>
<!--头部-->
<div class="top_bg" id="top_bg">
    <div class="top_gang">
        <div class="tou_zj">
            <div class="hy">
                <img src="images/tou_tb_03.png">
                <span>欢迎来到贵州天能物业管理有限公司</span>
            </div>
            <div class="soucang">
                <a href="#">设为首页&nbsp;</a>｜
                <a href="#">&nbsp;加入收藏</a>
            </div>
        </div>
    </div>
    <div class="top_main">
        <div class="top_logo">
            <a href='./'><img src="images/logo.png"></a>
        </div>
        <!--导航-->
        <div class="daohang">
            <div class="header_nav">
                <div class="main clearBoth">
                    <ul class="nav right">
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="index.html">
                                网站首页
                                <b></b>
                            </a>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="about.html">
                                关于我们
                                <b></b>
                                <div></div>
                            </a>
                            <div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="about.html">公司简介</a>
                                    </li>
                                    <li>
                                        <a href="#">公司文化</a>
                                    </li>
                                    <li>
                                        <a href="#">领导致辞</a>
                                    </li>
                                    <li>
                                        <a href="#">服务理念</a>
                                    </li>
                                    <li>
                                        <a href="#">企业荣誉</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="products.html">
                                项目展示
                                <b></b>
                                <div></div>
                            </a>
                            <div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="products.html">经典案例</a>
                                    </li>
                                    <li>
                                        <a href="#">公司项目</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="news.html">
                                公司动态
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="news.html">公司新闻</a>
                                    </li>
                                    <li>
                                        <a href="#">行业新闻</a>
                                    </li>
                                    <li>
                                        <a href="#">公司大事记</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="javascript:;">
                                人才招聘
                                <b></b>
                            </a>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="contact.html">
                                联系我们
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="contact.html">在线留言</a>
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
<!--子页-->
<div class="ziye_bj">
    <div class="ziye_tu">
        <img src="images/jdanli_03.jpg">
    </div>
</div>
<!--关于我们-->
<div class="zy_gywm">
    <div class="ejdh" style="height: 1050px;">
        <div class="shang_g"></div>
        <div class="women">
            <div class="btmc">
                <h1>P</h1>
                <p>项目展示<span>resentation</span></p>
            </div>
            <ul class="skb">
                <li style="background: #005bac; width: 25%;"></li>
                <li style="background: #ff8400; width: 20%;"></li>
                <li style="background: #d3d3d3; width: 55%;"></li>
            </ul>
        </div>
        <div class="zy_dh_lb">
            <ul>
                <li id="women"><img src="images/zy1_08.png"><a id="wenzidangq" href="#">经典案例</a></li>
                <li><img src="images/zy1_08_z.png"><a href="#">公司项目</a></li>
            </ul>
        </div>
    </div>
    <div class="touyin"></div>
    <div class="zynr_db" style="height: 1000px;">
        <div class="lujing">
            <h2>经典案例</h2>
            <p>您的位置：首页 > 经典案例</p>
        </div>
        <ul class="skb" style="margin-bottom: 20px;">
            <li style="background: #005bac; width: 12%;"></li>
            <li style="background: #ff8400; width: 15%;"></li>
            <li style="background: #d3d3d3; width: 73%;"></li>
        </ul>

        <!--内容-->
        <div class="gsjj_nr">
            <div class="al_biaoti">
                <h3>西电东送楼项目外观</h3>
                <span>发布时间：2014-7-4　浏览次数：392 次　　来源：公司办公室</span>
            </div>
            <div class="ban" id="demo1">
                <div class="ban2" id="ban_pic1">
                    <div class="prev1" id="prev1">
                        <img src="images/zy_03.png"/>
                    </div>
                    <div class="next1" id="next1">
                        <img src="images/zy_05.png"/>
                    </div>
                    <ul>
                        <li><img src="images/anlizs_06.jpg"/></li>
                        <li><img src="images/anlizs_06.jpg"/></li>
                        <li><img src="images/anlizs_06.jpg"/></li>
                    </ul>
                </div>
                <script src="js/jquery.min.js"></script>
                <script src="js/pic_tab.js"></script>
                <script>
                    jq(function(){
                        jq('#demo1').banqh({
                            box:"#demo1",//总框架
                            pic:"#ban_pic1",//大图框架
                            pnum:"#ban_num1",//小图框架
                            prev_btn:"#prev_btn1",//小图左箭头
                            next_btn:"#next_btn1",//小图右箭头
                            pop_prev:"#prev2",//弹出框左箭头
                            pop_next:"#next2",//弹出框右箭头
                            prev:"#prev1",//大图左箭头
                            next:"#next1",//大图右箭头
                            pop_div:"#demo2",//弹出框框架
                            pop_pic:"#ban_pic2",//弹出框图片框架
                            pop_xx:".pop_up_xx",//关闭弹出框按钮
                            mhc:".mhc",//朦灰层
                            autoplay:true,//是否自动播放
                            interTime:5000,//图片自动切换间隔
                            delayTime:400,//切换一张图片时间
                            pop_delayTime:400,//弹出框切换一张图片时间
                            order:0,//当前显示的图片（从0开始）
                            picdire:true,//大图滚动方向（true为水平方向滚动）
                            mindire:true,//小图滚动方向（true为水平方向滚动）
                            min_picnum:5,//小图显示数量
                            pop_up:true//大图是否有弹出框
                        })
                    })
                </script>
            </div>
            <div class="wzsm">
                <p>2015年10月17日，由国家旅游局主办、湖南省旅游局承办的全国旅游规划扶贫公益行动动员培训会在张家界召开，会上，来也股份与湖南省花垣县十八洞村结对，签约公益编制十八洞村旅游扶贫规划，并实施为期3年的对口帮扶。
                    规划编制阶段，来也股份集结了最强力量的专家团队，首先对十八洞村旅游扶贫的潜力进行分析，针对性的提出了贫困户及村民参与旅游扶贫的方式，以“一年启动、三年脱贫”为目标。同时对十八洞村旅游产业发展目标、贫困人口减少目标、人均收入和产业结构进行定性定量，为的是让精准 扶贫更 加的精准。</p>
                <p>规划确定了八大规划战略，把十八洞村打造成苗家古村体验旅游目的地，成为全国乡村旅游精准扶贫示范村和国家4A级旅游景区。以“十八洞村,云雾四寨”为总品牌，差异化打造梨子、竹子、飞虫、当戎四寨，空间上形成“一廊、两园、四寨、四节点”，在景观上分别形成云雾梨花、山乡翠竹寨、田园唱响、桃园山谷；在主题产品上分别构建全国精准扶贫学习地、苗乡文化体验地、中华苗医养生地、中国首个少数民族传统体育运动村落</p>
            </div>
            <div>
                <div class="div_list_item">
                    <div class="bdsharebuttonbox">
                        <a class="bds_more" href="#" data-cmd="more"></a>
                        <a title="分享到QQ空间" class="bds_qzone" href="#" data-cmd="qzone" data-id="635623857208296120"></a>
                        <a title="分享到新浪微博" class="bds_tsina" href="#" data-cmd="tsina" data-id="635623857208296120"></a>
                        <a title="分享到腾讯微博" class="bds_tqq" href="#" data-cmd="tqq" data-id="635623857208296120"></a>
                    </div>
                </div>
            </div>
            <script type="text/javascript">
                //全局变量，动态的文章ID
                var ShareId = "";
                //绑定所有分享按钮所在A标签的鼠标移入事件，从而获取动态ID
                $(function () {
                    $(".bdsharebuttonbox a").mouseover(function () {
                        ShareId = $(this).attr("data-id");
                    });
                });

                /*
                * 动态设置百度分享URL的函数,具体参数
                * cmd为分享目标id,此id指的是插件中分析按钮的ID
                *，我们自己的文章ID要通过全局变量获取
                * config为当前设置，返回值为更新后的设置。
                */
                function SetShareUrl(cmd, config) {
                    if (ShareId) {
                        config.bdUrl = "http://shiyousan.com/post/" + ShareId;
                    }
                    return config;
                }

                //插件的配置部分，注意要记得设置onBeforeClick事件，主要用于获取动态的文章ID
                window._bd_share_config = {
                    "common": {
                        onBeforeClick:SetShareUrl,"bdSnsKey":{},"bdText":"","bdMini":"2"
                        ,"bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"24"
                    }, "share": {}
                };
                //插件的JS加载部分
                with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+ ~(-new Date() / 36e5)];
            </script>
            <div class="sx_pian">
                <a href="#">上一篇：多少个多少个手嘎哈</a>
                <a href="#">上一篇：哪个快递号刚刚才把你当回事</a>
            </div>
            <div class="fanhui">
                <a href="products.html"><img src="images/fanhui_03.png"><span>返回列表</span></a>
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
                <li><a href="http://connect.qq.com/widget/shareqq/index.html?url=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-sqq-1-12217-9737f6f9e09dfaf5d3fd14d775bfee85&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&desc=&summary=&site=baidu" target="_black"><img src="images/dibu_06.png"></a></li>
                <li><a href="http://service.weibo.com/share/share.php" target="_black"><img src="images/dibu_08.png"></a></li>
                <li><a href="http://widget.renren.com/dialog/share?resourceUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&srcUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&description=" target="_black"><img src="images/dibu_10.png"></a></li>
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
            <img class="dibu_logo" src="images/dibu_03.png">
        </div>
    </div>
</div>
<div class="dibu_1">
    <p>版权所有 贵州天能物业管理有限公司 黔ICP备10001741号<br>
        技术支持：WangID 驰通网络</p>
</div>


</body>
</html>

