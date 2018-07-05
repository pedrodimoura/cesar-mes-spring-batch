package com.github.pedrodimoura.cesarmesspringbatch.model.dao.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.github.pedrodimoura.cesarmesspringbatch.model.dao.IDAO;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Remuneracao;

@Repository
public class RemuneracaoDAO implements IDAO<Remuneracao> {

	private static final String INSERT_STATEMENT = "INSERT INTO remuneracao (ano, mes, id_servidor_portal, cpf, nome, remuneracao_basica_bruta_rs, remuneracao_basica_bruta_us, abate_teto_rs, abate_teto_us, gratificacao_natalina_rs, gratificacao_natalina_us, abate_teto_da_gratificacao_natalina_rs, abate_teto_da_gratificacao_natalina_us, ferias_rs, ferias_us, outras_remuneracoes_eventuais_rs, outras_remuneracoes_eventuais_us, irrf_rs, irrf_us, pss_rpgs_rs, pss_rpgs_us, demais_deducoes_rs, demais_deducoes_us, pensao_militar_rs, pensao_militar_us, fundo_de_saude_rs, fundo_de_saude_us, taxa_de_ocupacao_imovel_funcional_rs, taxa_de_ocupacao_imovel_funcional_us, remuneracao_apos_deducoes_obrigatorias_rs, remuneracao_apos_deducoes_obrigatorias_us, verbas_indenizatorias_rspc_rs, verbas_indenizatorias_rspc_us, verbas_indenizatorias_rspm_rs, verbas_indenizatorias_rspm_us, verbas_indenizatorias_pdv_mp_rs, verbas_indenizatorias_pdv_mp_us, total_de_verbas_indenizatorias_rs, total_de_verbas_indenizatorias_us) "
			+ "VALUES "
			+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void save(Remuneracao t) {
		
		Query query = entityManager.createNativeQuery(INSERT_STATEMENT);
		query.setFlushMode(FlushModeType.COMMIT);

		query.setParameter(1, t.getAno());
		query.setParameter(2, t.getMes());
		query.setParameter(3, (Long) t.getIdServidorPortal());
		query.setParameter(4, t.getCpf());
		query.setParameter(5, t.getNome());
		query.setParameter(6, t.getRemuneracaoBasicaBrutaRs());
		query.setParameter(7, t.getRemuneracaoBasicaBrutaUs());
		query.setParameter(8, t.getAbateTetoRs());
		query.setParameter(9, t.getAbateTetoUs());
		query.setParameter(10, t.getGratificacaoNatalinaRs());
		query.setParameter(11, t.getGratificacaoNatalinaUs());
		query.setParameter(12, t.getAbateTetoDaGratificacaoNatalinaRs());
		query.setParameter(13, t.getAbateTetoDaGratificacaoNatalinaUs());
		query.setParameter(14, t.getFeriasRs());
		query.setParameter(15, t.getFeriasUs());
		query.setParameter(16, t.getOutrasRemuneracoesEventuaisRs());
		query.setParameter(17, t.getOutrasRemuneracoesEventuaisUs());
		query.setParameter(18, t.getIrrfRs());
		query.setParameter(19, t.getIrrfUs());
		query.setParameter(20, t.getPssRpgsRs());
		query.setParameter(21, t.getPssRpgsUs());
		query.setParameter(22, t.getDemaisDeducoesRs());
		query.setParameter(23, t.getDemaisDeducoesUs());
		query.setParameter(24, t.getPensaoMilitarRs());
		query.setParameter(25, t.getPensaoMilitarUs());
		query.setParameter(26, t.getFundoDeSaudeRs());
		query.setParameter(27, t.getFundoDeSaudeUs());
		query.setParameter(28, t.getTaxaDeOcupacaoImovelFuncionalRs());
		query.setParameter(29, t.getTaxaDeOcupacaoImovelFuncionalUs());
		query.setParameter(30, t.getRemuneracaoAposDeducoesObrigatoriasRs());
		query.setParameter(31, t.getRemuneracaoAposDeducoesObrigatoriasUs());
		query.setParameter(32, t.getVerbasIndenizatoriasRESDPCRs());
		query.setParameter(33, t.getVerbasIndenizatoriasRESDPCUs());
		query.setParameter(34, t.getVerbasIndenizatoriasRESDPMRs());
		query.setParameter(35, t.getVerbasIndenizatoriasRESDPMUs());
		query.setParameter(36, t.getVerbasIndenizatoriasPDVMp7922017Rs());
		query.setParameter(37, t.getVerbasIndenizatoriasPDVMp7922017Us());
		query.setParameter(38, t.getTotalDeVerbasIndenizatoriasRs());
		query.setParameter(39, t.getTotalDeVerbasIndenizatoriasUs());
		
		query.executeUpdate();

	}

	@Override
	public void saveAll(List<? extends Remuneracao> collection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Remuneracao t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Remuneracao t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Collection<Remuneracao> collection) {
		// TODO Auto-generated method stub

	}

	@Override
	public Remuneracao findById(Remuneracao t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Remuneracao> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
