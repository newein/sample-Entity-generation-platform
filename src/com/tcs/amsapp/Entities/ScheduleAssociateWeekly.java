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
public class ScheduleAssociateWeekly implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="ScheduleWeekly_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "scheduleweekly_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "ScheduleWeekly_Key_Incrementor")
	@Column(name="scheduleassociateweekly_id")
	private int scheduleWeeklyId;
	
	@ManyToOne
	@JoinColumn(name="schedule_id",referencedColumnName="schedule_master_id")
	private ScheduleMaster scheduleid;
	
	@ManyToOne
	@JoinColumn(name="associate_id",referencedColumnName="associate_id")	
	private Associate associate;

	@ManyToOne
	@JoinColumn(name="process_id",referencedColumnName="process_id")
	private Process process;
	
	@Column(name="weekly_date")
	@Temporal(TemporalType.DATE)	
	private Date associateWeeklyDate;
	
	@Column(name="alloc_hours")
	private float allochours;
	
	@Column(name="weekly_min_hours")
	private int weeklyMinHours;
	
	@Column(name="weekly_max_hours")
	private int weeklyMaxHours;
	
	@Column(name="max_day_per_week")
	private int maxDayPerWeek;
	
	@Column(name="allocated_days")
	private int allocatedDays;

	public int getScheduleWeeklyId() {
		return scheduleWeeklyId;
	}

	public void setScheduleWeeklyId(int scheduleWeeklyId) {
		this.scheduleWeeklyId = scheduleWeeklyId;
	}

	public ScheduleMaster getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(ScheduleMaster scheduleid) {
		this.scheduleid = scheduleid;
	}

	public Associate getAssociate() {
		return associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public Date getAssociateWeeklyDate() {
		return associateWeeklyDate;
	}

	public void setAssociateWeeklyDate(Date associateWeeklyDate) {
		this.associateWeeklyDate = associateWeeklyDate;
	}

	public float getAllochours() {
		return allochours;
	}

	public void setAllochours(float allochours) {
		this.allochours = allochours;
	}

	public int getWeeklyMinHours() {
		return weeklyMinHours;
	}

	public void setWeeklyMinHours(int weeklyMinHours) {
		this.weeklyMinHours = weeklyMinHours;
	}

	public int getWeeklyMaxHours() {
		return weeklyMaxHours;
	}

	public void setWeeklyMaxHours(int weeklyMaxHours) {
		this.weeklyMaxHours = weeklyMaxHours;
	}

	public int getMaxDayPerWeek() {
		return maxDayPerWeek;
	}

	public void setMaxDayPerWeek(int maxDayPerWeek) {
		this.maxDayPerWeek = maxDayPerWeek;
	}

	public int getAllocatedDays() {
		return allocatedDays;
	}

	public void setAllocatedDays(int allocatedDays) {
		this.allocatedDays = allocatedDays;
	}
	
	
	
	

}
