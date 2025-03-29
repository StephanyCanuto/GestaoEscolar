import models.Aluno;
import models.Escola;
import models.Professor;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("Senai");
        Aluno aluno1 = new Aluno("João", 18, "123456");
        Aluno aluno2 = new Aluno("Amanda", 16, "123456");
        Aluno aluno3 = new Aluno("Marcos", 20, "123456");
        Professor professor1 = new Professor("Carlos","Engenharia de Software",42);
        Professor professor2 = new Professor("Matheus","Banco de Dados",30);
        Professor professor3 = new Professor("Flor","Algoritmos",25);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);
        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.adicionarProfessor(professor3);
        escola.ListarAlunos();
        escola.ListarProfessores();

    }

}