package com.dealer.management.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="HibernateGenericDao")
public  class HibernatGenericDaoImpl<Type> implements HibernateGenericDao<Type> {

	
	@Autowired
    private SessionFactory mysessionfactory;
	
	private Session hs=null;
	private org.hibernate.Transaction tx=null;
	private List newlist;
	
	@Override
	public Type find(Type t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Type t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Type> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer countAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Type t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Type t) {
		// TODO Auto-generated method stub
		
	}

	

}
