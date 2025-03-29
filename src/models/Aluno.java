package models;

public class Aluno {
    private String nomeAluno, matriculaAluno;
    private int idadeAluno;

    public Aluno(String nomeAluno, int idadeAluno, String matriculaAluno){
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.idadeAluno = idadeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }


    @Override
    public String toString() {
        return "Aluno{" +
        "\nnome: " + nomeAluno + "\n"+
        "idade: " + idadeAluno + "\n"+
        "matricula: " + matriculaAluno + "\n" +
        '}';
    }
}
