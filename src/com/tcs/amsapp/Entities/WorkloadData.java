package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: WorkloadData
 *
 */
@Entity

public class WorkloadData implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@TableGenerator(name="Workload_Data_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "workload_data_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Workload_Data_Key_Incrementor")
	@Column(name="workload_data_id")
	private long workloadDataId;
	
	@ManyToOne
	@JoinColumn(name="process_id")
	private Process process;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill skill;
	
	@Column(name="data_date")
	@Temporal(TemporalType.DATE)
	private Date dataDate;

	@Column(name="year_week")
	private int yearWeek;
	
	@Column(name="sum_values")
	private float sumValues;

	@Column(name="workload_mode")
	private float workloadMode;

	@Version
	private Long version;
	
	public long getWorkloadDataId() {
		return workloadDataId;
	}

	public void setWorkloadDataId(long workloadDataId) {
		this.workloadDataId = workloadDataId;
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

	public Date getDataDate() {
		return dataDate;
	}

	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}

	public int getYearWeek() {
		return yearWeek;
	}

	public void setYearWeek(int yearWeek) {
		this.yearWeek = yearWeek;
	}

	public float getSumValues() {
		return sumValues;
	}

	public void setSumValues(float sumValues) {
		this.sumValues = sumValues;
	}

	public List<TimelyWorkloadData> getTimelyWorkloadData() {
		return timelyWorkloadData;
	}

	public void setTimelyWorkloadData(List<TimelyWorkloadData> timelyWorkloadData) {
		this.timelyWorkloadData = timelyWorkloadData;
	}

	@ElementCollection
	@CollectionTable(name="workloadData_timelyWorkloadData",joinColumns=@JoinColumn(name="workloadData_workload_data_id"))
	private List<TimelyWorkloadData> timelyWorkloadData = new ArrayList<TimelyWorkloadData>();
	
	public WorkloadData() {
		super();
	}

	public float getWorkloadMode() {
		return workloadMode;
	}

	public void setWorkloadMode(float workloadMode) {
		this.workloadMode = workloadMode;
	}
   
}
