package com.henrizampacheco.java.exercicio01relacionamentosclasses;

/**1. Escreva uma classe Agenda, que contém vários contatos do tipo Contato.
 * Cada contato possui nome, telefone e email. A Agenda também possui um nome.
 * Crie um programa que teste e peça para o usuário entrar com o nome da Agenda
 * e em seguida 3 contatos. Crie métodos que retornem uma String com a informação
 * de cada contato e também de todos os contatos da agenda.
 */
public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String imprimirContato() {
        return "Nome do contato: " + this.getNome() + ". Telefone: " + this.getTelefone()
                + ". E-mail: " + this.getEmail() + ".";
    }
}
