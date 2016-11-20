package com.dealer.management.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DealerDept")
public class DealerDept {
	
	@Id
	@Column(name="id")
	public  Integer deptid=null;
	@Column(name="DeptName")
	public String deptname=null;
    @OneToMany(mappedBy = "dealerdept", cascade = CascadeType.ALL)
	public Set<Dealer> dealerbasic=null;
	
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Set<Dealer> getDealerbasic() {
		return dealerbasic;
	}
	public void setDealerbasic(Set<Dealer> dealerbasic) {
		this.dealerbasic = dealerbasic;
	}
	
	
	

}
