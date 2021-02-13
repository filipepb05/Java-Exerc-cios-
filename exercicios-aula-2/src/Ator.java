public class Ator extends Pessoa{

    private int oscar;


    public Ator(String nome, int idade, Genero genero, int oscar) {
        super (nome, idade, genero);
        this.oscar = oscar;
    }

    public void informacoes(){
        super.informacoes();
        System.out.println("Numero de oscars: " + this.oscar);
    }


}
