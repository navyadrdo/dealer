
$("document").ready(function(){

	
	$("#seminar").validate({
		
		rules : {
		st : {
				required : true,
			letterswithbasicpunc : true,
			},
		princi : {
				required : true,
			letterswithbasicpunc : true,
			},
		Time : {
				required : true,
			time : true,
			},
		seminardate : {
				required : true,
			dateITA : true,
			}
			
		},
		messages : {
		st : {
			required:"enter seminar topic.",
					 
			     },
				 princi : {
			required:"enter principal name.",
					 
			     },
				 Time : {
			required:"enter time 0-24 format.",
					 
			     },
			seminardate : {
			required:"enter date.",
					 
			     },
			}
		
		
		
		
	});
		
	alert("welcome to here");
	
});