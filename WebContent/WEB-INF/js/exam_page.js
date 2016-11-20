
$("document").ready(function(){

	
	$("#exampage").validate({
		
		rules : {
			timing : {
				required : true,
				lettersonly : true,
			},
			password : {
				required : true,
				pwcheck : true,
			}
		},
		messages : {
			timing : {
			required:"enter proper timing.",
			
			               },
			password : {
			required:"password please",
			
			               }
		}
		
		
		
		
	});
		
	alert("welcome to here");
	
});