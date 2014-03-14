package com.tcs.amsapp.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import static javax.persistence.GenerationType.TABLE;

/**
 * Entity implementation class for Entity: Process
 *
 */
@Entity
@Table(schema="amsapp_schema")

public class Process implements Serializable {
	/*process_id
	process_name
	process_type
	client_id*/

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="Process_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "process_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Process_Key_Incrementor")
	@Column(name="process_id")
	private int processId;
		
	@Column(name="process_name")
	private String processName;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	@OneToMany(mappedBy="process")
	List<Skill> skillList = new ArrayList<Skill>();
	
	@ManyToOne
	@JoinColumn(name="config_id")
	private Configuration process_type;
	
	@Column(name="status")
	private String status;
	
	@Column(name="created_on")
	@Temporal(TemporalType.DATE)
	private Date createdOn;

	@Column(name="created_By")
	private String createdBy;
	
	@Column(name="process_description")
	private String processDescription;
		
	@Version
    private Long version;
	
	@OneToMany(mappedBy="process")
	private List<Shift> shiftList = new ArrayList<Shift>();
	
	@OneToOne(mappedBy="process")
	private ForecastConfig forecastConfig;

	@OneToOne(mappedBy="process")
	private WorkloadConfig workloadConfig;

	@OneToOne(mappedBy="process")
	private ScheduleConfig scheduleConfig;
	
	public int getProcessId() {
		return processId;
	}

	public void setProcessId(int processId) {
		this.processId = processId;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	public Configuration getProcess_type() {
		return process_type;
	}

	public void setProcess_type(Configuration process_type) {
		this.process_type = process_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public List<Shift> getShiftList() {
		return shiftList;
	}

	public void setShiftList(List<Shift> shiftList) {
		this.shiftList = shiftList;
	}

	public ForecastConfig getForecastConfig() {
		return forecastConfig;
	}

	public void setForecastConfig(ForecastConfig forecastConfig) {
		this.forecastConfig = forecastConfig;
	}

	public WorkloadConfig getWorkloadConfig() {
		return workloadConfig;
	}

	public void setWorkloadConfig(WorkloadConfig workloadConfig) {
		this.workloadConfig = workloadConfig;
	}

	public ScheduleConfig getScheduleConfig() {
		return scheduleConfig;
	}

	public void setScheduleConfig(ScheduleConfig scheduleConfig) {
		this.scheduleConfig = scheduleConfig;
	}

	public String getProcessDescription() {
		return processDescription;
	}

	public void setProcessDescription(String processDescription) {
		this.processDescription = processDescription;
	}
   
}
