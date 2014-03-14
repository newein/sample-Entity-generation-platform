package com.tcs.amsapp.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import static javax.persistence.GenerationType.TABLE;

/**
 * Entity implementation class for Entity: Skill
 *
 */
@Entity
@Table(schema="amsapp_schema")

public class Skill implements Serializable {
	
	/*skill_id
	color_code
	skill_name
	skill_abb
	process_id*/
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name = "Skill_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "skill_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Skill_Key_Incrementor")
	@Column(name="skill_id")
	private int skillId;
	
	@Column(name="skill_name")
	private String skillName;
	
	@Column(name="skill_abb")
	private String skillAbb;
	
	@ManyToOne
	@JoinColumn(name="process_id")
	private Process process;
	
	@ManyToOne
	@JoinColumn(name="config_id")
	private Configuration skill_type;

	@ManyToMany
	@JoinTable(name="skill_business_driver" ,
	    joinColumns={@JoinColumn(name="skill_id" , referencedColumnName="skill_id")},
	    inverseJoinColumns={@JoinColumn(name="config_id" , referencedColumnName="config_id")})
	private List<Configuration> configList = new ArrayList<Configuration>();
	
	@Column(name="status")
	private String status;
	
	@Column(name="created_on")
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public List<Configuration> getConfigList() {
		return configList;
	}

	public void setConfigList(List<Configuration> configList) {
		this.configList = configList;
	}

	@Version
    private Long version;
	
	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillAbb() {
		return skillAbb;
	}

	public void setSkillAbb(String skillAbb) {
		this.skillAbb = skillAbb;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public Configuration getSkill_type() {
		return skill_type;
	}

	public void setSkill_type(Configuration skill_type) {
		this.skill_type = skill_type;
	}

	
   
}
