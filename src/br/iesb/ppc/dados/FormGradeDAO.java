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
        
    }

    public GerenciarGrade consultar(int id) throws DadosException {
        return null;
    }

    public List<GerenciarGrade> listar() throws DadosException {
        List<GerenciarGrade> listar = new ArrayList<GerenciarGrade>();
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            Statement stmt = conexao.createStatement();
            
            
            
            String sql = "select nomeCurso, modalidadeTipo from Curso, Modalidade where Modalidade_id = id_Modalidade";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            int i=0;
            while(rs.next()){
                GerenciarGrade gerenciarGrade = new GerenciarGrade();
                
                
                gerenciarGrade.setNomeCurso(rs.getString(1));
                gerenciarGrade.setModalidadeTipo(rs.getInt(2));
                
                listar.add(i, gerenciarGrade);
                i++;
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
            
            String sql = "select nomeTurma, modalidadeTipo, nomeCurso from Curso, Modalidade, Turma where Modalidade_id = id_Modalidade and Curso_id = id_Curso";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                GerenciarGrade gerenciarGrade = new GerenciarGrade();
                
                gerenciarGrade.setNomeTurma(rs.getString(1));
                gerenciarGrade.setModalidadeTipo(rs.getInt(2));
                gerenciarGrade.setNomeCurso(rs.getString(3));
                
                listarTurma.add(gerenciarGrade);
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return listarTurma;
    }
}
