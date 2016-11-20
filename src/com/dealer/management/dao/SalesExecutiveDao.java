package com.dealer.management.dao;

import java.util.List;

import com.dealer.management.model.SalesExecutive;





public interface SalesExecutiveDao {
	
	public String updatedao(SalesExecutive se);
	public String deletedao(SalesExecutive se);
	public List searchdao(SalesExecutive se);
	
	public String savedao(SalesExecutive se);
	public List Getall(SalesExecutive se);
	

}
