package com.dealer.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
//import org.junit.runners.Parameterized.Parameter;



@Entity
@Table(name="SEDETAILS")

public class SeDetails {
	public Integer sedid=null;
	public String dno=null;
	public String street=null;
	public String city=null;
	public String state=null;
	public String zip=null;
	public String phoneno=null;
	public String qualification=null;
	public SalesExecutive salesexecutive=null;
	
	@GenericGenerator(name = "generator", strategy = "foreign", 
	parameters = @org.hibernate.annotations.Parameter(name = "property", value = "salesexecutive"))
	@Id
	@Column(name = "sed_id",  nullable = false)

	public Integer getSeid() {
		return sedid;
	}

	public void setSeid(Integer sedid) {
		this.sedid= sedid;
	}

	@Column(name = "se_dno", nullable = false)
	public String getDno() {
		return dno;
	}

	public void setDno(String dno) {
		this.dno = dno;
	}
	@Column(name = "se_street", nullable = false)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@Column(name = "se_city",  nullable = false)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(name = "se_state", nullable = false)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Column(name = "se_zip",  nullable = false)
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	@Column(name = "se_phoneno",  nullable = false)
	public String getphoneno() {
		return phoneno;
	}

	public void setphoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Column(name = "se_qualification", nullable = false)
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Column(name="Phone_no")
	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@OneToOne
	@JoinColumn(name="se_id")
	public SalesExecutive getSalesexecutive() {
		return salesexecutive;
	}

	public void setSalesexecutive(SalesExecutive salesexecutive) {
		this.salesexecutive = salesexecutive;
	}
	

	
	
	
	
	
	
	
  }
