package br.com.bootcamps.codergirls;

import java.util.Scanner;

public class PercentualEleitores {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Habitantes: ");
        double habitantes = dadosEntrada.nextDouble();
        System.out.println("Brancos: ");
        double brancos = dadosEntrada.nextDouble();
        System.out.println("Nulos: ");
        double nulos = dadosEntrada.nextDouble();
        System.out.println("Válidos: ");
        double validos = dadosEntrada.nextDouble();

        calcularVotosBrancos(brancos, habitantes);

        calcularVotosNulos(nulos, habitantes);

        calcularVotosValidos(validos, habitantes);

    }

    public static void calcularVotosBrancos(double brancos, double habitantes){
        double eleitoresBrancos  = (brancos * 100) / habitantes;
        String percent = "%";
        System.out.printf("Brancos: %.0f%s %n" , eleitoresBrancos, percent);
    }

    public static void calcularVotosNulos(double nulos, double habitantes){
        double eleitoresNulos  = (nulos * 100) / habitantes;
        String percent = "%";
        System.out.printf("Nulos: %.0f%s %n", eleitoresNulos, percent);
    }

    public static void calcularVotosValidos(double validos, double habitantes){
        double eleitoresValidos  = (validos * 100) / habitantes;
        String percent = "%";
        System.out.printf("Validos: %.0f%s %n", eleitoresValidos, percent);
    }
}
