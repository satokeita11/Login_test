package jp.co.aforce.beans;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class LoginAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session = request.getSession();
		String user_login = request.getParameter("user_login");
		String password = request.getParameter("password");
		LoginDAO dao = new LoginDAO();
		Login login = dao.search(user_login, password);
		if (login != null) {
			session.setAttribute("login", login);
			return "jsp/login-out.jsp";
		}
		return "jsp/login-error.jsp";
	}
}