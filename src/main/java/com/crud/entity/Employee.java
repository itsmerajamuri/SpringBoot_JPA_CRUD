package com.crud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private long phonenumber;
	
	private long salary1;
	
	@OneToOne(fetch = FetchType.EAGER,optional=true)
	@JoinColumn(name = "FkeyAddress")
	@JsonIgnore
	private Address address;

	public Employee(String name, long phonenumber, long salary1, Address address) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.salary1 = salary1;
		this.address = address;
	}

	public Employee(String name, long phonenumber, long salary1) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.salary1 = salary1;
	}

	
	
	
	
	

	
	
	

}
