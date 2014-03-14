package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Shift
 *
 */
@Entity
@Table(schema="amsapp_schema")

public class Shift implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="Shift_Incrementor", table = "id_generator", 
	             pkColumnName = "gen_name", valueColumnName = "gen_value", 
	             pkColumnValue = "shift_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Shift_Incrementor")
	@Column(name="shift_id")	
	private int shiftId;
	
	@Column(name="shift_desc")
	private String shiftDesc;
	
	@Column(name="start_time")
	@Temporal(TemporalType.TIME)
	private Date startTime;

	@Column(name="end_time")
	@Temporal(TemporalType.TIME)
	private Date endTime;
	
	@ManyToOne
	@JoinColumn(name="process_id")
	private Process process;
	
	@ManyToOne
	@JoinColumn(name="break_position_rule_id")
	private BreakPositionRule breakPositionRule;
	
	@ManyToOne
	@JoinColumn(name="break_count_rule_id")
	private BreakCountRule breakCountRule;
	
	@Column(name="status")
	private boolean status;
	
	@Version
	private Long version;

	public int getShiftId() {
		return shiftId;
	}

	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}

	public String getShiftDesc() {
		return shiftDesc;
	}

	public void setShiftDesc(String shiftDesc) {
		this.shiftDesc = shiftDesc;
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

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public BreakPositionRule getBreakPositionRule() {
		return breakPositionRule;
	}

	public void setBreakPositionRule(BreakPositionRule breakPositionRule) {
		this.breakPositionRule = breakPositionRule;
	}

	public BreakCountRule getBreakCountRule() {
		return breakCountRule;
	}

	public void setBreakCountRule(BreakCountRule breakCountRule) {
		this.breakCountRule = breakCountRule;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
