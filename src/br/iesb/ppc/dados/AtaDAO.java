package br.iesb.ppc.dados;

import br.iesb.ppc.entidade.Ata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class AtaDAO implements DAO<Ata> {

    public void inserir(Ata entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        
        try {
            String sql = "INSERT INTO ata(data, horaInicio, horaFim, assunto, sede, sala, descricao) VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setString(1, entidade.getData());
            pstmt.setString(2, entidade.getHoraInicio());
            pstmt.setString(3, entidade.getHoraFim());
            pstmt.setString(4, entidade.getAssunto());
            pstmt.setString(5, entidade.getSede());
            pstmt.setString(6, entidade.getSala());
            pstmt.setString(7, entidade.getDescricao());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new DadosException(e.getMessage());
        }
    }

    public void alterar(Ata entidade) throws DadosException {
        // TODO
    }

    public void excluir(Ata entidade) throws DadosException {
        // TODO
    }

    public Ata consultar(int id) throws DadosException {
        return null;
    }

    public List<Ata> listar() throws DadosException {

        List<Ata> lista = new ArrayList<Ata>();
        Connection conexao = ConexaoBD.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select * data, assunto, sede, descricao from ata";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Ata ata = new Ata();
                ata.setData(rs.getString(1));
                ata.setAssunto(rs.getString(2));
                ata.setSala(rs.getString(3));
                ata.setDescricao(rs.getString(4));
                lista.add(ata);
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return lista;
    }

}
