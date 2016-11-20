package com.dealer.management.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tr_users")
public class User1 {

	@Id
	@GeneratedValue
	private Integer id;

	private String login;

	private String password;

	@OneToOne(cascade=CascadeType.ALL)
/*	@JoinTable(name="tr_user_roles",
		joinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")},
		inverseJoinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")}
	)*/
	private Role1 role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role1 getRole() {
		return role;
	}

	public void setRole(Role1 role) {
		this.role = role;
	}

}
