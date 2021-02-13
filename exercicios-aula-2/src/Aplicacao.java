public class Aplicacao {

    public static void main(String[] args) {

        Diretor spielberg = new Diretor ("Spielberg", 65, Genero.MASCULINO, 55);
        Filme batman = new Filme ("Batman","Universo DC", 135, 2012, spielberg);
        Filme resgate = new Filme ("O Resgate do soldado Ryan", "Guerra - WW2", 172, 2001, spielberg);
        Ator hanks = new Ator ("Tom Hanks", 55, Genero.MASCULINO, 10);

        batman.reproduzir();
        resgate.reproduzir();

        spielberg.informacoes();
        hanks.informacoes();


    }
}
