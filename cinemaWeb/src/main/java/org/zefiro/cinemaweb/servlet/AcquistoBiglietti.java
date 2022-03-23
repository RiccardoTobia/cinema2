package org.zefiro.cinemaweb.servlet;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AcquistoBiglietti
 */
public class AcquistoBiglietti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcquistoBiglietti() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String orario = request.getParameter("ora");
		String posti = request.getParameter("posti");
		String pagina = "";
		
		int numeroPosti = Integer.parseInt(posti);
		
		LocalTime ora = LocalTime.parse(orario);
		LocalTime adesso = LocalTime.now();
		
		if(numeroPosti > 0 &&
		   ora.isAfter(adesso)) {
			pagina = "AcquistoBiglietti.jsp";
			
		} else {
			if(numeroPosti == 0) {
				pagina = "PostiFiniti.jsp";
			} else {
				pagina = "filmPassato.jsp";				
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher(pagina);		
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
