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
public class ScheduleStatDaily implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="ScheduleStat_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "schedulestat_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "ScheduleStat_Key_Incrementor")
	@Column(name="schedulestatdaily_id")
	private int scheduleStatDailyId;
	
	@ManyToOne
	@JoinColumn(name="process_id",referencedColumnName="process_id")
	private Process process;
	
	@ManyToOne
	@JoinColumn(name="skill_id",referencedColumnName="skill_id")	
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name="schedule_id",referencedColumnName="schedule_master_id")
	private ScheduleMaster scheduleid;
	
	@Column(name="daily_date")
	@Temporal(TemporalType.DATE)
	private Date dailyStatDate;
	
	@Column(name="under_alloc")
	private float underAllocation;
	
	@Column(name="over_alloc")
	private float overAllocation;
	
	@Column(name="workload")
	private float workload;
	
	@Column(name="schedule_alloc")
	private float scheduledAllocation;
	
	@Version
	private long version;

	public int getScheduleStatDailyId() {
		return scheduleStatDailyId;
	}

	public void setScheduleStatDailyId(int scheduleStatDailyId) {
		this.scheduleStatDailyId = scheduleStatDailyId;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Date getDailyStatDate() {
		return dailyStatDate;
	}

	public void setDailyStatDate(Date dailyStatDate) {
		this.dailyStatDate = dailyStatDate;
	}

	public float getUnderAllocation() {
		return underAllocation;
	}

	public void setUnderAllocation(float underAllocation) {
		this.underAllocation = underAllocation;
	}

	public float getOverAllocation() {
		return overAllocation;
	}

	public void setOverAllocation(float overAllocation) {
		this.overAllocation = overAllocation;
	}

	public float getWorkload() {
		return workload;
	}

	public void setWorkload(float workload) {
		this.workload = workload;
	}

	public float getScheduledAllocation() {
		return scheduledAllocation;
	}

	public void setScheduledAllocation(float scheduledAllocation) {
		this.scheduledAllocation = scheduledAllocation;
	}

	public ScheduleMaster getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(ScheduleMaster scheduleid) {
		this.scheduleid = scheduleid;
	}
	
	
	
	

}
