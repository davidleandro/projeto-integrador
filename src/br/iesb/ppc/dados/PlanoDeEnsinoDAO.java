package br.iesb.ppc.dados;

import br.iesb.ppc.entidade.PlanoDeEnsino;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;

public class PlanoDeEnsinoDAO implements DAO<PlanoDeEnsino>  {

    public void inserir(PlanoDeEnsino entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "INSERT INTO plano_ensino(curso, disciplina, ano, semestre, carga_horaria_semanal, "
                    + "professor, ementa, competencias, metodologia, cronograma, avaliacao) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setString(1, entidade.getCurso());
            pstmt.setString(2, entidade.getDisciplina());
            pstmt.setInt(3, entidade.getAno());
            pstmt.setInt(4, entidade.getSemestre());
            pstmt.setString(5, entidade.getCargaHoraria());
            pstmt.setString(6, entidade.getProfessor());
            pstmt.setString(7, entidade.getEmenta());
            pstmt.setString(8, entidade.getCompetencias());
            pstmt.setString(9, entidade.getMetodologia());
            pstmt.setString(10, entidade.getCronograma());
            pstmt.setString(11, entidade.getAvaliacao()); 

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("erro ao inserir" + e.getMessage());
            throw new DadosException(e.getMessage());
        }
    }

    public void alterar(PlanoDeEnsino entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "UPDATE plano_ensino SET curso = ?, disciplina = ?, ano = ?, semestre = ?, "
                    + "carga_horaria_semanal = ?, professor = ?, ementa = ?, competencias = ?, "
                    + "metodologia = ?, cronograma = ?, avaliacao = ? WHERE id = ?";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setString(1, entidade.getCurso());
            pstmt.setString(2, entidade.getDisciplina());
            pstmt.setInt(3, entidade.getAno());
            pstmt.setInt(4, entidade.getSemestre());
            pstmt.setString(5, entidade.getCargaHoraria());
            pstmt.setString(6, entidade.getProfessor());
            pstmt.setString(7, entidade.getEmenta());
            pstmt.setString(8, entidade.getCompetencias());
            pstmt.setString(9, entidade.getMetodologia());
            pstmt.setString(10, entidade.getCronograma());
            pstmt.setString(11, entidade.getAvaliacao()); 
            pstmt.setInt(12, entidade.getID()); 

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
    }

    public void excluir(PlanoDeEnsino entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "DELETE FROM plano_ensino WHERE id = ?";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setInt(1, entidade.getID());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
    }

    public PlanoDeEnsino consultar(int id) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        PlanoDeEnsino plano_ensino = new PlanoDeEnsino();
        
        try {
            Statement stmt = conexao.createStatement();
            String sql = "SELECT id, curso, disciplina, ano, semestre, carga_horaria_semanal, professor, "
                    + "ementa, competencias, metodologia, cronograma, avaliacao FROM plano_ensino WHERE id =" + id;
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                plano_ensino.setID(rs.getInt(1));
                plano_ensino.setCurso(rs.getString(2));
                plano_ensino.setDisciplina(rs.getString(3));
                plano_ensino.setAno(rs.getInt(4));
                plano_ensino.setSemestre(rs.getInt(5));
                plano_ensino.setCargaHoraria(rs.getString(6));
                plano_ensino.setProfessor(rs.getString(7));
                plano_ensino.setEmenta(rs.getString(8));
                plano_ensino.setCompetencias(rs.getString(9));
                plano_ensino.setMetodologia(rs.getString(10));
                plano_ensino.setCronograma(rs.getString(11));
                plano_ensino.setAvaliacao(rs.getString(12));
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return plano_ensino;
    }

    public List<PlanoDeEnsino> listar() throws DadosException {
        
        List<PlanoDeEnsino> lista = new ArrayList<PlanoDeEnsino>();
        Connection conexao = ConexaoBD.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select id, curso, disciplina, professor, ano, semestre from plano_ensino";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                PlanoDeEnsino plano_ensino = new PlanoDeEnsino();
                
                plano_ensino.setID(rs.getInt(1));
                plano_ensino.setCurso(rs.getString(2));
                plano_ensino.setDisciplina(rs.getString(3));
                plano_ensino.setProfessor(rs.getString(4));
                plano_ensino.setAno(rs.getInt(5));
                plano_ensino.setSemestre(rs.getInt(6));
                lista.add(plano_ensino);
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return lista;
    }

    /*@Override*/
    public List<PlanoDeEnsino> listarTurma() throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlanoDeEnsino> listarTurma(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlanoDeEnsino> listar(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlanoDeEnsino> listarSemestre(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlanoDeEnsino> listarGrade(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
