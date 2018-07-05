package com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "remuneracao")
public class Remuneracao {

	public static final String[] NAMES = new String[] { "ano", "mes", "idServidorPortal", "cpf", "nome",
			"remuneracaoBasicaBrutaRs", "remuneracaoBasicaBrutaUs", "abateTetoRs", "abateTetoUs",
			"gratificacaoNatalinaRs", "gratificacaoNatalinaUs", "abateTetoDaGratificacaoNatalinaRs",
			"abateTetoDaGratificacaoNatalinaUs", "feriasRs", "feriasUs", "outrasRemuneracoesEventuaisRs",
			"outrasRemuneracoesEventuaisUs", "irrfRs", "irrfUs", "pss/RpgsRs", "pss/RpgsUs", "demaisDeducoesRs",
			"demaisDeducoesUs", "pensaoMilitarRs", "pensaoMilitarUs", "fundoDeSaudeRs", "fundoDeSaudeUs",
			"taxaDeOcupacaoImovelFuncionalRs", "taxaDeOcupacaoImovelFuncionalUs",
			"remuneracaoAposDeducoesObrigatoriasRs", "remuneracaoAposDeducoesObrigatoriasUs",
			"verbasIndenizatoriasRESDPCRs", "verbasIndenizatoriasRESDPCUs", "verbasIndenizatoriasRESDPMRs",
			"verbasIndenizatoriasRESDPMUs", "verbasIndenizatoriasPDVMp7922017Rs", "verbasIndenizatoriasPDVMp7922017Us",
			"totalDeVerbasIndenizatoriasRs", "totalDeVerbasIndenizatoriasUs" };

	private String ano;
	private String mes;
	private Long idServidorPortal;
	private String cpf;
	private String nome;
	private String remuneracaoBasicaBrutaRs;
	private String remuneracaoBasicaBrutaUs;
	private String abateTetoRs;
	private String abateTetoUs;
	private String gratificacaoNatalinaRs;
	private String gratificacaoNatalinaUs;
	private String abateTetoDaGratificacaoNatalinaRs;
	private String abateTetoDaGratificacaoNatalinaUs;
	private String feriasRs;
	private String feriasUs;
	private String outrasRemuneracoesEventuaisRs;
	private String outrasRemuneracoesEventuaisUs;
	private String irrfRs;
	private String irrfUs;
	private String pssRpgsRs;
	private String pssRpgsUs;
	private String demaisDeducoesRs;
	private String demaisDeducoesUs;
	private String pensaoMilitarRs;
	private String pensaoMilitarUs;
	private String fundoDeSaudeRs;
	private String fundoDeSaudeUs;
	private String taxaDeOcupacaoImovelFuncionalRs;
	private String taxaDeOcupacaoImovelFuncionalUs;
	private String remuneracaoAposDeducoesObrigatoriasRs;
	private String remuneracaoAposDeducoesObrigatoriasUs;
	private String verbasIndenizatoriasRESDPCRs;
	private String verbasIndenizatoriasRESDPCUs;
	private String verbasIndenizatoriasRESDPMRs;
	private String verbasIndenizatoriasRESDPMUs;
	private String verbasIndenizatoriasPDVMp7922017Rs;
	private String verbasIndenizatoriasPDVMp7922017Us;
	private String totalDeVerbasIndenizatoriasRs;
	private String totalDeVerbasIndenizatoriasUs;
	
	@Column(name = "ANO")
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Column(name = "MES")
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Id
	@Column(name = "ID_SERVIDOR_PORTAL")
	public Long getIdServidorPortal() {
		return idServidorPortal;
	}

	public void setIdServidorPortal(Long idServidorPortal) {
		this.idServidorPortal = idServidorPortal;
	}

	@Column(name = "CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "REMUNERACAO_BASICA_BRUTA_RS")
	public String getRemuneracaoBasicaBrutaRs() {
		return remuneracaoBasicaBrutaRs;
	}

	public void setRemuneracaoBasicaBrutaRs(String remuneracaoBasicaBrutaRs) {
		this.remuneracaoBasicaBrutaRs = remuneracaoBasicaBrutaRs;
	}

	@Column(name = "REMUNERACAO_BASICA_BRUTA_US")
	public String getRemuneracaoBasicaBrutaUs() {
		return remuneracaoBasicaBrutaUs;
	}

	public void setRemuneracaoBasicaBrutaUs(String remuneracaoBasicaBrutaUs) {
		this.remuneracaoBasicaBrutaUs = remuneracaoBasicaBrutaUs;
	}

	@Column(name = "ABATE_TETO_RS")
	public String getAbateTetoRs() {
		return abateTetoRs;
	}

	public void setAbateTetoRs(String abateTetoRs) {
		this.abateTetoRs = abateTetoRs;
	}

	@Column(name = "ABATE_TETO_US")
	public String getAbateTetoUs() {
		return abateTetoUs;
	}

	public void setAbateTetoUs(String abateTetoUs) {
		this.abateTetoUs = abateTetoUs;
	}

	@Column(name = "GRATIFICACAO_NATALINA_RS")
	public String getGratificacaoNatalinaRs() {
		return gratificacaoNatalinaRs;
	}

	public void setGratificacaoNatalinaRs(String gratificacaoNatalinaRs) {
		this.gratificacaoNatalinaRs = gratificacaoNatalinaRs;
	}

	@Column(name = "GRATIFICACAO_NATALINA_US")
	public String getGratificacaoNatalinaUs() {
		return gratificacaoNatalinaUs;
	}

	public void setGratificacaoNatalinaUs(String gratificacaoNatalinaUs) {
		this.gratificacaoNatalinaUs = gratificacaoNatalinaUs;
	}

	@Column(name = "ABATE_TETO_DA_GRATIFICACAO_NATALINA_RS")
	public String getAbateTetoDaGratificacaoNatalinaRs() {
		return abateTetoDaGratificacaoNatalinaRs;
	}

	public void setAbateTetoDaGratificacaoNatalinaRs(String abateTetoDaGratificacaoNatalinaRs) {
		this.abateTetoDaGratificacaoNatalinaRs = abateTetoDaGratificacaoNatalinaRs;
	}

	@Column(name = "ABATE_TETO_DA_GRATIFICACAO_NATALINA_US")
	public String getAbateTetoDaGratificacaoNatalinaUs() {
		return abateTetoDaGratificacaoNatalinaUs;
	}

	public void setAbateTetoDaGratificacaoNatalinaUs(String abateTetoDaGratificacaoNatalinaUs) {
		this.abateTetoDaGratificacaoNatalinaUs = abateTetoDaGratificacaoNatalinaUs;
	}

	@Column(name = "FERIAS_RS")
	public String getFeriasRs() {
		return feriasRs;
	}

	public void setFeriasRs(String feriasRs) {
		this.feriasRs = feriasRs;
	}

	@Column(name = "FERIAS_US")
	public String getFeriasUs() {
		return feriasUs;
	}

	public void setFeriasUs(String feriasUs) {
		this.feriasUs = feriasUs;
	}

	@Column(name = "OUTRAS_REMUNERACOES_EVENTUAIS_RS")
	public String getOutrasRemuneracoesEventuaisRs() {
		return outrasRemuneracoesEventuaisRs;
	}

	public void setOutrasRemuneracoesEventuaisRs(String outrasRemuneracoesEventuaisRs) {
		this.outrasRemuneracoesEventuaisRs = outrasRemuneracoesEventuaisRs;
	}

	@Column(name = "OUTRAS_REMUNERACOES_EVENTUAIS_US")
	public String getOutrasRemuneracoesEventuaisUs() {
		return outrasRemuneracoesEventuaisUs;
	}

	public void setOutrasRemuneracoesEventuaisUs(String outrasRemuneracoesEventuaisUs) {
		this.outrasRemuneracoesEventuaisUs = outrasRemuneracoesEventuaisUs;
	}

	@Column(name = "IRRF_RS")
	public String getIrrfRs() {
		return irrfRs;
	}

	public void setIrrfRs(String irrfRs) {
		this.irrfRs = irrfRs;
	}

	@Column(name = "IRRF_US")
	public String getIrrfUs() {
		return irrfUs;
	}

	public void setIrrfUs(String irrfUs) {
		this.irrfUs = irrfUs;
	}

	@Column(name = "PSS_RPGS_RS")
	public String getPssRpgsRs() {
		return pssRpgsRs;
	}

	public void setPssRpgsRs(String pssRpgsRs) {
		this.pssRpgsRs = pssRpgsRs;
	}

	@Column(name = "PSS_RPGS_US")
	public String getPssRpgsUs() {
		return pssRpgsUs;
	}

	public void setPssRpgsUs(String pssRpgsUs) {
		this.pssRpgsUs = pssRpgsUs;
	}

	@Column(name = "DEMAIS_DEDUCOES_RS")
	public String getDemaisDeducoesRs() {
		return demaisDeducoesRs;
	}

	public void setDemaisDeducoesRs(String demaisDeducoesRs) {
		this.demaisDeducoesRs = demaisDeducoesRs;
	}

	@Column(name = "DEMAIS_DEDUCOES_US")
	public String getDemaisDeducoesUs() {
		return demaisDeducoesUs;
	}

	public void setDemaisDeducoesUs(String demaisDeducoesUs) {
		this.demaisDeducoesUs = demaisDeducoesUs;
	}

	@Column(name = "PENSAO_MILITAR_RS")
	public String getPensaoMilitarRs() {
		return pensaoMilitarRs;
	}

	public void setPensaoMilitarRs(String pensaoMilitarRs) {
		this.pensaoMilitarRs = pensaoMilitarRs;
	}

	@Column(name = "PENSAO_MILITAR_US")
	public String getPensaoMilitarUs() {
		return pensaoMilitarUs;
	}

	public void setPensaoMilitarUs(String pensaoMilitarUs) {
		this.pensaoMilitarUs = pensaoMilitarUs;
	}

	@Column(name = "FUNDO_DE_SAUDE_RS")
	public String getFundoDeSaudeRs() {
		return fundoDeSaudeRs;
	}

	public void setFundoDeSaudeRs(String fundoDeSaudeRs) {
		this.fundoDeSaudeRs = fundoDeSaudeRs;
	}

	public String getFundoDeSaudeUs() {
		return fundoDeSaudeUs;
	}

	@Column(name = "FUNDO_DE_SAUDE_US")
	public void setFundoDeSaudeUs(String fundoDeSaudeUs) {
		this.fundoDeSaudeUs = fundoDeSaudeUs;
	}

	@Column(name = "TAXA_DE_OCUPACAO_IMOVEL_FUNCIONAL_RS")
	public String getTaxaDeOcupacaoImovelFuncionalRs() {
		return taxaDeOcupacaoImovelFuncionalRs;
	}

	public void setTaxaDeOcupacaoImovelFuncionalRs(String taxaDeOcupacaoImovelFuncionalRs) {
		this.taxaDeOcupacaoImovelFuncionalRs = taxaDeOcupacaoImovelFuncionalRs;
	}

	@Column(name = "TAXA_DE_OCUPACAO_IMOVEL_FUNCIONAL_US")
	public String getTaxaDeOcupacaoImovelFuncionalUs() {
		return taxaDeOcupacaoImovelFuncionalUs;
	}

	public void setTaxaDeOcupacaoImovelFuncionalUs(String taxaDeOcupacaoImovelFuncionalUs) {
		this.taxaDeOcupacaoImovelFuncionalUs = taxaDeOcupacaoImovelFuncionalUs;
	}

	@Column(name = "REMUNERACAO_APOS_DEDUCOES_OBRIGATORIAS_RS")
	public String getRemuneracaoAposDeducoesObrigatoriasRs() {
		return remuneracaoAposDeducoesObrigatoriasRs;
	}

	public void setRemuneracaoAposDeducoesObrigatoriasRs(String remuneracaoAposDeducoesObrigatoriasRs) {
		this.remuneracaoAposDeducoesObrigatoriasRs = remuneracaoAposDeducoesObrigatoriasRs;
	}

	@Column(name = "REMUNERACAO_APOS_DEDUCOES_OBRIGATORIAS_US")
	public String getRemuneracaoAposDeducoesObrigatoriasUs() {
		return remuneracaoAposDeducoesObrigatoriasUs;
	}

	public void setRemuneracaoAposDeducoesObrigatoriasUs(String remuneracaoAposDeducoesObrigatoriasUs) {
		this.remuneracaoAposDeducoesObrigatoriasUs = remuneracaoAposDeducoesObrigatoriasUs;
	}

	@Column(name = "VERBAS_INDENIZATORIAS_RSPC_RS")
	public String getVerbasIndenizatoriasRESDPCRs() {
		return verbasIndenizatoriasRESDPCRs;
	}

	public void setVerbasIndenizatoriasRESDPCRs(String verbasIndenizatoriasRESDPCRs) {
		this.verbasIndenizatoriasRESDPCRs = verbasIndenizatoriasRESDPCRs;
	}

	@Column(name = "VERBAS_INDENIZATORIAS_RSPC_US")
	public String getVerbasIndenizatoriasRESDPCUs() {
		return verbasIndenizatoriasRESDPCUs;
	}

	public void setVerbasIndenizatoriasRESDPCUs(String verbasIndenizatoriasRESDPCUs) {
		this.verbasIndenizatoriasRESDPCUs = verbasIndenizatoriasRESDPCUs;
	}
	@Column(name = "VERBAS_INDENIZATORIAS_RSPM_RS")
	public String getVerbasIndenizatoriasRESDPMRs() {
		return verbasIndenizatoriasRESDPMRs;
	}

	public void setVerbasIndenizatoriasRESDPMRs(String verbasIndenizatoriasRESDPMRs) {
		this.verbasIndenizatoriasRESDPMRs = verbasIndenizatoriasRESDPMRs;
	}
	@Column(name = "VERBAS_INDENIZATORIAS_RSPM_US")
	public String getVerbasIndenizatoriasRESDPMUs() {
		return verbasIndenizatoriasRESDPMUs;
	}

	public void setVerbasIndenizatoriasRESDPMUs(String verbasIndenizatoriasRESDPMUs) {
		this.verbasIndenizatoriasRESDPMUs = verbasIndenizatoriasRESDPMUs;
	}

	@Column(name = "VERBAS_INDENIZATORIAS_PDV_MP_RS")
	public String getVerbasIndenizatoriasPDVMp7922017Rs() {
		return verbasIndenizatoriasPDVMp7922017Rs;
	}

	public void setVerbasIndenizatoriasPDVMp7922017Rs(String verbasIndenizatoriasPDVMp7922017Rs) {
		this.verbasIndenizatoriasPDVMp7922017Rs = verbasIndenizatoriasPDVMp7922017Rs;
	}

	@Column(name = "VERBAS_INDENIZATORIAS_PDV_MP_US")
	public String getVerbasIndenizatoriasPDVMp7922017Us() {
		return verbasIndenizatoriasPDVMp7922017Us;
	}

	public void setVerbasIndenizatoriasPDVMp7922017Us(String verbasIndenizatoriasPDVMp7922017Us) {
		this.verbasIndenizatoriasPDVMp7922017Us = verbasIndenizatoriasPDVMp7922017Us;
	}

	@Column(name = "TOTAL_DE_VERBAS_INDENIZATORIAS_RS")
	public String getTotalDeVerbasIndenizatoriasRs() {
		return totalDeVerbasIndenizatoriasRs;
	}

	public void setTotalDeVerbasIndenizatoriasRs(String totalDeVerbasIndenizatoriasRs) {
		this.totalDeVerbasIndenizatoriasRs = totalDeVerbasIndenizatoriasRs;
	}

	@Column(name = "TOTAL_DE_VERBAS_INDENIZATORIAS_US")
	public String getTotalDeVerbasIndenizatoriasUs() {
		return totalDeVerbasIndenizatoriasUs;
	}

	public void setTotalDeVerbasIndenizatoriasUs(String totalDeVerbasIndenizatoriasUs) {
		this.totalDeVerbasIndenizatoriasUs = totalDeVerbasIndenizatoriasUs;
	}

}
