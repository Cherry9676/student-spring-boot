package com.Student.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rollNO;

	@Column(nullable = false)
	private String sname;

	@Column(nullable = false)
	private int year;

	@Column(nullable = false)
	private String branch;

	@Column(name = "date_of_joining")
	private LocalDate dateOfJoining;

	@Column(nullable = false, length = 10)
	private String phoneNumber;

	// Default constructor
	public Student() {
	}

	// Parameterized constructor
	public Student(Long rollNO, String sname, int year, String branch, LocalDate dateOfJoining, String phoneNumber) {
		this.rollNO = rollNO;
		this.sname = sname;
		this.year = year;
		this.branch = branch;
		this.dateOfJoining = dateOfJoining;
		this.phoneNumber = phoneNumber;
	}

	// Getters and Setters
	public Long getRollNO() {
		return rollNO;
	}

	public void setRollNO(Long rollNO) {
		this.rollNO = rollNO;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", sname=" + sname + ", year=" + year + ", branch=" + branch
				+ ", dateOfJoining=" + dateOfJoining + ", phoneNumber=" + phoneNumber + "]";
	}
}
