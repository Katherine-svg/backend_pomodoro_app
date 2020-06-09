package com.pomodoro_login.entity;

public enum Status {
	
	ACTIVE(1),
	DISABLED(2);
	
	private int roleId;

	Status(int num) {
		this.roleId = num;
	}

	public int getRoleId() {
		return roleId;
	}	

}
