<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="../css/Table_common_css.css" />
</head>
<body>
	
	<table>
		<thead>
			<tr>
				<th>Item ID</th>
				<th>Item Name</th>
				<th>Unit Cost</th>
				<th>Entered date</th>
				<th>Entered by</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="s" items="${returnitemlist}">
				<tr>
					<td><c:out value="${s.itemid}" /></td>
					<td><c:out value="${s.itemname}" /></td>
					<td><c:out value="${s.unitcost}" /></td>
					<td><c:out value="${s.edate}" /></td>
					<td><c:out value="${s.enteredby}" /></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>