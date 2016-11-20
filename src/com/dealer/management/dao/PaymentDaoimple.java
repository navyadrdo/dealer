package com.dealer.management.dao;

import java.util.List;

import com.dealer.management.model.Payment;
import javax.persistence.Entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentDaoimple implements PaymentDao {
	
	@Autowired
    private SessionFactory mysessionfactory;
	
	private Session hs=null;
	private org.hibernate.Transaction tx=null;
	private List newlist;
	
	
	
	@Override
	public String save(Payment pay) {
		// TODO Auto-generated method stub
	   try{
		hs=mysessionfactory.openSession();
	   tx=hs.beginTransaction();
	   hs.save(pay);
	   tx.commit();
	   hs.close();
	   }catch (Exception e) {
		// TODO: handle exception 
		   e.printStackTrace();
	}
		return null;
	}

	@Override
	public String update(Payment pay) {
		// TODO Auto-generated method stub
		
		try{
			hs=mysessionfactory.openSession();
			 tx=hs.beginTransaction();
			 Query hqlquery=hs.createQuery("update Payment set amount=:amount,itemid=:itemid,ndate=:ndate,paymode=:paymode,recivedby=:recivedby where txid=:txid");
			 hqlquery.setParameter("amount", pay.getAmount());
			 hqlquery.setParameter("itemid", pay.getItemid());
			 hqlquery.setParameter("ndate", pay.getNdate());
			 hqlquery.setParameter("paymode", pay.getPaymode());
			 hqlquery.setParameter("recivedby", pay.getRecivedby());
			 hqlquery.setParameter("txid", pay.getTxid());
			 hqlquery.executeUpdate();
			 tx.commit();	
			 mysessionfactory.close();
			 
	
	}catch (Exception e) {
		tx.rollback();
		e.printStackTrace();
		System.out.println("u r in exception update");
		
		// TODO: handle exception
	}

		return null;
	}

	@Override
	public List search(Payment pay) {
		// TODO Auto-generated method stub

		Query hqlquery=null;
		try{
			hs=mysessionfactory.openSession();
			 tx=hs.beginTransaction();
			 hqlquery=hs.createQuery("from Payment where txid=?");
			hqlquery.setString(0,pay.getTxid());
			
			 		
		}catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}
		
	
		return hqlquery.list();
		
		
		
	}

	@Override
	public String delete(Payment pay) {
		// TODO Auto-generated method stub
		
		try{
			hs=mysessionfactory.openSession();
			 tx=hs.beginTransaction();
			 hs.load(pay,pay.getTxid());
			 hs.delete(pay);
			 tx.commit();	
			
			hs.close();
			
		}catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
			System.out.println("u r delete dao");
		}
		
	


		return "welcome";
	}

	@Override
	public List getallpays() {
		// TODO Auto-generated method stub
		
		try{
			hs=mysessionfactory.openSession();
			 tx=hs.beginTransaction();
		
			

		}catch (Exception e) {
			// TODO: handle except
		}	 
		
		
			return hs.createQuery("from Payment").list();
			

		

	  
	}

}
