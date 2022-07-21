package com.traxcrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "billings")
public class Billing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="firstName" , length=45 , nullable=false)
	private String firstName;
	
	@Column(name="lastName" , length=45,nullable=false)
	private String lastName;
	
	@Column(name="email" , length=128,nullable= false , unique=true)
	private String email;
	
	@Column(name="mobile" , length=10,nullable= false , unique=true)
	private long mobile;
	
	@Column(name="productName" , length=45 , nullable=false)
	private String productName;
	
	@Column(name = "productPrice" , length=45, nullable= false)
	private long productPrice;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id=id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public long getMobile() {
		return this.mobile;
	}
	public void setMobile(long mobile) {
		this.mobile=mobile;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName= productName;
	}
	
	public long getProductPrice() {
		return this.productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice=productPrice;
	}
}
