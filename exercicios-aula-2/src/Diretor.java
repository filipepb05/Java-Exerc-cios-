public class Diretor {

    private String nome;
    private int idade;
    private int numeroFilme;


    public Diretor(String nome, int idade, int numeroFilme) {
        this.nome = nome;
        this.idade = idade;
        this.numeroFilme = numeroFilme;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroFilme() {
        return numeroFilme;
    }

    public String informacoesDiretor(){
        System.out.println(getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Numero de filmes dirigidos " + getNumeroFilme());
        return null;
    }
}

