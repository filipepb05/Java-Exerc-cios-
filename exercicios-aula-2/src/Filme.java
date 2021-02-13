public class Filme {

    private String nomeFilme;
    private String descricao;
    private double duracao;
    private int anoLancamento;
    private String nomeDiretor;

    public Filme(String nomeFilme, String descricao, double duracao, int anoLancamento, String nomeDiretor) {
        this.nomeFilme = nomeFilme;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.nomeDiretor = nomeDiretor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public String reproduzir(){
        System.out.println(getNomeFilme());
        System.out.println(getDescricao());
        System.out.println("Duracao de " + getDuracao() + " minutos.");
        System.out.println("Do diretor " + getNomeDiretor());
        return null;
    }



}
