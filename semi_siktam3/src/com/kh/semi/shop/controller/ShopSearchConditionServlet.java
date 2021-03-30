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
			String[] plist = request.getParameterValues("plist");			
			String line = request.getParameter("line");
				
			System.out.println(keyword);
			System.out.println("line : " + line );
				
			keyword = nullCheck(keyword);
			line = nullCheck(line);
				
			ArrayList<ShopSearch> list = new ShopService().SearchCondition(keyword,line,tlist,clist,plist);
				
			for(ShopSearch sc : list) {
				System.out.println(sc);
			}
							
			new Gson().toJson(list,response.getWriter());
				
	}
	
	public String nullCheck(String word) {
		if(word.equals("null") || word.equals("") || word == null) {
			return null;
		}
		return word;
	}
	
	public String selectQuery() {
		
		SelectQueryMaker select = new SelectQueryMaker.Builder().select().column("S.SHOP_PID").comma()
													  .column("S.SHOP_IMG").comma().column("S.SHOP_NAME").comma().column("S.SHOP_ADDR")
												      .comma().column("S.TABLE_TYPE").comma().column("S.MENU_CATEGORY").comma()
													  .column("S.MENU_CATEGORY").comma().column("ROUND(NVL(AVG(RE.SCORE),0),1)").comma()
													  .column("COUNT(RE.SHOP_PID)").comma().column("COUNT(RES.SHOP_PID)").enter().build();
		
		String selectQuery = select.getQuery().toString();
		
		return selectQuery;
		
	}
	
	
    public String fromQuery() {
    	
    	SelectQueryMaker from = new SelectQueryMaker.Builder().from().tableName("Shop").as("S").Leftjoin().tableName("REVIEW").as("RE").on()
													.equalCondition("S.SHOP_PID", "RE.SHOP_PID").Leftjoin().tableName("RESERVATION").as("RES")
													.on().equalCondition("RE.SHOP_PID", "RES.SHOP_PID").enter().build();
    	
    	String fromQuery = from.getQuery().toString();
    	
    	return fromQuery;
    }
    
    public String titleSearch() {
    	
    	
    	return null;
    }
    
    public String 
    public String whereQuery() {
    	
    	String whereQuery = "";
    	return whereQuery;
    }
    
    public String groupByQuery() {
	   
	    SelectQueryMaker groupBy = new SelectQueryMaker.Builder().groupBy().column("RE.SHOP_PID").comma().column("S.SHOP_PID").comma().column("S.SHOP_IMG").comma()
				 									   .column("S.SHOP_NAME").comma().column("S.SHOP_ADDR").comma().column("S.TABLE_TYPE").comma()
				                                       .column("S.MENU_CATEGORY").enter().build();
	    
	    String groupByQuery = groupBy.getQuery().toString();
	    return groupByQuery;
    } 
   
    public String orderByKeyword(String line) {
	   
	    String orderByKeyword = "";
	   
	    if(line != null) {
			 if(line.equals("리뷰 순")) {
				 orderByKeyword = "COUNT(RE.SHOP_PID)";
			 }else if(line.equals("방문 순")) {
				 orderByKeyword = "COUNT(RES.SHOP_PID)";
			 }else if(line.equals("평점 순")){
				 orderByKeyword = "ROUND(NVL(AVG(RE.SCORE),1),0)";
			 }
		 }else {
		 	 orderByKeyword = "1";
		 }
	   	   
	    return orderByKeyword;
    }
   
    public String orderByQuery(String orderbyKeyword) {
	   
	    SelectQueryMaker orderBy = new SelectQueryMaker.Builder().orderBy().columnName(orderbyKeyword).desc().build();
	    String orderByQuery = orderBy.getQuery().toString();
	   
	    return orderByQuery;
    }
   
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
