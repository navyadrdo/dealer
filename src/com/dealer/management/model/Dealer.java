package com.dealer.management.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Dealer")
@Inheritance(strategy=InheritanceType.JOINED)
public class Dealer {
	
	@javax.persistence.Id
	@Column(name="Dealer_id",unique = true, nullable = false)
	public  Integer Id=null;
	@Column(name="Dealer_name")
	public String Name=null;
	@Column(name="Qualification")
	public String Qualification=null;
	
	@ManyToOne
	@JoinColumn(name="id")
	public DealerDept dealerdept=null;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public DealerDept getDealerdept() {
		return dealerdept;
	}
	public void setDealerdept(DealerDept dealerdept) {
		this.dealerdept = dealerdept;
	}
	
	
}
