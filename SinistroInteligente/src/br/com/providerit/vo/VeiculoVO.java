package br.com.providerit.vo;

public class VeiculoVO {

	private long id;
	private String placa;
	private String modelo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public VeiculoVO(long id, String placa, String modelo) {
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
