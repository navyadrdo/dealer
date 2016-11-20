package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealer.management.dao.HibernateGenericDao;
import com.dealer.management.model.DealerAddress;
@Service
public class DealerAddressImpl implements Dealeraddress {
	@Autowired
	HibernateGenericDao<DealerAddress> HibernatGenericDaoImpl;
	

	@Override
	public String save(DealerAddress da) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.save(da);
		return null;
	}

	@Override
	public String update(DealerAddress da) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.update(da);
		return null;
	}

	@Override
	public String delete(DealerAddress da) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.delete(da);
		return null;
	}

	@Override
	public DealerAddress search(DealerAddress da) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.find(da);
		return null;
	}

	@Override
	public List Getall() {
		// TODO Auto-generated method stub
		List newlist=HibernatGenericDaoImpl.findAll();
		return newlist;
	}

}
