package com.dealer.management.dao;

import java.util.List;

import com.dealer.management.combain.Dealerfull;


public interface DealerDao {
	public String savedao(Dealerfull df);
	public String updatedao(Dealerfull df);
	public String deletedao(Dealerfull df);
	public List searchdao(Dealerfull df);
	public List Getalldao();

}
