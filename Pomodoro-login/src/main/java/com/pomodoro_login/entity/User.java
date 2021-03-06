package com.pomodoro_login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	@Enumerated(EnumType.ORDINAL)
	private Role role;
	
	@Column
	@Enumerated(EnumType.ORDINAL)
	private Status accStatus;
	
	public User() {}
	
	public User(String username, String password
			, String email, Role role, Status accStatus) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.accStatus = accStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	public Status getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(Status accStatus) {
		this.accStatus = accStatus;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", role="
				+ role + ", accStatus=" + accStatus + "]";
	}
	
}
