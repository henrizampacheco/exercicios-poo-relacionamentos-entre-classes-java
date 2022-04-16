package com.henrizampacheco.java.exercicio02relacionamentosclasses;

/**2. Escreva uma classe para representar um Curso, que tem nome e horário. Cada
 * curso tem um Professor, que possui nome, departamento e email. Cada Curso
 * também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome, matrícula e
 * 4 notas. Escreva um programa teste que crie um Curso com 5 alunos, e que peça
 * para o usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média
 * de cada aluno, se o mesmo está aprovado (média maior ou igual a 7), e qual é
 * a média da turma.
 */
public class Professor {
    private String nome;
    private String departamento;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
