package br.iesb.ppc.dados;

import br.iesb.ppc.entidade.GerenciarGrade;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<GerenciarGrade> listarTurma(int id) throws DadosException {
        List<GerenciarGrade> listarTurma = new ArrayList<GerenciarGrade>();
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "select nomeTurma, id_Turma from Curso, Turma where id_Curso = ? and id_Curso = Curso_id";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                GerenciarGrade gerenciarGrade = new GerenciarGrade();
                
                gerenciarGrade.setNomeTurma(rs.getString(1));
                gerenciarGrade.setIdTurma(rs.getInt(2));
                
                listarTurma.add(gerenciarGrade);
            }
            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return listarTurma;
    }

    public List<GerenciarGrade> listar(int id) throws DadosException {
        List<GerenciarGrade> listar = new ArrayList<GerenciarGrade>();
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "select nomeCurso, modalidadeTipo, id_Curso from Curso, Modalidade where Modalidade_id = id_Modalidade and modalidadeTipo = ? ";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);

            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                GerenciarGrade gerenciarGrade = new GerenciarGrade();
                
                gerenciarGrade.setNomeCurso(rs.getString(1));
                gerenciarGrade.setModalidadeTipo(rs.getInt(2));
                gerenciarGrade.setIdCurso(rs.getInt(3));

                listar.add(gerenciarGrade);
            }
            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return listar;
    }
}
