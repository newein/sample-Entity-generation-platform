package com.tcs.amsapp.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class TimelyWorkloadData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="data_time_stamp")
	@Temporal(TemporalType.TIME)
	private Date dataTimeStamp;
	
	@Column(name="value")
	private Long value;

	public Date getDataTimeStamp() {
		return dataTimeStamp;
	}

	public void setDataTimeStamp(Date dataTimeStamp) {
		this.dataTimeStamp = dataTimeStamp;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
	

}
