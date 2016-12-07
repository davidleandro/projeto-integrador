package br.iesb.ppc.negocio;

import br.iesb.ppc.dados.AtaDAO;
import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.dados.ProfessorDAO;
import br.iesb.ppc.entidade.Professor;

public class ProfessorBO implements BO<Professor> {

    public void validar(Professor entidade) throws NegocioException {
        if (entidade.getNome().isEmpty()) {
            throw new NegocioException("Campo Nome inicio é obrigatório");
        }
        if (entidade.getAtualizacaoCurriculo().isEmpty()) {
            throw new NegocioException("Campo Data de atualizacao do curriculo obrigatorio");
        }
        if (entidade.getCurriculoLates().isEmpty()) {
            throw new NegocioException("Campo Curriculo Lattes é obrigatório");
        }
        if (entidade.getFormacaoTitulacao().isEmpty()) {
            throw new NegocioException("Campo Formaçao obrigatorio");
        }
        if (entidade.getMaiorTitulacao().isEmpty()) {
            throw new NegocioException("Campo Maior titulacao é obrigatório");
        }
    }

    public List<Professor> listar() throws NegocioException {
        List<Professor> lista;
        DAO<Professor> dao = new ProfessorDAO();
        try {
            lista = dao.listar();
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema", e);
        }
        if (lista.size() == 0) {
            throw new NegocioException("Nenhum Professor encontrado");
        }
        return lista;
    }

    public void inserir(Professor entidade) throws NegocioException {
        DAO<Professor> dao = new ProfessorDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException e) {
            System.out.println(e.getMessage());
            throw new NegocioException("Erro no sistema", e);
        }
    }

    public void alterar(Professor entidade) throws NegocioException {
        DAO<Professor> dao = new ProfessorDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException e) {
            System.out.println(e.getMessage());
            throw new NegocioException("Erro ao alterar", e);
        }
    }

    public void excluir(Professor entidade) throws NegocioException {
        DAO<Professor> dao = new ProfessorDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException e) {
            System.out.println(e.getMessage());
            throw new NegocioException("Erro ao excluir", e);
        }
    }

    public Professor consultar(int id) throws NegocioException {
        DAO<Professor> dao = new ProfessorDAO();
        Professor professor;
        try {
            professor = dao.consultar(id);
        } catch (DadosException e) {
            System.out.println(e.getMessage());
            throw new NegocioException("Erro ao consultar", e);
        }
        return professor;
    }

    public List<Professor> listar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Professor> listarTurma(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Professor> listarSemestre(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Professor> listarGrade(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
