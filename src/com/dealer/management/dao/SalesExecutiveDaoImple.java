package com.dealer.management.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dealer.management.model.SalesExecutive;

@Repository(value="SalesExecutiveDao")
public class SalesExecutiveDaoImple implements SalesExecutiveDao {
		@Autowired
		SessionFactory mysessionfactory=null;
	
	
	Session hsession=null;
	Transaction tx=null;
	@Override
	public String savedao(SalesExecutive se) {
		// TODO Auto-generated method stub
		try{
			System.out.println(" ur in se dao");
		hsession=mysessionfactory.openSession();
		tx=hsession.beginTransaction();
		System.out.println(tx);
		System.out.println(hsession);
		System.out.println(se.getSeid());
		hsession.save(se);
		
		tx.commit();
	
		hsession.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public String updatedao(SalesExecutive se ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletedao( SalesExecutive se) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List searchdao(SalesExecutive se ) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override*/
	/*public List Getalldao(SalesExecutive se) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getStudentSchedule(int a) {
	     Session sessionHb = session.openSession();
	     String sql = "select stud.firstname,stud.roll,sub.subjectname,cls.classname,exam.exam_name,exam.from_time,exam.to_time,exam.exam_date from Student stud,Subject sub,Classs cls,Exam exam where exam.classs=cls.id and exam.subject=sub.id and sub.classs=cls.id and stud.classs=cls.id and stud.roll= :roll";
	     SQLQuery query = sessionHb.createSQLQuery(sql);
	     query.setParameter("roll", a);
	     query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	     return query.list();
	}*/

	@Override
	public List Getall(SalesExecutive se) {
		 List getlist=new ArrayList();
		try{
			System.out.println(" ur in se dao");
		hsession=mysessionfactory.openSession();
		tx=hsession.beginTransaction();
		System.out.println(tx);
		System.out.println(hsession);
		getlist = hsession.createCriteria(SalesExecutive.class ).list();
		tx.commit();
	
		hsession.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
		
		return getlist;
	}
	


}
