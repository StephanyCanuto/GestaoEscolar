package models;

public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(String nome, int cargaH, Professor professor) {
        this.nomeDisciplina = nome;
        this.cargaHoraria = cargaH;
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void ListarDisciplina(){
        System.out.println("-------------DISCIPLINA-------------");
        System.out.println("Disciplina: "+ nomeDisciplina);
        System.out.println("Carga Horária: "+ cargaHoraria);
        System.out.println("Professor(a): " + professor.getNomeProfessor());
        System.out.println("-------------------------------------");
    }
}
