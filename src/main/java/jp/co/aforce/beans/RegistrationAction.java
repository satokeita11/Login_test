package jp.co.aforce.beans;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		return "jsp/registration-in.jsp";
	}

}
