package LacosDeRepeticao;

import java.util.Scanner;

public class Aula5DOwhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("play 1: digite um numero de 1 a 10");
            int num1 = scanner.nextInt();
            System.out.println("--------------------------------------");
            System.out.println("play2 : digite um numero de 1 a 10");
            int num2 = scanner.nextInt();
            System.out.println("--------------------------------------");
            System.out.println("acertou " + (num1 == num2));
            System.out.println("--------------------------------------");
            System.out.println("deseja continuar jogando?0");
            System.out.println("1. sim ");
            System.out.println("2. não ");
            desejaContinuar = scanner.nextInt();
        }while (desejaContinuar == 1);

    }
}
