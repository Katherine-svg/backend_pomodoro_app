package com.pomodoro_login.entity;

public enum Role {
	
	USER(1),
	ADMIN(2);
	
	private int statusId;

	Role(int num) {
		this.statusId = num;
	}

	public int getStatusId() {
		return statusId;
	}	

}
