package SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class Aula2TipoDeComta {
    public static void main(String[] args) {
        Scanner digitarconta = new Scanner(System.in);
        System.out.println("digite sua  conta ");
        String conta = digitarconta.nextLine();
        switch (conta) {
            case "conta Poupança":
                System.out.println("0.05%");
                break;
            case "conta corrente":
                System.out.println("0.02%");
                break;
            case "conta investimento":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("conta inexistente ");
        }
    }
}
