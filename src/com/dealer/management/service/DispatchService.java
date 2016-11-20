package com.dealer.management.service;

import java.util.List;

import com.dealer.management.model.Dispatch;

public interface DispatchService {
	
	public String save(Dispatch dis);
	public String update(Dispatch dis);
	public String delete(Dispatch dis);
	public List search(Dispatch dis);
	
	public List Getall();

}
