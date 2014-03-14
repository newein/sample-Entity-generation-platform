package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: WorkloadConfig
 *
 */
@Entity
@Table(schema="amsapp_schema")
public class WorkloadConfig implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="Workload_Config_Incrementor" , table="id_generator" ,
					pkColumnName = "gen_name", valueColumnName = "gen_value", 
					pkColumnValue = "workload_config_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Workload_Config_Incrementor")
	@Column(name="workload_config_id")	
	private int workloadConfigId;

	@Column(name="sla" , length=4 , scale=2)
	private float sla;

	@Column(name="asa" , length=4 , scale=2)
	private float asa;

	@Column(name="util" , length=4 , scale=2)
	private float util;

	@Column(name="abandon" , length=4 , scale=2)
	private float abandon;

	@Column(name="leave_count")
	private int leaveCount;

	@Column(name="break_count")
	private int breakCount;

	@Column(name="meeting_count")
	private int meeting_count;
		
	@Column(name="training_Count")
	private int training_Count;

	@Column(name="shrinkage" , length=4 , scale=2)
	private float shrinkage;	

	@Column(name="tolerance" , length=4 , scale = 2)
	private float tolerance;
	
	@OneToOne
	@JoinColumn(name="process_id")
	private Process process;
	
	@Column(name="is_default_params")
	private boolean isDefaultParams;

	@Version
	private Long version;
	
	public int getWorkloadConfigId() {
		return workloadConfigId;
	}

	public void setWorkloadConfigId(int workloadConfigId) {
		this.workloadConfigId = workloadConfigId;
	}

	public float getSla() {
		return sla;
	}

	public void setSla(float sla) {
		this.sla = sla;
	}

	public float getAsa() {
		return asa;
	}

	public void setAsa(float asa) {
		this.asa = asa;
	}

	public float getUtil() {
		return util;
	}

	public void setUtil(float util) {
		this.util = util;
	}

	public float getAbandon() {
		return abandon;
	}

	public void setAbandon(float abandon) {
		this.abandon = abandon;
	}

	public int getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}

	public int getBreakCount() {
		return breakCount;
	}

	public void setBreakCount(int breakCount) {
		this.breakCount = breakCount;
	}

	public int getMeeting_count() {
		return meeting_count;
	}

	public void setMeeting_count(int meeting_count) {
		this.meeting_count = meeting_count;
	}

	public int getTraining_Count() {
		return training_Count;
	}

	public void setTraining_Count(int training_Count) {
		this.training_Count = training_Count;
	}

	public float getShrinkage() {
		return shrinkage;
	}

	public void setShrinkage(float shrinkage) {
		this.shrinkage = shrinkage;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public boolean isDefaultParams() {
		return isDefaultParams;
	}

	public void setDefaultParams(boolean isDefaultParams) {
		this.isDefaultParams = isDefaultParams;
	}

	public float getTolerance() {
		return tolerance;
	}

	public void setTolerance(float tolerance) {
		this.tolerance = tolerance;
	}
	
}
