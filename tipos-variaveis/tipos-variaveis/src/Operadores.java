public class Operadores {
    public static void main (String[] args) {
        int a, b;

        a = 5;
        b = 6;
        
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "false";

        System.out.println(resultado);
        }

        //Essa sintaxe pode substituir essa de cima String resultado = a==b ? "verdadeiro" : "false";

}
