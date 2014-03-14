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
public class ScheduleAssociateDaily implements Serializable {	
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="ScheduleDaily_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "scheduledaily_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "ScheduleDaily_Key_Incrementor")
	@Column(name="scheduleassociatedaily_id")
	private int scheduleAssociateDailyId;
	
	
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
	
	@Column(name="daily_date")
	@Temporal(TemporalType.DATE)
	private Date dailyDate;
	
	@Column(name="start_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;
	
	@Column(name="end_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;
	
	@Column(name="dailyminhours")
	private int dailyMinHours;
	
	@Column(name="allochours")
	private float allocHours;
	
	@Column(name="dailymaxhours")
	private int dailyMaxHours;
	
	@Version
    private Long version;
	
	public ScheduleMaster getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(ScheduleMaster scheduleid) {
		this.scheduleid = scheduleid;
	}

	public int getScheduleAssociateDailyId() {
		return scheduleAssociateDailyId;
	}

	public void setScheduleAssociateDailyId(int scheduleAssociateDailyId) {
		this.scheduleAssociateDailyId = scheduleAssociateDailyId;
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

	public Date getDailyDate() {
		return dailyDate;
	}

	public void setDailyDate(Date dailyDate) {
		this.dailyDate = dailyDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getDailyMinHours() {
		return dailyMinHours;
	}

	public void setDailyMinHours(int dailyMinHours) {
		this.dailyMinHours = dailyMinHours;
	}

	public float getAllocHours() {
		return allocHours;
	}

	public void setAllocHours(float allocHours) {
		this.allocHours = allocHours;
	}

	public int getDailyMaxHours() {
		return dailyMaxHours;
	}

	public void setDailyMaxHours(int dailyMaxHours) {
		this.dailyMaxHours = dailyMaxHours;
	}
	
	

}
