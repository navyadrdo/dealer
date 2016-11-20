package com.dealer.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.dealer.management.model.Billing;


public class BillingDaoImple implements BillingDao{
	
	
	

	@Autowired
    private SessionFactory mysessionfactory;
	
	private Session hs=null;
	private org.hibernate.Transaction carrytx=null;
	/*private List newlist;*/
	
	/* (non-Javadoc)
	 * @see com.dealer.management.dao.FINALLYOK#savedao(com.dealer.management.model.Billing)
	 */
	

	@Override
	public String savedao(Billing bill) {
		System.out.println(mysessionfactory);
		System.out.println("u r in daobill");
		System.out.println(bill.getTxid());
		try{
			
				hs=mysessionfactory.openSession();
				carrytx=hs.beginTransaction();
				hs.saveOrUpdate(bill);
			 	System.out.println(" ur in try block");  
			 	carrytx.commit();	
				hs.close();
			
	   }catch(Exception e){
			   System.out.println("u r catch exception");
			   e.printStackTrace();
			   carrytx.rollback();
			 
		   
	   }
		
		// TODO Auto-generated method stub
		return "billsuccess";
	}


	/* (non-Javadoc)
	 * @see com.dealer.management.dao.FINALLYOK#updatedao(com.dealer.management.model.Billing)
	 */
	
	
	@Override
	public String updatedao(Billing bill) {
		// TODO Auto-generated method stub
		
		try{
				hs=mysessionfactory.openSession();
				 carrytx=hs.beginTransaction();
				 Query hqlquery=hs.createQuery("update Billing set amount=:amount,billto=:billto,itemid=:itemid,no_of_items=:noofitems,tradername=:tname,unitprice=:unitprice where txid=:txid");
				 hqlquery.setParameter("amount", bill.getAmount());
				 hqlquery.setParameter("billto", bill.getBillto());
				 hqlquery.setParameter("itemid", bill.getItemid());
				 hqlquery.setParameter("noofitems", bill.getNoofitems());
				 hqlquery.setParameter("tname", bill.getTname());
				 hqlquery.setParameter("unitprice", bill.getUnitprice());
				 hqlquery.setParameter("txid", bill.getTxid());
				 hqlquery.executeUpdate();
				 carrytx.commit();	
				 hs.close();
				 
		
		}catch (Exception e) {
			carrytx.rollback();
			e.printStackTrace();
			System.out.println("u r in exception update");
			
			// TODO: handle exception
		}
	

		
		
		return "billsuccess" ;
	}

	/* (non-Javadoc)
	 * @see com.dealer.management.dao.FINALLYOK#deletedao(com.dealer.management.model.Billing)
	 */
	
	
	@Override
	public String deletedao(Billing bill) {
		// TODO Auto-generated method stub
		try{
			hs=mysessionfactory.openSession();
			 carrytx=hs.beginTransaction();
			 hs.load(bill,bill.getTxid());
			 hs.delete(bill);
			 carrytx.commit();	
				
				hs.close();
			
		}catch (Exception e) {
			carrytx.rollback();
			// TODO: handle exception
			System.out.println("u r delete dao");
		}
		
	

		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.dealer.management.dao.FINALLYOK#searchdao(com.dealer.management.model.Billing)
	 */

	
	@Override
	public List searchdao(Billing bill) {
		// TODO Auto-generated method stub
		List returnlist=null;
		Query hqlquery=null;
		try{
			hs=mysessionfactory.openSession();
			 carrytx=hs.beginTransaction();
			 hqlquery=hs.createQuery("from Billing where txid=?");
			hqlquery.setString(0,bill.getTxid());
			returnlist=hqlquery.list();
			 carrytx.commit();	
			hs.close();
			 		
		}catch (Exception e) {
			// TODO: handle exception
			carrytx.rollback();
		}
		
	
		return returnlist;
		
	}

	/* (non-Javadoc)
	 * @see com.dealer.management.dao.FINALLYOK#Getalldao()
	 */
	
	
	@Override
	public List Getalldao() {
		// TODO Auto-generated method stub
		List returnlist=null;
	try{
		hs=mysessionfactory.openSession();
		 carrytx=hs.beginTransaction();
			
		 Query billingquery=hs.createQuery("from Billing").setFetchSize(3);
		/* billingquery.setFirstResult(3);
		 billingquery.setMaxResults(5);*/
		 
		 returnlist= billingquery.list();
		Integer Size=returnlist.size();
	
		 carrytx.commit();	
		 hs.close();
	}catch (Exception e) {
		// TODO: handle except
	}	 
	
	
		return returnlist;
		

	

  }

}