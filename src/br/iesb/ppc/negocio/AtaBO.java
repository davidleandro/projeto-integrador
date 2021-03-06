package br.iesb.ppc.negocio;

import br.iesb.ppc.dados.AtaDAO;
import java.util.List;
import br.iesb.ppc.dados.DAO;
import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.entidade.Ata;

public class AtaBO implements BO<Ata> {

    public void validar(Ata entidade) throws NegocioException {
        if (entidade.getHoraInicio().isEmpty()) {
            throw new NegocioException("Campo Hora inicio é obrigatório");
        }
        if (entidade.getHoraFim().isEmpty()) {
            throw new NegocioException("Campo Hora Fim é obrigatório");
        }
        if (entidade.getAssunto().isEmpty()) {
            throw new NegocioException("Campo Assunto é obrigatório");
        }
        if (entidade.getSede().isEmpty()) {
            throw new NegocioException("Campo Sede é obrigatório");
        }
        if (entidade.getSala().isEmpty()) {
            throw new NegocioException("Campo Sala é obrigatório");
        }
        if (entidade.getDescricao().isEmpty()) {
            throw new NegocioException("Campo Descriçao é obrigatório");

        }
    }

    public List<Ata> listar() throws NegocioException {
        List<Ata> lista;
        DAO<Ata> dao = new AtaDAO();
        try {
            lista = dao.listar();
        } catch (DadosException e) {
            throw new NegocioException("Erro no sistema", e);
        }
        if (lista.size() == 0) {
            throw new NegocioException("Nenhuma Ata encontrada");
        }
        return lista;
    }

    public void inserir(Ata entidade) throws NegocioException {
        DAO<Ata> dao = new AtaDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException e) {
            System.out.println(e.getMessage());
            throw new NegocioException("Erro no sistema", e);
        }
    }

    public void alterar(Ata entidade) throws NegocioException {
        DAO<Ata> dao = new AtaDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException e) {
            System.out.println(e.getMessage());
            throw new NegocioException("Erro ao alterar", e);
        }
    }

    public void excluir(Ata entidade) throws NegocioException {
        DAO<Ata> dao = new AtaDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException e) {
            System.out.println(e.getMessage());
            throw new NegocioException("Erro ao excluir", e);
        }
    }

    public Ata consultar(int id) throws NegocioException {
        DAO<Ata> dao = new AtaDAO();
        Ata ata;
        try {
            ata = dao.consultar(id);
        } catch (DadosException e) {
            System.out.println(e.getMessage());
            throw new NegocioException("Erro ao consultar", e);
        }
        return ata;
    }

    public List<Ata> listar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Ata> listarTurma(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ata> listarSemestre(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ata> listarGrade(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
