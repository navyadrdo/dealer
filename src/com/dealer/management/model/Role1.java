package com.dealer.management.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tr_roles")
public class Role1 {

	@Id
	@GeneratedValue
	private Integer id;

	private String role;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="tr_user_roles",
		joinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")},
		inverseJoinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")}
	)
	private Set<User1> userRoles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<User1> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<User1> userRoles) {
		this.userRoles = userRoles;
	}

}
