package com.spring.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.spring.student.enums.Gender;

@Entity(name = "Students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
 
	@Column(name = "fullName")
    private String fullName;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
    private Gender gender;

	@Column(name = "phone")
    private String phone;

	@Column(name = "age")
    private String age;

	@Column(name = "address")
    private String address;

    @CreationTimestamp
    @Column(name = "dateCreated")
    private Date dateCreated;

    @UpdateTimestamp
    @Column(name = "dateUpdated")
    private Date dateUpdated;

    public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String fullName, Gender gender, String phone, String age, String address, Date dateCreated,
			Date dateUpdated) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
		this.address = address;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	public Student(String fullName, Gender gender, String phone, String age, String address, Date dateCreated,
			Date dateUpdated) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
		this.address = address;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
    
    
}