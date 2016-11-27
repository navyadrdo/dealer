<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Billing Page</title>
<meta name="Generator" content="EditPlus">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">

<link rel="stylesheet" type="text/css" href="../css/chrome.css" />
<link rel="stylesheet" type="text/css"
	href="../css/common_css_for_all.css" />


<script type="text/javascript" src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../jquery/jquery.validate.js"></script>
<script type="text/javascript"
	src="../jquery/common_methods_validation.js"></script>
<script type="text/javascript" src="../jquery/placement_details.js"></script>
<script type="text/javascript">


 function saveurl(){
 document.billform.action = "/dealer/bills/savebill.htm";
 return true;
 }

 function updateurl(){
 document.billform.action = "/dealer/bills/updatebill.htm";
 return true;
 }

 function deleteurl(){
 document.billform.action = "/dealer/bills/deletebill.htm";
 return true;
 }

 function searchurl(){
 document.billform.action = "/dealer/bills/searchbill.htm";
 return true;
 }

 function getallurl(){
 document.billform.action = "/dealer/bills/getall.htm";
 return true;
 }

</script>


</head>

<body><h4>Billing Information</h4>
<form class="form-horizontal" id="placementdetails" name="billform" method="post">
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Transaction ID</label>
    <div class="col-sm-10">
	<input type="text" class="form-control" id="txid"  value="12ws"/>
    </div></div>
 	<div class="form-group">
	<label  class="control-label col-sm-2"   >TraderName</label> <div class="col-sm-10"><input class="form-control"  type="text" name="tname"	value="welcome" /></div>
	</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Bill to mr.</label><div class="col-sm-10"><input class="form-control"  type="text" name="billto"
					value="ravi" />
			</div></div>
			<div class="form-group">
				<label  class="control-label col-sm-2"  >Item id</label><div class="col-sm-10"><input class="form-control"  type="text" name="itemid" value="1231" />
			</div></div>
			<div class="form-group">
				<label  class="control-label col-sm-2"  >No.of items</label><div class="col-sm-10"><input class="form-control"  type="text" name="noofitems"
					value="3" id="noofitems" />
			</div></div>
			<div class="form-group">
				<label  class="control-label col-sm-2"  >unit price</label><div class="col-sm-10"><input class="form-control"  type="text" name="unitprice"
					value="5" id="unitprice" />
			</div></div>
			<div class="form-group">
				<label  class="control-label col-sm-2"  >Amount</label><div class="col-sm-10"><input class="form-control"  type="text" name="amount" value="15"
					id=amount />
			</div></div>
			<div class="form-group"> <div class="col-sm-offset-2 col-sm-10">
					<input class="btn btn-success" type="submit"  value="save" name="billoperationcarry" onclick="saveurl();" />
					<input class="btn btn-warning" type="submit" value="update"   name="billoperationcarry" onclick="updateurl();" /> 
					<input class="btn btn-danger" type="submit"  value="Delete" name="billoperationcarry" onclick="deleteurl();" /> 
					<input class="btn btn-info" type="submit" value="search" name="billoperationcarry" onclick="searchurl();" /> 
					<input class="btn btn-primary "type="submit" value="GetAll" name="billoperationcarry" onclick="getallurl();" />
				
			</div>
		
	</form>
	
</body>
</html>
