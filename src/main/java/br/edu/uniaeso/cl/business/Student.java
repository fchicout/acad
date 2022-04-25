package br.edu.uniaeso.cl.business;

import java.util.Date;

public class Student {
    private int id;
    private int matricula;
    private String nomeCompleto;
    private String nomeSocial;
    private Date date;
    private String nomeMae;
    private String status;

    public Student() {
    }

    public Student(int id, int matricula, String nomeCompleto, String nomeSocial, Date date, String nomeMae, String status) {
        this.id = id;
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.nomeSocial = nomeSocial;
        this.date = date;
        this.nomeMae = nomeMae;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
