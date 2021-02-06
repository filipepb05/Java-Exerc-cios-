public class Main {

    public static void main(String[] args) {

        int primeirovalor = 3;
        int valor2 = 6;
        int mult = primeirovalor * valor2;
        int resto = valor2 % primeirovalor;
        // boolean comp = valor2 > valor1;

         System.out.println(primeirovalor + " multiplicado por " + valor2 + " eh igual a " + mult);
         System.out.println("O resto da divisão de " + valor2 + " por " + primeirovalor + " é " + resto);
         // System.out.println(valor2 + " é maior que " + valor1 + "? " + comp);
        System.out.println(valor2 + " é maior que " + primeirovalor + "? " + (valor2 > primeirovalor));


    }
}
