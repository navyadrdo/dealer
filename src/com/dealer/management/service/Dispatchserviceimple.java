package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dealer.management.dao.DispatchDao;
import com.dealer.management.model.Dispatch;

public class Dispatchserviceimple implements DispatchService {
	
	@Autowired
	private DispatchDao dispatchdaoimple;

	@Override
	public String save(Dispatch dis) {
		// TODO Auto-generated method stub
		System.out.println("u r in dispatch service");
		System.out.println(dis.getTxid());
		dispatchdaoimple.savedao(dis);
		return null;
	}

	@Override
	public String update(Dispatch dis) {
		// TODO Auto-generated method stub
		
		dispatchdaoimple.updatedao(dis);
		return null;
	}

	@Override
	public String delete(Dispatch dis) {
		// TODO Auto-generated method stub
		return dispatchdaoimple.deletedao(dis);
	}

	@Override
	public List search(Dispatch dis) {
		// TODO Auto-generated method stub
		return dispatchdaoimple.searchdao(dis);
	}

	@Override
	public List Getall() {
		// TODO Auto-generated method stub
		return dispatchdaoimple.Getalldao();
	}

}
