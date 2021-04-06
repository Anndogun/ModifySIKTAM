package com.kh.semi.shop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.semi.common.SelectQueryMaker;
import com.kh.semi.shop.model.service.ShopService;
import com.kh.semi.shop.model.vo.ShopSearch;


/**
 * Servlet implementation class ShopSearchConditionServlet
 */
@WebServlet("/SearchCondition.sc")
public class ShopSearchConditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopSearchConditionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 인코딩
			request.setCharacterEncoding("UTF-8");
			response.setContentType("application/json; charset=UTF-8");
				
			String keyword = request.getParameter("key");			// 검색창 지역 검색 키워드
			String[] tlist = request.getParameterValues("tlist");	// 테이블 타입 list
			String[] clist = request.getParameterValues("clist");	// 메뉴 카테고리 list
			String priceRange = request.getParameter("plist");		// 메뉴 평균 가격대	
			String line = request.getParameter("line");				// 정렬 키워드
			String[] plist = null;									// 가격대 list
			
			keyword = nullCheck(keyword);
			line = nullCheck(line);
			
			if (priceRange != null) {
				plist = priceRange(priceRange);
			}
	
			
			ArrayList<ShopSearch> list = new ShopService().SearchCondition(keyword,line,tlist,clist,plist);
				
			for(ShopSearch sc : list) {
				System.out.println(sc);
			}
							
			new Gson().toJson(list,response.getWriter());
				
	}
	
	
	/**
	 * null 체크
	 * ajax에서 값이 null을 넘기면
	 * 문자열 null, 공백으로 들어옴
	 */
	public String nullCheck(String word) {
		System.out.println(word);
		if (word.equals("null") || word.equals("") || word == null) {
			return null;
		}
		return word;
	}
	
	/**
	 *  0 ~ 10000 이런 식으로 들어오는 문자열을
	 *  쿼리문에 쓸 수 있도록 불리
	 */
	public String[] priceRange(String price) {
		if (price == null) {
			return null;
		}
		
		String[] plist = price.split("~");
		
		return plist;
	}
	
	
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
