package EstruturacondicionaisIfElse;

public class DesafioTorneioDeNatacao {
    public static void main(String[] args) {

         String nome= "Fabaino";
         int idade = 19 ;

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
