public class Ator extends Pessoa{

    private int oscar;


    public Ator(String nome, int idade, Genero genero, int oscar) {
        super (nome, idade, genero);
        this.oscar = oscar;
    }

    public String informacoes(){
        System.out.println(super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Genero: " + super.getGenero().getDescricao());
        System.out.println("Numero de oscars: " + this.oscar);
        return null;
    }


}
