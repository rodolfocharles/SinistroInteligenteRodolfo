package br.com.providerit.vo;

import java.io.Serializable;
import java.util.Date;

public class LogVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8310280383096085124L;
	private Long id;
	private Date hora;
	private String comentario;
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LogVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LogVo(Long id, Date hora, String comentario) {
		super();
		this.id = id;
		this.hora = hora;
		this.comentario = comentario;
	}
	public LogVo(Date hora, String comentario) {
		super();
		this.hora = hora;
		this.comentario = comentario;
	}
	
	
}
