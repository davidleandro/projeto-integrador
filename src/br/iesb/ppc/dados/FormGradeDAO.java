package br.iesb.ppc.dados;

import br.iesb.ppc.entidade.GerenciarGrade;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class FormGradeDAO implements DAO<GerenciarGrade>  {

    public void inserir(GerenciarGrade entidade) throws DadosException {
        // TODO
    }

    public void alterar(GerenciarGrade entidade) throws DadosException {
        // TODO
    }

    public void excluir(GerenciarGrade entidade) throws DadosException {
        // TODO
    }

    public GerenciarGrade consultar(int id) throws DadosException {
        return null;
    }

    public List<GerenciarGrade> listar() throws DadosException {
        List<GerenciarGrade> listar = new ArrayList<GerenciarGrade>();
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            Statement stmt = conexao.createStatement();
            
            GerenciarGrade gerenciarGrade = new GerenciarGrade();
            int modalidade = gerenciarGrade.getModalidadeTipo(); //codigo precisa de substituir
            
            String sql = "select * from Curso, Modalidade, Turma where Curso_id = id_Curso and Modalidade_id = id_Modalidade and modalidadeTipo = " + modalidade +"";

            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                listar = (List<GerenciarGrade>) rs.getArray("nomeCurso");
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return listar;
    }
    public List<GerenciarGrade> listarTurma() throws DadosException {
        List<GerenciarGrade> listarTurma = new ArrayList<GerenciarGrade>();
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            Statement stmt = conexao.createStatement();
            
            GerenciarGrade gerenciarGrade = new GerenciarGrade();
            int modalidade = gerenciarGrade.getModalidadeTipo();
            String curso = gerenciarGrade.getNomeCurso();
            
            String sql = "select * from Curso, Modalidade, Turma where Curso_id = id_Curso and Modalidade_id = id_Modalidade and modalidadeTipo = " + modalidade +" and nomeCurso = "+ curso +"";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                listarTurma = (List<GerenciarGrade>) rs.getArray("nomeTurma");
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return listarTurma;
    }
}
