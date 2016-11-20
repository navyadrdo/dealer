/**
 * 
 */
package com.dealer.management.service;



import java.util.List;

import com.dealer.management.model.Item;




/**
 * @author Raa
 *
 */
public interface ItemService {
	public String saveitemservice(Item it);
	public String updateitemservice(Item it);
	public List searchtemservice(Item it);
	public String deleteitemservice(Item it);
	public List Getall();


}
