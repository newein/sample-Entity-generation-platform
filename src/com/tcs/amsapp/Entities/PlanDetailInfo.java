package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema="amsapp_schema")
public class PlanDetailInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="PlanInfo_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "planinfo_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "PlanInfo_Key_Incrementor")
	@Column(name="planinfo_id")
	private int planInfoId;
	
	@ManyToOne
	@JoinColumn(name="process_id",referencedColumnName="process_id")
	private Process process;
	
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	
	@Column(name="generated_on")
	@Temporal(TemporalType.DATE)
	private Date generatedOn;
	
	@Column(name="status")
	private String status;


	public int getPlanInfoId() {
		return planInfoId;
	}


	public void setPlanInfoId(int planInfoId) {
		this.planInfoId = planInfoId;
	}


	public Process getProcess() {
		return process;
	}


	public void setProcess(Process process) {
		this.process = process;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public Date getGeneratedOn() {
		return generatedOn;
	}


	public void setGeneratedOn(Date generatedOn) {
		this.generatedOn = generatedOn;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
