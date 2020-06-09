package com.pomodoro_login.entity;

public enum Role {
	
	USER(1),
	ADMIN(2);
	
	private int roleId;

	Role(int num) {
		this.roleId = num;
	}

	public int getRoleId() {
		return roleId;
	}	

}
