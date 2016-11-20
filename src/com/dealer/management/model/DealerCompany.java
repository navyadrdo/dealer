package com.dealer.management.model;

import javax.persistence.Column;

public class DealerCompany {
	@javax.persistence.Id
	@Column(name="Dealer_id")
	public String Id=null;
	@Column(name="Orgname")
	public String Orgname=null;
	@Column(name="Turnover")
	public String turnover=null;
	@Column(name="NOofEmp")
	public String noofemp=null;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getOrgname() {
		return Orgname;
	}
	public void setOrgname(String orgname) {
		Orgname = orgname;
	}
	public String getTurnover() {
		return turnover;
	}
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	public String getNoofemp() {
		return noofemp;
	}
	public void setNoofemp(String noofemp) {
		this.noofemp = noofemp;
	}
	
	

}
