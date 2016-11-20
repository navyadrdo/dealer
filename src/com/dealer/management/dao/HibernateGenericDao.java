package com.dealer.management.dao;

import java.util.List;

public interface HibernateGenericDao<Type>{
	
	
		public Type find(Type t);
		public void save (Type t);
		public void update (Type t);
		public List<Type> findAll();
		public Integer countAll();
		public void delete(Type t);
		
	

}
