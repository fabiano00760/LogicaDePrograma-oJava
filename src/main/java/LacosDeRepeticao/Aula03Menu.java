package LacosDeRepeticao;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        int opcao = 1;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. depositar salario");
            System.out.println("3. sair ");
            System.out.println("Digitar a sua opçao :");
            opcao = teclado.nextInt();
        }
        System.out.println("programa encerrado");
    }

}
