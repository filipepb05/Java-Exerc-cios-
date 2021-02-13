public class Aplicacao {

    public static void main(String[] args) {

        Diretor spielberg = new Diretor ("Spielberg", 65, 78);
        Filme batman = new Filme ("Batman","Universo DC", 135, 2012, spielberg);
        Filme resgate = new Filme ("O Resgate do soldado Ryan", "Guerra - WW2", 172, 2001, spielberg);

        batman.nota(3);
        spielberg.informacoesDiretor();
        batman.reproduzir();
        resgate.reproduzir();

    }
}
