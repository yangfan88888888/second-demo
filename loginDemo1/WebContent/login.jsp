<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="target.jsp" method="get">
			<table border="1" cellspacing="0" width="400px" heigth="300px" align="center">
			
				<tr>
					<th colspan="2">用户登录：</td>
					
				</tr>
				<tr>
					<td>用户名：</td>
					<td>
						<input type="text" name="userName" value="userName"/>
					
					</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td>
						<input type="password" name="password" value="password"/>
					
					</td>
				</tr>
			<tr>
					
					<td colspan="2">
						<input type="submit" value="登录"/>
					
					</td>
				</tr>
			
			
			
			</table>
		
		
		
		</form>
	
	</body>
</html>