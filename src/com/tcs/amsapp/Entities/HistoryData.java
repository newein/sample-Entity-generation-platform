package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistoryData
 *
 */
@Entity

public class HistoryData implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="History_Data_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "history_data_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "History_Data_Key_Incrementor")
	@Column(name="history_data_id")
	private long historyDataId;
	
	@ManyToOne
	@JoinColumn(name="process_id")
	private Process process;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill skill;

	@ManyToOne
	@JoinColumn(name="business_Driver_id",referencedColumnName="config_id")
	private Configuration businessDriver;
	
	@Column(name="data_date")
	@Temporal(TemporalType.DATE)
	private Date dataDate;

	@Column(name="year_week")
	private int yearWeek;
	
	@Column(name="sum_values")
	private float sumValues;

	@Version
	private Long version;
	
	@ElementCollection
	@CollectionTable(name="historyData_timelyHistoryData",joinColumns=@JoinColumn(name="historyData_history_data_id"))
	private List<TimelyData> timelyHistoryData = new ArrayList<TimelyData>();
	
	
	
	
	public long getHistoryDataId() {
		return historyDataId;
	}




	public void setHistoryDataId(long historyDataId) {
		this.historyDataId = historyDataId;
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




	public Configuration getBusinessDriver() {
		return businessDriver;
	}




	public void setBusinessDriver(Configuration businessDriver) {
		this.businessDriver = businessDriver;
	}




	public Date getDataDate() {
		return dataDate;
	}




	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}




	public List<TimelyData> getTimelyHistoryData() {
		return timelyHistoryData;
	}




	public void setTimelyHistoryData(List<TimelyData> timelyHistoryData) {
		this.timelyHistoryData = timelyHistoryData;
	}




	public HistoryData() {
		super();
	}




	public float getSumValues() {
		return sumValues;
	}




	public void setSumValues(float sumValues) {
		this.sumValues = sumValues;
	}




	public int getYearWeek() {
		return yearWeek;
	}




	public void setYearWeek(int yearWeek) {
		this.yearWeek = yearWeek;
	}
   
}
