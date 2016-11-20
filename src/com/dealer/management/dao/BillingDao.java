package com.dealer.management.dao;

import java.util.List;

import com.dealer.management.model.Billing;

public interface BillingDao {
	
	public String savedao(Billing bill);
	public String updatedao(Billing bill);
	public String deletedao(Billing bill);
	public List searchdao(Billing bill);
	public List Getalldao();
	

}
