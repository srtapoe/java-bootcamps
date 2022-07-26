package br.com.bootcamps.spring;

import java.util.ArrayList;
import java.util.Scanner;

public class PulandoNomes {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);

        String sigla;

        ArrayList<String> siglas = new ArrayList<>();

        for (int i = 0; i<10;i++){
            System.out.println("Digite uma sigla: ");
            sigla = dadosEntrada.nextLine();
            siglas.add(sigla);
        }


            System.out.println(siglas.get(2));
            System.out.println(siglas.get(6));
            System.out.println(siglas.get(8));


    }
}
