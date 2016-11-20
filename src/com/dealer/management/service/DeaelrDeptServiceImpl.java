package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealer.management.dao.HibernateGenericDao;
import com.dealer.management.model.DealerAddress;
import com.dealer.management.model.DealerDept;

@Service
public class DeaelrDeptServiceImpl implements DealerDeptService {
	@Autowired
	HibernateGenericDao<DealerDept> HibernatGenericDaoImpl;
	@Override
	public String save(DealerDept ddept) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.save(ddept);
		System.out.println("u r in deptdelar.........");
		return null;
	}

	@Override
	public String update(DealerDept ddept) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.update(ddept);
		return null;
	}

	@Override
	public String delete(DealerDept ddept) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.delete(ddept);
		return null;
	}

	@Override
	public List search(DealerDept ddept) {
		// TODO Auto-generated method stub
		HibernatGenericDaoImpl.find(ddept);
		return null;
	}

	@Override
	public List Getall() {
		// TODO Auto-generated method stub
		
		return HibernatGenericDaoImpl.findAll();
	}

}
