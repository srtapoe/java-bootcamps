package br.com.bootcamps.codergirls;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numeroEntrada = dadosEntrada.nextDouble();

        verificaNumero(numeroEntrada);
    }

    public static void verificaNumero(double numeroEntrada){

        if(numeroEntrada >= 0 && numeroEntrada <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(numeroEntrada > 25 && numeroEntrada <= 50 ){
            System.out.println("Intervalo [25,50]");
        }else if(numeroEntrada > 50 && numeroEntrada <= 75){
            System.out.println("Intervalo [50,75]");
        }else if(numeroEntrada > 75 && numeroEntrada <= 100){
            System.out.println("Intervalo [75,100]");
        }else{
            System.out.println("Fora do Intervalo");
        }
    }
}
