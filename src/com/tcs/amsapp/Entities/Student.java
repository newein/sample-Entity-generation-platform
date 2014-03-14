package com.tcs.amsapp.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity 
@Table(name="Student",schema="amsapp_schema") 

public class Student implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id private int id;
	private String name;

	@ElementCollection
	@CollectionTable(name="student_address",joinColumns=@JoinColumn(name="student_id"))

	private List<Address> address = new ArrayList<Address>();


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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
