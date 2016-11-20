
$("document").ready(function(){

	
		
	alert("welcome to here");
	
		$("#stureg").validate({
		
		rules : {
			tradename : {
				required : true,
				lettersonly : true,
			},
			fname : {
				required : true,
				lettersonly  : true,
			},
			dno : {
				required : true,
				lettersonly  : true,
			},
			street : {
				required : true,
				lettersonly : true,
			},
			city : {
				required : true,
				lettersonly : true,
			},
			state : {
				required : true,
				lettersonly : true,
			},
			zip : {
				required : true,
				lettersonly : true,
			},
			emailid : {
				required : true,
				email2 : true,
			},
			phone : {
				required : true,
				lettersonly : true,
			},
			Qualification: {
				required : true,
				lettersonly : true,
			},
			turnover : {
				required : true,
				lettersonly : true,
			},
			noEmp : {
				required : true,
				lettersonly : true,
			},
			dealid : {
				required : true,
				lettersonly : true,
			},
			accno : {
				required : true,
				lettersonly : true,
			},
			bank : {
				required : true,
				lettersonly : true,
			},
			branch : {
				required : true,
				lettersonly : true,
			},
			location : {
				required : true,
				lettersonly : true,
			},
			ifsc : {
				required : true,
				lettersonly : true,
			},
			state : {
				required : true,
				lettersonly : true,
			}
		},
		messages : {
			tradename : {
			required:"enter trade name.",
			
			               },
			fname : {
			required:"enter father name.",
			
			               },
			dno : {
				required : 'enter Dno.',
				
			},
			street : {
				required : 'enter street.',
				
			},
			city : {
				required : 'enter city.',
				
			},
			state : {
				required:"enter state.",
				
				               },
			zip : {
				required:"enter zip code of city.",
			            },
			emailid : {
			  required:"enter email id of applicant.",
			    			
			      },
			phone : {
					required:"enter phone no.",
				            },
			Qualification: {
				  required:"enter qualification of applicant.",
				    			
				      },
				  	    		
		   turnover : {
						required:"enter yearly turnover.",
					            },
			noEmp : {
					  required:"enter no of employees working.",
					    			
					      },
			dealid : {
							required:"enter deal id.",
						            },
			accno : {
						  required:"enter bank a/c no.",
						    			
						      },
			bank : {
					required:"enter bank name.",
			            },
			branch : {
				  required:"enter bank branch.",
							      },
		 location : {
			  required:"enter location of the bank.",
				      },
		 ifsc : {
					  required:"enter bank ifsc code.",
						    },												      
			state : {
			required:"enter state name.",
			
			               }
		}
		
		
		
		
	});
	
	
});