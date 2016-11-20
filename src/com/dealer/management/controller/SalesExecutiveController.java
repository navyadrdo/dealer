package com.dealer.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.dealer.management.service.SalesExecutiveService;
import com.dealer.management.combain.Dealerfull;
import com.dealer.management.model.SalesExecutive;
import com.dealer.management.model.SeDetails;


@Controller
@RequestMapping(value="/sales")
public class SalesExecutiveController {

	@Autowired
	private SalesExecutiveService SalesExecutiveServiceimpl;
	
	
	/*@RequestMapping(value="/save",method=RequestMethod.GET)
	public String save(Model mo){
		
		System.out.println("do get save executive is called...");
		System.out.println("u r in save controller");
		SalesExecutive salesEx=new SalesExecutive();
		SeDetails sedetails=new SeDetails();
		mo.addAttribute("saleexecutive", "saleEx");
		mo.addAttribute("salesexecutiveaddress", "sedetails");
        return "add_sales_executive";

	}*/


	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveExecutive(Model mo,SalesExecutive se,SeDetails sed){
			
		se.setSeDetails(sed);
		System.out.println("ur tested values are    "+se.getSeDetails().getCity());
		System.out.println("ur tested values arew  "+se.getSeDetails().getQualification());
		System.out.println(" sales executive details"+se.getEname());
		System.out.println("sales executive value is "+se.getSeid());
		System.out.println("sales executive details are id are"+se.getSeDetails().getSeid());
		System.out.println("sales executive phone no ..."+se.getSeDetails().getphoneno());
		System.out.println("u r in save controller");
		SalesExecutiveServiceimpl.saveSE(se);
return "salesexecutivesuccess";
	}

	@RequestMapping(value="/updateexecutive",method=RequestMethod.POST)
	public String searchExecutive(Model mo){

		   System.out.println("u r in update");
		return null;
			}
	@RequestMapping(value="/deleteexecutive",method=RequestMethod.POST)
	public List updateExecutive(Model mo){

		   System.out.println("u r in delete");
		return null;
			}
	@RequestMapping(value="/searchexecutive",method=RequestMethod.POST)
	public String deletebill(Model mo){

		   System.out.println("u r in search");
		return null;
			}
	@RequestMapping(value="/get",method=RequestMethod.POST)
	public List getbills(Model mo,SalesExecutive se){
		SalesExecutiveServiceimpl.GetallSe(se);
		   System.out.println("u r in getbill");
		return null;
			}

	/*
	@RequestMapping(value="/save.htm",method=RequestMethod.GET)
		public String save(Model mo){
			System.out.println("u r in save controller");
			SalesExecutive salesEx=new SalesExecutive();
			SeDetails sedetails=new SeDetails();
			mo.addAttribute("saleexecutive", "saleEx");
			mo.addAttribute("salesexecutiveaddress", "sedetails");
	return "add_sales_executive";
		}*/
}
