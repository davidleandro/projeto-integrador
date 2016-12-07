package br.iesb.ppc.negocio;

import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.dados.GradeDAO;
import br.iesb.ppc.entidade.GerenciarGrade;

public class GradeBO implements BO<GerenciarGrade> {
    
    public void validar(GerenciarGrade entidade) throws NegocioException {
        if(entidade.getModalidadeTipo() == 0){
            throw new NegocioException("Modalidade não marcada!");
        }
        if(entidade.getIdCurso() == 0){
            throw new NegocioException("Nenhum Curso selecionado!");
        }
        if (entidade.getIdTurma() == 0){
            throw new NegocioException("Nenhuma Turma selecionada!");
        }
        if(entidade.getQuantidadeSemestre() == 0){
            throw new NegocioException("Nenhuma Semestre selecionada!");
        }
        if(entidade.getIdGrade() == 0){
            throw new NegocioException("Nenhuma Turma selecionada!");
        }
    }

    public List<GerenciarGrade> listar() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<GerenciarGrade> listarTurma(int id) throws NegocioException {
        List<GerenciarGrade> lista;
        DAO<GerenciarGrade> dao = new GradeDAO();
        
        try {
            lista = dao.listarTurma(id);
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema!", e);
        }
        if (lista.isEmpty()) {
            throw new NegocioException("Nenhum Turma encontrada!");
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

    public List<GerenciarGrade> listar(int id) throws NegocioException {
        List<GerenciarGrade> lista;
        DAO<GerenciarGrade> dao = new GradeDAO();
        try {
            lista = dao.listar(id);
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema!", e);
        }
        if (lista.isEmpty()) {
            throw new NegocioException("Nenhum Curso encontrada!");
        }
        return lista;
    }

    public List<GerenciarGrade> listarSemestre(int id) throws NegocioException {
        List<GerenciarGrade> listaSemestre;
        DAO<GerenciarGrade> dao = new GradeDAO();
        try {
            listaSemestre = dao.listarSemestre(id);
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema!", e);
        }
        if (listaSemestre.isEmpty()) {
            throw new NegocioException("Nenhum Semestre encontrado!");
        }
        return listaSemestre;
    }

    public List<GerenciarGrade> listarGrade(int id) throws NegocioException {
        List<GerenciarGrade> listaGrade;
        DAO<GerenciarGrade> dao = new GradeDAO();
        try {
            listaGrade = dao.listarGrade(id);
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema!", e);
        }
        if (listaGrade.isEmpty()) {
            throw new NegocioException("Nenhum Grade encontrada!");
        }
        return listaGrade;
    }
}