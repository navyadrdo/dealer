<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
    xmlns:spring="http://www.springframework.org/tags"
    xmlns:c="http://java.sun.com/jsp/jstl/core"
    xmlns:form="http://www.springframework.org/tags/form" version="2.0">
    <jsp:directive.page language="java" contentType="text/html" />
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
<title>Please Login</title>
<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" ></link>
</head>
<body>
<div class ="container">
    <c:url value="/login" var="loginUrl"/>
    <form:form name="f" action="${loginUrl}" method="post">
        <fieldset>
            <legend>Please Login</legend>
            <c:if test="${param.error != null}">
                <div class="alert alert-error">
                    Invalid username and password.
                </div>
            </c:if>
            <c:if test="${param.logout != null}">
                <div class="alert alert-success">
                    You have been logged out.
                </div>
            </c:if>
            <table class="table table-nostriped">
            <tr><td><label for="username">Username</label></td>
            <td><input type="text" id="username" name="username" value="${username}"/></td></tr>
            <tr><td><label for="password">Password</label></td>
            <td><input type="password" id="password" name="password"/></td></tr>
            </table>
            <div class="form-actions">
            <input type="hidden"                        
		name="${_csrf.parameterName}"
		value="${_csrf.token}"/>
                <button type="submit" class="btn btn-success">Log in</button>
            </div>
        </fieldset>
    </form:form>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script></div>
</body>
</html>
</jsp:root>