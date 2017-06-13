<%@page import="java.util.ArrayList"%>
<%@page import="com.hxd.bean.User"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table {
	text-align: center;
}
h2 {
	text-align: center;
}
.one{
	margin-left: 950px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<User> list = new ArrayList<User>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdemo", "root", "root");
		String sql = "select * from users;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setAge(rs.getString("age"));
			user.setPhone(rs.getString("phone"));
			list.add(user);
			pageContext.setAttribute("list", list);
		}
	%>
	<a href="add.jsp" class="one" >添加用戶</a>
	<h2>用戶列表</h2>
	<table align="center">
		<tr>
			<td width="100px;">ID</td>
			<td width="150px;">姓名</td>
			<td width="100px;">年龄</td>
			<td width="200px;">手机号</td>
			<td width="100px;">可执行操作</td>
		</tr>
		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
				<td>${user.phone}</td>
				<td><a
					href=" <%= request.getContextPath() %>/servlet/DeleteUser?id=${user.id}">删除</a>&nbsp;
				<a href="update.jsp" >更新</a>
				
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>