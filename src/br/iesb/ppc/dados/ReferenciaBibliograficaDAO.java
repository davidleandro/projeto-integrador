package br.iesb.ppc.dados;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import br.iesb.ppc.entidade.ReferenciaBibliografica;
import java.sql.PreparedStatement;

public class ReferenciaBibliograficaDAO implements DAO<ReferenciaBibliografica>  {

    public void inserir(ReferenciaBibliografica entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "INSERT INTO referencia_bibliografica(autor, titulo, editora, ano, quantidade) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setString(1, entidade.getAutor());
            pstmt.setString(2, entidade.getTitulo());
            pstmt.setString(3, entidade.getEditora());
            pstmt.setString(4, entidade.getAno());
            pstmt.setString(5, entidade.getQuantidade());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
    }

    public void alterar(ReferenciaBibliografica entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "UPDATE referencia_bibliografica SET autor = ?', titulo = ?, editora = ?, ano = ?, quantidade = ? WHERE id = ?";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setString(1, entidade.getAutor());
            pstmt.setString(2, entidade.getTitulo());
            pstmt.setString(3, entidade.getEditora());
            pstmt.setString(4, entidade.getAno());
            pstmt.setString(5, entidade.getQuantidade());
            pstmt.setInt(6, entidade.getID());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
    }

    public void excluir(ReferenciaBibliografica entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "DELETE FROM referencia_bibliografica WHERE id = ?";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setInt(1, entidade.getID());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
    }

    public ReferenciaBibliografica consultar(int id) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        ReferenciaBibliografica referencia_bibliografica = new ReferenciaBibliografica();
        
        try {
            Statement stmt = conexao.createStatement();
            String sql = "SELECT id, autor, titulo, editora, ano, quantidade FROM referencia_bibliografica WHERE id =" + id;
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                referencia_bibliografica.setID(rs.getInt(1));
                referencia_bibliografica.setAutor(rs.getString(2));
                referencia_bibliografica.setTitulo(rs.getString(3));
                referencia_bibliografica.setEditora(rs.getString(4));
                referencia_bibliografica.setAno(rs.getString(5));
                referencia_bibliografica.setQuantidade(rs.getString(6));
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return referencia_bibliografica;
    }

    public List<ReferenciaBibliografica> listar() throws DadosException {

        List<ReferenciaBibliografica> lista = new ArrayList<ReferenciaBibliografica>();
        Connection conexao = ConexaoBD.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "SELECT id, autor, titulo, editora, ano, quantidade FROM referencia_bibliografica";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                ReferenciaBibliografica referencia_bibliografica = new ReferenciaBibliografica();
                referencia_bibliografica.setID(rs.getInt(1));
                referencia_bibliografica.setAutor(rs.getString(2));
                referencia_bibliografica.setTitulo(rs.getString(3));
                referencia_bibliografica.setEditora(rs.getString(4));
                referencia_bibliografica.setAno(rs.getString(5));
                referencia_bibliografica.setQuantidade(rs.getString(6));
                lista.add(referencia_bibliografica);
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return lista;
    }

    public List<ReferenciaBibliografica> listarTurma() throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ReferenciaBibliografica> listar(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ReferenciaBibliografica> listarTurma(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
