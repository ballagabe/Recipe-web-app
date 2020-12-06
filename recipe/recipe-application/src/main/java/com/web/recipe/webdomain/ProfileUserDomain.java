package com.web.recipe.webdomain;

public class ProfileUserDomain{
	private String username;
	private String nickname;
	private String email;
	private int id;
	public ProfileUserDomain(String username, String nickname, String email, int id) {
		super();
		this.username = username;
		this.nickname = nickname;
		this.email = email;
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public String getNickname() {
		return nickname;
	}
	public String getEmail() {
		return email;
	}
	public int getId() {
		return id;
	}

}