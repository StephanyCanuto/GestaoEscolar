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
        System.out.println();
        System.out.println("-----------TURMA---------------");
        System.out.println();
        System.out.println("Nome da Turma: "+ nomeTurma );
        System.out.println("Ano letivo: "+ anoLetivo);

        System.out.println("\nLista de alunos");
        for(Aluno aluno:alunos){
            System.out.println(aluno.getNomeAluno());
        }
        System.out.println("\nProfessor(a): " + professor.getNomeProfessor() + "\nDisciplina: "+ professor.getDisciplinaProfessor());
        System.out.println();
    }


}
