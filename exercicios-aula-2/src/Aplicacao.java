public class Aplicacao {

    public static void main(String[] args) {

        Filme batman = new Filme ("Batman","Universo DC", 135, 2012, "Nolan");
        Filme resgate = new Filme ("O Resgate do soldado Ryan", "Guerra - WW2", 172, 2001, "Spielberg");

        batman.reproduzir();
        resgate.reproduzir();


    }
}
