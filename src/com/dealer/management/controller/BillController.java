package com.dealer.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dealer.management.model.Billing;
import com.dealer.management.service.BillingService;




@Controller
@RequestMapping(value="/bills")

public class BillController {
	
	
	@Autowired
	BillingService billingserviceimple;
	
	@RequestMapping(value="/savebill",method=RequestMethod.POST)
	public String Savebill(Model mo,Billing bill){
		 System.out.println("u r in save");
		System.out.println(bill.getTxid());
		System.out.println(bill.getTname());
		mo.addAttribute("successmsg","bill is successfully saved");
		return billingserviceimple.save(bill);
		
		
	}

	
	
	
	@RequestMapping(value="/updatebill",method=RequestMethod.POST)
	public String updatebill(Model mo,Billing bill){
		mo.addAttribute("updatemsg","updation is successfull.........");
		String ok=billingserviceimple.update(bill);
		
		
		   System.out.println("u r in update bill");
		return ok;
			}
	
	
	
	
	
	
	@RequestMapping(value="/deletebill",method=RequestMethod.POST)
	public String deletebill(Model mo,Billing bill){
		
		   System.out.println("u r in delete");
		   billingserviceimple.delete(bill);
		   mo.addAttribute("successmsg","bill is successfully deleted");
		return "billsuccess";
			}
	
	
	
	
	
	@RequestMapping(value="/searchbill",method=RequestMethod.POST)
	public String searchbill(Model mo,Billing bill){
		
		   System.out.println("u r in delete");
		   mo.addAttribute("returnlist",billingserviceimple.search(bill));
		return"billsuccesstables" ;
			}
	
	
	
	
	
	@RequestMapping(value="/getall",method=RequestMethod.POST)
	public String getbills(Model map){
		   System.out.println("u r in getbill");
		   
		   
		   map.addAttribute("returnlist",billingserviceimple.Getall());
		   
		return "billsuccesstables" ;
			}


}
