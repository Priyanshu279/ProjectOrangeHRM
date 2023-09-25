package com.pageactions;

public class BugStrikerLogin {
	
	OrangeHRMLoginPageActions loginBS = new OrangeHRMLoginPageActions();
	
	public void setLoginBS() {
		loginBS.login("Bug Striker","admin123");
		loginBS.setLoingbtn();
	}
	
	public void setLogoutBS() {
		
	}
}
