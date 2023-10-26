package com.crud.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String customerName;
    
	@OneToOne
	private Order orderDetails;

}
