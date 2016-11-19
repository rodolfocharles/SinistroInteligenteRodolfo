package br.com.providerit.vo;

public class TipoSinistroVO {

	private long id;
	private String tipo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public TipoSinistroVO(long id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}
	public TipoSinistroVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
