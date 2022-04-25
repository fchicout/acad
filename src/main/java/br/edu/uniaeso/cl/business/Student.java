package br.edu.uniaeso.cl.business;

import java.util.Date;

public class Student {
    private int id;
    private int matricula;
    private String nomeCompleto;
    private String nomeSocial;
    private String dataNascimento;
    private String nomeMae;
    private String status;

    public Student() {
    }

    public Student(int id, int matricula, String nomeCompleto, String nomeSocial, String dataNascimento, String nomeMae, String status) {
        this.id = id;
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.nomeSocial = nomeSocial;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }else{
            System.out.println("Aluno não cadastrado");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula > 0){
            this.matricula = matricula;
        }else{
            System.out.println("Matricula não pode ser menor do que 0!");
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        if(nomeCompleto != null){
            this.nomeCompleto = nomeCompleto;
        }else{
            System.out.println("Nome não pode ser vázio6");
        }
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        if (nomeSocial != null) {
            this.nomeSocial = nomeSocial;
        }else{
            this.nomeSocial = nomeCompleto;
        }
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if(dataNascimento != null){
            this.dataNascimento = dataNascimento;
        }else{
            System.out.println("Por favor, inserir data de nascimento.");
        }
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        if(nomeMae != null){
            this.nomeMae = nomeMae;
        }else{
            System.out.println("Nome da mãe não pode ficar vázio");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
