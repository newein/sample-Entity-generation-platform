package com.tcs.amsapp.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity Vs Serializable bean mapping for the Entity: UserAuth
 *
 */
@Entity
@Table(name="user_auth", schema="amsapp_schema")

public class UserAuth implements Serializable {
	
	/*
	 *  CREATE TABLE user_auth
	 *  (
	 * 		username character varying(256),
  	 *		userpassword character varying(1024),
  	 *		CONSTRAINT username_userauth_pkey PRIMARY KEY (username )
	 *	)
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="userpassword")
	private String userpassword;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}
	
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
}
