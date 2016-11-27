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

<script type="text/javascript" src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../jquery/jquery.validate.js"></script>
<script type="text/javascript"
	src="../jquery/common_methods_validation.js"></script>
<script type="text/javascript" src="../jquery/seminar_page.js"></script>
<script type="text/javascript">


 function saveurl(){
 document.dispatchform.action = "/dealer/dispatch/savedispatch.htm";
 return true;
 }
 
 function updateurl(){
 document.dispatchform.action = "/dealer/dispatch/dispatchupdate.htm";
 return true;
 }
 
 function deleteurl(){
 document.dispatchform.action = "/dealer/dispatch/dispatchdelete.htm";
 return true;
 }
 
 function searchurl(){
 document.dispatchform.action = "/dealer/dispatch/dispatchsearch.htm";
 return true;
 }
 
 function getallurl(){
 document.dispatchform.action = "/dealer/dispatch/getdispatch.htm";
 return true;
 }
 
</script>


</head>

<body>
	<form id="seminar" name="dispatchform" method="post">
		<div id="middle">
			<h4>DISPATCH INFO</h4>

			<p>
				<label>Item Id</label><input type="text" name="itemid" value="1212" />
			</p>
			<p>
				<label>Dealer Name</label><input type="text" name="dealername"
					value="dsfsd" />
			</p>
			<p>
				<label>Dealer id</label><input type="text" name="dealerid"
					value="sdfasd" />
			</p>
			<p>
				<label>No of Items</label><input type="text" name="noofitems"
					value="3" />
			</p>
			<p>
				<label>Date</label><input type="text" name="tdate"
					value="11/11/2011" />
			</p>
			<p>
				<label>Cost</label><input type="text" name="cost" value="12" />
			</p>
			<p>
				<label>Transaction ID</label><input type="text" name="txid"
					value="dsfasd" />
			</p>

			<div class="">
				<p>
					<label></label>
				<p>
					<input type="submit" value="save" name="dispatchcarry"
						onclick="saveurl();" /> <input type="submit" value="update"
						name="dispatchcarry" onclick="updateurl();"> <input
						type="submit" value="Search" name="dispatchcarry"
						onclick="searchurl();" /> <input type="submit" value="Delete"
						name="dispatchcarry" onclick="deleteurl();" /> <input
						type="submit" value="Getall" name="dispatchcarry"
						onclick="getallurl();" />

				</p>
			</div>
		</div>
	</form>

</body>
</html>
