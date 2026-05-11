package com.jpa.nplus1.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private  String name;
	private Long phoneNumber;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL
			,orphanRemoval=true,fetch=FetchType.EAGER)
	//FetchType.Eager also solves JPA N+1 issues
	//By default FetchType.Lazy then it won't load child at the beginning
	//It hits the DB N+1 times
	
	@JsonManagedReference
	private List<Address> addresses;
	
	public Customer(String name, Long phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
