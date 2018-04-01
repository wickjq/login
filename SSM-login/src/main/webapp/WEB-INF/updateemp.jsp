<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>更新员工信息</title>
	<link rel="stylesheet" 
			type="text/css" href="css/style.css" />
</head>
<body>
	<div id="wrap">
			<div id="top_content">
				<%@ include file="header.jsp" %>	
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						修改员工:
					</h1>
					
					<form action="update.do" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									ID:
								</td>
								<td valign="middle" align="left">
									${emp.id }
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									姓名:
								</td>
								<td valign="middle" align="left">
									<input type="text" 
									class="inputgri" name="name" 
									value="${emp.name }"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									薪水:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" 
									name="salary" value="${emp.salary }"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									年龄:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" 
									name="age" value="${emp.age }"/>
								</td>
							</tr>
						</table>
						<input type="hidden" name="id" 
						value="${emp.id }"/>
						<p>
							<input type="submit" class="button" 
							value="确定" />
						</p>
					</form>
				</div>
			</div>
			<%@ include file="footer.jsp" %>
		</div>
</body>
</html>