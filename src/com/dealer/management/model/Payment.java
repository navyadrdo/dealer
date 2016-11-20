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
@Table(name="PAYMENT")
public class Payment {
	
	@Column(name="TXID")
	@Id
	public String txid=null;
	
	@Column(name="ITEMID")
	public String itemid=null;
	@Temporal(TemporalType.DATE)
	@Column( name="NDATE")
	public Date ndate=null;
	@Column(name="RECIVEDBY")
	public String recivedby=null;
	@Column(name="AMOUNT")
	public Integer amount=0;
	@Column( name="PAYMODE")
	public String paymode=null;
	
	
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public Date getNdate() {
		return ndate;
	}
	public void setNdate(Date ndate) {
		this.ndate = ndate;
	}
	public String getRecivedby() {
		return recivedby;
	}
	public void setRecivedby(String recivedby) {
		this.recivedby = recivedby;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getPaymode() {
		return paymode;
	}
	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}

	

}
