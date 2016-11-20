package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealer.management.dao.HibernateGenericDao;
import com.dealer.management.model.DealerAddress;
import com.dealer.management.model.DealerBank;
@Service
public class DealerBankServiceImpl implements DealerBankService {
	@Autowired
	HibernateGenericDao<DealerBank> HibernatGenericDaoImpl;

	@Override
	public String save(DealerBank db) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.save(db);
		return null;
	}

	@Override
	public String update(DealerBank db) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.update(db);
		return null;
	}

	@Override
	public String delete(DealerBank db) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.delete(db);
		return null;
	}

	@Override
	public List search(DealerBank db) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.find(db);
		return null;
	}

	@Override
	public List Getall() {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.findAll();
		return null;
	}

}
