public class PropostaFinanciamento {

    private double salario;
    private double valorImovel;
    private UnidadeFederativa uf;
    private int mesesPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovelescolhido, int mesesPagamento) {
        this.salario = beneficiario.getSalario();
        this.valorImovel = imovelescolhido.getValor();
        this.uf = imovelescolhido.getEndereco().getEstado();
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
        if (uf == UnidadeFederativa.SP && ((salario * mesesPagamento) >= (valorImovel * 0.65))){
                System.out.println("Aprovado! Essa bomba agora é sua! Parabéns?");
        }else if (uf == UnidadeFederativa.RJ && ((salario * mesesPagamento) >= (valorImovel * 0.6))){
                System.out.println("Aprovado! Essa bomba agora é sua! Parabéns?");
        }else if (uf != UnidadeFederativa.SP && uf != UnidadeFederativa.RJ && (salario * mesesPagamento) >=
                (valorImovel * 0.5)){
            System.out.println("Aprovado! Essa bomba agora é sua! Parabéns?");
        }else {
            System.out.println("Esquece, parece que vc é pobre demais para ter essa casa...");
        }
    }
}