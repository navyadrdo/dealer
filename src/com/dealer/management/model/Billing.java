package com.dealer.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BILLING")
public class Billing {
	@Id

	@Column(name="TXID")
	public String txid=null;
	@Column(name="TRADERNAME")
	public String	tname=null;
	@Column(name="BILLTO")
	public String billto=null;
	@Column(name="ITEMID")
	public String itemid=null;
	@Column(name="NO_OF_ITEMS")
	public Integer noofitems=0;
	@Column(name="UNITPRICE")
	public Integer unitprice=0;
	@Column(name="AMOUNT")
	public Integer amount=0;
	
	
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getBillto() {
		return billto;
	}
	public void setBillto(String billto) {
		this.billto = billto;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public Integer getNoofitems() {
		return noofitems;
	}
	public void setNoofitems(Integer noofitems) {
		this.noofitems = noofitems;
	}
	public Integer getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(Integer unitprice) {
		this.unitprice = unitprice;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
	
	
}
