<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.imti.model.Student,com.imti.dao.StudentDao,com.imti.impl.StudentDaoImpl"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String userName=request.getParameter("userName");
		    String password=request.getParameter("password");
		    Student student =new Student(userName,password);
		    StudentDao studentDao=new StudentDaoImpl();
		    Student resultStudent=studentDao.login(student);
		    if(resultStudent!=null){
		    	session.setAttribute("currentStudent",resultStudent);
		    	System.out.println("登陆成功");
		    }else{
		    	System.out.println("登陆成功");
		    }
		
		%>
		<%-- <h1>用户名: <%=userName %></h1>
		<h1>密码: <%=password %></h1> --%>
	</body>
</html>