/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-02-25 15:54:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.semi.member.model.vo.*;
import com.kh.semi.eventBanner.model.vo.*;
import java.util.ArrayList;
import com.kh.semi.shop.model.vo.Shop;
import com.kh.semi.member.model.vo.*;

public final class main_005f6_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1582645757249L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1582645755766L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.kh.semi.member.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.kh.semi.eventBanner.model.vo");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.semi.shop.model.vo.Shop");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	/* 	 Member m = (Member)session.getAttribute("member"); */
	ArrayList<EventBanner> list = (ArrayList<EventBanner>) request.getAttribute("list");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head> \r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>식탐메인</title>\r\n");
      out.write("    <!-- <script src=\"/siktam/resources/js/jquery-3.4.1.min.js\"></script> -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/siktam/resources/css/main_6.css\">\r\n");
      out.write("\t\r\n");
      out.write("    <style>\r\n");
      out.write("        /* 이벤트 배너(bootstrap)*/\r\n");
      out.write("        .carousel-inner > .item > img,\r\n");
      out.write("        .carousel-inner > .item > a > img {\r\n");
      out.write("            width: 521px;\r\n");
      out.write("            height: 196px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .carousel-control {\r\n");
      out.write("            width: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container{\r\n");
      out.write("            width: 550px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        a:link, a:visited, a:hover {text-decoration: none;}\r\n");
      out.write("        /* rgb(13, 78, 100); */\r\n");
      out.write("\r\n");
      out.write("        hr{\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            height: 1px;\r\n");
      out.write("            background-color: lightslategrey;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        @font-face{\r\n");
      out.write("            font-family:'배달의민족 주아'; \r\n");
      out.write("            src:url('/siktam/resources/fonts/BMJUA_ttf.ttf');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body{\r\n");
      out.write("            font-family: '배달의민족 주아';\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        header{\r\n");
      out.write("\t\t\tdisplay: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#logoMain{\r\n");
      out.write("\t\t    height: 130px;\r\n");
      out.write("\t\t    width: 130px; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#navdiv1, #navdiv2{\r\n");
      out.write("\t\t\twidth: 70%;\r\n");
      out.write("\t\t    margin: 0 auto;\r\n");
      out.write("\t\t    margin-top: 30px;\r\n");
      out.write("\t\t    margin-bottom: 30px;\r\n");
      out.write("\t\t    text-align: center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#navdiv1{\r\n");
      out.write("\t\t\ttext-align: right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Member m = (Member)session.getAttribute("member");
	ArrayList<Shop> slist=new ArrayList<Shop>();
	if(m!=null&&m.getShopYN().equals("Y")){
		slist=(ArrayList<Shop>)session.getAttribute("shop");		
	}else{
		slist=null;
	}
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <nav id=\"nav\">\n");
      out.write("    \t<div id=\"logodiv\"><a href=\"/siktam/listMain.ma\"><img id=\"logo\" src=\"/siktam/resources/images/KakaoTalk_20200101_193858750.png\" alt=\"\" style=\"width:50px; height:50px; margin-top:10px;\"></a></div>\r\n");
      out.write("\r\n");
      out.write("    \t<div id=\"navp\">\r\n");
      out.write("\t        ");
 if(m!=null && m.getUserId().equals("4dich")){ 
      out.write("\r\n");
      out.write("\t        \t<a class=\"navp\" href=\"/siktam/views/admin_main_4.jsp\"><span>관리자</span></a>\r\n");
      out.write("\t        ");
 } 
      out.write("\r\n");
      out.write("            <a class=\"navp\" href=\"/siktam/nselectList.no\"><span>공지사항</span></a>\r\n");
      out.write("            <a class=\"navp\" href=\"/siktam/QnaListServlet\"><span>문의사항</span></a>\r\n");
      out.write("            ");
if(m==null) {
      out.write("\r\n");
      out.write("            ");
}else if(m.getShopYN().equals("N")){
      out.write("\r\n");
      out.write("            \t<a class=\"navp\" href=\"/siktam/mypageMember.mm\"><span>마이페이지</span></a>\r\n");
      out.write("            ");
}else{ 
      out.write("\r\n");
      out.write("            \t<a class=\"navp\" href=\"/siktam/views/mypageShop_5.jsp\"><span>마이페이지</span></a>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            ");
 if(m==null){ 
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"navp\" href=\"/siktam/views/login_2.jsp\"><span style=\"border: 2px solid rgb(13, 78, 100); color:rgb(13, 78, 100); background-color:white; padding:5px\">로그인</span></a>\r\n");
      out.write("            ");
 }else{ 
      out.write("\r\n");
      out.write("            \t<a class=\"navp\" onclick=\"location.href='/siktam/logout.do'; alert('로그아웃되었습니다')\"><span style=\"cursor: pointer; border: 2px solid rgb(13, 78, 100); color:rgb(13, 78, 100); background-color:white; padding:5px\">로그아웃</span></a>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("\t<nav>\r\n");
      out.write("        <div id=\"navdiv1\">\r\n");
      out.write("         ");
 if(m!=null && m.getUserId().equals("4dich")){ 
      out.write("\r\n");
      out.write("         \t<a class=\"navpMain\" href=\"/siktam/views/admin_main_4.jsp\"><span>관리자</span></a>\r\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("            <a class=\"navpMain\" href=\"/siktam/nselectList.no?currentPage=1\"><span>공지사항</span></a>\r\n");
      out.write("\n");
      out.write("            <a class=\"navpMain\" href=\"/siktam/QnaListServlet\"><span>문의사항</span></a>\r\n");
      out.write("\n");
      out.write("           ");
if(m==null) {
      out.write("\r\n");
      out.write("            ");
}else if(m.getShopYN().equals("N")){
      out.write("\r\n");
      out.write("            \t<a class=\"navp\" href=\"/siktam/mypageMember.mm\"><span>마이페이지</span></a>\r\n");
      out.write("            ");
}else{ 
      out.write("\r\n");
      out.write("            \t<a class=\"navp\" href=\"/siktam/views/mypageShop_5.jsp\"><span>마이페이지</span></a>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            ");
 if(m==null){ 
      out.write("\r\n");
      out.write("\t\t\t<a class=\"navpMain\" href=\"/siktam/views/login_2.jsp\"><span style=\"border: 2px solid rgb(13, 78, 100); color:white; background-color: rgb(13, 78, 100); padding:5px\">로그인</span></a>\r\n");
      out.write("            ");
 }else{ 
      out.write("\r\n");
      out.write("            \t<a class=\"navpMain\" onclick=\"location.href='/siktam/logout.do'; alert('로그아웃되었습니다')\"><span style=\"cursor: pointer; border: 2px solid rgb(13, 78, 100); color:white; background-color: rgb(13, 78, 100); padding:5px\">로그아웃</span></a>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navdiv2\">\r\n");
      out.write("            <div id=\"logodivMain\"><a href=\"listMain.ma\"><img id=\"logoMain\" src=\"/siktam/resources/images/KakaoTalk_20200101_193858750.png\" alt=\"\"></a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- 검색창 -->\r\n");
      out.write("    <div id=\"div1\">\r\n");
      out.write("        <img src=\"/siktam/resources/images/searchbar.png\" alt=\"\">\r\n");
      out.write("        <input id=\"searchtext\" type=\"text\" placeholder=\"지역을 입력해주세요\">\r\n");
      out.write("        <!-- <a href=\"searchConditions_4.jsp\"> -->\r\n");
      out.write("        <!-- 2020-02-11 현희 수정(서치기능) -->\r\n");
      out.write("        <button id=\"searchbtn\" onclick=\"search();\">\r\n");
      out.write("        <span class=\"glyphicon glyphicon-search\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <!-- </a> -->\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction search(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/searchMain.sc?keyword=\"+$('#searchtext').val();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- 2020-02-11 현희 수정(서치기능) 끝 -->\r\n");
      out.write("\t\r\n");
      out.write("    <!-- 이벤트배너 -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("          <ol class=\"carousel-indicators\">\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\r\n");
      out.write("          </ol>\r\n");
      out.write("      \r\n");
      out.write("          <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("      \r\n");
      out.write("            <div class=\"item active\">\r\n");
      out.write("              <img src=\"/siktam/resources/images/banner1.png\" alt=\"img\" width=\"800\" height=\"400\">\r\n");
      out.write("              <!-- <div class=\"carousel-caption\">\r\n");
      out.write("                <h3>Chania</h3>\r\n");
      out.write("                <p>The atmosphere in Chania has a touch of Florence and Venice.</p>\r\n");
      out.write("              </div> -->\r\n");
      out.write("            </div>\r\n");
      out.write("      \r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"/siktam/resources/images/banner2.png\" alt=\"img\" width=\"800\" height=\"400\">\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"/siktam/resources/images/banner3.png\" alt=\"img\" width=\"400\" height=\"200\">\r\n");
      out.write("            </div>\r\n");
      out.write("      \r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"/siktam/resources/images/banner4.png\" alt=\"img\" width=\"400\" height=\"200\">\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("          </div>\r\n");
      out.write("      \r\n");
      out.write("          <!-- Left and right controls -->\r\n");
      out.write("          <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Next</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br><hr>\r\n");
      out.write("\r\n");
      out.write("    <!-- TOP5 배너 -->\r\n");
      out.write("    <div id=\"bannersection\">\r\n");
      out.write("        <ul>\r\n");
      out.write("        \t");
 for (EventBanner eb : list) { 
      out.write("\r\n");
      out.write("            <li class=\"banner\">             \r\n");
      out.write("            \t<div style=\"display:none;\">");
      out.print(eb.getEventNo() );
      out.write("</div>\r\n");
      out.write("            \t<div style=\"display:none;\">");
      out.print(eb.getEventName() );
      out.write("</div>\r\n");
      out.write("                <div class=\"bannertext1\">");
      out.print(eb.getEventName() );
      out.write("<br>TOP 5</div>\r\n");
      out.write("                <div style=\"background-image: url(/siktam/resources/images/");
      out.print(eb.getEventImg());
      out.write(");\" class=\"bannerimgb1\"></div>                              \r\n");
      out.write("            </li>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("    \t$('.banner').click(function(){\r\n");
      out.write("    \t\tvar eno = $(this).children('div').eq(0).text();\r\n");
      out.write("    \t\tvar ename = $(this).children('div').eq(1).text();\r\n");
      out.write("    \t\tconsole.log(eno);\r\n");
      out.write("    \t\tconsole.log(ename);\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/msList.ms?eno=\" + eno+\"&ename=\"+ename;\r\n");
      out.write("    \t});\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- <script>\r\n");
      out.write("        $(function(){\r\n");
      out.write("            // 배너 1\r\n");
      out.write("            $('.bannerimgb1').hover(function(){\r\n");
      out.write("                $('.bannertext1').css({\r\n");
      out.write("                    'color':'white',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });\r\n");
      out.write("                $('.bannerimgb1').css({\r\n");
      out.write("                    'opacity':'1',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });                \r\n");
      out.write("            },function(){\r\n");
      out.write("                $('.bannertext1').css('color','black');\r\n");
      out.write("                $('.bannerimgb1').css('opacity','0.3');\r\n");
      out.write("            });\r\n");
      out.write("            // 배너 2\r\n");
      out.write("            $('.bannerimgb2').hover(function(){\r\n");
      out.write("                $('.bannertext2').css({\r\n");
      out.write("                    'color':'white',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });\r\n");
      out.write("                $('.bannerimgb2').css({\r\n");
      out.write("                    'opacity':'1',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });                \r\n");
      out.write("            },function(){\r\n");
      out.write("                $('.bannertext2').css('color','black');\r\n");
      out.write("                $('.bannerimgb2').css('opacity','0.3');\r\n");
      out.write("            });\r\n");
      out.write("            // 배너 3\r\n");
      out.write("            $('.bannerimgb3').hover(function(){\r\n");
      out.write("                $('.bannertext3').css({\r\n");
      out.write("                    'color':'white',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("  \r\n");
      out.write("                });\r\n");
      out.write("                $('.bannerimgb3').css({\r\n");
      out.write("                    'opacity':'1',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });                \r\n");
      out.write("            },function(){\r\n");
      out.write("                $('.bannertext3').css('color','black');\r\n");
      out.write("                $('.bannerimgb3').css('opacity','0.3');\r\n");
      out.write("            });\r\n");
      out.write("            // 배너 4\r\n");
      out.write("            $('.bannerimgb4').hover(function(){\r\n");
      out.write("                $('.bannertext4').css({\r\n");
      out.write("                    'color':'white',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });\r\n");
      out.write("                $('.bannerimgb4').css({\r\n");
      out.write("                    'opacity':'1',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });                \r\n");
      out.write("            },function(){\r\n");
      out.write("                $('.bannertext4').css('color','black');\r\n");
      out.write("                $('.bannerimgb4').css('opacity','0.3');\r\n");
      out.write("            });\r\n");
      out.write("            // 배너 5\r\n");
      out.write("            $('.bannerimgb5').hover(function(){\r\n");
      out.write("                $('.bannertext5').css({\r\n");
      out.write("                    'color':'white',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });\r\n");
      out.write("                $('.bannerimgb5').css({\r\n");
      out.write("                    'opacity':'1',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });                \r\n");
      out.write("            },function(){\r\n");
      out.write("                $('.bannertext5').css('color','black');\r\n");
      out.write("                $('.bannerimgb5').css('opacity','0.3');\r\n");
      out.write("            });\r\n");
      out.write("            // 배너 6\r\n");
      out.write("            $('.bannerimgb6').hover(function(){\r\n");
      out.write("                $('.bannertext6').css({\r\n");
      out.write("                    'color':'white',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });\r\n");
      out.write("                $('.bannerimgb6').css({\r\n");
      out.write("                    'opacity':'1',\r\n");
      out.write("                    'cursor':'pointer'\r\n");
      out.write("                });                \r\n");
      out.write("            },function(){\r\n");
      out.write("                $('.bannertext6').css('color','black');\r\n");
      out.write("                $('.bannerimgb6').css('opacity','0.3');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script> -->\r\n");
      out.write("\r\n");
      out.write("    <!-- 푸터 시작 -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<footer>\r\n");
      out.write("    <div id=\"footerArea\">\r\n");
      out.write("    <p>\r\n");
      out.write("\t\t<b>식탐</b><br>\r\n");
      out.write("\t\t서울시 강남구 역상동 테헤란로 12길 남도빌딩 kh정보교육원 3층 h클래스 <br>\r\n");
      out.write("\t\t대표자 : 상또두리 | 사업자 등록번호 : 328478-24-2348971<br>\r\n");
      out.write("\t\t전화 : 010365656 | 팩스 : 0236541255| honbabsiktam.co.kr<br>\r\n");
      out.write("        <b>Copyright ⓒ 식탐 All rights reserved</b>\r\n");
      out.write("    </p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
