package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SchedulerInfo
 *
 */
@Entity
@Table(schema= "amsapp_schema")

public class ScheduleInfo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="ScheduleInfo_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "scheduleinfo_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "ScheduleInfo_Key_Incrementor")
	@Column(name="schedule_info_id")
	private int schedulerInfoId;
	
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
	public int getSchedulerInfoId() {
		return schedulerInfoId;
	}
	public void setSchedulerInfoId(int schedulerInfoId) {
		this.schedulerInfoId = schedulerInfoId;
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
