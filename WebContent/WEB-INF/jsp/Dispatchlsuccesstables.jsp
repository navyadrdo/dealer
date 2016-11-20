<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/Table_common_css.css"/>
</head>
<body>
<br>
${dispatchlist}<br>
<table>
        <thead>
            <tr>
                <th>Transaction Id</th>
                <th>Item ID</th>
                <th>Dealer Id</th>
                 <th>NO_oF_Items</th>
                <th>Date</th>
                 <th>COST</th>
                
             </tr>
        </thead>
        <tbody>
            <c:forEach var="s" items="${dispatchlist}">
                <tr>
                    <td><c:out value="${s.txid}"/></td>
                    <td><c:out value="${s.itemid}"/></td>
                    <td><c:out value="${s.dealerid}"/></td>
                    <td><c:out value="${s.noofitems}"/></td>
                    <td><c:out value="${s.tdate}"/></td>
                    <td><c:out value="${s.cost}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>


</body>
</html>