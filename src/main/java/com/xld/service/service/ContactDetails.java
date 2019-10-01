package com.xld.service.service;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "contactDetails")
public class ContactDetails {
	
	@Id
	Long id;
	
	private String name;
	
	private String email;
	
	private String number;
	
	public ContactDetails() {}

	public ContactDetails(String name, String email, String number) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ContactDetail{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", email='" + this.email + '\'' +
                ", number=" + this.number +
                '}';
	}
	
	
}
