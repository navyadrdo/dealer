
$("document").ready(function(){

	
	$("#adminlogin").validate({
		
		rules : {
			username : {
				required : true,
				lettersonly : true,
			},
			password : {
				required : true,
				pwcheck : true,
			}
		},
		messages : {
			username : {
			required:"enter admin id.",
			
			               },
			password : {
			required:"password please",
			
			               }
		}
		
		
		
		
	});
		
	alert("welcome to here");
	
});