package br.iesb.ppc.negocio;

import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.dados.PlanoDeEnsinoDAO;
import br.iesb.ppc.entidade.PlanoDeEnsino;
public class PlanoDeEnsinoBO implements BO<PlanoDeEnsino> {
  
    public void validar(PlanoDeEnsino entidade) throws NegocioException {
        if (entidade.getProfessor().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getCurso().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getDisciplina().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getAno() == 0) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getSemestre() == 0) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getAno() < 0) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getSemestre() < 0) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
    }

    public List<PlanoDeEnsino> listar() throws NegocioException {
        List<PlanoDeEnsino> lista;
        DAO<PlanoDeEnsino> dao = new PlanoDeEnsinoDAO();
        try {
            lista = dao.listar();
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema", e);
        }
        if (lista.size() == 0) {
            throw new NegocioException("Nenhum plano de ensino encontrado");
        }
        return lista;
    }
    
    public void inserir(PlanoDeEnsino entidade) throws NegocioException {
        // TODO
    }
    
    public void alterar(PlanoDeEnsino entidade) throws NegocioException {
        // TODO
    }
    
    public void excluir(PlanoDeEnsino entidade) throws NegocioException {
        // TODO
    }
    
    public PlanoDeEnsino consultar(int id) throws NegocioException {
        return null;
    }

    public List<PlanoDeEnsino> listarTurma(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<PlanoDeEnsino> listar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
