package org.zefiro.cinemaweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zefiro.cenaweb.dao.FilmDao;
import org.zefiro.cinemaweb.model.Film;

/**
 * Servlet implementation class GetInfoFilm
 */
public class GetInfoFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetInfoFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FilmDao dao = new FilmDao();
		String titolo = request.getParameter("titolo");
		
		try {
			Film movie = dao.getFilm(titolo);

			request.setAttribute("film", movie);
			
//			RequestDispatcher rd = request.getRequestDispatcher("infoFile.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("infoFileJstl.jsp");
			rd.forward(request, response);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
