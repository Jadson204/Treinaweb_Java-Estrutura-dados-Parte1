package br.com.treinaweb.estruturadados.main;

import br.com.treinaweb.estruturadados.modelos.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1. Gerenciamento de memória");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
        }
        scanner.close();
    }

    private static void fazerGerenciamentoMemoria() {
        int a = 3;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        b = 2;
        System.out.println("------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        System.out.println("********************");
        Pessoa p1 = new Pessoa(1, "Treinaweb");
        System.out.println(p1.toString());
        Pessoa p2 = p1;
        System.out.println(p2.toString());
        System.out.println("---------------------");
        p2.setNome("Treinaweb Modificado");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}