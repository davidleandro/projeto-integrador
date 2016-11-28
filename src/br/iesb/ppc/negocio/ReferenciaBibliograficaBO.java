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
        // TODO
    }

    public void alterar(ReferenciaBibliografica entidade) throws NegocioException {
        // TODO
    }

    public void excluir(ReferenciaBibliografica entidade) throws NegocioException {
        // TODO
    }

    public ReferenciaBibliografica consultar(int id) throws NegocioException {
        return null;
    }
}
