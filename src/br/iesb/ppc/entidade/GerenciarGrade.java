package br.iesb.ppc.entidade;

import java.io.Serializable;

public class GerenciarGrade implements Serializable{
    private String nomeDisciplina;
    private int quantidadeSemestre;
    private String nomeCurso;
    private int modalidadeTipo;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getQuantidadeSemestre() {
        return quantidadeSemestre;
    }

    public void setQuantidadeSemestre(int quantidadeSemestre) {
        this.quantidadeSemestre = quantidadeSemestre;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getModalidadeTipo() {
        return modalidadeTipo;
    }

    public void setModalidadeTipo(int modalidadeTipo) {
        this.modalidadeTipo = modalidadeTipo;
    }
}
