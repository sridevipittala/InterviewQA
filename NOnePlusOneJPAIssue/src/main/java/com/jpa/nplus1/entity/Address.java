package com.jpa.nplus1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private  String houseNumber;
	private  String street;
	private  String city;
	private  String state;
	private  Double  zipCode;
	private Long phoneNumber;
	
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	@JsonBackReference
	private Customer customer;
	
	
	public Address(Customer customer,String houseNumber, String street, String city, String state, Double zipCode, Long phoneNumber,
			Address address) {
		this.customer=customer;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		
	}
	
	public Address() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getZipCode() {
		return zipCode;
	}

	public void setZipCode(Double zipCode) {
		this.zipCode = zipCode;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
