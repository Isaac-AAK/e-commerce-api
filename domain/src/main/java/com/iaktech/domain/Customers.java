package com.iaktech.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name="customers")
public class Customers {

	@Id
	private long id;
	
	private String name;
	
	private String street;
	
	private String city;
	
	private String zipCode;
	
	
	
	
	
	
}
