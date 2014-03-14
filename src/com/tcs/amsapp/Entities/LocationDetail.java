package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Location
 *
 */
@Entity 
@Table(name="location_detail",schema="amsapp_schema") 

public class LocationDetail implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@TableGenerator(name = "Location_Detail_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "location_detail_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Location_Detail_Key_Incrementor")
	@Column(name="location_detail_id")
	private int locationDetailId;
	
	@Column(name="location_name")
	private String locationName;	
	
	@Column(name="lunch_start_time")
	@Temporal(TemporalType.TIME)
	private Date lunchStartTime;

	@Column(name="lunch_end_time")
	@Temporal(TemporalType.TIME)
	private Date lunchEndTime;

	@Column(name="dinner_start_time")
	@Temporal(TemporalType.TIME)
	private Date dinnerStartTime;

	@Column(name="dinner_end_time")
	@Temporal(TemporalType.TIME)
	private Date dinnerEndTime;

	@Column(name="status")
	private String status;	
	
	@ManyToOne
	@JoinColumn(name="process_id")
	private Process process;

	@ManyToOne
	@JoinColumn(name="country" )
	private Configuration country;

	@ManyToOne
	@JoinColumn(name="city")// , referencedColumnName="config_id")
	private Configuration city;
	
	@Version
	private Long version;
	
	@ElementCollection
	@CollectionTable(name="location_locationOperatingHour",joinColumns=@JoinColumn(name="location_location_detail_id"))
	private List<LocationOperatingHour> locationOperatingHour = new ArrayList<LocationOperatingHour>();
	
	public int getLocationDetailId() {
		return locationDetailId;
	}

	public void setLocationDetailId(int locationDetailId) {
		this.locationDetailId = locationDetailId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Date getLunchStartTime() {
		return lunchStartTime;
	}

	public void setLunchStartTime(Date lunchStartTime) {
		this.lunchStartTime = lunchStartTime;
	}

	public Date getLunchEndTime() {
		return lunchEndTime;
	}

	public void setLunchEndTime(Date lunchEndTime) {
		this.lunchEndTime = lunchEndTime;
	}

	public Date getDinnerStartTime() {
		return dinnerStartTime;
	}

	public void setDinnerStartTime(Date dinnerStartTime) {
		this.dinnerStartTime = dinnerStartTime;
	}

	public Date getDinnerEndTime() {
		return dinnerEndTime;
	}

	public void setDinnerEndTime(Date dinnerEndTime) {
		this.dinnerEndTime = dinnerEndTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public Configuration getCountry() {
		return country;
	}

	public void setCountry(Configuration country) {
		this.country = country;
	}

	public Configuration getCity() {
		return city;
	}

	public void setCity(Configuration city) {
		this.city = city;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public List<LocationOperatingHour> getLocationOperatingHour() {
		return locationOperatingHour;
	}

	public void setLocationOperatingHour(
			List<LocationOperatingHour> locationOperatingHour) {
		this.locationOperatingHour = locationOperatingHour;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public LocationDetail() {
		super();
	}
   
}
