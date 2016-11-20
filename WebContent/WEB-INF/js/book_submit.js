
$("document").ready(function(){

	
	$("#booksubmit").validate({
		
		rules : {
			stuid : {
				required : true,
			alphanumerics : true,
			}
			
		},
		messages : {
			stuid : {
			required:"enter student id.",
					 
			
			               },
			}
		
		
		
		
	});
		
	alert("welcome to here");
	
});