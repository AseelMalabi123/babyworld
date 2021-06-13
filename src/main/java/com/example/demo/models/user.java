package com.example.demo.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity(name="user")
@Table(name="users")
@JsonIgnoreProperties(ignoreUnknown = true)
public class user implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String email;
	@Column
	private String password;
	public user() {}
	
	public user( String fname, String lname, String email, String password) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

