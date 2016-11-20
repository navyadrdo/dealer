package com.dealer.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealer.management.dao.SalesExecutiveDao;
import com.dealer.management.model.SalesExecutive;

@Service
public class SalesExecutiveServiceimpl implements SalesExecutiveService {

	@Autowired
	SalesExecutiveDao SalesExecutiveDaoImple;
	
	@Override
	public String saveSE(SalesExecutive se) {
		// TODO Auto-generated method stub
		
		SalesExecutiveDaoImple.savedao(se);
		return null;
	}

	@Override
	public String deleteSe(SalesExecutive se) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSe(SalesExecutive se) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchSe(SalesExecutive se) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetallSe(SalesExecutive se) {
		// TODO Auto-generated method stub
		SalesExecutiveDaoImple.Getall(se);
		return null;
	}

}
