package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delController")
public class RemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 BookingController controller = new BookingController();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mobile = request.getParameter("mobile");
		int result =controller.removeBooking(mobile);
		if (result == 1) {
			response.sendRedirect("loginCon");
		} else {
			String msg = "Delete Unsuccessfully";
			request.setAttribute("message", msg);
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
			response.sendRedirect("loginCon");
		}
	}

}