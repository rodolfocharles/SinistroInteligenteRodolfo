package br.com.providerit.vo;

public class VeiculoVO {

	private Long id;
	private String placa;
	private String modelo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public VeiculoVO(Long id, String placa, String modelo) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
	}
	public VeiculoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
