<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Sales Executive Page</title>
<meta name="Generator" content="EditPlus">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">

<link rel="stylesheet" type="text/css"
	href="../css/chrome.css/>
 <link rel="stylesheet" type="text/css" href="../css/common_css_for_all.css>


 <script type="text/javascript" src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../jquery/.validate.js"></script>
<script type="text/javascript" src="../jquery/common_methods_validation.js"></script>
<script type="text/javascript" src="../jquery/exam_page.js"></script>
<script type="text/javascript">


 function saveurl(){
 document.saleexecutiveform.action = "/
	dealer/sales/save.htm";
 return true;
 }

 function
	updateurl(){
 document.saleexecutiveform.action="/dealer/salesexecutive/updateexecutive.htm"
	;
 }

 function
	deleteurl(){
 document.saleexecutiveform.action="/dealer/salesexecutive/deleteexecutive.htm"
	;
 }

 function
	searchurl(){
 document.saleexecutiveform.action="/dealer/salesexecutive/searchexecutive.htm"
	;
 }

 function
	getallurl(){
	 document.saleexecutiveform.action="/dealer/sales/get.htm";
 }


</script>


</head>

<body>
	<form id="exampage" name="saleexecutiveform" method="post">



		<div id="middle">
			<h4>Sales Executive</h4>

			<p>
				<label>Empid</label><input type="text" name="Seid" value="12" />
			</p>
			<p>
				<label>Ename</label><input type="text" name="ename" value="adsfd" />
			</p>
			<p>
				<label>Username</label><input type="text" name="username"
					value="ravi" />
			</p>
			<p>
				<label>Password</label><input type="text" name="password"
					value="ravi" />
			</p>
			<p>
				<label>Retype password</label><input type="text" name="repass"
					value="ravi" />
			</p>
			<p>
				<label>D.no</label><input type="text" name="dno" value="12=12" />
			</p>
			<p>
				<label>Street</label><input type="text" name="street" value="fdsgsd" />
			</p>
			<p>
				<label>City/town</label><input type="text" name="city"
					value="dfsgsdf" />
			</p>
			<p>
				<label>State</label><input type="text" name="state" value="dfgdf" />
			</p>
			<p>
				<label>zip</label><input type="text" name="zip" value="3423" />
			</p>
			<p>
				<label>Phone number</label><input type="text" name="phoneno"
					value="34132311" />
			</p>
			<p>
				<label>Qualification</label><input type="text" name="qualification"
					value="mca" />
			</p>
			<label></label>


			<div class="input">

				<input type="submit" value="save" onclick="saveurl();" /> <input
					type="submit" value="update" onclick="updateurl();" /> <input
					type="submit" value="search" onclick="searchurl();" /> <input
					type="submit" value="delete" onclick="deleteurl();" /> <input
					type="submit" value="getall" onclick="getallurl();" />

			</div>
		</div>
	</form>
</body>
</html>
