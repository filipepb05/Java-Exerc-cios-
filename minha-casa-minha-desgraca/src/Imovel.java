public class Imovel {

    private Endereco endereco;
    private double valor;


    public Imovel(Endereco endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public String apresentacao() {
        return "Imóvel localizado na " + endereco.getLogradouro() + " número " + endereco.getNumero() + ", " +
                endereco.getComplemento() + " Bairro " + endereco.getBairro() + ", " + endereco.getCidade() +
                ", " + endereco.getEstado() + ". No valor de R$" + valor;
    }



}
