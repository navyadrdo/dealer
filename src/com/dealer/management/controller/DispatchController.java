package com.dealer.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dealer.management.model.Dispatch;
import com.dealer.management.service.DispatchService;

@Controller
@RequestMapping(value="/dispatch")
public class DispatchController {
	
	@Autowired
	private DispatchService dispatchserviceimple;
	

	@RequestMapping( method = RequestMethod.GET)
	public String processRequest(ModelMap model) {
		return "dispatch_page";
	}
	@RequestMapping(value="/savedispatch",method=RequestMethod.POST)
	public String saveDispatch(Model mo,Dispatch disp){
		System.out.println("u r in save dispatch");
		dispatchserviceimple.save(disp);
		
		mo.addAttribute("successmsg", " Dispatch info saved successfully");
		System.out.println("u r in save dispatch");
		return "dispatchsuccess";
	}

	@RequestMapping(value="/dispatchupdate",method=RequestMethod.POST)
	public String updateDispatch(Dispatch dis,Model mo){
	dispatchserviceimple.update(dis);
	mo.addAttribute("updatemsg", "dispatch updated successfully");
		System.out.println("u r in save dispatch");
		return "dispatchsuccess";
	}
	
	@RequestMapping(value="/dispatchdelete",method=RequestMethod.POST)
	public String deleteDispatch(Dispatch dis,Model mo){
		mo.addAttribute("successmsg", "Dispatch information deleted successfully");
		 dispatchserviceimple.delete(dis);
		 return "dispatchsuccess";
		
	}
	
	@RequestMapping(value="/dispatchsearch",method=RequestMethod.POST)
	public String searchDispatch(Dispatch dis,Model mo){
		 mo.addAttribute("dispatchlist",dispatchserviceimple.search(dis));
	
		System.out.println("u r in search dispatch");
		return "Dispatchsuccesstables";
	}
	
	@RequestMapping(value="/getdispatch",method=RequestMethod.POST)
	public String getallDispatch(Model mo){
	 mo.addAttribute("dispatchlist",dispatchserviceimple.Getall());
		System.out.println("u r in getall dispatch");
		return "Dispatchsuccesstables";
	}
	

}
