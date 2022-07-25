package br.com.bootcamps.codergirls;

import java.util.ArrayList;
import java.util.Scanner;

public class SelecaoIdVetor {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        String nomeEntrada;

        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i <5; i++){
            System.out.println("Digite o nome: ");
            nomeEntrada = dadosEntrada.nextLine();
            nomes.add(nomeEntrada);
        }

        System.out.println("Digite o indice: ");
        int indice = dadosEntrada.nextInt();

        System.out.println(nomes.get(indice));

    }
}
