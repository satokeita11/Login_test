package jp.co.aforce.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO extends DAO {
	public Login search(String user_login, String password)
			throws Exception {
		Login login = null;
		Connection con = getConnection();
		PreparedStatement st;
		st = con.prepareStatement("select * from login where user_login = ? and password = ?");
		st.setString(1, user_login);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			login = new Login();
			login.setUser_login(rs.getString("user_login"));
			login.setPassword(rs.getString("password"));
		}
		st.close();
		con.close();
		return login;
	}
}