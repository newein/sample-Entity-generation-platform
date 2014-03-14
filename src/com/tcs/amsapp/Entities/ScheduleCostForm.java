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
public class ScheduleCostForm implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="ScheduleCost_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "schedulecost_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "ScheduleCost_Key_Incrementor")
	@Column(name="schedulecostform_id")
	private int ScheduleCostFormId;
	
	@ManyToOne
	@JoinColumn(name="process_id",referencedColumnName="process_id")
	private Process process;
	
	@ManyToOne
	@JoinColumn(name="skill_id",referencedColumnName="skill_id")	
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name="schedule_id",referencedColumnName="schedule_master_id")
	private ScheduleMaster scheduleid;
	
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="value")
	private float value;
	
	@Column(name="value_type")
	private String valueType;
	
	@Column(name="flag")
	private int flag;
	
	@Version
	private long version;

	public int getScheduleCostFormId() {
		return ScheduleCostFormId;
	}

	public void setScheduleCostFormId(int scheduleCostFormId) {
		ScheduleCostFormId = scheduleCostFormId;
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

	public ScheduleMaster getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(ScheduleMaster scheduleid) {
		this.scheduleid = scheduleid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float totalPay) {
		this.value = totalPay;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	
	
}
