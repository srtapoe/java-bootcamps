package br.com.bootcamps.codergirls;

import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de peças: ");

        int numeroPeca = dadosEntrada.nextInt();

        int pecasDomino = ((numeroPeca + 1) * (numeroPeca +2))/ 2;

        System.out.println(pecasDomino);

    }
}
