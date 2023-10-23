package com.infinite.VizagMuncipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Users")
public class Muncipal {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="userName")
	@NotEmpty(message="userName is mandatory..!")
	private String userName;
	@Column(name="password")
	@NotEmpty(message="Password is mandatory..!")
	@Size(min=8,message="This field should be atleast 8 characters" )
	private String password;

	public Muncipal() {

	}

	public Muncipal(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
