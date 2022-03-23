package org.zefiro.cinemaweb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zefiro.cenaweb.dao.FilmDao;
import org.zefiro.cinemaweb.model.Film;

/**
 * Servlet implementation class GetTuttiFilm
 */
public class GetTuttiFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTuttiFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		FilmDao dao = new FilmDao();
		
		List<Film> result = new ArrayList<Film>();
		
		result = dao.getAll();
		
		request.setAttribute("list", result);

//		RequestDispatcher rd = request.getRequestDispatcher("listaFilm.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("listaFilmJstl.jsp");

		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
