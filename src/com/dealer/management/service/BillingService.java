package com.dealer.management.service;

import java.util.List;

import com.dealer.management.model.Billing;

public interface BillingService {
	
	public String save(Billing bill);
	public String update(Billing bill);
	public String delete(Billing bill);
	public List search(Billing bill);
	public List Getall();

}
