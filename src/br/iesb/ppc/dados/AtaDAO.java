package br.iesb.ppc.dados;

import br.iesb.ppc.entidade.Ata;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class AtaDAO implements DAO<Ata> {

    public void inserir(Ata entidade) throws DadosException {
        // TODO
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
