import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        List<Pessoa> elencoBatman;
        List<Pessoa> elencoResgate;

        Diretor spielberg = new Diretor ("Spielberg", LocalDate.of(1950, 1, 12), Genero.MASCULINO, 55);
        Diretor schumacher = new Diretor ("Joel Schumacher", LocalDate.of(1939, 6, 15), Genero.MASCULINO, 3);
        Ator hanks = new Ator ("Tom Hanks", LocalDate.of(1962, 8, 12), Genero.MASCULINO, 10);
        Ator arnold = new Ator ("Arnold Schwarzenegger", LocalDate.of(1978, 3, 30), Genero.MASCULINO, 500);
        Ator clooney = new Ator ("George Clooney", LocalDate.of(1975, 12, 1), Genero.MASCULINO, 0);

        elencoBatman = new ArrayList<>();
        elencoResgate = new ArrayList<>();
        elencoBatman.add(schumacher);
        elencoBatman.add(arnold);
        elencoBatman.add(clooney);
        elencoResgate.add(spielberg);
        elencoResgate.add(hanks);

        Filme batman = new Filme ("Batman","Universo DC", 135, 2012, schumacher,
                elencoBatman, 10);
        Filme resgate = new Filme ("O Resgate do soldado Ryan", "Guerra - WW2", 172,
                2001, spielberg, elencoResgate, 5);


        batman.reproduzir();
        resgate.reproduzir();

        //spielberg.informacoes();
        //hanks.informacoes();



    }
}
