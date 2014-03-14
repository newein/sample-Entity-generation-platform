package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistoryFileDetail
 *
 */
@Entity

public class HistoryFileDetail implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@TableGenerator(name="History_File_Detail_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "history_file_detail_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "History_File_Detail_Key_Incrementor")
	@Column(name="history_file_detail_id")
	private int historyFileDetailId;
	
	@Column(name="filename")
	private String filename;
	
	@Column(name="file_start_date")
	@Temporal(TemporalType.DATE)
	private Date fileStartDate;

	@Column(name="file_end_date")
	@Temporal(TemporalType.DATE)
	private Date fileEndDate;
	
	@ManyToOne
	@JoinColumn(name="process_id")
	private Process process;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill skill;

	@Version
	private Long version;
	
	public HistoryFileDetail() {
		super();
	}



	public int getHistoryFileDetailId() {
		return historyFileDetailId;
	}



	public void setHistoryFileDetailId(int historyFileDetailId) {
		this.historyFileDetailId = historyFileDetailId;
	}



	public String getFilename() {
		return filename;
	}



	public void setFilename(String filename) {
		this.filename = filename;
	}



	public Date getFileStartDate() {
		return fileStartDate;
	}



	public void setFileStartDate(Date fileStartDate) {
		this.fileStartDate = fileStartDate;
	}



	public Date getFileEndDate() {
		return fileEndDate;
	}



	public void setFileEndDate(Date fileEndDate) {
		this.fileEndDate = fileEndDate;
	}



	public Process getProcess() {
		return process;
	}



	public void setProcess(Process process) {
		this.process = process;
	}



	public Skill getSkill() {
		return skill;
	}



	public void setSkill(Skill skill) {
		this.skill = skill;
	}
   
}
