public abstract class Imovel {

    private Endereco endereco;
    private double valor;

    public abstract String apresentacao();

    public Endereco getEndereco() {
        return endereco;
    }
    public double getValor() {
        return valor;
    }
}
