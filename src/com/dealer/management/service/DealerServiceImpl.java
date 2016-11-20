package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealer.management.combain.Dealerfull;
import com.dealer.management.dao.DealerDao;

import com.dealer.management.dao.HibernateGenericDao;
import com.dealer.management.model.Dealer;
import com.dealer.management.model.DealerAddress;
import com.dealer.management.model.DealerBank;
@Service
public class DealerServiceImpl implements DealerService {
	@Autowired
	HibernateGenericDao<Dealer> HibernatGenericDaoImpl;

	@Override
	public String save(Dealer de) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.save(de);
		return null;
	}

	@Override
	public String update(Dealer de) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.update(de);

		return null;
	}

	@Override
	public String delete(Dealer de) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.delete(de);

		return null;
	}

	@Override
	public List search(Dealer de) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.find(de);

		return null;
	}

	@Override
	public List Getall(Dealer de) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.findAll();

		return null;
	}

}
