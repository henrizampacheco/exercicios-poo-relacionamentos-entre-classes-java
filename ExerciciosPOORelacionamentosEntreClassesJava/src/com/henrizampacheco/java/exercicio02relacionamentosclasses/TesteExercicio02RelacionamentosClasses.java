package com.henrizampacheco.java.exercicio02relacionamentosclasses;

import java.util.Scanner;

/**2. Escreva uma classe para representar um Curso, que tem nome e horário. Cada
 * curso tem um Professor, que possui nome, departamento e email. Cada Curso
 * também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome, matrícula e
 * 4 notas. Escreva um programa teste que crie um Curso com 5 alunos, e que peça
 * para o usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média
 * de cada aluno, se o mesmo está aprovado (média maior ou igual a 7), e qual é
 * a média da turma.
 */
public class TesteExercicio02RelacionamentosClasses {
    public static void main(String[] args)  {
        Curso curso1 = new Curso();
        Professor professor1 = new Professor();
        Aluno[] alunosTurma1 = new Aluno[5];
        Scanner scan = new Scanner(System.in);
        double somaNotasTurma = 0;
        
        System.out.println("**CURSO**");
        System.out.print("Informe o nome do curso: ");
        curso1.setNome(scan.nextLine());
        System.out.print("Informe o horário: ");
        curso1.setHorario(scan.nextLine());
        
        System.out.println("**PROFESSOR**");
        System.out.print("Informe o nome do professor: ");
        professor1.setNome(scan.nextLine());
        System.out.print("Informe o departamento: ");
        professor1.setDepartamento(scan.nextLine());
        System.out.print("Informe o e-mail: ");
        professor1.setEmail(scan.nextLine());        
        curso1.setProfessor(professor1);
        
        System.out.println("**ALUNOS**");
        for(int i=0; i<alunosTurma1.length; i++) {
            Aluno aluno = new Aluno();
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Nome do aluno " + (i+1) + ": ");
            aluno.setNome(sc.nextLine());
            
            System.out.print("Código da matrícula: ");
            aluno.setMatricula(sc.nextLine());
            
            double[] notas = new double[4];
            double somaNotasAluno = 0;
            
            for(int j=0; j<notas.length; j++) {
                System.out.print("Informe a nota " + (j+1) + ": ");
                notas[j] = sc.nextDouble();
                somaNotasAluno += notas[j];
            }
            System.out.println("******");
            aluno.setNotas(notas);
            aluno.obterMediaAluno(somaNotasAluno);
            
            somaNotasTurma += aluno.getMediaAluno();
            alunosTurma1[i] = aluno;
        }
        curso1.setAlunos(alunosTurma1);
        curso1.obterMediaTurma(somaNotasTurma);
        
        System.out.println("**RESULTADO FINAL**");
        curso1.imprimirResultadoCurso();
        for(int k=0; k<alunosTurma1.length; k++) {
            curso1.getAlunos()[k].imprimirResultadoAluno();
            System.out.println("******");
        }
    }
}
