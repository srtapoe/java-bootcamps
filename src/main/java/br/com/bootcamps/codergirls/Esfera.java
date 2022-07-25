package br.com.bootcamps.codergirls;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        double raio = dadosEntrada.nextDouble();

        double PI =  3.14159;

        double volume = (4/3.0) * PI * (Math.pow(raio, 3.0));
        System.out.printf("VOLUME  = %.3f%n", volume);
    }
}
