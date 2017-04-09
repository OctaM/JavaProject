package ro.unitbv.invoicemanagement.model;

import java.time.LocalDateTime;

public class User {
	private String username;
	private String password;
	private LocalDateTime joinDate;

	public User(String usUsername, String usPassword) {
		username = usUsername;
		password = usPassword;
		joinDate = LocalDateTime.now();
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

	public LocalDateTime getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDateTime joinDate) {
		this.joinDate = joinDate;
	}
}
