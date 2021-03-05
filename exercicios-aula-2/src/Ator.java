import java.time.LocalDate;

public class Ator extends Pessoa{

    private int oscar;


    public Ator(String nome, LocalDate anoNascimento, Genero genero, int oscar) {
        super (nome, anoNascimento, genero);
        this.oscar = oscar;
    }

    @Override
    public void informacoes(){
        super.informacoes();
        System.out.println("Numero de oscars: " + this.oscar + "\n");
    }


}
