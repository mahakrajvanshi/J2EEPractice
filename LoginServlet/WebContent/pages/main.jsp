<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="numAction.do" method="GET">
		Number 1 : <input type="text" name="num1"/>
		Number 2 : <input type="text" name="num2" />
		
		<%= request.getAttribute("result") %> <br/>
		
		<input type="submit" value="add" name="butt" />
		<input type="submit" value="minus" name="butt" />
		<input type="submit" value="showAdd" name="butt" />
	</form>




	<table>
		<thead>
			<th>Ways</th>
			<th>name</th>
			<th>pass</th>
		</thead>

		<tbody>

			<tr>
				<td>Session</td>
				<td><%= session.getAttribute("username") %></td>
				<td>${sessionScope.password}</td>
			</tr>


			<!-- This is how you hanld cookies.  you find a map.elements from an array -->
			<%! String name, pass; %>
			<%
				Cookie[] cookies = request.getCookies();
				for(Cookie c: cookies){
					if(c.getName().equals("username")){
						name = c.getValue();
					}
					if(c.getName().equals("password")){
						pass = c.getValue();
					}
				}
			%>
			<tr>
				<td>Cookie</td>
				<td><%= name %></td>
				<td><%= pass %></td>
			</tr>
		</tbody>
	</table>

</body>
</html>