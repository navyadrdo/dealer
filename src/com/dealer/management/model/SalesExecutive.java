package com.dealer.management.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;





@Entity
@Table(name="salesexecutive")
public class SalesExecutive {
	

	
	@Id 
	@Column(name="Se_id",unique = true, nullable = false)	
	public Integer Seid=null;
	
	
	@Column(name="se_name")
	public String ename=null;
	
	@Column(name="username")
	public String username=null;
	
	@Column(name="password")
	public String password=null;
	
	@Column(name="role")
	public String role=null;
	
	@OneToOne(mappedBy="salesexecutive",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@Fetch(FetchMode.SELECT)
	public SeDetails seDetails=null;

	
	
	
	public Integer getSeid() {
		return Seid;
	}

	public void setSeid(Integer Seid) {
		this.Seid = Seid;
	}
	
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	public SeDetails getSeDetails() {
		return seDetails;
	}

	public void setSeDetails(SeDetails seDetails) {
		this.seDetails = seDetails;
	}
	
	
	
	

}
