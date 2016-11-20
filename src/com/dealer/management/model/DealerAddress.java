package com.dealer.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DealerAddress")
public class DealerAddress extends Dealer {
	
	
	@Column(name="Dno")
	public String  Dno=null;
	@Column(name="Street")
	public String  Street=null;
	@Column(name="City")
	public String City=null;
	@Column(name="zipcode")
	public String Zipcode=null;
	@Column(name="mailid")
	public String Mailid=null;
	@Column(name="Phoneno")
	public String Phone=null;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public String getMailid() {
		return Mailid;
	}
	public void setMailid(String mailid) {
		Mailid = mailid;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	
	
	
	
}
