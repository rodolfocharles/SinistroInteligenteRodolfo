package br.com.providerit.vo;

public class TipoSinistroVO {

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
