package com.tcs.amsapp.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity Vs Serializable bean mapping for the Entity: UserInfo
 *
 */
@Entity
@Table(name="user_info", schema="amsapp_schema")

public class UserInfo implements Serializable {
	
	/*
		CREATE TABLE user_info
		(
		  firstname character varying(256),
		  lastname character varying(256),
		  username character varying(256) NOT NULL,
		  email character varying(256),
		  userrole character varying(32),
		  CONSTRAINT username_userinfo_pkey PRIMARY KEY (username )
		)
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="userrole")
	private String userrole;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
}
