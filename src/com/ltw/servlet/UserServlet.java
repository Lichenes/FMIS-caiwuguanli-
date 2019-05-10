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
	//��ȡservice�����
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
  		//������������ʽ
  		request.setCharacterEncoding("utf-8");
  		//������Ӧ�����ʽ
  		response.setContentType("text/html;charset=utf-8");
  		//��ȡ������
  		String oper=request.getParameter("oper");
  		if("Login".equals(oper)){
  			//���õ�¼������
  		checkUerLogin(request,response);
  		}else if("Register".equals(oper)){
  			//����ע��
  			userReister(request,response);
  		}else if("Out".equals(oper)){
  			//�����˳�����
  			userOut(request,response);
  		}else if("Newpwd".equals(oper)){
  			//���������޸�
  			userChangePwd(request,response);
  		}
  	}
	//ע���û�
	private void userReister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ������Ϣ
		String uname=request.getParameter("username");
  		String password=request.getParameter("password");
		//����������Ϣ
  			//����ҵ��㴦��
  		int reg=us.userReisgterService(uname,password);
		//��Ӧ������
  		if(reg>0){
  		//��ȡsession����
			request.setAttribute("info","ע��ɹ�!");
			//�ض���
			request.getRequestDispatcher("login.jsp").forward(request, response);
  		}
  		else{
  		//��ȡsession����
			request.setAttribute("info","�û����Ѵ���!");
			//�ض���
			request.getRequestDispatcher("register.jsp").forward(request, response);
  		}
	}

	//�û��޸�����
	private void userChangePwd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ����������
		String newPwd=request.getParameter("newpwd");
		//��ȡ�û���Ϣ
		User u=(User)request.getSession().getAttribute("user");
		int uid=u.getUid();
		//��������
		  //����service����
		int log=us.userChangePwdService(newPwd,uid);
		if(log>0){
			//��ȡsession����
			request.setAttribute("info","�����޸ĳɹ�!");
			//�ض���
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	//�û��˳�
  	private void userOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//��ȡsession����
		HttpSession hs=request.getSession();
		//ǿ������session
		hs.invalidate();
		//�ض��򵽵�¼ҳ��
		response.sendRedirect("login.jsp");
	}

	//�����¼
  	private void checkUerLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
  		// TODO Auto-generated method stub
  		//��ȡ������Ϣ
  		String uname=request.getParameter("username");
  		String pwd=request.getParameter("password");
  		//����������Ϣ
  			//����service����
  			//У��
  			User u=us.checkUserLoginService(uname, pwd);
  			if(u!=null){
  				//��ȡsession����
  				HttpSession hs=request.getSession();
  				//���û����ݴ洢��session��
  				hs.setAttribute("user", u);
  				//�ض���
  				response.sendRedirect("index.jsp");
  			}else{
  				request.setAttribute("info","�˺Ż������������������");
  				//����ת��
  				request.getRequestDispatcher("login.jsp").forward(request, response);
  			}
  		//��Ӧ������
  			//ֱ����Ӧ
  			//����ת��
  			
  	}
  }

