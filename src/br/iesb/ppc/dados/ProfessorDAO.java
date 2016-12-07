package br.iesb.ppc.dados;

import br.iesb.ppc.entidade.Ata;
import br.iesb.ppc.entidade.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class ProfessorDAO implements DAO<Professor> {

    public void inserir(Professor entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();

        try {
            String sql = "insert into professor (nome, cpf, maior_titulacao, formacao_titulacao, curriculo_lattes, atualizacao_curriculo_lates) values (?,?,?,?,?,?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql);

            pstmt.setString(1, entidade.getNome());
            pstmt.setInt(2, entidade.getCpf());
            pstmt.setString(3, entidade.getMaiorTitulacao());
            pstmt.setString(4, entidade.getFormacaoTitulacao());
            pstmt.setString(5, entidade.getCurriculoLates());
            pstmt.setString(6, entidade.getAtualizacaoCurriculo());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new DadosException(e.getMessage());
        }
    }

    public void alterar(Professor entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();

        try {
            String sql = "UPDATE professor SET nome = ?, cpf = ?, maior_titulacao = ?, formacao_titulacao = ?, curriculo_lattes = ?, atualizacao_curriculo_lates = ? WHERE id = ?";

            PreparedStatement pstmt = conexao.prepareStatement(sql);

            pstmt.setString(1, entidade.getNome());
            pstmt.setInt(2, entidade.getCpf());
            pstmt.setString(3, entidade.getMaiorTitulacao());
            pstmt.setString(4, entidade.getFormacaoTitulacao());
            pstmt.setString(5, entidade.getCurriculoLates());
            pstmt.setString(6, entidade.getAtualizacaoCurriculo());
            pstmt.setInt(8, entidade.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
    }

    public void excluir(Professor entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        try {
            String sql = "delete from professor where id = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql);

            pstmt.setInt(1, entidade.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new DadosException(e.getMessage());
        }
    }

    public Professor consultar(int id) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        Professor professor = new Professor();
//`id` INT NOT NULL auto_increment,
//  `nome` VARCHAR(45) NULL,
//  `cpf` INT NULL,
//  `maior_titulacao` VARCHAR(45) NULL,
//  `formacao_titulacao` VARCHAR(45) NULL,
//  `curriculo_lattes` VARCHAR(45) NULL,
//  `atualizacao_curriculo_lates` varchar(100) NULL,
        try {
            Statement stmt = conexao.createStatement();
            String sql = "SELECT id, nome, cpf, maior_titulacao, formacao_titulacao, curriculo_lattes, atualizacao_curriculo_lates FROM professor WHERE id =" + id;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                professor.setId(rs.getInt(1));
                professor.setNome(rs.getString(2));
                professor.setCpf(rs.getInt(3));
                professor.setMaiorTitulacao(rs.getString(4));
                professor.setFormacaoTitulacao(rs.getString(5));
                professor.setCurriculoLates(rs.getString(6));
                
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return professor;
    }

    public List<Professor> listar() throws DadosException {

        List<Professor> lista = new ArrayList<Professor>();
        Connection conexao = ConexaoBD.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select id, nome, cpf, maior_titulacao, formacao_titulacao from professor";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Professor professor = new Professor();
                professor.setId(rs.getInt(1));
                professor.setNome(rs.getString(2));
                professor.setCpf(rs.getInt(3));
                professor.setMaiorTitulacao(rs.getString(4));
                lista.add(professor);
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return lista;
    }

    public List<Professor> listar(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Professor> listarTurma(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Professor> listarSemestre(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Professor> listarGrade(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
