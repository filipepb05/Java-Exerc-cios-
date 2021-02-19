public class PropostaFinanciamento {

    private double salario;
    private Imovel imovel;
    private int mesesPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovelescolhido, int mesesPagamento) {
        this.salario = beneficiario.getSalario();
        this.imovel = imovelescolhido;
        this.mesesPagamento = mesesPagamento;
    }
    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
        if (imovel.getEndereco().getEstado() == UnidadeFederativa.SP && ((salario * mesesPagamento) >= (imovel.getValor() * 0.65))){
                imprimirPropostaAprovada();
        }else if (imovel.getEndereco().getEstado() == UnidadeFederativa.RJ && ((salario * mesesPagamento) >= (imovel.getValor() * 0.6))){
                imprimirPropostaAprovada();
        }else if (imovel.getEndereco().getEstado()  != UnidadeFederativa.SP && imovel.getEndereco().getEstado()  != UnidadeFederativa.RJ && (salario * mesesPagamento) >=
                (imovel.getValor() * 0.5)){
                imprimirPropostaAprovada();
        }else {
            imprimirPropostaNegada();
        }
    }

    private void imprimirPropostaAprovada () {
        System.out.println("Aprovado! Essa bomba agora é sua! Parabéns?");
    }

    private void imprimirPropostaNegada () {
        System.out.println("Esquece, parece que vc é pobre demais para ter esse imóvel...");
    }
}