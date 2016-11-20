package com.dealer.management.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.dealer.management.model.Dispatch;

public class DispatchDaoimpl implements DispatchDao {
    @Autowired
	private SessionFactory mysessionfactory;
	
	Session hs=null;
	Transaction tx=null;
	@Override
	public String savedao(Dispatch dis) {
		System.out.println("u r in dao dispatch");
		// TODO Auto-generated method stub
			try{
				hs=mysessionfactory.openSession();
		Transaction tx=hs.beginTransaction();
		System.out.println(tx);
		hs.save(dis);
		tx.commit();
		hs.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		return null;
	}

	@Override
	public String updatedao(Dispatch dis) {
		// TODO Auto-generated method stub
		
		
		
		
		try{
			hs=mysessionfactory.openSession();
				 tx=hs.beginTransaction();
				 Query hqlquery=hs.createQuery("update Dispatch set itemid=:itemid,dealername=:dealername,dealerid=:dealer,noofitems=:noofitems,tdate=:todaydate,cost=:cost where txid=:txid");
				 hqlquery.setParameter("itemid", dis.getItemid());
				 hqlquery.setParameter("dealername", dis.getDealername());
				 hqlquery.setParameter("dealer", dis.getDealerid());
				 hqlquery.setParameter("noofitems", dis.getNoofitems());

				 hqlquery.setParameter("todaydate", dis.getTdate());
				 hqlquery.setParameter("cost", dis.getCost());
				 hqlquery.setParameter("txid", dis.getTxid());
				 hqlquery.executeUpdate();
				 tx.commit();	
				 hs.close();
				 
		
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("u r in exception update");
			
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public String deletedao(Dispatch dis) {
		
		
		// TODO Auto-generated method stub
		
		try{
			hs=mysessionfactory.openSession();
			 tx=hs.beginTransaction();
			 hs.load(dis,dis.getTxid());
			 hs.delete(dis);
			 tx.commit();	
				
			 hs.close();
			
		}catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
			System.out.println("u r delete dao");
		}
		
		
		return null;
	}

	@Override
	public List searchdao(Dispatch dis) {
		// TODO Auto-generated method stub
		
		Query hqlquery=null;
		try{
			hs=mysessionfactory.openSession();
			 tx=hs.beginTransaction();
			 hqlquery=hs.createQuery("from Dispatch where txid=?");
			hqlquery.setString(0,dis.getTxid());
		
			 		
		}catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}
		
	
		return hqlquery.list();
		
	}

	@Override
	public List Getalldao() {
		// TODO Auto-generated method stub
		try{
			hs=mysessionfactory.openSession();
			 tx=hs.beginTransaction();
		
			

		}catch (Exception e) {
			// TODO: handle except
		}	 
		
		
			return hs.createQuery("from Dispatch").list();
		
	}

}
