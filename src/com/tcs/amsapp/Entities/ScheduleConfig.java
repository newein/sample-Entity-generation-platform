package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ScheduleConfig
 *
 */
@Entity
@Table(schema="amsapp_schema")
public class ScheduleConfig implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="Schedule_Config_Incrementor" , table="id_generator" ,
					pkColumnName = "gen_name", valueColumnName = "gen_value", 
					pkColumnValue = "schedule_config_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Schedule_Config_Incrementor")
	@Column(name="schedule_config_id")	
	private int scheduleConfigId;
	
	@Column(name="future_weeks")
	private int futureWeeks;

	@Column(name="frequency_change_in_shift")
	private int frequencyChangeInShift;

	@Column(name="surplus_weight")
	private int surplusWeight;

	@Column(name="deficit_weight")
	private int deficit_weight;

	@Column(name="mand_rule_weight")
	private int mandRuleWeight;

	@Column(name="timeout")
	private int timeout;

	@Column(name="two_day_off_pattern")
	private int twoDayOffPattern;

	@Column(name="inc_diff_alloc")
	private int incDiffAlloc;

	@Column(name="max_associate_constraint")
	private int maxAssociateConstraint;

	@Column(name="alloc_to_all_const")
	private int allocToAllConst;

	@Column(name="diff_in_alloc_penality")
	private int diffInAllocPenality;

	@Column(name="alloc_to_each_constraint")
	private int allocToEachConstraint;

	@Column(name="include_defficit_variable")
	private int includeDefficitVariable;
	
	@OneToOne
	@JoinColumn(name="process_id")
	private Process process;
	
	@Version
	private Long version;

	public int getScheduleConfigId() {
		return scheduleConfigId;
	}

	public void setScheduleConfigId(int scheduleConfigId) {
		this.scheduleConfigId = scheduleConfigId;
	}

	public int getFutureWeeks() {
		return futureWeeks;
	}

	public void setFutureWeeks(int futureWeeks) {
		this.futureWeeks = futureWeeks;
	}

	public int getFrequencyChangeInShift() {
		return frequencyChangeInShift;
	}

	public void setFrequencyChangeInShift(int frequencyChangeInShift) {
		this.frequencyChangeInShift = frequencyChangeInShift;
	}

	public int getSurplusWeight() {
		return surplusWeight;
	}

	public void setSurplusWeight(int surplusWeight) {
		this.surplusWeight = surplusWeight;
	}

	public int getDeficit_weight() {
		return deficit_weight;
	}

	public void setDeficit_weight(int deficit_weight) {
		this.deficit_weight = deficit_weight;
	}

	public int getMandRuleWeight() {
		return mandRuleWeight;
	}

	public void setMandRuleWeight(int mandRuleWeight) {
		this.mandRuleWeight = mandRuleWeight;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getTwoDayOffPattern() {
		return twoDayOffPattern;
	}

	public void setTwoDayOffPattern(int twoDayOffPattern) {
		this.twoDayOffPattern = twoDayOffPattern;
	}

	public int getIncDiffAlloc() {
		return incDiffAlloc;
	}

	public void setIncDiffAlloc(int incDiffAlloc) {
		this.incDiffAlloc = incDiffAlloc;
	}

	public int getMaxAssociateConstraint() {
		return maxAssociateConstraint;
	}

	public void setMaxAssociateConstraint(int maxAssociateConstraint) {
		this.maxAssociateConstraint = maxAssociateConstraint;
	}

	public int getAllocToAllConst() {
		return allocToAllConst;
	}

	public void setAllocToAllConst(int allocToAllConst) {
		this.allocToAllConst = allocToAllConst;
	}

	public int getDiffInAllocPenality() {
		return diffInAllocPenality;
	}

	public void setDiffInAllocPenality(int diffInAllocPenality) {
		this.diffInAllocPenality = diffInAllocPenality;
	}

	public int getAllocToEachConstraint() {
		return allocToEachConstraint;
	}

	public void setAllocToEachConstraint(int allocToEachConstraint) {
		this.allocToEachConstraint = allocToEachConstraint;
	}

	public int getIncludeDefficitVariable() {
		return includeDefficitVariable;
	}

	public void setIncludeDefficitVariable(int includeDefficitVariable) {
		this.includeDefficitVariable = includeDefficitVariable;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}
	
	
	
	

   
}
