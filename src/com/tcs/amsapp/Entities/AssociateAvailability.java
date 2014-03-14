package com.tcs.amsapp.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class AssociateAvailability  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name="day_id")
	private int dayId;

	@Column(name="start_time")
	@Temporal(TemporalType.TIME)
	private Date startTime;

	@Column(name="end_time")
	@Temporal(TemporalType.TIME)
	private Date endTime;
	

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



}
