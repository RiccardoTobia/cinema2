package org.zefiro.cinemaweb.model;

import java.sql.Time;

public class Film {
	private int id;
	private String titolo;
	private String regista;
	private String genere;
	private int posti;
	private Time oraInizio;
	private String img;
	private String descrizione;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public int getPosti() {
		return posti;
	}
	public void setPosti(int posti) {
		this.posti = posti;
	}
	public Time getOraInizio() {
		return oraInizio;
	}
	public void setOraInizio(Time oraInizio) {
		this.oraInizio = oraInizio;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getTitolo());
		sb.append(" di ");
		sb.append(getRegista());
		sb.append(" ");
		sb.append(getOraInizio());
		return super.toString();
	}
	
	
}
