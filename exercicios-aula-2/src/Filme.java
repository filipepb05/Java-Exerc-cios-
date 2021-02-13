public class Filme {

    private String filme;
    private String descricao;
    private double duracao;
    private int anoLancamento;
    private int nota;
    private Diretor diretor;

    public Filme(String filme, String descricao, double duracao, int anoLancamento, Diretor batata) {
        this.filme = filme;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.diretor = batata;
    }

    public String reproduzir(){
        System.out.println(this.filme);
        System.out.println(this.descricao);
        System.out.println("Duracao de " + this.duracao + " minutos.");
        System.out.println("Lancado em: " + this.anoLancamento);
        System.out.println("Do diretor " + this.diretor.getNome());
        if (nota != 0) {
            System.out.println("Nota " + this.nota);
        }
        return null;
    }

    public void nota (int nota){
        this.nota = nota;
    }


}
