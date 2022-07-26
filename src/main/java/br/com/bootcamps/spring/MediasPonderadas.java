package br.com.bootcamps.spring;

import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Quantidade de casos: ");
        double qtdeCasos = dadosEntrada.nextDouble();

        double valor1, valor2, valor3, mediaPonderada;

        for (int i = 0; i < qtdeCasos; i++){
            System.out.println("Valor A: ");
            valor1 = dadosEntrada.nextDouble();
            System.out.println("Valor B: ");
            valor2 = dadosEntrada.nextDouble();
            System.out.println("Valor C: ");
            valor3 = dadosEntrada.nextDouble();

            mediaPonderada = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;
            System.out.printf("%.1f %n", mediaPonderada);
        }

    }
}
