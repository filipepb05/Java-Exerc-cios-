import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int numeroFilme;


    public Diretor(String nome, LocalDate anoNascimento, Genero genero, int numeroFilme) {
        super (nome, anoNascimento, genero);
        this.numeroFilme = numeroFilme;
    }

    @Override
    public String getNome() {

        return super.getNome();
    }

    @Override
    public void informacoes(){
        super.informacoes();
        System.out.println("Numero de filmes dirigidos: " + this.numeroFilme + "\n");
    }
}

