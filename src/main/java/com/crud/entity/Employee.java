package com.crud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
	
	@Size(min = 5,max = 20,message = "sariga enter chey | credits:NeeharRadhika")
	@NotNull(message = "should not be null")
	@NotBlank(message = "should contain atleat one non white space")
	@NotEmpty(message = "should not be empty")
	private String name;
	
    @Min(value = 10,message = "enter phone number")
    @NotNull
	private long phonenumber;
   
  
    @Digits(integer = 11,message = "enter valid salary", fraction = 12)
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
