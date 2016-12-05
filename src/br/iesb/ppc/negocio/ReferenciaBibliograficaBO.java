package br.iesb.ppc.negocio;

import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.ReferenciaBibliograficaDAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.entidade.ReferenciaBibliografica;
public class ReferenciaBibliograficaBO implements BO<ReferenciaBibliografica> {

    public void validar(ReferenciaBibliografica entidade) throws NegocioException {
        if (entidade.getAutor().isEmpty()) {
            throw new NegocioException("Campo Autor é obrigatório");
        }
        if (entidade.getTitulo().isEmpty()) {
            throw new NegocioException("Campo Título é obrigatório");
        }
        if (entidade.getEditora().isEmpty()) {
            throw new NegocioException("Campo Editora é obrigatório");
        }
        if (entidade.getAno() .isEmpty()) {
            throw new NegocioException("Campo Ano é obrigatório");
        }
        if (entidade.getQuantidade().isEmpty()) {
            throw new NegocioException("Campo Quantidade é obrigatório");
        }
    }

    public List<ReferenciaBibliografica> listar() throws NegocioException {
        List<ReferenciaBibliografica> lista;
        DAO<ReferenciaBibliografica> dao = new ReferenciaBibliograficaDAO();
        try {
            lista = dao.listar();
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema", e);
        }
        if (lista.size() == 0) {
            throw new NegocioException("Nenhuma referência bibliográfica encontrada");
        }
        return lista;
    }

    public void inserir(ReferenciaBibliografica entidade) throws NegocioException {
        DAO<ReferenciaBibliografica> dao = new ReferenciaBibliograficaDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException e) {
            throw new NegocioException("Erro ao inserir", e);
        }
    }

    public void alterar(ReferenciaBibliografica entidade) throws NegocioException {
        DAO<ReferenciaBibliografica> dao = new ReferenciaBibliograficaDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException e) {
            throw new NegocioException("Erro ao alterar", e);
        }
    }

    public void excluir(ReferenciaBibliografica entidade) throws NegocioException {
        DAO<ReferenciaBibliografica> dao = new ReferenciaBibliograficaDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException e) {
            throw new NegocioException("Erro ao excluir", e);
        }
    }

    public ReferenciaBibliografica consultar(int id) throws NegocioException {
        DAO<ReferenciaBibliografica> dao = new ReferenciaBibliograficaDAO();
        ReferenciaBibliografica referencia_bibliografica;
        
        try {
            referencia_bibliografica = dao.consultar(id);
        } catch (DadosException e) {
            throw new NegocioException("Erro na consulta", e);
        }
        return referencia_bibliografica;
    }

    public List<ReferenciaBibliografica> listarTurma() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ReferenciaBibliografica> listar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ReferenciaBibliografica> listarTurma(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
