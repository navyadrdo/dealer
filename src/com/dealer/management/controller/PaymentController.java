package com.dealer.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dealer.management.model.Payment;
import com.dealer.management.service.PaymentService;

@Controller
@RequestMapping(value="/payments")
public class PaymentController {
	@Autowired
	private PaymentService payserviceimpl;
	
	@RequestMapping(value="/savepay",method=RequestMethod.POST)
	public String savepayment(Model mo,Payment pay) {
	System.out.println(pay.getPaymode());
	payserviceimpl.save(pay);
	mo.addAttribute("paymsg","payment information successfully saved");
		return "paysuccess";
	}

	@RequestMapping(value="/updatepay",method=RequestMethod.POST)
	public String updatepayment(Model mo,Payment pay) {
		payserviceimpl.update(pay);
		mo.addAttribute("paymsg","payment information updated successfully......");
		return "paysuccess";
	}
	@RequestMapping(value="/searchpay",method=RequestMethod.POST)
	public String searchpayment(Model mo,Payment pay) {
		mo.addAttribute("paylist",payserviceimpl.search(pay));
		return "paymentsuccesstables";
	}
	@RequestMapping(value="/deletepay",method=RequestMethod.POST)
	public String deletepayment(Model mo,Payment pay) {
		payserviceimpl.delete(pay);
		mo.addAttribute("paymsg","payment successfully deleted...");
		return "paysuccess";
	}
	@RequestMapping(value="/getallpay",method=RequestMethod.POST)
	public String getallpayments(ModelMap mo) {
		mo.addAttribute("paylist",payserviceimpl.getallpays());
		return "paymentsuccesstables";
	}

	

}
