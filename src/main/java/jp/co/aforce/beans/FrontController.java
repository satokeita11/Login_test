package jp.co.aforce.beans;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "*.action" })

public class FrontController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			String path = request.getServletPath().substring(1);

			if (path.endsWith(".action")) {
				String name = path.replace(".a", "A").replace('/', '.');
				String fullClassName = "jp.co.aforce.beans." + name;
				Action action = (Action) Class.forName(fullClassName).getDeclaredConstructor().newInstance();
				String url = action.execute(request, response);
				request.getRequestDispatcher(url).forward(request, response);
			} else if (path.endsWith(".logout")) {
				LogoutAction logoutAction = new LogoutAction();
				String url = logoutAction.execute(request, response);
				request.getRequestDispatcher(url).forward(request, response);
			} else if (path.endsWith(".registration")) {
				// リクエストが ".registration" で終わる場合は、直接 registration.jsp にフォワードする
				request.getRequestDispatcher("jsp/registration.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
