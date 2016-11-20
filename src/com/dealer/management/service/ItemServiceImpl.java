/**
 * 
 */
package com.dealer.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.dealer.management.dao.Itemdao;
import com.dealer.management.dao.ItemdaoImple;
import com.dealer.management.model.Item;


/**
 * @author Raa
 * 
 * 
 * 
 *
 */


public class ItemServiceImpl implements ItemService {
	
	
	@Autowired
	private Itemdao itemdaoimple;
	
	/* (non-Javadoc)
	 * @see com.srkcase.study.service.ItemService#saveitemservice(com.srkcase.study.model.Iteam)
	 */
	
	@Override
	public String saveitemservice(Item it) {
		System.out.println("ur in save item service");
		itemdaoimple.saveitemdao(it);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateitemservice(Item it) {
		// TODO Auto-generated method stub
		
		itemdaoimple.updateitemdao(it);
		return null;
	}

	@Override
	public List searchtemservice(Item it) {
		// TODO Auto-generated method stub
		
		return itemdaoimple.searchitemdao(it);
	}

	@Override
	public String deleteitemservice(Item it) {
		// TODO Auto-generated method stub
		itemdaoimple.deleteitemdao(it);
		return null;
	}

	@Override
	public List Getall() {
		// TODO Auto-generated method stub
	
		return 	itemdaoimple.getalldao();
	}
}


