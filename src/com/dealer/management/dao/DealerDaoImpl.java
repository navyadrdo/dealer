package com.dealer.management.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dealer.management.combain.Dealerfull;

@Repository("DealerDao")
public class DealerDaoImpl implements DealerDao {
	
	@Autowired
    private SessionFactory mysessionfactory;
	
	private Session hs=null;
	private org.hibernate.Transaction carrytx=null;

	@Override
	public String savedao(Dealerfull df) {
		// TODO Auto-generated method stub
		System.out.println(mysessionfactory);
		System.out.println("u r in dao dealer");
		
		try{
			
				hs=mysessionfactory.openSession();
				carrytx=hs.beginTransaction();
				hs.saveOrUpdate(df.getDealer());
				hs.saveOrUpdate(df.getAddress());
				hs.saveOrUpdate(df.getBank());
				hs.saveOrUpdate(df.getCompany());
			 	System.out.println(" ur in try block");  
			 	carrytx.commit();	
				hs.close();
			
	   }catch(Exception e){
			   System.out.println("u r catch exception");
			   e.printStackTrace();
			   carrytx.rollback();
			 
		   
	   }
		
		return null;
	}

	@Override
	public String updatedao(Dealerfull df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletedao(Dealerfull df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List searchdao(Dealerfull df) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List Getalldao() {
		// TODO Auto-generated method stub
		return null;
	}

}
