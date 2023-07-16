package com.spring.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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

}