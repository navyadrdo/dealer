package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dealer.management.dao.BillingDao;
import com.dealer.management.model.Billing;

public class BillingserviceImpl implements BillingService {
	@Autowired
	private BillingDao billingdaoimpl;
	
	public String save(Billing bill) {
		System.out.println("U R IN SSERVICE BILLING");
		
		return billingdaoimpl.savedao(bill);
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public String update(Billing bill) {
		// TODO Auto-generated method stub
		
		return billingdaoimpl.updatedao(bill);
	}

	@Override
	public String delete(Billing bill) {
		// TODO Auto-generated method stub
		return billingdaoimpl.deletedao(bill);
	}

	@Override
	public List search(Billing bill) {
		// TODO Auto-generated method stub
		return billingdaoimpl.searchdao(bill);
	}

	@Override
	public List Getall() {
		// TODO Auto-generated method stub
		return billingdaoimpl.Getalldao();
	}

}
