package com.dealer.management.dao;

import java.util.List;

import com.dealer.management.model.Payment;

public interface PaymentDao {
	
	
	public String save(Payment pay);

	public String update(Payment pay);

	public List search(Payment pay);

	public String delete(Payment pay);

	public List getallpays();

}
