<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Item Page</title>
<meta name="Generator" content="EditPlus">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
<link rel="stylesheet" type="text/css" href="/css/welcome.css" />
<link rel="stylesheet" type="text/css" href="../css/chrome.css" />
<link rel="stylesheet" type="text/css"
	href="../css/common_css_for_all.css" />

<script type="text/javascript" src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../jquery/jquery.validate.js"></script>
<script type="text/javascript"
	src="../jquery/common_methods_validation.js"></script>
<script type="text/javascript" src="../jquery/student_mark_list.js"></script>

<script type="text/javascript">


 function saveurl(){
 document.itemlistform.action = "/dealer/item/itemsave.htm";
 
 }
 
 function updateurl(){
 document.itemlistform.action = "/dealer/item/itemupdate.htm";
 }
 
 function deleteurl(){
 document.itemlistform.action = "/dealer/item/deleteitem.htm";
 }
 
 function searchurl(){
 document.itemlistform.action = "/dealer/item/searchitem.htm";
 }
 
 function getallurl(){
 document.itemlistform.action = "/dealer/item/getitem.htm";
 }
 
</script>

</head>

<body>
	<form id="marklist" name="itemlistform" method="post">
		<div id="middle">
			<div align="center">
				<h4>Item Details</h4>
			</div>


			<p>
				<label>Item Id</label><input type="text" name="itemid" value="11" />
			</p>
			<p>
				<label>Item name</label><input type="text" name="itemname"
					value="fdsad" />
			</p>
			<p>
				<label>Unit Cost</label><input type="text" name="unitcost"
					value="12" />
			</p>
			<p>
				<label>Date</label><input type="text" name="edate"
					value="11/11/2000" />
			</p>
			<p>
				<label>Entered By</label><input type="text" name="enteredby"
					value="sdfsd" />
			</p>
			<div class="">
				<label></label> <input type="submit" value="save" name="operation"
					onclick="saveurl();" /> <input type="submit" value="update"
					name="operation" onclick="updateurl();" /> <input type="submit"
					value="Delete" name="operation" onclick="deleteurl();" /> <input
					type="submit" value="Search" name="operation"
					onclick="searchurl();" /> <input type="submit" value="getall"
					name="operation" onclick="getallurl();" />
			</div>
		</div>
	</form>

</body>
</html>
