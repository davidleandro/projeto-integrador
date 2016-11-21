package br.iesb.ppc.entidade;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Ata implements Serializable {

    private Date data;
    private String horaInicio;
    private String horaFim;
    private String assunto;
    private String sede;
    private String sala;
    private String descricao;

    public Ata(Date data, String horaInicio, String horaFim, String assunto, String sede, String sala, String descricao) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.assunto = assunto;
        this.sede = sede;
        this.sala = sala;
        this.descricao = descricao;
    }

    public Ata() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Ata{" + "data=" + data + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", assunto=" + assunto + ", sede=" + sede + ", sala=" + sala + ", descricao=" + descricao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.data);
        hash = 37 * hash + Objects.hashCode(this.horaInicio);
        hash = 37 * hash + Objects.hashCode(this.horaFim);
        hash = 37 * hash + Objects.hashCode(this.assunto);
        hash = 37 * hash + Objects.hashCode(this.sede);
        hash = 37 * hash + Objects.hashCode(this.sala);
        hash = 37 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ata other = (Ata) obj;
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
        if (!Objects.equals(this.horaFim, other.horaFim)) {
            return false;
        }
        if (!Objects.equals(this.assunto, other.assunto)) {
            return false;
        }
        if (!Objects.equals(this.sede, other.sede)) {
            return false;
        }
        if (!Objects.equals(this.sala, other.sala)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

}
