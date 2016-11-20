/**
 * 
 */
package com.dealer.management.dao;

import java.util.List;



import com.dealer.management.model.Item;




/**
 * @author Raa
 *
 */
public interface Itemdao {
	public String saveitemdao(Item it);
	public String updateitemdao(Item it);
	public List searchitemdao(Item it);
	public String deleteitemdao(Item it);
    public List getalldao();
}
