package com.ltw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
  		int res;
  		if("Ifm".equals(oper)){
  					res=userAdd2(request,response);
  			   if(res>0){
  				   	userAdd(request,response);
  			   }else{
  				 request.setAttribute("info","添加失败!");
  				 request.getRequestDispatcher("information.jsp").forward(request, response);
  			   }
  		}
	}

	private int userAdd2(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		User u=(User)request.getSession().getAttribute("user");
		String uname=u.getUsername();
		int age=request.getParameter("age")!=" "?Integer.parseInt(request.getParameter("age")):0;
		String sex=request.getParameter("sex");
		int information2=as.userAdd2(uname,sex,age);
		return information2;
		
	}

	private void userAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User u=(User)request.getSession().getAttribute("user");
		String uname=u.getUsername();
		String id=request.getParameter("cardid");
		int money=request.getParameter("money")!=" "?Integer.parseInt(request.getParameter("money")):0;
		int information=as.userAdd(uname,id,money);
		if(information>0){
			request.setAttribute("info","添加成功!");
			request.getRequestDispatcher("information.jsp").forward(request, response);
		}else{
			request.setAttribute("info","此银行卡已被绑定!");
			request.getRequestDispatcher("information.jsp").forward(request, response);
		}
	}
}
