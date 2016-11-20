$("document").ready(function(){

	
	$("#marklist").validate({
		
		rules : {
			itemid : {
				required : true,
				lettersonly : true,
			},
			itemname : {
				required : true,
				lettersonly : true,
			},
			unitcost : {
				required : true,
				integer : true,
			},
			edate : {
				required : true,
				integer : true,
			},
			enteredby : {
				required : true,
				lettersonly : true,
			},
			p5 : {
				required : true,
				integer : true,
			},
			p6 : {
				required : true,
				integer : true,
			},
			p7 : {
				required : true,
				integer : true,
			},
			p8 : {
				required : true,
				integer : true,
			}
		},
		messages : {
			itemid : {
			required:"enter item id.",
			
			               },
			itemname : {
			required:"enter item id .",
			
			               },
			unitcost : {
			required:"enter name.",
			
			               },
			               enteredby : {
			required:"enter cost.",
			
			               },
			edate : {
			required:"enter date yyyy/mm/dd format.",
			
			               },
			p5 : {
			required:"enter u r name or id.",
			
			               },
			p6 : {
			required:"enter marks.",
			
			               },
			p7 : {
			required:"enter marks.",
			
			               },
			p8 : {
			required:"enter marks.",
			
			               }
						   
		}
		
		
		
		
	});
		
	alert("welcome to here");
	
});