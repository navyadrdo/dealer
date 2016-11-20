package com.dealer.management.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ITEM")
public class Item {
	
	
	@Id
	@Column(name="ITEMID")
	public String itemid=null;
	@Column(name="ITEMNAME")
	public String itemname=null;
	@Column(name="UNITCOST")
	public Integer unitcost=0;
	
	@Temporal(TemporalType.DATE)
	@Column(name="EDATE")
	public Date edate=null;
	@Column(name="ENTEREDBY")
	public String enteredby=null;
	
	
	
	
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Integer getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(Integer unitcost) {
		this.unitcost = unitcost;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public String getEnteredby() {
		return enteredby;
	}
	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}
	
	
	
	
	
	
	
	

}
