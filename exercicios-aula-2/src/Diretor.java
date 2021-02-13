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


    public String informacoesDiretor(){
        System.out.println(this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Numero de filmes dirigidos " + this.numeroFilme);
        return null;
    }
}

