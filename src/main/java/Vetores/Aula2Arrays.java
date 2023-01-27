package Vetores;

import java.util.Scanner;

public class Aula2Arrays {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("tamanho do arrays " + notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i++));
            notas[i] = scanner.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("nota " + (i++) + ":" + notas[i]);
        }
        media= media / notas.length;
        System.out.println("Soma da notas " + media);

    }
}
