package Vetores;

import java.util.Scanner;

public class aulo4ExerciciosArraysMelhorado {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner scanner = new Scanner(System.in);
        String array3Multiplicado = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("vetor 1, possição:" + i + ": ");
            array1[i] = scanner.nextInt();
            System.out.println("vertor 2, posição " + i + ": ");
            array2[i] = scanner.nextInt();
            array3[3] = array1[i] * array2[i];
            System.out.print(array3[i]);
        }

    }

}
