package com.ltw.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltw.pojo.User;
import com.ltw.service.SearchService;
import com.ltw.service.impl.SearchServiceImpl;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet(name = "Search", urlPatterns = { "/Search" })
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       SearchService ss=new SearchServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
  		response.setContentType("text/html;charset=utf-8");
  		String oper=request.getParameter("oper");
  		if("Income".equals(oper)){
  			userCheckIncome(request,response);
  		}
	}

	private void userCheckIncome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> lu=ss.userCheckIncomeService();
		if(lu!=null){
			request.setAttribute("lu", lu);
			request.getRequestDispatcher("income.jsp").forward(request, response);
			return;
		}
	}

}
