package br.com.bootcamps.spring;

import java.util.Scanner;

public class JogadoresViciados {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Quantidade de gameplays: ");
        int qtdeGameplays = dadosEntrada.nextInt();
        System.out.println("Seu ID: ");
        int id = dadosEntrada.nextInt();

        int qtdeCS = 0, idGameplay, idPlayer;
        int idCS = 0;

        for(int i = 0; i < qtdeGameplays; i++) {
            System.out.println("ID do Player: ");
            idPlayer = dadosEntrada.nextInt();
            System.out.println("ID do Jogo: ");
            idGameplay = dadosEntrada.nextInt();

            if(idPlayer == id && idGameplay == idCS){
                qtdeCS++;
            }

        }

        System.out.println(qtdeCS);
    }
}
