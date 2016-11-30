package br.iesb.ppc.negocio;

import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.dados.GerenciarGradeDAO;
import br.iesb.ppc.entidade.GerenciarGrade;

public class GerenciarGradeBO implements BO<GerenciarGrade> {
  
    public void validar(GerenciarGrade entidade) throws NegocioException {
        if (entidade.getNomeDisciplina().isEmpty()) {
            throw new NegocioException("Não existe disciplina cadastrada!");
        }
    }

    public List<GerenciarGrade> listar() throws NegocioException {
        List<GerenciarGrade> lista;
        DAO<GerenciarGrade> dao = new GerenciarGradeDAO();
        try {
            lista = dao.listar();
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema", e);
        }
        if (lista.size() == 0) {
            throw new NegocioException("Nenhuma Grade encontrada");
        }
        return lista;
    }
    
    public void inserir(GerenciarGrade entidade) throws NegocioException {
        // TODO
    }
    
    public void alterar(GerenciarGrade entidade) throws NegocioException {
        // TODO
    }
    
    public void excluir(GerenciarGrade entidade) throws NegocioException {
        // TODO
    }
    
    public GerenciarGrade consultar(int id) throws NegocioException {
        return null;
    }
}