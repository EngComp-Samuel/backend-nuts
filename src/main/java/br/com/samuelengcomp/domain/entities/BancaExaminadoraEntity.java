package br.com.samuelengcomp.domain.entities;

import java.math.BigDecimal;
import java.util.List;

public class BancaExaminadoraEntity extends AtividadeEntity{
	
	private TipoDeBancaExaminadoraEntity tipoDeBanca;
	
	private Origem origemDaBanca;
	
	private List<InstituicaoParticipanteEntity> instituicoesParticipantes;
	
	private String localizacaoDoEstudante;
	
	private Integer numeroDePontosExternos;
	
	private Integer numeroDePassagens;
	
	//se não inserir valor, assumir 100 reias
	private BigDecimal valorIda;
	
	//se não inserir valor, assumir 100 reias
	private BigDecimal valorVolta;
	
	//se não inserir valor, assumir 100 reias
	private BigDecimal diarias;
	
	//aqui sera transiente, esse valor sera calculado
	private BigDecimal total;
	

}
