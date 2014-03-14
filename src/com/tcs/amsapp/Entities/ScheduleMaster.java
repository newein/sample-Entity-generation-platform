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
import javax.persistence.Version;

@Entity
@Table(schema="amsapp_schema")
public class ScheduleMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="ScheduleMaster_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "schedulemaster_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "ScheduleMaster_Key_Incrementor")
	@Column(name="schedule_master_id")
	private int scheduleMasterId;
	
	@ManyToOne
	@JoinColumn(name="process_id",referencedColumnName="process_id")
	private Process process;
	
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	public int getScheduleMasterId() {
		return scheduleMasterId;
	}

	public void setScheduleMasterId(int scheduleMasterId) {
		this.scheduleMasterId = scheduleMasterId;
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

	@Version
    private Long version;
	

}
