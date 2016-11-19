package br.com.providerit.vo;

import java.io.Serializable;

public class TreinoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7813299464081357399L;
	private byte[] imagem;
	private String modeloCarro;
	private String porcentagemDano;
	private boolean existeDano;
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	public String getPorcentagemDano() {
		return porcentagemDano;
	}
	public void setPorcentagemDano(String porcentagemDano) {
		this.porcentagemDano = porcentagemDano;
	}
	public boolean isExisteDano() {
		return existeDano;
	}
	public void setExisteDano(boolean existeDano) {
		this.existeDano = existeDano;
	}
	public TreinoVO(String modeloCarro, String porcentagemDano, boolean existeDano) {
		super();
		this.modeloCarro = modeloCarro;
		this.porcentagemDano = porcentagemDano;
		this.existeDano = existeDano;
	}
	public TreinoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
	
}
