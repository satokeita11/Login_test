package jp.co.aforce.beans;

public class Login implements java.io.Serializable {

	private String user_login;
	private String password;

	public String getUser_login() {
		return user_login;
	}

	public String getPassword() {
		return password;
	}

	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}