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
        // TODO
    }

    public void excluir(ReferenciaBibliografica entidade) throws DadosException {
        // TODO
    }

    public ReferenciaBibliografica consultar(int id) throws DadosException {
        return null;
    }

    public List<ReferenciaBibliografica> listar() throws DadosException {

        List<ReferenciaBibliografica> lista = new ArrayList<ReferenciaBibliografica>();
        Connection conexao = ConexaoBD.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select * from referencia_bibliografica";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                ReferenciaBibliografica referencia_bibliografica = new ReferenciaBibliografica();
                referencia_bibliografica.setAutor(rs.getString(1));
                referencia_bibliografica.setTitulo(rs.getString(2));
                referencia_bibliografica.setEditora(rs.getString(3));
                referencia_bibliografica.setAno(rs.getString(4));
                referencia_bibliografica.setQuantidade(rs.getString(5));
                lista.add(referencia_bibliografica);
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return lista;
    }

}
