package com.zup;

import java.util.*;

public class Main {
    static String pegaLinha() {
        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        Map<String, List<String>> emailsEDadosDoContato = new HashMap<>();

        System.out.println("Agenda de contatos");

        System.out.println("Qual o nome do contato a adicionar?");
        String nome = pegaLinha();

        System.out.println("Qual o e-mail do contato?");
        String email = pegaLinha();

        System.out.println("Qual o telefone do contato?");
        String telefone = pegaLinha();

emailsEDadosDoContato.put(email, Arrays.asList(nome, telefone, email));
        System.out.println("Nome adicionado.");
        System.out.println(emailsEDadosDoContato);
    }
}