package br.edu.uniaeso.cl.business;

import java.util.Date;

public class Management {

    public void RegistrarAluno(String nomeCompleto, String nomeSocial, String nomeMae, Date dataNascimento){
        Student estudante = new Student();
        estudante.setNomeCompleto(nomeCompleto);
        estudante.setDataNascimento(dataNascimento);
        estudante.setNomeSocial(nomeSocial);
        estudante.setNomeMae(nomeMae);
        estudante.setStatus("Inativo");
    }

    public void MatricularAluno(){}

    public void AtivarAluno(boolean status){}

    public void DesativarAluno(boolean status){}

    public void ExcluirAluno(){}

    public void AtualizarAluno(){}

    public void BuscarAluno(){}
}
