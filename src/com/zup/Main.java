package com.zup;

import java.util.*;

public class Main {
    static String pegaLinha()
    {
        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        Map<String, List<String>> emailsEDadosDoContato = new HashMap<>();
        boolean continuar = true;

        System.out.println("Agenda de contatos");

        String opcao;

        do {
            System.out.println("Digite adicionar para adicionar um contato.\nDigite excluir para excluir um contato.\nDigite sair para sair e mostrar todos os contatos.");
            opcao = pegaLinha();

            if (opcao.equalsIgnoreCase("adicionar")) {
                System.out.println("Qual o nome do contato a adicionar?");
                String nome = pegaLinha();

                System.out.println("Qual o e-mail do contato?");
                String email = pegaLinha();

                if (!emailsEDadosDoContato.containsKey(email)) {
                    System.out.println("Qual o telefone do contato?");
                    String telefone = pegaLinha();

                    emailsEDadosDoContato.put(email, Arrays.asList(nome, telefone, email));
                    System.out.println("Contato adicionado.");
                } else {
                    System.out.println("O e-mail deste contato já está na lista.");
                }
            } else if (opcao.equalsIgnoreCase("excluir")) {
                System.out.println("Qual o e-mail do contato a excluir?");
                String email = pegaLinha();

                if (emailsEDadosDoContato.containsKey(email)) {
                    emailsEDadosDoContato.remove(email);
                    System.out.println("Contato removido.");
                } else {
                    System.out.println("O e-mail do contato não foi achado na lista.");
                }
            } else if (opcao.equalsIgnoreCase("sair")) {
                continuar = false;
            }
        } while(continuar);

        System.out.println("Os contatos adicionados na lista foram:");
        System.out.println(emailsEDadosDoContato);
    }
}