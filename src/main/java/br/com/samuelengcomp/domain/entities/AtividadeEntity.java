package br.com.samuelengcomp.domain.entities;

import java.time.LocalDate;
import java.util.Objects;

public class AtividadeEntity {
	
	
	private Long id;
	
	private LocalDate data;
	
	private String descriminacao;
	
	private TipoAtividadeEntity tipoAtividade;
	
	private FormaDeConexaoEntity formaDeConexao;
	
	private Integer quantidadeParticipantes;
	
	private String tema;
	
	private Integer pontosConectados;
	
	//esse campo deve ser calculado com a hora inicial e a hora final
	private Integer duracao;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtividadeEntity other = (AtividadeEntity) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescriminacao() {
		return descriminacao;
	}

	public void setDescriminacao(String descriminacao) {
		this.descriminacao = descriminacao;
	}

	public TipoAtividadeEntity getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(TipoAtividadeEntity tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public FormaDeConexaoEntity getFormaDeConexao() {
		return formaDeConexao;
	}

	public void setFormaDeConexao(FormaDeConexaoEntity formaDeConexao) {
		this.formaDeConexao = formaDeConexao;
	}

	public Integer getQuantidadeParticipantes() {
		return quantidadeParticipantes;
	}

	public void setQuantidadeParticipantes(Integer quantidadeParticipantes) {
		this.quantidadeParticipantes = quantidadeParticipantes;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Integer getPontosConectados() {
		return pontosConectados;
	}

	public void setPontosConectados(Integer pontosConectados) {
		this.pontosConectados = pontosConectados;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	
	
	

}
