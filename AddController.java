package controller;

import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addCon")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AccountController controller = new AccountController();
		String name = request.getParameter("name");
		String mobileno = request.getParameter("mobile");
		Date date = request.getParameter("date");
		String seatno== request.getParameter("seatno");
		controller.addBooking(name, mobile, date, seatno);

		response.sendRedirect("loginCon");
	}

}