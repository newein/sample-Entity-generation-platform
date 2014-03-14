package com.tcs.amsapp.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import static javax.persistence.GenerationType.TABLE;


/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@Table(schema="amsapp_schema")
public class Client implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -307877173245402549L;

	@Id
	@TableGenerator(name = "Client_key_Incrementor", table = "Id_Generator", schema = "amsapp_schema", initialValue = 1, pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "client_id_gen", allocationSize = 1)
	@GeneratedValue(strategy = TABLE, generator = "Client_key_Incrementor")
	@Column(name = "client_id")
	private int clientId;
	
	@Column(name = "client_name")
	private String clientName;
	
	@Column(name = "client_address")
	private String clientAddress;
	
	@Column(name="created_on")
	@Temporal(TemporalType.DATE)
	private Date createdOn;

	@Column(name="created_By")
	private String createdBy;
	
	@Column(name="status")
	private boolean status;
	
	@Version
    private Long version;
	
	
	@OneToMany(mappedBy = "client")//name refers to the object name in process entity
	List<Process> processList = new ArrayList<Process>();

	public List<Process> getProcessList() {
		return processList;
	}

	public void setProcessList(List<Process> processList) {
		this.processList = processList;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
   
}
