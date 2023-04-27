package net.project.gms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class userType {
	
	@Id
	public String check;
	
	public userType() {
		
	}

	public userType(String check) {
		super();
		this.check = check;
	}

	public String getType() {
		return check;
	}

	public void setType(String check) {
		this.check = check;
	}
	
}
