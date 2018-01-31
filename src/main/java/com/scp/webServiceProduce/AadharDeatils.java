package com.scp.webServiceProduce;

public class AadharDeatils {
	int id;
	String name;
	String uid;
	Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AadharDeatils [id=" + id + ", name=" + name + ", uid=" + uid + ", address=" + address + "]";
	}

	public AadharDeatils(int id, String name, String uid, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.uid = uid;
		this.address = address;
	}
}

class Address {
	String street;
	String city;
	String state;
	int pincode;

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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	public Address(String street, String city, String state, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

}