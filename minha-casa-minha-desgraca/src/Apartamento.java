public class Apartamento extends Imovel {

    private Endereco endereco;
    private double valor;
    private int andar;

    public Apartamento(Endereco endereco, double valor, int andar) {
        this.endereco = endereco;
        this.valor = valor;
        this.andar = andar;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String apresentacao() {
        return "Apartamento localizado na " + endereco.getLogradouro() + ", número " + endereco.getNumero() + ", " +
                andar + "º andar, " + endereco.getComplemento() + ", bairro " + endereco.getBairro() + ", " +
                endereco.getCidade() + ", " + endereco.getEstado() + ". No valor de R$" + valor;
    }

}
