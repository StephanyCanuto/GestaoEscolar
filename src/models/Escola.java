package models;

import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList <Aluno> alunos;
    private ArrayList <Professor> professores;

    public Escola(String nome) {
        this.nomeEscola = nome;
        this.alunos = new ArrayList<>() ;
        this.professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    public void ListarAlunos(){
        System.out.println("Lista de alunos");
        for(Aluno aluno:alunos){
            System.out.println(aluno + "\n");
        }
    }

    public void ListarProfessores(){
        System.out.println("Lista de professores");
        for(Professor professor:professores){
            System.out.println(professor + "\n");
        }
    }
}
