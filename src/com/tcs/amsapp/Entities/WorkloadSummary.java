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
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class WorkloadSummary implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="WorkloadSummary_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", 
	    valueColumnName = "gen_value", pkColumnValue = "Workload_summary_id_gen", 
	    allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "WorkloadSummary_Key_Incrementor")
	@Column(name="workload_summary_id")
	private int workloadSummaryId;
	
	@Column(name="workload_start_date")
	@Temporal(TemporalType.DATE)
	private Date workloadStartDate;

	@Column(name="workload_end_date")
	@Temporal(TemporalType.DATE)
	private Date workloadEndDate;		

	@Column(name="created_on_date")
	@Temporal(TemporalType.DATE)
	private Date createdOnDate;

	@ManyToOne
	@JoinColumn(name="process_id")
	private Process process;

	@OneToOne
	@JoinColumn(name="workload_config_id")
	private WorkloadConfig workloadConfig;
	
	@Version
	private Long version;
	
	public int getWorkloadSummaryId() {
		return workloadSummaryId;
	}

	public void setWorkloadSummaryId(int workloadSummaryId) {
		this.workloadSummaryId = workloadSummaryId;
	}

	public Date getWorkloadStartDate() {
		return workloadStartDate;
	}

	public void setWorkloadStartDate(Date workloadStartDate) {
		this.workloadStartDate = workloadStartDate;
	}

	public Date getWorkloadEndDate() {
		return workloadEndDate;
	}

	public void setWorkloadEndDate(Date workloadEndDate) {
		this.workloadEndDate = workloadEndDate;
	}

	public Date getCreatedOnDate() {
		return createdOnDate;
	}

	public void setCreatedOnDate(Date createdOnDate) {
		this.createdOnDate = createdOnDate;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public WorkloadConfig getWorkloadConfig() {
		return workloadConfig;
	}

	public void setWorkloadConfig(WorkloadConfig workloadConfig) {
		this.workloadConfig = workloadConfig;
	}
		
}
