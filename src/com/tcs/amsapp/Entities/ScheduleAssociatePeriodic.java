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
public class ScheduleAssociatePeriodic implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="SchedulePeriodic_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "scheduleperiodic_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "SchedulePeriodic_Key_Incrementor")
	@Column(name="scheduleassociatedaily_id")
	private long scheduleAssociatePeriodicId;
	
	
	@ManyToOne
	@JoinColumn(name="process_id",referencedColumnName="process_id")
	private Process process;
	
	@ManyToOne
	@JoinColumn(name="associate_id",referencedColumnName="associate_id")	
	private Associate associate;	
	
	@ManyToOne
	@JoinColumn(name="skill_id",referencedColumnName="skill_id")	
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name="schedule_id",referencedColumnName="schedule_master_id")
	private ScheduleMaster scheduleid;
	
	@Column(name="periodic_date")
	@Temporal(TemporalType.DATE)
	private Date periodicDate;
	
	@Column(name="periodic_time")
	@Temporal(TemporalType.TIME)
	private Date periodicTime;
	
	@Column(name="is_allocated")
	private int isAllocated;
	
	@Column(name="is_break")
	private int isBreak;
	
	@Column(name="wage_rate")
	private float wageRate;
	
	@Version
	private long version;

	public long getScheduleAssociatePeriodicId() {
		return scheduleAssociatePeriodicId;
	}

	public void setScheduleAssociatePeriodicId(long scheduleAssociatePeriodicId) {
		this.scheduleAssociatePeriodicId = scheduleAssociatePeriodicId;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public Associate getAssociate() {
		return associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public ScheduleMaster getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(ScheduleMaster scheduleid) {
		this.scheduleid = scheduleid;
	}

	public Date getPeriodicDate() {
		return periodicDate;
	}

	public void setPeriodicDate(Date periodicDate) {
		this.periodicDate = periodicDate;
	}

	public Date getPeriodicTime() {
		return periodicTime;
	}

	public void setPeriodicTime(Date periodicTime) {
		this.periodicTime = periodicTime;
	}

	public int getIsAllocated() {
		return isAllocated;
	}

	public void setIsAllocated(int isAllocated) {
		this.isAllocated = isAllocated;
	}

	public int getIsBreak() {
		return isBreak;
	}

	public void setIsBreak(int isBreak) {
		this.isBreak = isBreak;
	}

	public float getWageRate() {
		return wageRate;
	}

	public void setWageRate(float wageRate) {
		this.wageRate = wageRate;
	}
	
	
	
	

}
