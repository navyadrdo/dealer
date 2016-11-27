<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" ></link>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>

<div class="container">
	<div align="center">
		<tiles:insertAttribute name="header" />
	</div>
	<div style="float: left; padding: 10px; width: 15%;">
		<tiles:insertAttribute name="menu" />
	</div>
	<div
		style="float: left; padding: 10px; width: 80%; border-left: 1px solid pink;">
		<tiles:insertAttribute name="body" />
	</div>
	<div style="clear: both" align="right">
		<tiles:insertAttribute name="footer" />
	</div></div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
