package com.hxd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxd.bean.User;
import com.hxd.dao.UserDao;
import com.hxd.factory.UserDaoFactory;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/servlet/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String  name=request.getParameter("name");
		String age=request.getParameter("age");
		String phone=request.getParameter("phone");
		if ("".equals(id)||null==name||"".equals(name)||null==age||"".equals(age)||null==phone||"".equals(phone)) {
			request.setAttribute("Error", "每项都不能为空！");
			request.getRequestDispatcher("/update.jsp").forward(request, response);
		}else{
			UserDao userDao =UserDaoFactory.getUserDAOInstance();
		User user1=userDao.getUserById(id);
		if (null==user1) {
			request.setAttribute("error", "该用户不存在!请重新输入");
			request.getRequestDispatcher("/update.jsp").forward(request, response);
		}else {
			User user =new User();
			user.setId(id);
			user.setName(name);
			user.setAge(age);
			user.setPhone(phone);
			userDao.updateUser(user);
			response.sendRedirect("../index.jsp");
		}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
