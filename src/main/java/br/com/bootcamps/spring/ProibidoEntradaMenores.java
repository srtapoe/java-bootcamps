package br.com.bootcamps.spring;

import java.util.ArrayList;
import java.util.Scanner;

public class ProibidoEntradaMenores {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Quantidade de pessoas a entrar: ");
        int qtdePessoas = dadosEntrada.nextInt();
        int idadeMinima = 18;
        int pessoa;

        ArrayList<Integer> proibidosEntrar = new ArrayList<>();

        ArrayList<Integer> pessoas = new ArrayList<>();
        for (int i = 0; i < qtdePessoas; i++){
            System.out.println("Idade: ");
            pessoa = dadosEntrada.nextInt();

            pessoas.add(pessoa);

            if(pessoa < idadeMinima){
                proibidosEntrar.add(pessoa);
            }
        }


        for (Integer ignored : proibidosEntrar) {
            System.out.println("Não poderão entrar as idades: ");
            System.out.println(proibidosEntrar);
        }
    }
}
