public class Diretor extends Pessoa {

    private int numeroFilme;


    public Diretor(String nome, int idade, Genero genero, int numeroFilme) {
        super (nome, idade, genero);
        this.numeroFilme = numeroFilme;
    }

    public String getNome() {
        return super.getNome();
    }


    public String informacoes(){
        System.out.println(super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Genero: " + super.getGenero().getDescricao());
        System.out.println("Numero de filmes dirigidos: " + this.numeroFilme);
        return null;
    }
}

