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
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

@Repository
public class CadastroDAO implements IDAO<Cadastro> {

	private static final String INSERT_STATEMENT = "INSERT INTO cadastro (id_servidor_portal, nome, cpf, matricula, descricao_cargo, classe_cargo, referencia_cargo, padrao_cargo, nivel_cargo, sigla_funcao, nivel_funcao, funcao, codigo_atividade, atividade, opcao_parcial, cod_uorg_lotacao, uorg_lotacao, cod_org_lotacao, org_lotacao, cod_orgsup_lotacao, orgsup_lotacao, cod_uorg_exercicio, uorg_exercicio, cod_org_exercicio, org_exercicio, cod_orgsup_exercicio, orgsup_exercicio, tipo_vinculo, situacao_vinculo, data_inicio_afastamento, data_termino_afastamento, regime_juridico, jornada_de_trabalho, data_ingresso_cargofuncao, data_nomeacao_cargofuncao, data_ingresso_orgao, documento_ingresso_servicopublico, data_diploma_ingresso_servicopublico, diploma_ingresso_cargofuncao, diploma_ingresso_orgao, diploma_ingresso_servicopublico, uf_exercicio) "
			+ "VALUES "
			+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void save(Cadastro cadastro) {
		
		Query query = entityManager.createNativeQuery(INSERT_STATEMENT);
		query.setFlushMode(FlushModeType.COMMIT);
		
		query.setParameter(1, cadastro.getIdServidorPortal());
		query.setParameter(2, cadastro.getNome());
		query.setParameter(3, cadastro.getCpf());
		query.setParameter(4, cadastro.getMatricula());
		query.setParameter(5, cadastro.getDescricaoCargo());
		query.setParameter(6, cadastro.getClasseCargo());
		query.setParameter(7, cadastro.getReferenciaCargo());
		query.setParameter(8, cadastro.getPadraoCargo());
		query.setParameter(9, cadastro.getNivelCargo());
		query.setParameter(10, cadastro.getSiglaFuncao());
		query.setParameter(11, cadastro.getNivelFuncao());
		query.setParameter(12, cadastro.getFuncao());
		query.setParameter(13, cadastro.getCodigoAtividade());
		query.setParameter(14, cadastro.getAtividade());
		query.setParameter(15, cadastro.getOpcaoParcial());
		query.setParameter(16, cadastro.getCodUOrgLotacao());
		query.setParameter(17, cadastro.getuOrgLotacao());
		query.setParameter(18, cadastro.getCodOrgLotacao());
		query.setParameter(19, cadastro.getOrgLotacao());
		query.setParameter(20, cadastro.getCodOrgSupLotacao());
		query.setParameter(21, cadastro.getOrgSupLotacao());
		query.setParameter(22, cadastro.getCodUOrgExercicio());
		query.setParameter(23, cadastro.getuOrgExercicio());
		query.setParameter(24, cadastro.getCodOrgExercicio());
		query.setParameter(25, cadastro.getOrgExercicio());
		query.setParameter(26, cadastro.getCodOrgSupExercicio());
		query.setParameter(27, cadastro.getOrgSupExercicio());
		query.setParameter(28, cadastro.getTipoVinculo());
		query.setParameter(29, cadastro.getSituacaoVinculo());
		query.setParameter(30, cadastro.getDataInicioAfastamento());
		query.setParameter(31, cadastro.getDataTerminoAfastamento());
		query.setParameter(32, cadastro.getRegimeJuridico());
		query.setParameter(33, cadastro.getJornadaDeTrabalho());
		query.setParameter(34, cadastro.getDataIngressoCargoFuncao());
		query.setParameter(35, cadastro.getDataNomeacaoCargoFuncao());
		query.setParameter(36, cadastro.getDataIngressoOrgao());
		query.setParameter(37, cadastro.getDocumentoIngressoServicoPublico());
		query.setParameter(38, cadastro.getDataDiplomaIngressoServicoPublico());
		query.setParameter(39, cadastro.getDiplomaIngressoCargoFuncao());
		query.setParameter(40, cadastro.getDiplomaIngressoOrgao());
		query.setParameter(41, cadastro.getDiplomaIngressoServicoPublico());
		query.setParameter(42, cadastro.getUfExercicio());

		query.executeUpdate();
		
	}

	@Override
	public void saveAll(List<? extends Cadastro> collection) {

	}

	@Override
	public void update(Cadastro t) {

	}

	@Override
	public void delete(Cadastro t) {
		
	}

	@Override
	public void deleteAll(Collection<Cadastro> collection) {
		
	}

	@Override
	public Cadastro findById(Cadastro t) {
		return null;
	}

	@Override
	public Iterator<Cadastro> findAll() {
		return null;
	}

}
