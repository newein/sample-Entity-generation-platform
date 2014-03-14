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
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(schema="amsapp_schema")
public class ScheduleDetail implements Serializable{

	private static final long serialVersionUID = 1L;

	@Version
	private Long version;

	@Id
	@TableGenerator(name="ScheduleDetail_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "scheduledetail_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "ScheduleDetail_Key_Incrementor")
	@Column(name="scheduledetail_id")
	private int scheduleDetailId;

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

	@Column(name="start_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	@Column(name="end_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@Column(name="allocation_hours")
	private float allocationHours;

	public int getScheduleDetailId() {
		return scheduleDetailId;
	}

	public ScheduleMaster getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(ScheduleMaster scheduleid) {
		this.scheduleid = scheduleid;
	}

	public void setScheduleDetailId(int scheduleDetailId) {
		this.scheduleDetailId = scheduleDetailId;
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

	public float getAllocationHours() {
		return allocationHours;
	}

	public void setAllocationHours(float allocationHours) {
		this.allocationHours = allocationHours;
	}

}
