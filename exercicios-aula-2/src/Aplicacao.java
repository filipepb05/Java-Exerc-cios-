import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        List<Pessoa> elencoBatman;
        List<Pessoa> elencoResgate;

        Pessoa spielberg = new Diretor ("Spielberg", 65, Genero.MASCULINO, 55);
        Pessoa schumacher = new Diretor ("Joel Schumacher", 60, Genero.MASCULINO, 3);
        Pessoa hanks = new Ator ("Tom Hanks", 55, Genero.MASCULINO, 10);
        Pessoa arnold = new Ator ("Arnold Schwarzenegger", 68, Genero.MASCULINO, 500);
        Pessoa clooney = new Ator ("George Clooney", 50, Genero.MASCULINO, 0);

        elencoBatman = new ArrayList<>();
        elencoResgate = new ArrayList<>();
        elencoBatman.add(schumacher);
        elencoBatman.add(arnold);
        elencoBatman.add(clooney);
        elencoResgate.add(spielberg);
        elencoResgate.add(hanks);

        Filme batman = new Filme ("Batman","Universo DC", 135, 2012, schumacher,
                elencoBatman , 3);
        Filme resgate = new Filme ("O Resgate do soldado Ryan", "Guerra - WW2", 172,
                2001, spielberg, elencoResgate, 5);


        batman.reproduzir();
        resgate.reproduzir();

        //spielberg.informacoes();
        //hanks.informacoes();



    }
}
