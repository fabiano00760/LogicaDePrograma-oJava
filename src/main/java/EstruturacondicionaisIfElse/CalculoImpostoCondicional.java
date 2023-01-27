package EstruturacondicionaisIfElse;

public class CalculoImpostoCondicional {


    public static void main(String[] args) {
        float salario = 4600.00f;
        float resultado =0f;
        float trintaPorcento = salario * 0.3f;
        float dezPorCento = salario * 0.1f;

        if (salario > 4500){
            resultado = salario * 0.3f;
            System.out.println(" 30% = " + trintaPorcento);
        }else{
            resultado = salario * 0.1f;
            System.out.println("10% " + dezPorCento);
        }
        System.out.println("o valor final he " + resultado);
    }
}
