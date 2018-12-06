package com.microservices.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Client {
	
	@Id
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="BIRTHDAY")
	private java.sql.Date birthday;

	public Client() {
		super();
	}

	public Client(Long id, String name, String lastName, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
	}	
}
