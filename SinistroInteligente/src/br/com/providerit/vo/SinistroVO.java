package br.com.providerit.vo;

import java.util.List;

public class SinistroVO {

	private long id;
	private VeiculoVO veiculo;
	List<TipoSinistroVO> tiposSinistro;
	List<LogVo> logs;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
