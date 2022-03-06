package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="address_id",unique=true,nullable = false)
private int id;

@Column(name="Street",unique = false,nullable = false)
private String street;

@Column(name="City",unique = false,nullable = false)
private String city;

@OneToOne(mappedBy = "address")
private Student student;





public Address(String street, String city) {
	super();
	this.street = street;
	this.city = city;
}

@Override
public String toString() {
	return "Address [id=" + id + ", street=" + street + ", city=" + city + ", student=" + student + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

}
