package com.dealer.management.service;

import java.util.List;

import com.dealer.management.model.Billing;
import com.dealer.management.model.DealerAddress;
import com.dealer.management.model.DealerBank;
import com.dealer.management.model.DealerCompany;

public interface DealerCompanyService {
	
	public String save(DealerCompany dc);
	public String update(DealerCompany dc);
	public String delete(DealerCompany dc);
	public List search(DealerCompany dc);
	public List Getall();

}
