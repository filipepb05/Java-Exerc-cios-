public class Diretor extends Pessoa {

    private int numeroFilme;


    public Diretor(String nome, int idade, Genero genero, int numeroFilme) {
        super (nome, idade, genero);
        this.numeroFilme = numeroFilme;
    }

    public String getNome() {
        return super.getNome();
    }

    public void informacoes(){
        super.informacoes();
        System.out.println("Numero de filmes dirigidos: " + this.numeroFilme);
    }
}

