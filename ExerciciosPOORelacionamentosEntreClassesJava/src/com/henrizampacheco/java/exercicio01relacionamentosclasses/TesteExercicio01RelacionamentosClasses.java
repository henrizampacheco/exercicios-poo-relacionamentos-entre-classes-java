package com.henrizampacheco.java.exercicio01relacionamentosclasses;

import java.util.Scanner;

/**1. Escreva uma classe Agenda, que contém vários contatos do tipo Contato.
 * Cada contato possui nome, telefone e email. A Agenda também possui um nome.
 * Crie um programa que teste e peça para o usuário entrar com o nome da Agenda
 * e em seguida 3 contatos. Crie métodos que retornem uma String com a informação
 * de cada contato e também de todos os contatos da agenda.
 */
public class TesteExercicio01RelacionamentosClasses {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Contato[] contatos = new Contato[3];
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o nome da agenda: ");
        agenda1.setNome(scan.nextLine());

        for(int i=0; i<contatos.length; i++) {
            System.out.println("");
            Contato contato = new Contato();
            System.out.print("Digite o nome do " + (i+1) + "º contato: ");
            contato.setNome(scan.nextLine());
            System.out.print("Digite o telefone do " + (i+1) + "º contato: ");
            contato.setTelefone(scan.nextLine());
            System.out.print("Digite o e-mail do " + (i+1) + "º contato: ");
            contato.setEmail(scan.nextLine());
            contatos[i] = contato;
        }
        System.out.println("");
        System.out.println(agenda1.imprimirAgenda());
        for(int j=0; j<contatos.length; j++) {
            System.out.println(contatos[j].imprimirContato());
        }
    }
}
