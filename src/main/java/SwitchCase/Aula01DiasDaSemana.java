package SwitchCase;

import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        Scanner escreverDia = new Scanner(System.in);
        System.out.println("digite o dia :");
        int dia = escreverDia.nextInt();
        switch (dia){
            case 1 :
            System.out.println("segunda");
            break;
            case 2 :
                System.out.println("terça");
                break;
            case 3 :
                System.out.println("quarta");
                break;
            case 4 :
                System.out.println("quinta");
                break;
            case 5 :
                System.out.println("sexta");
                break;
            case 6 :
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
            default:
                System.out.println("dia invalido ");
        }
    System.out.println("o dia da semana é " + dia);

    }
}
