<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>注册</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content">
				<%@ include file="header.jsp" %>	
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						注册
					</h1>
					<form action="regist.do" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									用户名:
								</td>
								<td valign="middle" align="left">
									<input type="text" 
									class="inputgri" name="username" />
					
									<span style="font-size:25px;color:red;">
										${regist_defeat_msg }
									</span>
								</td>
							</tr>
							
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" 
									class="inputgri" name="password" />
								</td>
							</tr>
							
							
							
						</table>
						<p>
							<input type="submit" class="button" 
							value="注册" />
						</p>
					</form>
				</div>
			</div>
			<%@ include file="footer.jsp" %>
		</div>
	</body>
</html>
