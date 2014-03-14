package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

@Entity
@Table(schema="amsapp_schema")

public class AssociateSkillMapping implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="Associate_Skill_Mapping_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "associate_skill_mapping_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Associate_Skill_Mapping_Key_Incrementor")
	@Column(name="associate_skill_mapping_id")
	private int associateSkillMappingId;
	
	@ManyToOne
	@JoinColumn(name="associate_id",referencedColumnName="associate_id")
	private Associate associate;

	@ManyToOne
	@JoinColumn(name="skill_id",referencedColumnName="skill_id")
	private Skill skill;
	
	@Column(name="associate_skill_grouping")
	private String associateSkillGrouping;

	@Version
    private Long version;
	
	public int getAssociateSkillMappingId() {
		return associateSkillMappingId;
	}

	public void setAssociateSkillMappingId(int associateSkillMappingId) {
		this.associateSkillMappingId = associateSkillMappingId;
	}

	public Associate getAssociate() {
		return associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public String getAssociateSkillGrouping() {
		return associateSkillGrouping;
	}

	public void setAssociateSkillGrouping(String associateSkillGrouping) {
		this.associateSkillGrouping = associateSkillGrouping;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
	
}
