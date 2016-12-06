package br.iesb.ppc.dados;

import br.iesb.ppc.entidade.PlanoDeEnsino;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class PlanoDeEnsinoDAO implements DAO<PlanoDeEnsino>  {

    public void inserir(PlanoDeEnsino entidade) throws DadosException {
        // TODO
    }

    public void alterar(PlanoDeEnsino entidade) throws DadosException {
        // TODO
    }

    public void excluir(PlanoDeEnsino entidade) throws DadosException {
        // TODO
    }

    public PlanoDeEnsino consultar(int id) throws DadosException {
        return null;
    }

    public List<PlanoDeEnsino> listar() throws DadosException {
        
        List<PlanoDeEnsino> lista = new ArrayList<PlanoDeEnsino>();
        Connection conexao = ConexaoBD.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select * from plano_ensino";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                PlanoDeEnsino plano_ensino = new PlanoDeEnsino();
                plano_ensino.setProfessor(rs.getString(1));
                plano_ensino.setCurso(rs.getString(2));
                plano_ensino.setCargaHoraria(rs.getString(3));
                plano_ensino.setAno(rs.getInt(4));
                plano_ensino.setSemestre(rs.getInt(5));
                lista.add(plano_ensino);
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return lista;
    }

    public List<PlanoDeEnsino> listarTurma(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<PlanoDeEnsino> listar(int id) throws DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
