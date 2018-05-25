package com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.IEntity;

@Entity(name = "cadastro")
public class Cadastro implements IEntity {
	
	public static final String[] NAMES = new String[] {
			"idServidorPortal",
			"nome",
		    "cpf",
		    "matricula",
		    "descricaoCargo",
		    "classeCargo",
		    "referenciaCargo",
		    "padraoCargo",
		    "nivelCargo",
		    "siglaFuncao",
		    "nivelFuncao",
		    "funcao",
		    "codigoAtividade",
		    "atividade",
		    "opcaoParcial",
		    "codUOrgLotacao",
		    "uOrgLotacao",
		    "codOrgLotacao",
		    "orgLotacao",
		    "codOrgSupLotacao",
		    "orgSupLotacao",
		    "codUOrgExercicio",
		    "uOrgExercicio",
		    "codOrgExercicio",
		    "orgExercicio",
		    "codOrgSupExercicio",
		    "orgSupExercicio",
		    "tipoVinculo",
		    "situacaoVinculo",
		    "dataInicioAfastamento",
		    "dataTerminoAfastamento",
		    "regimeJuridico",
		    "jornadaDeTrabalho",
		    "dataIngressoCargoFuncao",
		    "dataNomeacaoCargoFuncao",
		    "dataIngressoOrgao",
		    "documentoIngressoServicoPublico",
		    "dataDiplomaIngressoServicoPublico",
		    "diplomaIngressoCargoFuncao",
		    "diplomaIngressoOrgao",
		    "diplomaIngressoServicoPublico",
		    "ufExercicio"
	};

	private Long 	idServidorPortal;
	private String 	nome;
	private String 	cpf;
	private String 	matricula;
	private String 	descricaoCargo;
	private String 	classeCargo;
	private String 	referenciaCargo;
	private String 	padraoCargo;
	private String 	nivelCargo;
	private String 	siglaFuncao;
	private String 	nivelFuncao;
	private String 	funcao;
	private String 	codigoAtividade;
	private String 	atividade;
	private String 	opcaoParcial;
	private String 	codUOrgLotacao;
	private String 	uOrgLotacao;
	private String 	codOrgLotacao;
	private String 	orgLotacao;
	private String 	codOrgSupLotacao;
	private String 	orgSupLotacao;
	private String 	codUOrgExercicio;
	private String 	uOrgExercicio;
	private String 	codOrgExercicio;
	private String 	orgExercicio;
	private String 	codOrgSupExercicio;
	private String 	orgSupExercicio;
	private Integer tipoVinculo;
	private String 	situacaoVinculo;
	private String 	dataInicioAfastamento;
	private String 	dataTerminoAfastamento;
	private String 	regimeJuridico;
	private String 	jornadaDeTrabalho;
	private String 	dataIngressoCargoFuncao;
	private String 	dataNomeacaoCargoFuncao;
	private String 	dataIngressoOrgao;
	private String 	documentoIngressoServicoPublico;
	private String 	dataDiplomaIngressoServicoPublico;
	private String 	diplomaIngressoCargoFuncao;
	private String 	diplomaIngressoOrgao;
	private String 	diplomaIngressoServicoPublico;
	private String 	ufExercicio;

	@Id
	@Column(name = "ID_SERVIDOR_PORTAL")
	public Long getIdServidorPortal() {
		return idServidorPortal;
	}

	public void setIdServidorPortal(Long idServidorPortal) {
		this.idServidorPortal = idServidorPortal;
	}

	@Column(name = "NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "MATRICULA")
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Column(name = "DESCRICAO_CARGO")
	public String getDescricaoCargo() {
		return descricaoCargo;
	}

	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}
	
	@Column(name = "CLASSE_CARGO")
	public String getClasseCargo() {
		return classeCargo;
	}

	public void setClasseCargo(String classeCargo) {
		this.classeCargo = classeCargo;
	}

	@Column(name = "REFERENCIA_CARGO")
	public String getReferenciaCargo() {
		return referenciaCargo;
	}

	public void setReferenciaCargo(String referenciaCargo) {
		this.referenciaCargo = referenciaCargo;
	}

	@Column(name = "PADRAO_CARGO")
	public String getPadraoCargo() {
		return padraoCargo;
	}

	public void setPadraoCargo(String padraoCargo) {
		this.padraoCargo = padraoCargo;
	}

	@Column(name = "NIVEL_CARGO")
	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	@Column(name = "SIGLA_FUNCAO")
	public String getSiglaFuncao() {
		return siglaFuncao;
	}

	public void setSiglaFuncao(String siglaFuncao) {
		this.siglaFuncao = siglaFuncao;
	}

	@Column(name = "NIVEL_FUNCAO")
	public String getNivelFuncao() {
		return nivelFuncao;
	}

	public void setNivelFuncao(String nivelFuncao) {
		this.nivelFuncao = nivelFuncao;
	}

	@Column(name = "FUNCAO")
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Column(name = "CODIGO_ATIVIDADE")
	public String getCodigoAtividade() {
		return codigoAtividade;
	}

	public void setCodigoAtividade(String codigoAtividade) {
		this.codigoAtividade = codigoAtividade;
	}

	@Column(name = "ATIVIDADE")
	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	@Column(name = "OPCAO_PARCIAL")
	public String getOpcaoParcial() {
		return opcaoParcial;
	}

	public void setOpcaoParcial(String opcaoParcial) {
		this.opcaoParcial = opcaoParcial;
	}

	@Column(name = "COD_UORG_LOTACAO")
	public String getCodUOrgLotacao() {
		return codUOrgLotacao;
	}

	public void setCodUOrgLotacao(String codUOrgLotacao) {
		this.codUOrgLotacao = codUOrgLotacao;
	}

	@Column(name = "UORG_LOTACAO")
	public String getuOrgLotacao() {
		return uOrgLotacao;
	}

	public void setuOrgLotacao(String uOrgLotacao) {
		this.uOrgLotacao = uOrgLotacao;
	}

	@Column(name = "COD_ORG_LOTACAO")
	public String getCodOrgLotacao() {
		return codOrgLotacao;
	}

	public void setCodOrgLotacao(String codOrgLotacao) {
		this.codOrgLotacao = codOrgLotacao;
	}

	@Column(name = "ORG_LOTACAO")
	public String getOrgLotacao() {
		return orgLotacao;
	}

	public void setOrgLotacao(String orgLotacao) {
		this.orgLotacao = orgLotacao;
	}

	@Column(name = "COD_ORGSUP_LOTACAO")
	public String getCodOrgSupLotacao() {
		return codOrgSupLotacao;
	}

	public void setCodOrgSupLotacao(String codOrgSupLotacao) {
		this.codOrgSupLotacao = codOrgSupLotacao;
	}

	@Column(name = "ORGSUP_LOTACAO")
	public String getOrgSupLotacao() {
		return orgSupLotacao;
	}

	public void setOrgSupLotacao(String orgSupLotacao) {
		this.orgSupLotacao = orgSupLotacao;
	}

	@Column(name = "COD_UORG_EXERCICIO")
	public String getCodUOrgExercicio() {
		return codUOrgExercicio;
	}

	public void setCodUOrgExercicio(String codUOrgExercicio) {
		this.codUOrgExercicio = codUOrgExercicio;
	}

	@Column(name = "UORG_EXERCICIO")
	public String getuOrgExercicio() {
		return uOrgExercicio;
	}

	public void setuOrgExercicio(String uOrgExercicio) {
		this.uOrgExercicio = uOrgExercicio;
	}

	@Column(name = "COD_ORG_EXERCICIO")
	public String getCodOrgExercicio() {
		return codOrgExercicio;
	}

	public void setCodOrgExercicio(String codOrgExercicio) {
		this.codOrgExercicio = codOrgExercicio;
	}

	@Column(name = "ORG_EXERCICIO")
	public String getOrgExercicio() {
		return orgExercicio;
	}

	public void setOrgExercicio(String orgExercicio) {
		this.orgExercicio = orgExercicio;
	}

	@Column(name = "COD_ORGSUP_EXERCICIO")
	public String getCodOrgSupExercicio() {
		return codOrgSupExercicio;
	}

	public void setCodOrgSupExercicio(String codOrgSupExercicio) {
		this.codOrgSupExercicio = codOrgSupExercicio;
	}

	@Column(name = "ORGSUP_EXERCICIO")
	public String getOrgSupExercicio() {
		return orgSupExercicio;
	}

	public void setOrgSupExercicio(String orgSupExercicio) {
		this.orgSupExercicio = orgSupExercicio;
	}

	@Column(name = "TIPO_VINCULO")
	public Integer getTipoVinculo() {
		return tipoVinculo;
	}

	public void setTipoVinculo(Integer tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	@Column(name = "SITUACAO_VINCULO")
	public String getSituacaoVinculo() {
		return situacaoVinculo;
	}

	public void setSituacaoVinculo(String situacaoVinculo) {
		this.situacaoVinculo = situacaoVinculo;
	}

	@Column(name = "DATA_INICIO_AFASTAMENTO")
	public String getDataInicioAfastamento() {
		return dataInicioAfastamento;
	}

	public void setDataInicioAfastamento(String dataInicioAfastamento) {
		this.dataInicioAfastamento = dataInicioAfastamento;
	}

	@Column(name = "DATA_TERMINO_AFASTAMENTO")
	public String getDataTerminoAfastamento() {
		return dataTerminoAfastamento;
	}

	public void setDataTerminoAfastamento(String dataTerminoAfastamento) {
		this.dataTerminoAfastamento = dataTerminoAfastamento;
	}

	@Column(name = "REGIME_JURIDICO")
	public String getRegimeJuridico() {
		return regimeJuridico;
	}

	public void setRegimeJuridico(String regimeJuridico) {
		this.regimeJuridico = regimeJuridico;
	}

	@Column(name = "JORNADA_DE_TRABALHO")
	public String getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}

	public void setJornadaDeTrabalho(String jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}

	@Column(name = "DATA_INGRESSO_CARGOFUNCAO")
	public String getDataIngressoCargoFuncao() {
		return dataIngressoCargoFuncao;
	}

	public void setDataIngressoCargoFuncao(String dataIngressoCargoFuncao) {
		this.dataIngressoCargoFuncao = dataIngressoCargoFuncao;
	}

	@Column(name = "DATA_NOMEACAO_CARGOFUNCAO")
	public String getDataNomeacaoCargoFuncao() {
		return dataNomeacaoCargoFuncao;
	}

	public void setDataNomeacaoCargoFuncao(String dataNomeacaoCargoFuncao) {
		this.dataNomeacaoCargoFuncao = dataNomeacaoCargoFuncao;
	}

	@Column(name = "DATA_INGRESSO_ORGAO")
	public String getDataIngressoOrgao() {
		return dataIngressoOrgao;
	}

	public void setDataIngressoOrgao(String dataIngressoOrgao) {
		this.dataIngressoOrgao = dataIngressoOrgao;
	}

	@Column(name = "DOCUMENTO_INGRESSO_SERVICOPUBLICO")
	public String getDocumentoIngressoServicoPublico() {
		return documentoIngressoServicoPublico;
	}

	public void setDocumentoIngressoServicoPublico(String documentoIngressoServicoPublico) {
		this.documentoIngressoServicoPublico = documentoIngressoServicoPublico;
	}

	@Column(name = "DATA_DIPLOMA_INGRESSO_SERVICOPUBLICO")
	public String getDataDiplomaIngressoServicoPublico() {
		return dataDiplomaIngressoServicoPublico;
	}

	public void setDataDiplomaIngressoServicoPublico(String dataDiplomaIngressoServicoPublico) {
		this.dataDiplomaIngressoServicoPublico = dataDiplomaIngressoServicoPublico;
	}

	@Column(name = "DIPLOMA_INGRESSO_CARGOFUNCAO")
	public String getDiplomaIngressoCargoFuncao() {
		return diplomaIngressoCargoFuncao;
	}

	public void setDiplomaIngressoCargoFuncao(String diplomaIngressoCargoFuncao) {
		this.diplomaIngressoCargoFuncao = diplomaIngressoCargoFuncao;
	}

	@Column(name = "DIPLOMA_INGRESSO_ORGAO")
	public String getDiplomaIngressoOrgao() {
		return diplomaIngressoOrgao;
	}

	public void setDiplomaIngressoOrgao(String diplomaIngressoOrgao) {
		this.diplomaIngressoOrgao = diplomaIngressoOrgao;
	}

	@Column(name = "DIPLOMA_INGRESSO_SERVICOPUBLICO")
	public String getDiplomaIngressoServicoPublico() {
		return diplomaIngressoServicoPublico;
	}

	public void setDiplomaIngressoServicoPublico(String diplomaIngressoServicoPublico) {
		this.diplomaIngressoServicoPublico = diplomaIngressoServicoPublico;
	}

	@Column(name = "UF_EXERCICIO")
	public String getUfExercicio() {
		return ufExercicio;
	}

	public void setUfExercicio(String ufExercicio) {
		this.ufExercicio = ufExercicio;
	}

	@Override
	public String toString() {
		return "Cadastro [idServidorPortal=" + idServidorPortal + ", nome=" + nome + ", cpf=" + cpf + ", matricula="
				+ matricula + ", descricaoCargo=" + descricaoCargo + ", classeCargo=" + classeCargo
				+ ", referenciaCargo=" + referenciaCargo + ", padraoCargo=" + padraoCargo + ", nivelCargo=" + nivelCargo
				+ ", siglaFuncao=" + siglaFuncao + ", nivelFuncao=" + nivelFuncao + ", funcao=" + funcao
				+ ", codigoAtividade=" + codigoAtividade + ", atividade=" + atividade + ", opcaoParcial=" + opcaoParcial
				+ ", codUOrgLotacao=" + codUOrgLotacao + ", uOrgLotacao=" + uOrgLotacao + ", codOrgLotacao="
				+ codOrgLotacao + ", orgLotacao=" + orgLotacao + ", codOrgSupLotacao=" + codOrgSupLotacao
				+ ", orgSupLotacao=" + orgSupLotacao + ", codUOrgExercicio=" + codUOrgExercicio + ", uOrgExercicio="
				+ uOrgExercicio + ", codOrgExercicio=" + codOrgExercicio + ", orgExercicio=" + orgExercicio
				+ ", codOrgSupExercicio=" + codOrgSupExercicio + ", orgSupExercicio=" + orgSupExercicio
				+ ", tipoVinculo=" + tipoVinculo + ", situacaoVinculo=" + situacaoVinculo + ", dataInicioAfastamento="
				+ dataInicioAfastamento + ", dataTerminoAfastamento=" + dataTerminoAfastamento + ", regimeJuridico="
				+ regimeJuridico + ", jornadaDeTrabalho=" + jornadaDeTrabalho + ", dataIngressoCargoFuncao="
				+ dataIngressoCargoFuncao + ", dataNomeacaoCargoFuncao=" + dataNomeacaoCargoFuncao
				+ ", dataIngressoOrgao=" + dataIngressoOrgao + ", documentoIngressoServicoPublico="
				+ documentoIngressoServicoPublico + ", dataDiplomaIngressoServicoPublico="
				+ dataDiplomaIngressoServicoPublico + ", diplomaIngressoCargoFuncao=" + diplomaIngressoCargoFuncao
				+ ", diplomaIngressoOrgao=" + diplomaIngressoOrgao + ", diplomaIngressoServicoPublico="
				+ diplomaIngressoServicoPublico + ", ufExercicio=" + ufExercicio + "]";
	}

	@Override
	public boolean validate() {
		return true;
	}

}