<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
	<body>
		<h1 id="banner">Login to Security Demo</h1>  
		<form name="f" action="<%=request.getContextPath()%>/j_spring_security_check"method="POST">
			<table>
				<tr>
					<td>Username:</td>
					<td><input type='text' name='j_username' value="nag"/></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='j_password' value="nag"></td>
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
					<td colspan='2'><input name="submit" type="submit">&nbsp;<input name="reset" type="reset"></td>
				</tr>
			</table>
		</form>
	</body>
</html>