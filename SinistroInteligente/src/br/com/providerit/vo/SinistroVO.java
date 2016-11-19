package br.com.providerit.vo;

import java.io.Serializable;
import java.util.List;

public class SinistroVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1976205393109064181L;
	private Long id;
	private VeiculoVO veiculo;
	List<TipoSinistroVO> tiposSinistro;
	List<LogVo> logs;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public VeiculoVO getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(VeiculoVO veiculo) {
		this.veiculo = veiculo;
	}
	public List<TipoSinistroVO> getTiposSinistro() {
		return tiposSinistro;
	}
	public void setTiposSinistro(List<TipoSinistroVO> tiposSinistro) {
		this.tiposSinistro = tiposSinistro;
	}
	public List<LogVo> getLogs() {
		return logs;
	}
	public void setLogs(List<LogVo> logs) {
		this.logs = logs;
	}
	
}
