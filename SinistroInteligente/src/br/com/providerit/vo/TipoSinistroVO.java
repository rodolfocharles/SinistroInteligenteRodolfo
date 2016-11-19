package br.com.providerit.vo;

import java.io.Serializable;

public class TipoSinistroVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3022559759776188779L;
	private Long id;
	private String tipo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public TipoSinistroVO(Long id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}
	public TipoSinistroVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
