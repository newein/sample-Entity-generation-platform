package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: BreakPositionRule
 *
 */
@Entity
@Table(schema="amsapp_schema")

public class BreakPositionRule implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="Break_Position_Rule_Incrementor", table = "id_generator", 
	             pkColumnName = "gen_name", valueColumnName = "gen_value", 
	             pkColumnValue = "break_position_rule_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Break_Position_Rule_Incrementor")
	@Column(name="break_position_rule_id")	
	private int breakPositionRuleId;
	
	@Column(name="rule_description" , length=100)
	private String ruleDescription;
	
	@Column(name="first_rest_break" , length=4 , scale=2)
	private float firstRestBreak;

	@Column(name="first_meal_break" , length=4 , scale=2)
	private float firstMealBreak;
	
	@Column(name="last_rest_break" , length=4 , scale=2)
	private float lastRestBreak;
	
	@Column(name="last_meal_break" , length=4 , scale=2)
	private float lastMealBreak;

	@Column(name="time_between_two_rest_breaks" , length=4 , scale=2)
	private float timeBetweenTwoRestBreaks;

	@Column(name="time_between_two_meal_breaks" , length=4 , scale=2)
	private float timeBetweenTwoMealBreaks;

	@Column(name="time_between_rest_and_meal_breaks" , length=4 , scale=2)
	private float timeBetweenRestAndMealBreaks;
	
	@OneToMany(mappedBy="breakPositionRule")
	private List<Shift> shiftList = new ArrayList<Shift>();
	
	@Version
	private Long verison;

	public int getBreakPositionRuleId() {
		return breakPositionRuleId;
	}

	public void setBreakPositionRuleId(int breakPositionRuleId) {
		this.breakPositionRuleId = breakPositionRuleId;
	}

	public String getRuleDescription() {
		return ruleDescription;
	}

	public void setRuleDescription(String ruleDescription) {
		this.ruleDescription = ruleDescription;
	}

	public float getFirstRestBreak() {
		return firstRestBreak;
	}

	public void setFirstRestBreak(float firstRestBreak) {
		this.firstRestBreak = firstRestBreak;
	}

	public float getFirstMealBreak() {
		return firstMealBreak;
	}

	public void setFirstMealBreak(float firstMealBreak) {
		this.firstMealBreak = firstMealBreak;
	}

	public float getLastRestBreak() {
		return lastRestBreak;
	}

	public void setLastRestBreak(float lastRestBreak) {
		this.lastRestBreak = lastRestBreak;
	}

	public float getLastMealBreak() {
		return lastMealBreak;
	}

	public void setLastMealBreak(float lastMealBreak) {
		this.lastMealBreak = lastMealBreak;
	}

	public float getTimeBetweenTwoRestBreaks() {
		return timeBetweenTwoRestBreaks;
	}

	public void setTimeBetweenTwoRestBreaks(float timeBetweenTwoRestBreaks) {
		this.timeBetweenTwoRestBreaks = timeBetweenTwoRestBreaks;
	}

	public float getTimeBetweenTwoMealBreaks() {
		return timeBetweenTwoMealBreaks;
	}

	public void setTimeBetweenTwoMealBreaks(float timeBetweenTwoMealBreaks) {
		this.timeBetweenTwoMealBreaks = timeBetweenTwoMealBreaks;
	}

	public float getTimeBetweenRestAndMealBreaks() {
		return timeBetweenRestAndMealBreaks;
	}

	public void setTimeBetweenRestAndMealBreaks(float timeBetweenRestAndMealBreaks) {
		this.timeBetweenRestAndMealBreaks = timeBetweenRestAndMealBreaks;
	}

	public List<Shift> getShiftList() {
		return shiftList;
	}

	public void setShiftList(List<Shift> shiftList) {
		this.shiftList = shiftList;
	}

   
}
