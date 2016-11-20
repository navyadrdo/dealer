package com.dealer.management.service;

import java.io.Serializable;

import com.dealer.management.model.SalesExecutive;



public interface SalesExecutiveService  {
	
	public String saveSE(SalesExecutive se);
	public String deleteSe(SalesExecutive se);
	public String updateSe(SalesExecutive se);
	public String searchSe(SalesExecutive se);
	public 	String GetallSe(SalesExecutive se);
	

}
