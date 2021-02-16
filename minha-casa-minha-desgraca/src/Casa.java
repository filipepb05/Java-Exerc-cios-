public class Casa extends Imovel {

    private Endereco endereco;
    private double valor;
    private boolean patio;
    private String temPatio;

    public Casa(Endereco endereco, double valor, boolean patio) {
        this.endereco = endereco;
        this.valor = valor;
        this.patio = patio;
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
        if (patio){
            temPatio = "com pátio, ";
        }else{
            temPatio = "sem pátio, ";
        }
        return "Casa localizada na " + endereco.getLogradouro() + ", número " + endereco.getNumero() + ", " +
                temPatio + endereco.getComplemento() + ", bairro " + endereco.getBairro() + ", " + endereco.getCidade() +
                ", " + endereco.getEstado() + ". No valor de R$" + valor;
    }

}
