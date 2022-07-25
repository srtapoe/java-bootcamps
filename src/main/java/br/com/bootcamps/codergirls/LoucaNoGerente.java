package br.com.bootcamps.codergirls;

import java.util.Scanner;

public class LoucaNoGerente {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite o % de desconto: ");
        double desconto = dadosEntrada.nextDouble();

        System.out.println("Digite o preço antigo: ");
        int precoAntigo = dadosEntrada.nextInt();

        double conversaoDesconto = (desconto / 100) * precoAntigo;

        double precoComDesconto = precoAntigo - conversaoDesconto;

        System.out.printf("%.0f",precoComDesconto);


    }
}
