package br.com.etechoracio.avalicao.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import br.com.etechoracio.avalicao.business.*;
import br.com.etechoracio.avaliacao.dao.CadastroDAO;
import br.com.etechoracio.avaliacao.model.Avaliacao;

@Service
public class CadastroSB {
	private CadastroDAO cadastroDAO;

	@Override
	protected void postConstructImpl() {
		cadastroDAO = getDAO(CadastroDAO.class);

	}


	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Avaliacao> findAll() {
		return cadastroDAO.findAll();
	}

}
