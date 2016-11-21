package br.iesb.ppc.negocio;

import br.iesb.ppc.dados.AtaDAO;
import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.entidade.Ata;

public class AtaBO implements BO<Ata> {

    public void validar(Ata entidade) throws NegocioException {
        if (entidade.getHoraInicio().isEmpty()) {
            throw new NegocioException("Campo Hora inicio é obrigatório");
        }
        if (entidade.getHoraFim().isEmpty()) {
            throw new NegocioException("Campo Hora Fim é obrigatório");
        }
        if (entidade.getAssunto().isEmpty()) {
            throw new NegocioException("Campo Assunto é obrigatório");
        }
        if (entidade.getSede().isEmpty()) {
            throw new NegocioException("Campo Sede é obrigatório");
        }
        if (entidade.getSala().isEmpty()) {
            throw new NegocioException("Campo Sala é obrigatório");
        }
        if (entidade.getDescricao().isEmpty()) {
            throw new NegocioException("Campo Descriçao é obrigatório");

        }
    }

    public List<Ata> listar() throws NegocioException {
        List<Ata> lista;
        DAO<Ata> dao = new AtaDAO();
        try {
            lista = dao.listar();
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema", e);
        }
        if (lista.size() == 0) {
            throw new NegocioException("Nenhuma Ata encontrada");
        }
        return lista;
    }

    public void inserir(Ata entidade) throws NegocioException {
        // TODO
    }

    public void alterar(Ata entidade) throws NegocioException {
        // TODO
    }

    public void excluir(Ata entidade) throws NegocioException {
        // TODO
    }

    public Ata consultar(int id) throws NegocioException {
        return null;
    }
}
