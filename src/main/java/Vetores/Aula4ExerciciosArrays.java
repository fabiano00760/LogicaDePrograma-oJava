package Vetores;

import java.util.Scanner;

public class Aula4ExerciciosArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("vetor 1, possição:" + i + ": ");
            array1[i] = scanner.nextInt();
            System.out.println(array1[i]);

        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("vetor 2, possição:" + i + ": ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("vetor 3 multiplicado");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.println(array3[i] + " ");

        }
    }
}
