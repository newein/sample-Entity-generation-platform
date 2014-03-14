package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ForecastConfig
 *
 */
@Entity
@Table(schema="amsapp_schema")

public class ForecastConfig implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="Forecast_Config_Incrementor" , table="id_generator" ,
					pkColumnName = "gen_name", valueColumnName = "gen_value", 
					pkColumnValue = "forecast_config_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Forecast_Config_Incrementor")
	@Column(name="forecast_config_id")	
	private int forecastConfigId;
	
	@Column(name="history_weeks")
	private int historyWeeks;
	
	@Column(name="future_weeks")
	private int futureWeeks;
	
	@Column(name="high_low_zero")
	private int highLowZero;
	
	@Column(name="exponential_decay_rate" , length=4 , scale = 2)
	private float exponentialDecayRate;

	@Column(name="tolerance" , length=4 , scale = 2)
	private float tolerance;
	
	@OneToOne
	@JoinColumn(name="process_id")
	private Process process;
	
	@Column(name="is_default_params")
	private boolean isDefaultParams;
	
	@Version
	private Long version;

	public int getForecastConfigId() {
		return forecastConfigId;
	}

	public void setForecastConfigId(int forecastConfigId) {
		this.forecastConfigId = forecastConfigId;
	}

	public int getHistoryWeeks() {
		return historyWeeks;
	}

	public void setHistoryWeeks(int historyWeeks) {
		this.historyWeeks = historyWeeks;
	}

	public int getFutureWeeks() {
		return futureWeeks;
	}

	public void setFutureWeeks(int futureWeeks) {
		this.futureWeeks = futureWeeks;
	}

	public int getHighLowZero() {
		return highLowZero;
	}

	public void setHighLowZero(int highLowZero) {
		this.highLowZero = highLowZero;
	}

	public float getExponentialDecayRate() {
		return exponentialDecayRate;
	}

	public void setExponentialDecayRate(float exponentialDecayRate) {
		this.exponentialDecayRate = exponentialDecayRate;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public boolean isDefaultParams() {
		return isDefaultParams;
	}

	public void setDefaultParams(boolean isDefaultParams) {
		this.isDefaultParams = isDefaultParams;
	}

	public float getTolerance() {
		return tolerance;
	}

	public void setTolerance(float tolerance) {
		this.tolerance = tolerance;
	}	
   
}
