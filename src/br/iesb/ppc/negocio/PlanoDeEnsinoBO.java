package br.iesb.ppc.negocio;

import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.dados.PlanoDeEnsinoDAO;
import br.iesb.ppc.entidade.PlanoDeEnsino;
public class PlanoDeEnsinoBO implements BO<PlanoDeEnsino> {
  
    public void validar(PlanoDeEnsino entidade) throws NegocioException {
        if (entidade.getCurso().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getDisciplina().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getAno() ==0) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        
        if (entidade.getSemestre() == 0) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getCargaHoraria() .isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        if (entidade.getProfessor().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        
        if (entidade.getEmenta().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        
        if (entidade.getCompetencias().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        
        if (entidade.getMetodologia().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        
        if (entidade.getCronograma().isEmpty()) {
            throw new NegocioException("Todos os campos são obrigatórios");
        }
        
        if (entidade.getAvaliacao().isEmpty()) {
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
        DAO<PlanoDeEnsino> dao = new PlanoDeEnsinoDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException e) {
            throw new NegocioException("Erro ao inserir", e);
        }
    }
    
    
    public void alterar(PlanoDeEnsino entidade) throws NegocioException {
        DAO<PlanoDeEnsino> dao = new PlanoDeEnsinoDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException e) {
            throw new NegocioException("Erro ao alterar", e);
        }
    }
    
    public void excluir(PlanoDeEnsino entidade) throws NegocioException {
        DAO<PlanoDeEnsino> dao = new PlanoDeEnsinoDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException e) {
            throw new NegocioException("Erro ao excluir", e);
        }
    }
    
    public PlanoDeEnsino consultar(int id) throws NegocioException {
        DAO<PlanoDeEnsino> dao = new PlanoDeEnsinoDAO();
        PlanoDeEnsino plano_ensino;
        
        try {
            plano_ensino = dao.consultar(id);
        } catch (DadosException e) {
            throw new NegocioException("Erro na consulta", e);
        }
        return plano_ensino;
    }

    public List<PlanoDeEnsino> listarTurma() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlanoDeEnsino> listarTurma(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlanoDeEnsino> listar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
