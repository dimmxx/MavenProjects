package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DogController;
import model.Dog;

public class DogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DogServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DogController controller = new DogController();
		Dog dog = controller.getDog();
		request.setAttribute("dog", dog);
		RequestDispatcher rd=
				request.getRequestDispatcher("dogview.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
