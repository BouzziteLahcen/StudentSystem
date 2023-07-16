package com.spring.student.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.spring.student.enums.Gender;

@Entity(name = "Students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private Gender gender;

    private String phone;

    private String age;

    private String address;

    private Date dateCreated;

    private Date dateUpdated;

}