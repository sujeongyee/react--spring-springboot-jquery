/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-07-25 02:48:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/swiper.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("		var swiper = new Swiper('.swiper-container', {\r\n");
      out.write("			loop: true,\r\n");
      out.write("			autoplay:5500,\r\n");
      out.write("		    autoplayDisableOnInteraction: false,\r\n");
      out.write("			pagination: '.swiper-pagination',\r\n");
      out.write("            paginationClickable: true\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"container\">\r\n");
      out.write("        <div class=\"main_rolling_pc\">\r\n");
      out.write("            <div class=\"visualRoll\">\r\n");
      out.write("                <ul class=\"viewImgList\">\r\n");
      out.write("                    <li class=\"imglist0\">\r\n");
      out.write("                        <div class=\"roll_content\">\r\n");
      out.write("                            <a href=\"javascript:;\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/img_slidecontents01.png\" alt=\"TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?\"></a>\r\n");
      out.write("                            <p class=\"roll_txtline\">BE TOURIST FOR BETTER LIFE</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"imglist1\">\r\n");
      out.write("                        <div class=\"roll_content\">\r\n");
      out.write("                            <a href=\"javascript:;\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/img_slidecontents02.png\" alt=\"TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?\"></a>\r\n");
      out.write("                            <p class=\"roll_txtline\">BE TOURIST FOR BETTER LIFE</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"imglist2\">\r\n");
      out.write("                        <div class=\"roll_content\">\r\n");
      out.write("                            <a href=\"javascript:;\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/img_slidecontents03.png\" alt=\"TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?\"></a>\r\n");
      out.write("                            <p class=\"roll_txtline\">BE TOURIST FOR BETTER LIFE</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"rollbtnArea\">\r\n");
      out.write("                    <ul class=\"rollingbtn\">\r\n");
      out.write("                        <li class=\"seq butt0\"><a href=\"#butt\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/btn_rollbutt_on.png\" alt=\"1번\" /></a></li>\r\n");
      out.write("                        <li class=\"seq butt1\"><a href=\"#butt\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/btn_rollbutt_off.png\" alt=\"2번\" /></a></li>\r\n");
      out.write("                        <li class=\"seq butt2\"><a href=\"#butt\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/btn_rollbutt_off.png\" alt=\"3번\" /></a></li>\r\n");
      out.write("                        <li class=\"rollstop\"><a href=\"#\" class=\"stop\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/btn_roll_stop.png\" alt=\"멈춤\" /></a></li>\r\n");
      out.write("                        <li class=\"rollplay\"><a href=\"#\" class=\"play\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/btn_roll_play.png\" alt=\"재생\" /></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!-- //rollbtnArea -->\r\n");
      out.write("\r\n");
      out.write("            </div><!-- //visualRoll -->\r\n");
      out.write("        </div><!-- //main_rolling_pc -->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"main_rolling_mobile\">\r\n");
      out.write("            <div class=\"swiper-container\">\r\n");
      out.write("                <div class=\"swiper-wrapper\">\r\n");
      out.write("                    <div class=\"swiper-slide\">\r\n");
      out.write("                        <a href=\"javascript:;\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/mainslide_mob01.jpg\" alt=\"TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"swiper-slide\">\r\n");
      out.write("                        <a href=\"javascript:;\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/mainslide_mob02.jpg\" alt=\"TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"swiper-slide\">\r\n");
      out.write("                        <a href=\"javascript:;\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/mainslide_mob03.jpg\" alt=\"TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>						\r\n");
      out.write("                <div class=\"swiper-pagination\"></div>\r\n");
      out.write("                <!-- <div class=\"swiper-button-next\"></div>\r\n");
      out.write("                <div class=\"swiper-button-prev\"></div> -->\r\n");
      out.write("                \r\n");
      out.write("            </div><!--//swiper-container-->\r\n");
      out.write("        </div><!--//main_rolling_mobile -->\r\n");
      out.write("	\r\n");
      out.write("		<!-- about_area -->\r\n");
      out.write("		<div class=\"about_area\">\r\n");
      out.write("			<h2>다시 찾는 인기 여행지 <b>TOP 3</b></h2>\r\n");
      out.write("			<div class=\"about_box\">\r\n");
      out.write("				<ul class=\"place_list box_inner clear\">\r\n");
      out.write("					<li><a href=\"#\" onclick=\"$('.popup_base').css('height',$(document).height());$('.contact_pop').show();\">\r\n");
      out.write("							<img class=\"img_topplace\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/img_topplace01.jpg\" alt=\"다리를 높이 들어 운동\" />\r\n");
      out.write("							<h3>성패트릭 대성당</h3>\r\n");
      out.write("							<p class=\"txt\">바쁜 뉴욕 안에서 정교하면서도 웅장한 기운에 침묵하게 되는 기도의 시간!</p>\r\n");
      out.write("							<span class=\"view\">VIEW</span></a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li><a href=\"#\" onclick=\"$('.popup_base').css('height',$(document).height());$('.space_pop').show();\">\r\n");
      out.write("							<img class=\"img_topplace\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/img_topplace02.jpg\" alt=\"바닷가에서 스트레칭\" />\r\n");
      out.write("							<h3>원주 뮤지엄 '산'</h3>\r\n");
      out.write("							<p class=\"txt\">전시된 유산들을 담아낸 건물에 신비로운 돌과 물의 테마가 담겨 있다.</p>\r\n");
      out.write("							<span class=\"view\">VIEW</span></a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li><a href=\"#\" onclick=\"$('.popup_base').css('height',$(document).height());$('.program_pop').show();\">\r\n");
      out.write("							<img class=\"img_topplace\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/img_topplace03.jpg\" alt=\"앉아서 스트레칭\" />\r\n");
      out.write("							<h3>일본 만국박람회 기념공원</h3>\r\n");
      out.write("							<p class=\"txt\">오사카 센리 반파쿠에는 드넓은 대지에 정원과 들, 물과 함께 하는 문화가 있다.</p>\r\n");
      out.write("							<span class=\"view\">VIEW</span></a>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- //about_area -->\r\n");
      out.write("\r\n");
      out.write("		<!-- app_area -->\r\n");
      out.write("		<div class=\"appbbs_area\">\r\n");
      out.write("			<div class=\"appbbs_box box_inner clear\">\r\n");
      out.write("				<h2 class=\"hdd\">상담과 최근게시물</h2>\r\n");
      out.write("				<p class=\"app_line\">\r\n");
      out.write("					<a href=\"javascript:;\">카카오톡 1:1 상담</a>\r\n");
      out.write("					<a href=\"javascript:;\">전화 상담 신청</a>\r\n");
      out.write("				</p>\r\n");
      out.write("				<div class=\"bbs_line\">\r\n");
      out.write("					<h3>NOTICE</h3>\r\n");
      out.write("					<ul class=\"notice_recent\">\r\n");
      out.write("						<li><a href=\"javascript:;\">이번 여름 휴가 제주 갈까? 미션 투어 (여행경비 50만원 지원)</a></li>\r\n");
      out.write("						<li><a href=\"javascript:;\">박물관 미션 투어 응모 당첨자 발표</a></li>\r\n");
      out.write("						<li><a href=\"javascript:;\">추석 연휴 티켓/투어 배송 및 직접 수령 안내</a></li>\r\n");
      out.write("						<li><a href=\"javascript:;\">하롱베이 서비스 OPEN! (여행정보, 가이드북, 가이드맵)</a></li>\r\n");
      out.write("						<li><a href=\"javascript:;\">투어리스트인투어 서비스 점검 안내</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- //app_area -->\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- //container -->\r\n");
      out.write("\r\n");
      out.write("    ");
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
