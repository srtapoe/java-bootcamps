package br.com.bootcamps.spring;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //Quantidade de pessoas
        int quantidadePessoas = scan.nextInt();
        int[] idades = new int[quantidadePessoas];

        //Armazenando as idades em uma Array
        for (int i = 0; i < idades.length; i++) {

            int idade = scan.nextInt();
            idades[i] = idade;

        }

        System.out.println("Nao poderao entrar as idades: ");

        //testando maior de idade
        for (int idade : idades) {
            if (idade < 18) {
                System.out.println(idade);
            }

        }

    }
}

