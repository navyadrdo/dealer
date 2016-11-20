package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealer.management.dao.HibernateGenericDao;
import com.dealer.management.model.DealerCompany;
@Service
public class DealerCompanyServiceImpl implements DealerCompanyService {
	@Autowired
	HibernateGenericDao<DealerCompany> HibernatGenericDaoImpl;

	@Override
	public String save(DealerCompany dc) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.save(dc);
		return null;
	}

	@Override
	public String update(DealerCompany dc) {
		HibernatGenericDaoImpl.update(dc);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(DealerCompany dc) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.delete(dc);
		return null;
	}

	@Override
	public List search(DealerCompany dc) {
	HibernatGenericDaoImpl.find(dc);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List Getall() {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.findAll();
		return null;
	}

	
	

}
