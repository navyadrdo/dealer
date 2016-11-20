package com.dealer.management.service;

import java.util.List;

import com.dealer.management.model.Billing;
import com.dealer.management.model.DealerAddress;
import com.dealer.management.model.DealerBank;

public interface DealerBankService {
	
	public String save(DealerBank db);
	public String update(DealerBank db);
	public String delete(DealerBank db);
	public List search(DealerBank db);
	public List Getall();

}
