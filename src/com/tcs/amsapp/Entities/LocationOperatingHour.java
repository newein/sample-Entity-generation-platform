package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: LocationOperatingHour
 *
 */
@Embeddable

public class LocationOperatingHour implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	/*@Id
	@TableGenerator(name = "LocationOperatingHour_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "location_operating_hour_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "LocationOperatingHour_Key_Incrementor")
	@Column(name="location_Operating_Hour_Id")
	private int locationOperatingHourId;*/
	
	@Column(name="day_id")
	private int dayId;

	@Column(name="start_time")
	@Temporal(TemporalType.TIME)
	private Date startTime;

	@Column(name="end_time")
	@Temporal(TemporalType.TIME)
	private Date endTime;

	/*
	public int getLocationOperatingHourId() {
		return locationOperatingHourId;
	}



	public void setLocationOperatingHourId(int locationOperatingHourId) {
		this.locationOperatingHourId = locationOperatingHourId;
	}*/



	public int getDayId() {
		return dayId;
	}



	public void setDayId(int dayId) {
		this.dayId = dayId;
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



	public LocationOperatingHour() {
		super();
	}
   
}
