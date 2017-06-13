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
 * Servlet implementation class AddUser
 */
@WebServlet("/servlet/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String phone=request.getParameter("phone");
		if (null==name||"".equals(name)||null==age||"".equals(age)||null==phone||"".equals(phone)) {
			request.setAttribute("Error", "每项都不能为空！");
			request.getRequestDispatcher("/add.jsp").forward(request, response);
		}else {
			User user=new User();
			user.setName(name);
			user.setAge(age);
			user.setPhone(phone);
			UserDao userDao=UserDaoFactory.getUserDAOInstance();
			userDao.addUser(user);
			response.sendRedirect("../index.jsp");
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
