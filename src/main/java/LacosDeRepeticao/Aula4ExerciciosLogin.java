package LacosDeRepeticao;

import java.util.Scanner;

public class Aula4ExerciciosLogin {
    public static void main(String[] args) {
        final String login = "fabiano";
        final String password = "admin";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite o login ");
            String loginDigitado = scanner.nextLine();
            System.out.println("digite sua senha ");
            String passwordDigitado = scanner.nextLine();
            if (login.equals(loginDigitado) && passwordDigitado.equals(passwordDigitado)) {
                System.out.println("acesso concedido");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("acesso negado");
        }
    }
}

