package com.tcs.amsapp.Entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity Vs Serializable bean mapping for the Entity: LoginInfo
 *
 */
@Entity
@Table(name="login_info", schema="amsapp_schema")

public class LoginInfo implements Serializable {
	
	/*
	 *	CREATE TABLE login_info
	 *	(
  	 *		username character varying(256),
  	 *		lastsuccesslogin timestamp without time zone,
  	 *		lastfailedlogin timestamp without time zone,
  	 *		countloginattempt integer,
  	 *		CONSTRAINT username_logininfo_pkey PRIMARY KEY (username )
  	 *	)
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="username")
	private String username;
	
	@Temporal(TemporalType.DATE)
	@Column(name="lastsuccesslogin")
	private Date lastsuccesslogin;
	
	@Temporal(TemporalType.DATE)
	@Column(name="lastfailedlogin")
	private Date lastfailedlogin;
	
	@Column(name="countloginattempt")
	private Integer countloginattempt;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getLastsuccesslogin() {
		return lastsuccesslogin;
	}

	public void setLastsuccesslogin(Date lastsuccesslogin) {
		this.lastsuccesslogin = lastsuccesslogin;
	}

	public Date getLastfailedlogin() {
		return lastfailedlogin;
	}

	public void setLastfailedlogin(Date lastfailedlogin) {
		this.lastfailedlogin = lastfailedlogin;
	}

	public Integer getCountloginattempt() {
		return countloginattempt;
	}

	public void setCountloginattempt(Integer countloginattempt) {
		this.countloginattempt = countloginattempt;
	}
}
