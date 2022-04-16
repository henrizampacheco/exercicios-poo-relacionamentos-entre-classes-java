package com.henrizampacheco.java.exercicio02relacionamentosclasses;

/**2. Escreva uma classe para representar um Curso, que tem nome e horário. Cada
 * curso tem um Professor, que possui nome, departamento e email. Cada Curso
 * também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome, matrícula e
 * 4 notas. Escreva um programa teste que crie um Curso com 5 alunos, e que peça
 * para o usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média
 * de cada aluno, se o mesmo está aprovado (média maior ou igual a 7), e qual é
 * a média da turma.
 */
public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;
    private double mediaTurma;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
       
    public void obterMediaTurma(double somaNotasTurma) {
        this.mediaTurma = somaNotasTurma/5;
    }
    
    public double getMediaTurma() {
        return mediaTurma;
    }
    
    public void imprimirResultadoCurso() {
        System.out.println("Nome do curso: " + this.getNome());
        System.out.println("Média da turma: " + this.getMediaTurma());
    }
}
