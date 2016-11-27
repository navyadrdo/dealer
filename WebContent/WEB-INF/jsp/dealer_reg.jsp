<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Dealer Page</title>
<meta name="Generator" content="EditPlus">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">

<link rel="stylesheet" type="text/css" href="welcome.css" />
<link rel="stylesheet" type="text/css" href="../css/chrome.css" />
<link rel="stylesheet" type="text/css"
	href="../css/common_css_for_all.css" />
<script type="text/javascript" src="/jquery.js"></script>
<script type="text/javascript" src="jquery.validate.js"></script>
<script type="text/javascript" src="common_methods_validation.js"></script>
<script type="text/javascript" src="stu_reg.js"></script>
<script type="text/javascript">


 function saveurl(){
 document.dealerform.action = "/dealer/dealer/save.htm";
 return true;
 }

 function updateurl(){
 document.dealerform.action = "/dealer/bills/updatebill.htm";
 return true;
 }

 function deleteurl(){
 document.dealerform.action = "/dealer/bills/deletebill.htm";
 return true;
 }

 function searchurl(){
 document.dealerform.action = "/dealer/bills/searchbill.htm";
 return true;
 }

 function getallurl(){
 document.dealerform.action = "/dealer/bills/getall.htm";
 return true;
 }

</script>




</head>

<body>
	<form id="stureg" name="dealerform" method="post">
		<div id="middle">
			<h4>Dealer Registration</h4>
			<p>
				<label>Organisation name</label><input type="text" name="Orgname"
					value="" />
			</p>
			<p>
				<label>Dealer name</label><input type="text" name="Name" value="" />
			</p>
			<p>
				<label>Door No</label><input type="text" name="Dno" value="" />
			</p>
			<p>
				<label>Street</label><input type="text" name="Street" value="" />
			</p>
			<p>
				<label>City</label><input type="text" name="City" value="" />
			</p>
			<p>
				<label>State</label><input type="text" name="state" value="" />
			</p>

			<p>
				<label>Postal Code</label><input type="text" name="Zipcode" value="" />
			</p>
			<p>
				<label>Mail Id</label><input type="text" name="Mailid" value="" />
			</p>
			<p>
				<label>Phone Number</label><input type="text" name="Phone" value="" />
			</p>
			<p>
				<label>Qualification</label><input type="text" name="Qualification"
					value="" />
			</p>
			<p>
				<label>Year turnover</label><input type="text" name="turnover"
					value="" />
			</p>
			<p>
				<label>No.of Employees</label><input type="text" name="noofemp"
					value="" />
			</p>


			<p>
				<label>Deal id</label><input type="text" name="Id" value="" />
			</p>
			<p>
				<label>Bank Account No</label><input type="text" name="Accno"
					value="" />
			</p>
			<p>
				<label>Bank Name</label><input type="text" name="Bank" value="" />
			</p>
			<p>
				<label>Branch Name</label><input type="text" name="Branch" value="" />
			</p>
			<p>
				<label>Location</label><input type="text" name="Location" value="" />
			</p>
			<p>
				<label>IFSC code</label><input type="text" name="IfsCode" value="" />
			</p>
			<p>
				<label></label>
			</p>
			<div class="">
				<input type="submit" value="save" onclick="saveurl();" /> <input
					type="submit" value="update" onclick="updateurl();" /> <input
					type="submit" value="search" onclick="searchurl();" /> <input
					type="submit" value="delete" onclick="deleteurl();" /> <input
					type="submit" value="getall" onclick="getallurl();" />
			</div>
	</form>

</body>
</html>
