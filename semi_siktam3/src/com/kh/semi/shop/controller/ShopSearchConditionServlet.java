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
				
			String keyword = request.getParameter("key");
			String[] tlist = request.getParameterValues("tlist");
			String[] clist = request.getParameterValues("clist");
			String priceRange = request.getParameter("plist");			
			String line = request.getParameter("line");
			String[] plist = null;
			
			System.out.println("keyword : " + keyword);
			System.out.println("line : " + line);
			
			keyword = nullCheck(keyword);
			line = nullCheck(line);
//			priceRange = nullCheck(priceRange);
			
			System.out.println("keyword : " + keyword);
			System.out.println("line : " + line);
			
			if (priceRange != null) {
				plist = priceRange(priceRange);
			}
	
			
			ArrayList<ShopSearch> list = new ShopService().SearchCondition(keyword,line,tlist,clist,plist);
				
			for(ShopSearch sc : list) {
				System.out.println(sc);
			}
							
			new Gson().toJson(list,response.getWriter());
				
	}
	
	public String nullCheck(String word) {
		System.out.println(word);
		if (word.equals("null") || word.equals("") || word == null) {
			return null;
		}
		return word;
	}
	
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
