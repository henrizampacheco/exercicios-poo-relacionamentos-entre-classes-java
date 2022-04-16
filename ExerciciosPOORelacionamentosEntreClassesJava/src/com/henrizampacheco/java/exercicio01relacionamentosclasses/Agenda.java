package com.henrizampacheco.java.exercicio01relacionamentosclasses;

/**1. Escreva uma classe Agenda, que contém vários contatos do tipo Contato.
 * Cada contato possui nome, telefone e email. A Agenda também possui um nome.
 * Crie um programa que teste e peça para o usuário entrar com o nome da Agenda
 * e em seguida 3 contatos. Crie métodos que retornem uma String com a informação
 * de cada contato e também de todos os contatos da agenda.
 */
public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String imprimirAgenda() {
        return "Nome da agenda: " + this.getNome();
    }
}
