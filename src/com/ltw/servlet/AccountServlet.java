package com.ltw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ltw.pojo.User;
import com.ltw.service.AccountService;
import com.ltw.service.impl.AccountServiceImpl;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet(name = "Account", urlPatterns = { "/Account" })
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountService as=new AccountServiceImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountServlet() {
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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
  		response.setContentType("text/html;charset=utf-8");
  		String oper=request.getParameter("oper");
  		int all;
  		if("Ifm".equals(oper)){
  				   	userAdd(request,response);
  		}else if("refresh".equals(oper)){
  				userGetMessage(request,response);
  		}else if("Income".equals(oper)){
  			all=userIcrease(request,response);
  			if(all>0){
  				userIncome(request,response);
  			}
  		}else if("Consume".equals(oper)){
  			//userConsume(request,response);
  		}
	}

	private int userIcrease(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u=(User)request.getSession().getAttribute("user");
		int rmb=request.getParameter("money")!=" "?Integer.parseInt(request.getParameter("money")):0;
		String uname=u.getUsername();
		int index=as.userIcrease(rmb,uname);
		return index;
	}

	private void userIncome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String income=request.getParameter("income");
		int money=request.getParameter("money")!=" "?Integer.parseInt(request.getParameter("money")):0;
		String date=request.getParameter("date");
		String notebook=request.getParameter("notebook");
		int index=as.userIcome(name,income,money,date,notebook);
		if(index>0){
			request.setAttribute("info","添加成功!");
			request.getRequestDispatcher("income.jsp").forward(request, response);
		}
	}

	private void userGetMessage(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		User u=(User)request.getSession().getAttribute("user");
		String uname=u.getUsername();
		User account=as.userGetMessage(uname);
		if(account!=null){
			HttpSession hs=request.getSession();
			hs.setAttribute("user", account);
			response.sendRedirect("data.jsp");
		}else{
			request.setAttribute("info","请完善个人信息!");
			request.getRequestDispatcher("information.jsp").forward(request, response);
		}
	}
	private void userAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User u=(User)request.getSession().getAttribute("user");
		String uname=u.getUsername();
		String name=request.getParameter("name");
		String id=request.getParameter("cardid");
		int money=request.getParameter("money")!=" "?Integer.parseInt(request.getParameter("money")):0;
		int age=request.getParameter("age")!=" "?Integer.parseInt(request.getParameter("age")):0;
		String sex=request.getParameter("sex");
		int information=as.userAdd(uname,name,id,money,age,sex);
		if(information>0){
			request.setAttribute("info","添加成功!");
			request.getRequestDispatcher("information.jsp").forward(request, response);
		}else{
			request.setAttribute("info","此银行卡已被绑定!");
			request.getRequestDispatcher("information.jsp").forward(request, response);
		}
	}
}
