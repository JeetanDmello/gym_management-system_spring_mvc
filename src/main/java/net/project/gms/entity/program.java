package net.project.gms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "program")
public class program {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long program_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "time_required")
	private Float time_required;
	
	@Column(name = "trainer_name")
	private String trainer_name;
	
	public program() {
		
	}

	public program(String name, String type, Float time_required, String trainer_name) {
		super();
		this.name = name;
		this.type = type;
		this.time_required = time_required;
		this.trainer_name = trainer_name;
	}

	public Long getProgram_id() {
		return program_id;
	}

	public void setProgram_id(Long program_id) {
		this.program_id = program_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getTime_required() {
		return time_required;
	}

	public void setTime_required(Float time_required) {
		this.time_required = time_required;
	}

	public String getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}	
}
