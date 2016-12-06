package br.iesb.ppc.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GerenciarGrade implements Serializable{
    private String nomeDisciplina;
    private int quantidadeSemestre;
    private String nomeCurso;
    private int modalidadeTipo;
    private String nomeTurma;
    private int idTurma;
    private int idCurso;

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

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
