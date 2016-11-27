<%@page session="true"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="Generator" content="EditPlus">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
<link rel="stylesheet" type="text/css" href="welcome.css" />
<link rel="stylesheet" type="text/css" href="../css/chrome.css" />
<link rel="stylesheet" type="text/css"
	href="../css/common_css_for_all.css" />

<script type="text/javascript" src="./jquery/jquery.js"></script>
<script type="text/javascript" src="./jquery/jquery.validate.js"></script>
<script type="text/javascript"
	src="./jquery/common_methods_validation.js"></script>
<script type="text/javascript" src="./jquery/seminar_page.js"></script>
<script type="text/javascript">


 function saveurl(){
 document.dispatchform.action = "/dealer/dispatch/savedispatch.htm";
 
 }
 
 function updateurl(){
 document.dispatchform.action = "/dealer/dispatch/dispatchupdate.htm";
 }
 
 function deleteurl(){
 document.dispatchform.action = "/dealer/dispatch/dispatchdelete.htm";
 }
 
 function searchurl(){
 document.dispatchform.action = "/dealer/dispatch/dispatchsearch.htm";
 }
 
 function getallurl(){
 document.dispatchform.action = "/dealer/dispatch/getdispatch.htm";
 }
 
</script>
</head>

<body>

	<form id="seminar" name="dispatchform" method="post">

		</div>

		<br />


	</form>

</body>
</html>
