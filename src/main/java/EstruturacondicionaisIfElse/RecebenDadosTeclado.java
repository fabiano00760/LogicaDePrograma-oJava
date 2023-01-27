package EstruturacondicionaisIfElse;

import java.util.Scanner;

public class RecebenDadosTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome : ");
        String nome = teclado.next();
        System.out.println("digite sua idade ");
        int idade = teclado.nextInt();
        System.out.println("o nome digitado foi : "+ nome);
        System.out.println("A idade digitada foi : " +idade);

        if (idade <11){
            System.out.println(nome + " participara de categoria infantil ");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + "participarar da catergoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + "participarar da catergoria Pré adulto ");
        }else {
            System.out.println(nome + " participara da categorioa adulta ");
        }

    }

}
