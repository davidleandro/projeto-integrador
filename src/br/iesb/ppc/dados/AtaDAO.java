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

    }

    public void excluir(Ata entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        try {
            String sql = "delete from ata where id = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql);

            pstmt.setInt(1, entidade.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new DadosException(e.getMessage());
        }
    }

    public Ata consultar(int id) throws DadosException {
        return null;
    }

    public List<Ata> listar() throws DadosException {

        List<Ata> lista = new ArrayList<Ata>();
        Connection conexao = ConexaoBD.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select id,data, assunto, sede, descricao from ata";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Ata ata = new Ata();
                ata.setId(rs.getInt(1));
                ata.setData(rs.getString(2));
                ata.setAssunto(rs.getString(3));
                ata.setSede(rs.getString(4));
                ata.setDescricao(rs.getString(5));
                lista.add(ata);
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return lista;
    }

    public List<Ata> listarTurma() throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Ata> listar(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Ata> listarTurma(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
