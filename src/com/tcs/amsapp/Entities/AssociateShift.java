package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(schema="amsapp_schema")
public class AssociateShift implements Serializable {
	
	/*
	maxOtDay:1
	maxWorkingDaysInWeek:1
	maxOTWeek:1
	maxConsecutiveWorkingDays:1
	twoConsecutiveDaysOff:1
	holidayOff:1*/
	
	@Id
	@TableGenerator(name="Associate_Shift_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "associate_shift_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Associate_Shift_Key_Incrementor")
	@Column(name="associate_shift_id")
	private int associateShiftId;
	
	@Column(name="maxotday")
	private int maxOtDay;
	
	@Column(name="maxworkingdaysinweek")
	private int maxWorkingDaysInWeek;
	
	@Column(name="maxotweek")
	private int maxOTWeek;
	
	@Column(name="maxconsecutiveworkingdays")
	private int maxConsecutiveWorkingDays;
	
	@Column(name="twoconsecutivedaysoff")
	private int twoConsecutiveDaysOff;
	
	@Column(name="holidayoff")
	private int holidayOff;
	
	@ManyToOne
	@JoinColumn(name="associate_id")
	private Associate associate;
	
	
	
	

}
