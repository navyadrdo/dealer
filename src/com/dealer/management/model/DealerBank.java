package com.dealer.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DealerBank")

public class DealerBank extends Dealer{
	
	
	@Column(name="accno")
	public String Accno=null;
	@Column(name="Bank")
	public String Bank=null;
	@Column(name="Branch")
	public String Branch=null;
	@Column(name="Location")
	public String Location=null;
	@Column(name="IFSCcode")
	public String IfsCode=null;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getAccno() {
		return Accno;
	}
	public void setAccno(String accno) {
		Accno = accno;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getIfsCode() {
		return IfsCode;
	}
	public void setIfsCode(String ifsCode) {
		IfsCode = ifsCode;
	}
	
	
}
