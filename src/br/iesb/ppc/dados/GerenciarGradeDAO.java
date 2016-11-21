package br.iesb.ppc.dados;

import br.iesb.ppc.entidade.GerenciarGrade;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class GerenciarGradeDAO implements DAO<GerenciarGrade>  {

    public void inserir(GerenciarGrade entidade) throws DadosException {
        // TODO
    }

    public void alterar(GerenciarGrade entidade) throws DadosException {
        // TODO
    }

    public void excluir(GerenciarGrade entidade) throws DadosException {
        // TODO
    }

    public GerenciarGrade consultar(int id) throws DadosException {
        return null;
    }

    public List<GerenciarGrade> listar() throws DadosException {
        
        List<GerenciarGrade> lista = new ArrayList<GerenciarGrade>();
        Connection conexao = ConexaoBD.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select * from grade, disciplina, semestre, curso, modalidade";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                GerenciarGrade gerenciarGrade = new GerenciarGrade();
                
                //banco não padronizado!!!!
                
                gerenciarGrade.setNomeDisciplina(rs.getString(1));
                gerenciarGrade.setQuantidadeSemestre(rs.getInt(2));
                gerenciarGrade.setNomeCurso(rs.getString(3));
                gerenciarGrade.setModalidadeTipo(rs.getInt(4));
            }
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            throw new DadosException(e.getMessage());
        }
        return lista;
    }

}
