package com.tcs.amsapp.Entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trial
 *
 */
@Entity
@Table(schema="amsapp_schema")

public class Trial implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id private int id;
	
	@Column(name="name")
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trial() {
		super();
	}
   
}
