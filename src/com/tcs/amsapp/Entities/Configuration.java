package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Configuration
 *
 */
@Entity
@Table(schema="amsapp_schema")
public class Configuration implements Serializable {


	private static final long serialVersionUID = 1496451251480695620L;
	@Id
	@TableGenerator(name = "Config_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "conifg_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Config_Key_Incrementor")
	@Column(name = "config_id")
	private int configId;

	@Column(name = "config_name")
	private String configName;

	//bi-directional many-to-one association to Bill_Of_Material
	@ManyToOne
	@JoinColumn(name="parent_config_id", referencedColumnName="config_id")
	private Configuration parent;

	//bi-directional many-to-one association to Bill_Of_Material
	@OneToMany(mappedBy="parent")
	private List<Configuration> children = new ArrayList<Configuration>();
	
	//many to many relation with skill
	@ManyToMany(mappedBy="configList")
	private List<Skill> skillList = new ArrayList<Skill>();

	@Version
    private Long version;

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	
	public Configuration getParent() {
		return parent;
	}

	public void setParent(Configuration parent) {
		this.parent = parent;
	}



	public List<Configuration> getChildren() {
		return children;
	}

	public void setChildren(List<Configuration> children) {
		this.children = children;
	}

	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

}
