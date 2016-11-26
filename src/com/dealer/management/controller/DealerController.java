package com.dealer.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dealer.management.combain.Dealerfull;
import com.dealer.management.model.Dealer;
import com.dealer.management.model.DealerAddress;
import com.dealer.management.model.DealerBank;
import com.dealer.management.model.DealerCompany;
import com.dealer.management.model.DealerDept;
import com.dealer.management.service.DealerBankService;
import com.dealer.management.service.DealerCompanyService;
import com.dealer.management.service.DealerDeptService;
import com.dealer.management.service.DealerService;
import com.dealer.management.service.Dealeraddress;
@Controller
@RequestMapping(value="/dealer")
public class DealerController {

	@Autowired
	DealerService DealerServiceImpl;
	@Autowired
	Dealeraddress DealerAddressImpl;
	@Autowired
	DealerBankService DealerBankServiceImpl;
	@Autowired
	DealerCompanyService DealerCompanyServiceImpl;
	@Autowired
	DealerDeptService DeaelrDeptServiceImpl;
	
	
	@RequestMapping( method = RequestMethod.GET)
	public String processRequest(ModelMap model) {
		return "dealer_reg";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String SaveDealer(Dealer dealer,
							DealerAddress da,
							DealerBank db,
							DealerCompany dc,
							DealerDept dd,
							
							Model mo){
		
		try{
		System.out.println(dd.getDeptid());
		DeaelrDeptServiceImpl.save(dd);
		DealerServiceImpl.save(dealer);
		System.out.println(dealer.getName());
		DealerAddressImpl.save(da);
		DealerBankServiceImpl.save(db);
		DealerCompanyServiceImpl.save(dc);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}

	public String update(Dealer dealer,
							DealerAddress da,
							DealerBank db,
							DealerCompany dc,
							DealerDept dd,
							Model mo){
		
		return null;
	}
	
	public String Delete(Dealer dealer,
			DealerAddress da,
			DealerBank db,
			DealerCompany dc,
			DealerDept dd,
			Model mo){

		return null;
}
	
	public String Search(Dealer dealer,
			DealerAddress da,
			DealerBank db,
			DealerCompany dc,
			DealerDept dd,
			Model mo){

		return null;

}
		public List Getall(Model mo){
		return null;	
	}
}