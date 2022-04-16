package com.henrizampacheco.java.exercicio02relacionamentosclasses;

/**2. Escreva uma classe para representar um Curso, que tem nome e horário. Cada
 * curso tem um Professor, que possui nome, departamento e email. Cada Curso
 * também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome, matrícula e
 * 4 notas. Escreva um programa teste que crie um Curso com 5 alunos, e que peça
 * para o usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média
 * de cada aluno, se o mesmo está aprovado (média maior ou igual a 7), e qual é
 * a média da turma.
 */
public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private double mediaAluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public void obterMediaAluno(double somaNotasAluno) {
        this.mediaAluno = somaNotasAluno/4;
    }
    
    public double getMediaAluno() {
        return mediaAluno;
    }
    
    public void imprimirResultadoAluno() {
        System.out.println("Nome do aluno: " + this.getNome());
        System.out.println("Média do aluno: " + this.getMediaAluno());
        if(this.getMediaAluno() >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
