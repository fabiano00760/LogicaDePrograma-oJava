package EstruturacondicionaisIfElse;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'M';
        int idade = 17;

        if ((sexo == 'm' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento não permitido ");
        } else if (sexo == 'M' && idade >= 18 ) {
            System.out.println("alistamento  obrigatorio");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("deseja se alistar");
        }

    }
}
