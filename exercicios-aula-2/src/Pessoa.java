public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;

    }

    public String getNome() {
        return nome;
    }

    public void informacoes(){
        System.out.println(this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + genero.getDescricao());
    }
}
