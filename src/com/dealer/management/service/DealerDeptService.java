package com.dealer.management.service;

import java.util.List;

import com.dealer.management.model.Billing;
import com.dealer.management.model.DealerAddress;
import com.dealer.management.model.DealerBank;
import com.dealer.management.model.DealerDept;

public interface DealerDeptService {
	
	public String save(DealerDept ddept);
	public String update(DealerDept ddept);
	public String delete(DealerDept ddept);
	public List search(DealerDept ddept);
	public List Getall();

}
