package com.dealer.management.service;

import java.util.List;

import com.dealer.management.combain.Dealerfull;
import com.dealer.management.model.Billing;
import com.dealer.management.model.Dealer;

public interface DealerService {
	
	public String save(Dealer de);
	public String update(Dealer de);
	public String delete(Dealer de);
	public List search(Dealer de);
	public List Getall(Dealer de);

}
