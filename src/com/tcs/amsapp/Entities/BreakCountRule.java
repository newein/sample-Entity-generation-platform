package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: BreakCountRule
 *
 */
@Entity
@Table(schema="amsapp_schema")

public class BreakCountRule implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="Break_Count_Rule_Incrementor", table = "id_generator", 
	             pkColumnName = "gen_name", valueColumnName = "gen_value", 
	             pkColumnValue = "break_count_rule_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Break_Count_Rule_Incrementor")
	@Column(name="break_count_rule_id")	
	private int breakCountRuleId;
	
	@Column(name="shift_duration" , length=4 , scale=2)
	private float shiftDuration;

	@Column(name="rest_break_count")
	private int restBreakCount;

	@Column(name="rest_break_length" , length=4 , scale=2)
	private float restBreakLength;

	@Column(name="meal_break_count")
	private int mealBreakCount;

	@Column(name="meal_break_length" , length=4 , scale=2)
	private float mealBreakLength;
	
	@Column(name="description")
	private String description;

	@OneToMany(mappedBy="breakCountRule")
	private List<Shift> shiftList = new ArrayList<Shift>();
	
	@Version
	private Long version;

	public int getBreakCountRuleId() {
		return breakCountRuleId;
	}

	public void setBreakCountRuleId(int breakCountRuleId) {
		this.breakCountRuleId = breakCountRuleId;
	}

	public float getShiftDuration() {
		return shiftDuration;
	}

	public void setShiftDuration(float shiftDuration) {
		this.shiftDuration = shiftDuration;
	}

	public int getRestBreakCount() {
		return restBreakCount;
	}

	public void setRestBreakCount(int restBreakCount) {
		this.restBreakCount = restBreakCount;
	}

	public float getRestBreakLength() {
		return restBreakLength;
	}

	public void setRestBreakLength(float restBreakLength) {
		this.restBreakLength = restBreakLength;
	}

	public int getMealBreakCount() {
		return mealBreakCount;
	}

	public void setMealBreakCount(int mealBreakCount) {
		this.mealBreakCount = mealBreakCount;
	}

	public float getMealBreakLength() {
		return mealBreakLength;
	}

	public void setMealBreakLength(float mealBreakLength) {
		this.mealBreakLength = mealBreakLength;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Shift> getShiftList() {
		return shiftList;
	}

	public void setShiftList(List<Shift> shiftList) {
		this.shiftList = shiftList;
	}
	
   
}
