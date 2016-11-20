package com.dealer.management.service;

import java.util.List;

import com.dealer.management.model.Payment;

public interface PaymentService {
	
	public String save(Payment pay);

	public String update(Payment pay);

	public List search(Payment pay);

	public String delete(Payment pay);

	public List getallpays();
	

}
