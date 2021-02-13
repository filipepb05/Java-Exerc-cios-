public class Ator {

    private String nome;
    private int idade;
    private int oscar;
    private Genero genero;


    public Ator(String nome, int idade, Genero genero, int oscar) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.oscar = oscar;
    }

    public String informacoes(){
        System.out.println(this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + this.genero.getDescricao());
        System.out.println("Numero de oscars: " + this.oscar);
        return null;
    }


}
