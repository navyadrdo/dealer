<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Payments Page</title>
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
<script type="text/javascript" src="../jquery/book_submit.js"></script>
<script type="text/javascript">


 function saveurl(){
 document.paymentform.action = "/dealer/payments/savepay.htm"; 
 }
 
 function updateurl(){
 document.paymentform.action = "/dealer/payments/updatepay.htm";
 }
 
 function deleteurl(){
 document.paymentform.action = "/dealer/payments/deletepay.htm";
 }
 
 function searchurl(){
 document.paymentform.action = "/dealer/payments/searchpay.htm";
 }
 
 function getallurl(){
 document.paymentform.action = "/dealer/payments/getallpay.htm";
 }
 
</script>

</head>

<body>
	<form id="booksubmit" name="paymentform" method="post">

		<div id="middle">
			<h4>Payments</h4>


			<p>
				<label>Transaction id</label><input type="text" name="txid"
					value="12w" />
			</p>
			<p>
				<label>Item id</label><input type="text" name="itemid" value="erw" />
			</p>
			<p>
				<label>Date</label><input type="text" name="ndate"
					value="11/11/2011" />
			</p>
			<p>
				<label>Received by</label><input type="text" name="recivedby"
					value="sdfd" />
			</p>
			<p>
				<label>Amount</label><input type="text" name="amount" value="120" />
			</p>

			<p>
				<label>Payment Mode</label> <select name="paymode">
					<option value="money" selected="selected">Money</option>
					<option value="check">Check</option>
					<option value="DD">DD</option>
				</select>
			</p>
			<div class="">
				<p>
					<label></label> <input type="submit" value="save"
						name="paymentoperation" onclick="saveurl();" /> <input
						type="submit" value="update" name="paymentoperation"
						onclick="updateurl();" /> <input type="submit" value="search"
						name="paymentoperation" onclick="searchurl();" /> <input
						type="submit" value="delete" name="paymentoperation"
						onclick="deleteurl();" /> <input type="submit" value="getall"
						name="paymentoperation" onclick=" getallurl();" />
				</p>
			</div>
		</div>
	</form>

</body>
</html>
