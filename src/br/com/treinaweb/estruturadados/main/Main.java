package br.com.treinaweb.estruturadados.main;

import br.com.treinaweb.estruturadados.modelos.Pessoa;
import br.com.treinaweb.estruturadados.vetores.Vetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1. Gerenciamento de memória");
        System.out.println("2. Vetores");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
            case 2:
                fazerVetor();
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
        Pessoa p2 = new Pessoa(1, "Treinaweb");
        System.out.println(p2.toString());
        System.out.println("---------------------");
        // p2.setNome("Treinaweb Modificado");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
    }

    private static void fazerVetor() {
        Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
        vetorPessoas.inserir(new Pessoa(1, "Treinaweb1"));
        vetorPessoas.inserir(new Pessoa(2, "Treinaweb2"));
        vetorPessoas.inserir(new Pessoa(3, "Treinaweb3"));
        vetorPessoas.inserir(new Pessoa(4, "Treinaweb4"));
        vetorPessoas.inserirEm(1, new Pessoa(5, "Treinaweb5"));
        System.out.println(vetorPessoas);
        System.out.println("Lista de pessoas: ");
        for (int i = 0; i < vetorPessoas.tamanho(); i++) {
            System.out.println(vetorPessoas.recuperar(i).getNome());
        }
        Pessoa p = vetorPessoas.recuperar(1);
        Pessoa pessoaErrada = new Pessoa(100, "Treinaweb 100");
        System.out.println(vetorPessoas.contem(p));
        System.out.println(vetorPessoas.contem(pessoaErrada));
        System.out.println(vetorPessoas.indice(p));
        System.out.println(vetorPessoas.indice(pessoaErrada));
    }

}