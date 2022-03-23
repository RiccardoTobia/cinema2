package org.zefiro.cenaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.zefiro.cinemaweb.model.Film;

public class FilmDao {

	private final static String CONNECTION_STRING = "jdbc:mysql://localhost:3306/cinema?user=root&password=@First254";
	
	private Connection connection;
	private PreparedStatement getFilmByTitolo;
	
	public Film getFilm(String film) throws ClassNotFoundException {
		Film result = null;
		
		
		try {

			getGetFilmByTitolo().clearParameters();
			getGetFilmByTitolo().setString(1, film);
			ResultSet rs = getGetFilmByTitolo().executeQuery();
			
			if(rs.next()) {
				
				result = new Film();
				
				result.setId(rs.getInt("id"));
				result.setTitolo(rs.getString("titolo"));
				result.setRegista(rs.getString("regista"));
				result.setGenere(rs.getString("genere"));
				result.setPosti(rs.getInt("posti"));
				result.setOraInizio(rs.getTime("oraInizio"));
				result.setImg(rs.getString("img"));
				result.setDescrizione(rs.getString("descrizione"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return result;
	}


	public List<Film> getAll(){
		
		List<Film> result = new ArrayList<Film>();
		
		try {
			ResultSet rs = getConnection().createStatement().executeQuery("select * from film");
			
			while(rs.next()) {
				
				Film l = new Film();
				
				l.setId(rs.getInt("id"));
				l.setTitolo(rs.getString("titolo"));
				l.setRegista(rs.getString("regista"));
				l.setGenere(rs.getString("genere"));
				l.setPosti(rs.getInt("posti"));
				l.setOraInizio(rs.getTime("oraInizio"));
				l.setImg(rs.getString("Img"));
				l.setDescrizione(rs.getString("Descrizione"));
				
				result.add(l);
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}

	
	public Connection getConnection() throws SQLException {
		if(connection == null) {
			connection = DriverManager.getConnection(CONNECTION_STRING);
		}
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public PreparedStatement getGetFilmByTitolo() throws SQLException, ClassNotFoundException {
		if(getFilmByTitolo == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			getFilmByTitolo = getConnection().prepareStatement("select * from film where titolo=?");
		}
		return getFilmByTitolo;
	}

	public void setGetFilmByTitolo(PreparedStatement getFilmByTitolo) {
		this.getFilmByTitolo = getFilmByTitolo;
	}

}
