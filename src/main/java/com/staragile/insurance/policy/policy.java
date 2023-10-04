package com.staragile.insurance.policy;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class policy {
	
	@Id
	
	String policyId;
	String coustomerName;
	String coustomerAddress;
	String contactNumber;
	
	public policy() {
		super();	
	}
	
	public policy(String policyId, String coustomerName, String coustomerAddress, String contactNumber) {
		super();
		this.policyId = policyId;
		this.coustomerName = coustomerName;
		this.coustomerAddress = coustomerAddress;
		this.contactNumber = contactNumber;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getCoustomerName() {
		return coustomerName;
	}
	public void setCoustomerName(String coustomerName) {
		this.coustomerName = coustomerName;
	}
	public String getCoustomerAddress() {
		return coustomerAddress;
	}
	public void setCoustomerAddress(String coustomerAddress) {
		this.coustomerAddress = coustomerAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	

}
