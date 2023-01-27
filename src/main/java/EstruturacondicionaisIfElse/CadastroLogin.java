package EstruturacondicionaisIfElse;

import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o seu nome ");
        String nome = input.next();

        if(nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuaviro Invalido");
        }else{
            System.out.println( nome + " cadastrado om sucesso ");
        }

    }
}
