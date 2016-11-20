package com.dealer.management.dao;

import java.util.List;

import com.dealer.management.model.Dispatch;

public interface DispatchDao {
	
	public String savedao(Dispatch dis);
	public String updatedao(Dispatch dis);
	public String deletedao(Dispatch dis);
	public List searchdao(Dispatch dis);
	
	public List Getalldao();

}
