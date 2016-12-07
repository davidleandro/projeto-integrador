package br.iesb.ppc.entidade;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Professor implements Serializable {
    int id;
    String nome;
    int cpf;
    String maiorTitulacao;
    String formacaoTitulacao;
    String curriculoLates;
    String atualizacaoCurriculo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getMaiorTitulacao() {
        return maiorTitulacao;
    }

    public void setMaiorTitulacao(String maiorTitulacao) {
        this.maiorTitulacao = maiorTitulacao;
    }

    public String getFormacaoTitulacao() {
        return formacaoTitulacao;
    }

    public void setFormacaoTitulacao(String formacaoTitulacao) {
        this.formacaoTitulacao = formacaoTitulacao;
    }

    public String getCurriculoLates() {
        return curriculoLates;
    }

    public void setCurriculoLates(String curriculoLates) {
        this.curriculoLates = curriculoLates;
    }

    public String getAtualizacaoCurriculo() {
        return atualizacaoCurriculo;
    }

    public void setAtualizacaoCurriculo(String atualizacaoCurriculo) {
        this.atualizacaoCurriculo = atualizacaoCurriculo;
    }
    
    
}
