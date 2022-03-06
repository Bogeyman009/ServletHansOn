package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Student",uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "Email")
})
public class Student {
	@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(name="ID",unique = true,nullable = false)
private int id;

@Column(name="Name",unique = false,nullable = false,length = 50)
private String name;

@Column(name="Email",unique = true,nullable = false,length = 50)
private String email;

@OneToOne
@JoinColumn(name="address_id")
private Address address;


public int getId() {
	return id;
}

public Student(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

}
