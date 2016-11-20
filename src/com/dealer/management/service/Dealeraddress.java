package com.dealer.management.service;

import java.util.List;

import com.dealer.management.model.Billing;
import com.dealer.management.model.DealerAddress;

public interface Dealeraddress {
	
	public String save(DealerAddress da);
	public String update(DealerAddress da);
	public String delete(DealerAddress da);
	public DealerAddress search(DealerAddress da);
	public List Getall();

}
