package com.ltw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ltw.pojo.User;
import com.ltw.service.UserService;
import com.ltw.service.impl.UserSeerviceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet(name = "User", urlPatterns = { "/User" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//获取service层对象
		UserService us=new UserSeerviceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
  		//设置请求编码格式
  		request.setCharacterEncoding("utf-8");
  		//设置响应编码格式
  		response.setContentType("text/html;charset=utf-8");
  		//获取操做符
  		String oper=request.getParameter("oper");
  		if("Login".equals(oper)){
  			//调用登录处理方法
  		checkUerLogin(request,response);
  		}else if("Register".equals(oper)){
  			//调用注册
  			userReister(request,response);
  		}else if("Out".equals(oper)){
  			//调用退出功能
  			userOut(request,response);
  		}else if("Newpwd".equals(oper)){
  			//调用密码修改
  			userChangePwd(request,response);
  		}
  	}
	//注册用户
	private void userReister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求信息
		String uname=request.getParameter("username");
  		String password=request.getParameter("password");
		//处理请求信息
  			//调用业务层处理
  		int reg=us.userReisgterService(uname,password);
		//响应处理结果
  		if(reg>0){
  		//获取session对象
			request.setAttribute("info","注册成功!");
			//重定向
			request.getRequestDispatcher("login.jsp").forward(request, response);
  		}
  		else{
  		//获取session对象
			request.setAttribute("info","用户名已存在!");
			//重定向
			request.getRequestDispatcher("register.jsp").forward(request, response);
  		}
	}

	//用户修改密码
	private void userChangePwd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取新密码数据
		String newPwd=request.getParameter("newpwd");
		//获取用户信息
		User u=(User)request.getSession().getAttribute("user");
		int uid=u.getUid();
		//处理请求
		  //调用service处理
		int log=us.userChangePwdService(newPwd,uid);
		if(log>0){
			//获取session对象
			request.setAttribute("info","密码修改成功!");
			//重定向
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	//用户退出
  	private void userOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取session对象
		HttpSession hs=request.getSession();
		//强制销毁session
		hs.invalidate();
		//重定向到登录页面
		response.sendRedirect("login.jsp");
	}

	//处理登录
  	private void checkUerLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
  		// TODO Auto-generated method stub
  		//获取请求信息
  		String uname=request.getParameter("username");
  		String pwd=request.getParameter("password");
  		//处理请求信息
  			//调用service处理
  			//校验
  			User u=us.checkUserLoginService(uname, pwd);
  			if(u!=null){
  				//获取session对象
  				HttpSession hs=request.getSession();
  				//将用户数据存储到session中
  				hs.setAttribute("user", u);
  				//重定向
  				response.sendRedirect("index.jsp");
  			}else{
  				request.setAttribute("info","账号或密码错误！请重新输入");
  				//请求转发
  				request.getRequestDispatcher("login.jsp").forward(request, response);
  			}
  		//响应处理结果
  			//直接响应
  			//请求转发
  			
  	}
  }

