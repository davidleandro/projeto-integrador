package br.iesb.ppc.negocio;

import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.dados.FormGradeDAO;
import br.iesb.ppc.entidade.GerenciarGrade;

public class FormGradeBO implements BO<GerenciarGrade> {
  
    public void validar(GerenciarGrade entidade) throws NegocioException {
        if(entidade.getModalidadeTipo() == 0){
            throw new NegocioException("Modalidade não marcada!");
        }
        if(entidade.getNomeCurso().isEmpty()){
            throw new NegocioException("Não existe Curso cadastrada!");
        }
        if (entidade.getNomeTurma().isEmpty()){
            throw new NegocioException("Não existe Turma cadastrada!");
        }
    }

    public List<GerenciarGrade> listar() throws NegocioException {
        List<GerenciarGrade> lista;
        DAO<GerenciarGrade> dao = new FormGradeDAO();
        try {
            lista = dao.listar();
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema!", e);
        }
        if (lista.isEmpty()) {
            throw new NegocioException("Nenhum Curso encontrada!");
        }
        return lista;
    }
    
    public List<GerenciarGrade> listarTurma() throws NegocioException {
        List<GerenciarGrade> lista;
        DAO<GerenciarGrade> dao = new FormGradeDAO();
        
        try {
            lista = dao.listarTurma();
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema!", e);
        }
        if (lista.isEmpty()) {
            throw new NegocioException("Nenhum Turma encontrada!");
        }
        return listarTurma();
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