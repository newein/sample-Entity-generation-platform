package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ForecastData
 *
 */
@Entity

public class ForecastData implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="Forecast_Data_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "forecast_data_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Forecast_Data_Key_Incrementor")
	@Column(name="forecast_data_id")
	private long forecastDataId;
	
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

	@Column(name="forecast_mode")
	private float forecastMode;

	@Version
	private Long version;
	
	@ElementCollection
	@CollectionTable(name="forecastData_timelyForecastData",joinColumns=@JoinColumn(name="forecastData_forecast_data_id"))
	private List<TimelyData> timelyForecastData = new ArrayList<TimelyData>();
	
	
	public long getForecastDataId() {
		return forecastDataId;
	}


	public void setForecastDataId(long forecastDataId) {
		this.forecastDataId = forecastDataId;
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


	public float getSumValues() {
		return sumValues;
	}


	public void setSumValues(float sumValues) {
		this.sumValues = sumValues;
	}


	public List<TimelyData> getTimelyForecastData() {
		return timelyForecastData;
	}


	public void setTimelyForecastData(List<TimelyData> timelyForecastData) {
		this.timelyForecastData = timelyForecastData;
	}


	public ForecastData() {
		super();
	}


	public int getYearWeek() {
		return yearWeek;
	}


	public void setYearWeek(int yearWeek) {
		this.yearWeek = yearWeek;
	}


	public float getForecastMode() {
		return forecastMode;
	}


	public void setForecastMode(float forecastMode) {
		this.forecastMode = forecastMode;
	}

   
}
