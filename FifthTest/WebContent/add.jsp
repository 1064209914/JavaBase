<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
h2{
text-align: center;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
				<h2>请输入要添加用户的信息</h2>
		<center>
		<font color="red">${requestScope.Error }</font><br /> 
		<font color="red">${requestScope.error }</font><br /> 
		 <form action="<%= request.getContextPath()%>/servlet/AddUser" method="get" >
		 	<table>
		 	<tr> <td>姓名</td> <td> <input type="text" name="name" /> </td> </tr>
		 	<tr> <td>年龄</td> <td> <input type="text" name="age" /></td> </tr>
		 	<tr> <td>手机号</td> <td> <input type="text" name="phone" /></td> </tr>
		 	</table>	
		 	<input type="submit" /> <input type="reset" />
		 </form>
		 </center>
</body>
</html>