package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dealer.management.dao.PaymentDao;
import com.dealer.management.model.Payment;

public class PaymentServiceimple implements PaymentService {

	@Autowired
	private PaymentDao paydaoimpl;
	@Override
	public String save(Payment payment) {
		// TODO Auto-generated method stub
		System.out.println(payment.getPaymode());
		paydaoimpl.save(payment);
		return null;
	}

	@Override
	public String update(Payment pay) {
		// TODO Auto-generated method stub
		paydaoimpl.update(pay);
		return null;
	}

	@Override
	public List search(Payment pay) {
		// TODO Auto-generated method stub
		
		return paydaoimpl.search(pay);
	}

	@Override
	public String delete(Payment pay) {
		// TODO Auto-generated method stub
		paydaoimpl.delete(pay);
		
		return null;
	}

	@Override
	public List getallpays() {
		// TODO Auto-generated method stub
		
		return paydaoimpl.getallpays();
	}

}
