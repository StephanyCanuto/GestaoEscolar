package models;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoLetivo;
    private Professor professor;
    private ArrayList<Aluno> alunos;


    public Turma(String nome, int ano, Professor professor) {
        this.nomeTurma = nome;
        this.anoLetivo = ano;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAlunoTurma(Aluno aluno){
        alunos.add(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void ListarTurmas(){
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Nome da Turma: "+ nomeTurma + "\n");
        System.out.println("Ano letivo: "+ anoLetivo + "\n");
        System.out.println("-------------------------------------");
        System.out.println("Lista de alunos");
        for(Aluno aluno:alunos){
            System.out.println(aluno + "\n");
        }
        System.out.println("Professor: " + professor);
        System.out.println("-------------------------------------");
    }


}
