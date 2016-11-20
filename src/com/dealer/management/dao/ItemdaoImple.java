package com.dealer.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.dealer.management.model.Item;



public class ItemdaoImple implements Itemdao {

	@Autowired
	SessionFactory mysessionFactory;
	Transaction tx=null;
	Session hsession=null;

	@Override
	public String saveitemdao(Item it) {
		try{
		hsession=mysessionFactory.openSession();
		tx=hsession.beginTransaction();
		System.out.println(tx);
		System.out.println(it.getEdate());
		System.out.println(it.getItemid());
		hsession.save(it);
		System.out.println("after save is done");
		tx.commit();
		hsession.close();
		System.out.println(" comming the transaction completed");
		}catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateitemdao(Item it) {
		// TODO Auto-generated method stub
		try{
			hsession=mysessionFactory.openSession();
			tx=hsession.beginTransaction();
			System.out.println(tx);
			Query q=hsession.createQuery("update Item set itemname=:m,edate=:e,enteredby=:by,unitcost=:u where itemid=:n");  
			q.setParameter("m",it.getItemname());
			q.setParameter("e", it.getEdate());
			q.setParameter("by", it.getEnteredby());
			q.setParameter("u", it.getUnitcost());
			q.setParameter("n",it.getItemid());
			q.executeUpdate();
			tx.commit();
			hsession.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List searchitemdao(Item it) {
		// TODO Auto-generated method stub
		Criteria ct = null;
		try{
			hsession=mysessionFactory.openSession();
			tx=hsession.beginTransaction();
			System.out.println(tx);
			 ct= hsession.createCriteria(Item.class).add(Restrictions.eq("itemid", it.getItemid()));
			ct.list();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ct.list();
		
	}

	@Override
	public String deleteitemdao(Item it) {
		// TODO Auto-generated method stub
		try{
			hsession=mysessionFactory.openSession();
			 tx=hsession.beginTransaction();
			 hsession.load(it,it.getItemid());
			 hsession.delete(it);
			 tx.commit();	
			hsession.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List getalldao() {
		// TODO Auto-generated method stub
		try{
			hsession=mysessionFactory.openSession();
			tx=hsession.beginTransaction();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return hsession.createQuery("from Item").list();
	}
	
	

}
