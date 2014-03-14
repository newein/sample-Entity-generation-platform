package com.tcs.amsapp.Entities;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

@Entity
@Table(schema="amsapp_schema")

public class Associate implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="Associate_Key_Incrementor", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", pkColumnValue = "associate_id_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = TABLE, generator = "Associate_Key_Incrementor")
	@Column(name="associate_id")
	private int associateId;
		
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName; //
	
	@Column(name="phone_number")
	private int phoneNumber;
	
	@ManyToOne
	@JoinColumn(name="process_id",referencedColumnName="process_id")
	private Process processId;
	
	@ManyToOne
	@JoinColumn(name="type",referencedColumnName="config_id")
	private Configuration associateType;
	
	@ManyToOne
	@JoinColumn(name="role",referencedColumnName="config_id")
	private Configuration associateRole;
	
	@ManyToOne
	@JoinColumn(name="location",referencedColumnName="location_detail_id")
	private LocationDetail associateLocation;

	@Column(name="status")
	private String status;
	
	/*@ManyToMany
	@JoinTable(name="associate_skill_mapping" ,
	    joinColumns={@JoinColumn(name="associate_id" , referencedColumnName="associate_id")},
	    inverseJoinColumns={@JoinColumn(name="skill_id" , referencedColumnName="skill_id")})
	private List<Skill> skillList = new ArrayList<Skill>();*/
	
	@OneToMany(mappedBy = "associate")
	private List<AssociateSkillMapping> associateSkillMappingList = new ArrayList<AssociateSkillMapping>();
	
	@ElementCollection
	@CollectionTable(name="associate_availability",joinColumns=@JoinColumn(name="associate_associate_id"))
	private List<AssociateAvailability> associateAvailability = new ArrayList<AssociateAvailability>();

	@OneToOne(mappedBy = "associate")//name refers to the object name in process entity
	AssociateShift associateShift;
	
	@Version
    private Long version;
	
	public Process getProcessId() {
		return processId;
	}

	public void setProcessId(Process processId) {
		this.processId = processId;
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Configuration getAssociateType() {
		return associateType;
	}

	public void setAssociateType(Configuration associateType) {
		this.associateType = associateType;
	}

	public Configuration getAssociateRole() {
		return associateRole;
	}

	public void setAssociateRole(Configuration associateRole) {
		this.associateRole = associateRole;
	}

	public LocationDetail getAssociateLocation() {
		return associateLocation;
	}

	public void setAssociateLocation(LocationDetail associateLocation) {
		this.associateLocation = associateLocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<AssociateAvailability> getAssociateAvailability() {
		return associateAvailability;
	}

	public void setAssociateAvailability(
			List<AssociateAvailability> associateAvailability) {
		this.associateAvailability = associateAvailability;
	}

	public AssociateShift getAssociateShift() {
		return associateShift;
	}

	public void setAssociateShift(AssociateShift associateShift) {
		this.associateShift = associateShift;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public List<AssociateSkillMapping> getAssociateSkillMappingList() {
		return associateSkillMappingList;
	}

	public void setAssociateSkillMappingList(
			List<AssociateSkillMapping> associateSkillMappingList) {
		this.associateSkillMappingList = associateSkillMappingList;
	}


}
