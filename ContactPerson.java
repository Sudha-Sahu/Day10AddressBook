package com.Bridgelabz.Day10Assignment;
import java.util.*;

public class ContactPerson{
	private String firstName;
	private String lastName;
	private String address;	
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String gmail;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	@Override
	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", gmail=" + gmail
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAddress()="
				+ getAddress() + ", getCity()=" + getCity() + ", getState()=" + getState() + ", getZip()=" + getZip()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getGmail()=" + getGmail() + "]";
	}
}