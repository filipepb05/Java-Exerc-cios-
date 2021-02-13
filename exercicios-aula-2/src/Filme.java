public class Filme {

    private String filme;
    private String descricao;
    private double duracao;
    private int anoLancamento;
    private int nota;
    private Diretor diretor;

    public Filme(String filme, String descricao, double duracao, int anoLancamento, Diretor batata, int nota) {
        defineNota(nota);
        this.filme = filme;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.diretor = batata;
    }

    public void reproduzir(){
        System.out.println(this.filme);
        System.out.println(this.descricao);
        System.out.println("Duracao de " + this.duracao + " minutos.");
        System.out.println("Lancado em: " + this.anoLancamento);
        System.out.println("Do diretor " + this.diretor.getNome());
        System.out.println("Nota " + this.nota);

    }

    public String getFilme() {
        return filme;
    }

    public void defineNota (int nota){
        if (nota < 1 || nota > 5) {
            this.nota = 3;
        } else {
            this.nota = nota;
        }
    }


}
