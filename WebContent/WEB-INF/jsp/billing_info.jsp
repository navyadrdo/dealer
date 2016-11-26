<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <title> Billing Page </title>
  <meta name="Generator" content="EditPlus">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  
  <link rel="stylesheet" type="text/css" href="../css/chrome.css"/>
 <link rel="stylesheet" type="text/css" href="../css/common_css_for_all.css"/>


 <script type="text/javascript" src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../jquery/jquery.validate.js"></script>
<script type="text/javascript" src="../jquery/common_methods_validation.js"></script>
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

 <body>
  <form id="placementdetails" name="billform" method="post">
   <div id="header">
 <h2>DEALER MANAGEMENT SYSTEM</h2>
  </div>




 <div id="contentmenu">
 <ul>
<li><a href="/dealer/html/billing_info.html">BIlling</a></li>
<li><a href="/dealer/html/dispach_page.html">Dispatch</a></li>
 <li><a href="/dealer/html/itemlist.html">Items</a></li>
 <li><a href="/dealer/html/payment_page.html">Payment</a></li>
 <li><a href="/dealer/html/dealer_reg.html">Dealer</a></li>
 </ul>
 </div>





 <div id="middle">
 <h4>Billing Information</h4>

 <p><label>Transaction ID</label><input type="text" name="txid" value="12ws"/></p>
 <p><label>TraderName</label><input type="text" name="tname" value="welcome"/></p>
<p><label>Bill to mr.</label><input type="text"name="billto" value="ravi"/></p>
<p><label>Item id</label><input type="text" name="itemid" value="1231"/></p>
<p><label>No.of items</label><input type="text" name="noofitems" value="3" id="noofitems"/></p>
<p><label>unit price</label><input type="text" name="unitprice" value="5"id="unitprice"/></p>
<p><label>Amount</label><input type="text" name="amount" value="15" id=amount/></p>
<div class="">
<p><label></label><input type="submit" value="save" name="billoperationcarry"onclick="saveurl();"/>
					<input type="submit" value="update" name="billoperationcarry"onclick="updateurl();"/>
					<input type="submit" value="Delete" name="billoperationcarry"onclick="deleteurl();"/>
					<input type="submit" value="search" name="billoperationcarry"onclick="searchurl();"/>
					<input type="submit" value="GetAll" name="billoperationcarry"onclick="getallurl();"/>
					</p>
</div>
</div>
  </form>
 </body>
</html>
