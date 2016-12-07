package br.iesb.ppc.negocio;

import java.util.List;

public interface BO<T> {
    void validar(T entidade) throws NegocioException;
    void inserir(T entidade) throws NegocioException;
    void alterar(T entidade) throws NegocioException;
    void excluir(T entidade) throws NegocioException;
    T consultar(int id) throws NegocioException;
    List<T> listar() throws NegocioException;
    List<T> listarTurma(int id) throws NegocioException;
    List<T> listar(int id) throws NegocioException;
    List<T> listarSemestre(int id) throws NegocioException;
    List<T> listarGrade(int id) throws NegocioException;
}