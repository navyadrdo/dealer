package com.dealer.management.model;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DISPATCH")
public class Dispatch {

	@Column(name="ITEM_ID")
	public String itemid=null;
	@Column(name="DEALER_NAME")
	public String dealername=null;
	@Column(name="DEALER_ID")
	public String dealerid=null;
    @Column(name="NO_OF_ITEMS")
	public  Integer noofitems=0;
    
    @Column(name = "tdate")
    public String tdate=null;
   	
    @Column(name="COST")
	public Integer cost=0;
	
    @Id
	@Column(name="TX_ID")
	public String txid=null;
		
	
	
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getDealername() {
		return dealername;
	}
	public void setDealername(String dealername) {
		this.dealername = dealername;
	}
	public String getDealerid() {
		return dealerid;
	}
	public void setDealerid(String dealerid) {
		this.dealerid = dealerid;
	}
	public Integer getNoofitems() {
		return noofitems;
	}
	public void setNoofitems(Integer noofitems) {
		this.noofitems = noofitems;
	}
	
	



		public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}

	
	
	
	
	
	
	
	
}
