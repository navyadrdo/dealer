
$("document").ready(function(){

	
	$("#placementdetails").validate({
		
		rules : {
			companyname : {
				required : true,
				alphanumeric : true,
			},
				wid : {
				required : true,
				dateITA : true,
			},
			stream : {
				required : true,
				alphanumeric : true,
			},
			venuedetails : {
				required : true,
				alphanumeric : true,
			}
		},
		messages : {
			companyname : {
			required:"enter admin id.",
			
			},
			wid : {
			required:"enter walk-in date(01/01/1900).",
			
			},
			stream : {
			required:"stream please",

			},
			venuedetails : {
			required:"password please",
			
			               }
		}
		
		
		
		
	});
		
	alert("welcome to here");
	
});