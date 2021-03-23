/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-02-25 15:55:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.semi.shop.model.vo.*;
import com.kh.semi.menu.model.vo.*;
import com.kh.semi.member.model.vo.*;
import java.util.*;
import java.util.ArrayList;
import com.kh.semi.shop.model.vo.Shop;
import com.kh.semi.member.model.vo.*;

public final class productDetailPage_005f6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.kh.semi.menu.model.vo");
    _jspx_imports_packages.add("com.kh.semi.member.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.kh.semi.shop.model.vo");
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
      out.write("\r\n");
 
	Shop s = (Shop)request.getAttribute("shop");
	ArrayList<Menu> list = (ArrayList<Menu>)request.getAttribute("mList");
	Member mem = (Member)request.getAttribute("member");
	String favorite = String.valueOf(request.getAttribute("favorite"));
	List<String> tt = Arrays.asList(s.getTableType().split(","));

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>상세페이지</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/siktam/resources/css/headerfooterLayout.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/siktam/resources/css/productDetailPage_6.css\">\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js\"></script>\r\n");
      out.write("    <!-- 지도 설치 스크립트 -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- 지도 라이브러리 불러오기 -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=b75b48c17de2e99d89241117f1dc015c&libraries=services\"></script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script charset=\"UTF-8\" class=\"daum_roughmap_loader_script\" src=\"https://ssl.daumcdn.net/dmaps/map_js_init/roughmapLoader.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- 헤더 시작 -->\r\n");
      out.write("    ");
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
      out.write("\r\n");
      out.write("    <!-- 이 안에 작업하기 -->\r\n");
      out.write("\r\n");
      out.write("    <div id=\"detailbox\">\r\n");
      out.write("        <!-- 메인 이미지 -->\r\n");
      out.write("        <input type=\"hidden\" id=\"shopPid\" value=\"");
      out.print( s.getShopPid() );
      out.write("\"/>\r\n");
      out.write("        <div class=\"pagemainimg\">\r\n");
      out.write("        \t<img id=\"shopimg\" src=\"/siktam/resources/images/");
      out.print(s.getShopImg());
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- 2020.02.10 수정 시작(현희) < 즐겨찾기 추가 > -->\r\n");
      out.write("\t\t\r\n");
      out.write("        <div class=\"bookmark\">\r\n");
      out.write("            <p id=\"star\">★</p>\r\n");
      out.write("        </div>\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t<input type=\"hidden\" id=\"fav\" value=\"");
      out.print( favorite );
      out.write("\">\r\n");
      out.write("   \t\t\r\n");
      out.write("        <script>\r\n");
      out.write("        \t$(document).ready(function(){\r\n");
      out.write("        \t\tif($('#fav').val()=='o'){\r\n");
      out.write("        \t\t\t$('#star').css({'color':'rgb(255, 184, 53)'});\r\n");
      out.write("        \t\t\t$('#star').toggle(function(){\r\n");
      out.write("        \t\t\t\t$(this).css({'color':'#eee'});\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("                    \t  \turl:\"/siktam/shopDeleteFavorite.si\",\r\n");
      out.write("              \t\t\t\ttype:\"get\",\r\n");
      out.write("              \t\t\t\tdata:{\r\n");
      out.write("              \t\t\t\t\tshopPid : $('#shopPid').val()\r\n");
      out.write("              \t\t\t\t},\r\n");
      out.write("              \t\t\t\tsuccess: function(data){\r\n");
      out.write("              \t\t\t\t\tconsole.log(data);\r\n");
      out.write("              \t\t\t\t},\r\n");
      out.write("              \t\t\t\terror: function(){\r\n");
      out.write("              \t\t\t\t\tconsole.log(\"결과 전송 실패\");\r\n");
      out.write("              \t\t\t\t}\r\n");
      out.write("                      });\r\n");
      out.write("                    },function(){\r\n");
      out.write("                    \t$(this).css({'color':'rgb(255, 184, 53)'});\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("                    \t  \turl:\"/siktam/shopInsertFavorite.si\",\r\n");
      out.write("              \t\t\t\ttype:\"get\",\r\n");
      out.write("              \t\t\t\tdata:{\r\n");
      out.write("              \t\t\t\t\tshopPid : $('#shopPid').val()\r\n");
      out.write("              \t\t\t\t},\r\n");
      out.write("              \t\t\t\tsuccess: function(data){\r\n");
      out.write("              \t\t\t\t\tconsole.log(data);\r\n");
      out.write("              \t\t\t\t},\r\n");
      out.write("              \t\t\t\terror: function(){\r\n");
      out.write("              \t\t\t\t\tconsole.log(\"결과 전송 실패\");\r\n");
      out.write("              \t\t\t\t}\r\n");
      out.write("                      });\r\n");
      out.write("                    });\r\n");
      out.write("        \t\t}else{\r\n");
      out.write("        \t\t\t$('#star').css({'color':'#eee'});\r\n");
      out.write("        \t\t\t$('#star').toggle(function(){\r\n");
      out.write("                        $(this).css({'color':'rgb(255, 184, 53)'});\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("                    \t  \turl:\"/siktam/shopInsertFavorite.si\",\r\n");
      out.write("              \t\t\t\ttype:\"get\",\r\n");
      out.write("              \t\t\t\tdata:{\r\n");
      out.write("              \t\t\t\t\tshopPid : $('#shopPid').val()\r\n");
      out.write("              \t\t\t\t},\r\n");
      out.write("              \t\t\t\tsuccess: function(data){\r\n");
      out.write("              \t\t\t\t\tconsole.log(data);\r\n");
      out.write("              \t\t\t\t},\r\n");
      out.write("              \t\t\t\terror: function(){\r\n");
      out.write("              \t\t\t\t\tconsole.log(\"결과 전송 실패\");\r\n");
      out.write("              \t\t\t\t}\r\n");
      out.write("                      });\r\n");
      out.write("                    },function(){\r\n");
      out.write("                        $(this).css({'color':'#eee'});\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("                    \t  \turl:\"/siktam/shopDeleteFavorite.si\",\r\n");
      out.write("              \t\t\t\ttype:\"get\",\r\n");
      out.write("              \t\t\t\tdata:{\r\n");
      out.write("              \t\t\t\t\tshopPid : $('#shopPid').val()\r\n");
      out.write("              \t\t\t\t},\r\n");
      out.write("              \t\t\t\tsuccess: function(data){\r\n");
      out.write("              \t\t\t\t\tconsole.log(data);\r\n");
      out.write("              \t\t\t\t},\r\n");
      out.write("              \t\t\t\terror: function(){\r\n");
      out.write("              \t\t\t\t\tconsole.log(\"결과 전송 실패\");\r\n");
      out.write("              \t\t\t\t}\r\n");
      out.write("                      });\r\n");
      out.write("                    });\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t});\r\n");
      out.write("        \t\r\n");
      out.write("        \t/* 탐희 즐겨찾기 AJAX 추가 */\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("                $('#star').toggle(function(){\r\n");
      out.write("                    $(this).css({'color':'rgb(255, 184, 53)'});\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                \t  \turl:\"/siktam/shopInsertFavorite.si\",\r\n");
      out.write("          \t\t\t\ttype:\"get\",\r\n");
      out.write("          \t\t\t\tdata:{\r\n");
      out.write("          \t\t\t\t\tshopPid : $('#shopPid').val()\r\n");
      out.write("          \t\t\t\t},\r\n");
      out.write("          \t\t\t\tsuccess: function(data){\r\n");
      out.write("          \t\t\t\t\tconsole.log(data);\r\n");
      out.write("          \t\t\t\t},\r\n");
      out.write("          \t\t\t\terror: function(){\r\n");
      out.write("          \t\t\t\t\tconsole.log(\"결과 전송 실패\");\r\n");
      out.write("          \t\t\t\t}\r\n");
      out.write("                  });\r\n");
      out.write("                },function(){\r\n");
      out.write("                    $(this).css({'color':'#eee'});\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                \t  \turl:\"/siktam/shopDeleteFavorite.si\",\r\n");
      out.write("          \t\t\t\ttype:\"get\",\r\n");
      out.write("          \t\t\t\tdata:{\r\n");
      out.write("          \t\t\t\t\tshopPid : $('#shopPid').val()\r\n");
      out.write("          \t\t\t\t},\r\n");
      out.write("          \t\t\t\tsuccess: function(data){\r\n");
      out.write("          \t\t\t\t\tconsole.log(data);\r\n");
      out.write("          \t\t\t\t},\r\n");
      out.write("          \t\t\t\terror: function(){\r\n");
      out.write("          \t\t\t\t\tconsole.log(\"결과 전송 실패\");\r\n");
      out.write("          \t\t\t\t}\r\n");
      out.write("                  });\r\n");
      out.write("                });\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
      out.write("    \r\n");
      out.write("        <!-- 2020.02.10 수정 끝 (현희) -->\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"pageselect\">\r\n");
      out.write("            <!-- %% 업체정보연결-->\r\n");
      out.write("            <a href=\"#\"><div id=\"information\"><span>업체정보</span></div></a>\r\n");
      out.write("\n");
      out.write("            <!-- %% 리뷰연결-->\n");
      out.write("\n");
      out.write("            <!-- %% 리뷰연결-->\r\n");
      out.write("          <a href=\"/siktam/rPage.ro?shopPid=");
      out.print(s.getShopPid());
      out.write("&howSelect=new\"><div id=\"review\"><span>리뷰</span></div></a>\r\n");
      out.write("\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 상단 업체명/설명/예약버튼 -->\r\n");
      out.write("        <div id=\"pagetop\">\r\n");
      out.write("            <h3>");
      out.print( s.getShopName() );
      out.write("</h3>\r\n");
      out.write("            <span>");
      out.print( s.getsInfo() );
      out.write("</span>\r\n");
      out.write("            <!-- %% 예약페이지연결-->\r\n");
      out.write("            <input type=\"button\" id=\"reservation\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/reservation.rc?ShopId='+'");
      out.print( s.getShopPid());
      out.write("'\" value=\"예약하기\">\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("    <!-- 매장정보 -->\r\n");
      out.write("    <div id=\"pageinfo\">\r\n");
      out.write("        <div id=\"pageinfodiv\">\r\n");
      out.write("            <div id=\"infospan\"> 매장정보 </div><div id=\"infohr\"><hr></div>\r\n");
      out.write("            \r\n");
      out.write("            ");
 for(String ti : tt){ 
      out.write("\r\n");
      out.write("            \t<div class=\"pageicon\">\r\n");
      out.write("            \t\t");
 if(ti.equals("1인석")) { 
      out.write("\r\n");
      out.write("            \t\t\t<img class=\"iconimg\" src=\"/siktam/resources/images/search1.png\" alt=\"\">\r\n");
      out.write("            \t\t");
 } else if(ti.equals("2인석")) { 
      out.write("\r\n");
      out.write("        \t\t\t\t<img class=\"iconimg\" src=\"/siktam/resources/images/search2.png\" alt=\"\">\r\n");
      out.write("        \t\t\t");
 } else if(ti.equals("칸막이")) { 
      out.write("\r\n");
      out.write("        \t\t\t\t<img class=\"iconimg\" src=\"/siktam/resources/images/search3.png\" alt=\"\">\r\n");
      out.write("        \t\t\t");
 } else if(ti.equals("바테이블")) { 
      out.write("\r\n");
      out.write("        \t\t\t\t<img class=\"iconimg\" src=\"/siktam/resources/images/search4.png\" alt=\"\">\r\n");
      out.write("        \t\t\t");
 } else { 
      out.write("\r\n");
      out.write("        \t\t\t\t<img class=\"iconimg\" src=\"/siktam/resources/images/search5.png\" alt=\"\">\r\n");
      out.write("        \t\t\t");
 } 
      out.write("\r\n");
      out.write("\t            \t<p class=\"icontext\">");
      out.print( ti );
      out.write("</p>\r\n");
      out.write("            \t</div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            <br>\r\n");
      out.write("            <p class=\"infop\">매장 전화번호 : </p> <p class=\"infop2\">");
      out.print( s.getsPhone() );
      out.write("</p><br>\r\n");
      out.write("            <p class=\"infop\">매장 주소 : </p> <p class=\"infop2\">");
      out.print(s.getsAddr() );
      out.write("</p><br>\r\n");
      out.write("            <p class=\"infop\">매장 영업시간 : </p> <p class=\"infop2\">");
      out.print( s.getsTime() );
      out.write(' ');
      out.write('~');
      out.write(' ');
      out.print( s.geteTime() );
      out.write("</p><br>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 메뉴 -->\r\n");
      out.write("    <div id=\"pagemenu\">\r\n");
      out.write("        <div id=\"pagemenudiv\">\r\n");
      out.write("            <div id=\"menuspan\"> 메뉴 </div><div id=\"menuhr\"><hr></div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- 지원 잠시 주석처리 -->\r\n");
      out.write("            ");
 for(Menu me : list) { 
      out.write("\r\n");
      out.write("            <div class=\"menubox\">\r\n");
      out.write("                <div class=\"menuimg\"><img src=\"/siktam/resources/images/");
      out.print(me.getMenuImg() );
      out.write("\" alt=\"\"></div>\r\n");
      out.write("                <div class=\"menutext\">\r\n");
      out.write("                    <h4>");
      out.print(me.getMenuName() );
      out.write("</h4>\r\n");
      out.write("                    <p>");
      out.print(me.getMenuInfo() );
      out.write("</p>\r\n");
      out.write("                    <p class=\"menuprice\"><b>");
      out.print(me.getMenuPrice() );
      out.write("</b></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 상세주소 -->\r\n");
      out.write("    <div id=\"pageaddress\">\r\n");
      out.write("        <div id=\"pageaddressdiv\">\r\n");
      out.write("            <div id=\"addressspan\">상세 주소</div><div id=\"addresshr\"><hr></div>\r\n");
      out.write("            <div id=\"addinfo\">\r\n");
      out.write("                <p class=\"infop\">업체 주소 :</p> <p class=\"infop2\">");
      out.print(s.getsAddr() );
      out.write("</p><br>\r\n");
      out.write("                <a href=\"https://map.kakao.com/link/search/");
      out.print(s.getsAddr());
      out.write("\"><input id=\"mapButton\" type=\"button\" value=\"카카오맵으로 확인하기!\"></a><br>\r\n");
      out.write("                <p class=\"infop\">대표자명 : </p> <p class=\"infop2\">");
      out.write("</p><br>\r\n");
      out.write("                <p class=\"infop\">사업자 등록번호 : </p> <p class=\"infop2\">");
      out.print(s.getOwnerId() );
      out.write("</p><br>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- 지도 api -->\r\n");
      out.write("            <div id=\"map\" style=\"width: 430px;height: 300px;border:1px solid black;\"></div>\r\n");
      out.write("     \r\n");
      out.write("            <script>           \r\n");
      out.write("            var mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("             mapOption = {\r\n");
      out.write("                 center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표\r\n");
      out.write("                 level: 3 // 지도의 확대 레벨\r\n");
      out.write("             };  \r\n");
      out.write("\t         // 지도를 생성합니다    \r\n");
      out.write("\t         var map = new kakao.maps.Map(mapContainer, mapOption); \t\r\n");
      out.write("\t         // 주소-좌표 변환 객체를 생성합니다\r\n");
      out.write("\t         var geocoder = new kakao.maps.services.Geocoder();\t\r\n");
      out.write("\t         // 주소로 좌표를 검색합니다\r\n");
      out.write("\t         geocoder.addressSearch('");
      out.print(s.getsAddr());
      out.write("', function(result, status) {\t\r\n");
      out.write("\t             // 정상적으로 검색이 완료됐으면 \r\n");
      out.write("\t              if (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\t                 var coords = new kakao.maps.LatLng(result[0].y, result[0].x);\t\r\n");
      out.write("\t                 // 결과값으로 받은 위치를 마커로 표시합니다\r\n");
      out.write("\t                 var marker = new kakao.maps.Marker({\r\n");
      out.write("\t                     map: map,\r\n");
      out.write("\t                     position: coords\r\n");
      out.write("\t                 });\r\n");
      out.write("\t                 // 인포윈도우로 장소에 대한 설명을 표시합니다\r\n");
      out.write("\t                 var infowindow = new kakao.maps.InfoWindow({\r\n");
      out.write("\t                     content: '<div style=\"width:150px;text-align:center;padding:6px 0;\">식탐 맛집!</div>'\r\n");
      out.write("\t                 });\r\n");
      out.write("\t                 infowindow.open(map, marker);\r\n");
      out.write("\t                 // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다\r\n");
      out.write("\t                 map.setCenter(coords);\r\n");
      out.write("\t             } \r\n");
      out.write("\t         });    \r\n");
      out.write("         </script>\r\n");
      out.write("\t    \t\t\r\n");
      out.write("       \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <!-- 지도 api (끝) -->\r\n");
      out.write("            <!-- <div id=\"daumRoughmapContainer1578697903624\" \r\n");
      out.write("            class=\"root_daum_roughmap root_daum_roughmap_landing\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <script charset=\"UTF-8\">\r\n");
      out.write("                new daum.roughmap.Lander({\r\n");
      out.write("                   \"timestamp\" : \"1578697903624\",\r\n");
      out.write("                   \"key\" : \"wk9k\",\r\n");
      out.write("                   \"mapWidth\" : \"400\",\r\n");
      out.write("                   \"mapHeight\" : \"200\"\r\n");
      out.write("                }).render();\r\n");
      out.write("             </script> -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
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