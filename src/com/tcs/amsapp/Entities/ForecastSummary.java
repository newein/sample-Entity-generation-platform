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
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class ForecastSummary implements Serializable {

		
		private static final long serialVersionUID = 1L;
		
		@Id
		@TableGenerator(name="ForecastSummary_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", 
		    valueColumnName = "gen_value", pkColumnValue = "forecast_summary_id_gen", 
		    allocationSize = 1, initialValue = 1)
		@GeneratedValue(strategy = TABLE, generator = "ForecastSummary_Key_Incrementor")
		@Column(name="forecast_summary_id")
		private int forecastSummaryId;
		
		@Column(name="forecast_start_date")
		@Temporal(TemporalType.DATE)
		private Date forecastStartDate;

		@Column(name="forecast_end_date")
		@Temporal(TemporalType.DATE)
		private Date forecastEndDate;		

		@Column(name="history_start_date")
		@Temporal(TemporalType.DATE)
		private Date historyStartDate;

		@Column(name="history_end_date")
		@Temporal(TemporalType.DATE)
		private Date historyEndDate;

		@Column(name="created_on_date")
		@Temporal(TemporalType.DATE)
		private Date createdOnDate;

		@ManyToOne
		@JoinColumn(name="process_id")
		private Process process;

		@OneToOne
		@JoinColumn(name="forecast_config_id")
		private ForecastConfig forecastConfig;
		
		@Version
		private Long version;
		
		public int getForecastSummaryId() {
			return forecastSummaryId;
		}

		public void setForecastSummaryId(int forecastSummaryId) {
			this.forecastSummaryId = forecastSummaryId;
		}

		public Date getForecastStartDate() {
			return forecastStartDate;
		}

		public void setForecastStartDate(Date forecastStartDate) {
			this.forecastStartDate = forecastStartDate;
		}

		public Date getForecastEndDate() {
			return forecastEndDate;
		}

		public void setForecastEndDate(Date forecastEndDate) {
			this.forecastEndDate = forecastEndDate;
		}

		public Date getCreatedOnDate() {
			return createdOnDate;
		}

		public void setCreatedOnDate(Date createdOnDate) {
			this.createdOnDate = createdOnDate;
		}

		public Process getProcess() {
			return process;
		}

		public void setProcess(Process process) {
			this.process = process;
		}

		public ForecastConfig getForecastConfig() {
			return forecastConfig;
		}

		public void setForecastConfig(ForecastConfig forecastConfig) {
			this.forecastConfig = forecastConfig;
		}

		public Date getHistoryStartDate() {
			return historyStartDate;
		}

		public void setHistoryStartDate(Date historyStartDate) {
			this.historyStartDate = historyStartDate;
		}

		public Date getHistoryEndDate() {
			return historyEndDate;
		}

		public void setHistoryEndDate(Date historyEndDate) {
			this.historyEndDate = historyEndDate;
		}		
		
}
