package com.web.recipe.webdomain;

public class UpdateProfileDomain{
	private String username;
	private String oldnickname;
	private String nickname;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOldnickname() {
		return oldnickname;
	}
	public void setOldnickname(String oldnickname) {
		this.oldnickname = oldnickname;
	}
}