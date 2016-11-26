package com.dealer.management.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dealer.management.model.Item;
import com.dealer.management.service.ItemService;

@Controller
@RequestMapping(value="/item")
public class ItemController {
	
	@Autowired
	 private ItemService itemserviceimpl;
	
	
	@RequestMapping( method = RequestMethod.GET)
	public String processRequest(ModelMap model) {
		return "itemlist";
	}
	@RequestMapping(value="/itemsave",method=RequestMethod.POST)
	public String  saveItem(Model mo,Item it){
		itemserviceimpl.saveitemservice(it);
		System.out.println("u r in save item");
		mo.addAttribute("successmsg", "item saved successfully.......");
		
		return "itemsuccess";
		
	}
	
	@RequestMapping(value="/itemupdate",method=RequestMethod.POST)

	public String  updateItem(Item it,Model mo){
		System.out.println("u r in update item");
		itemserviceimpl.updateitemservice(it);
		mo.addAttribute("successmsg", "item updated successfully.......");
		return "itemsuccess";
		
	}
	@RequestMapping(value="/deleteitem",method=RequestMethod.POST)
	public String  deleteItem(Item it,Model mo){
		System.out.println("u r in delete item");
		itemserviceimpl.deleteitemservice(it);
		mo.addAttribute("successmsg", "item deleted successfully.........");
		return "itemsuccess";
		
	}
	@RequestMapping(value="/searchitem",method=RequestMethod.POST)

	public String  searchItem(Item it,Model mo){
		System.out.println("u r in search item");
		mo.addAttribute("returnitemlist",itemserviceimpl.searchtemservice(it));
		return "itemlsuccesstables";
		
	}
	@RequestMapping(value="/getitem",method=RequestMethod.POST)

	public String  getItem(Model mo){
		System.out.println("u r in get item");
		mo.addAttribute("returnitemlist",itemserviceimpl.Getall());
		return "itemlsuccesstables";
		
	}
	
	

}
