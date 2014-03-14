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
public class PlanDetail implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int version;
	
	@Id
	@TableGenerator(name="PlanDetail_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "plandetail_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "PlanDetail_Key_Incrementor")
	@Column(name="plan_detail_id")
	private long planDetailId;
	
	@ManyToOne
	@JoinColumn(name="skill_id",referencedColumnName="skill_id")
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name="shift_id",referencedColumnName="shift_id")
	private Shift shift;
	
	
	@ManyToOne
	@JoinColumn(name="process_id",referencedColumnName="process_id")
	private Process process;
	
	@Column(name="head_count")
	private int headCount;
	
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	
	
	public long getPlanDetailId() {
		return planDetailId;
	}
	public void setPlanDetailId(long planDetailId) {
		this.planDetailId = planDetailId;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
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
	public int getHeadCount() {
		return headCount;
	}
	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Shift getShift() {
		return shift;
	}
	public void setShift(Shift shift) {
		this.shift = shift;
	}
	
	

}
