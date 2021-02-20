public enum Genero {

    MASCULINO ("Masculino"),
    FEMININO ("Feminino"),
    NAO_BINARIO ("Não Binário");

    private String descricao;

    Genero (String descricao){  // no enum Cargo é sempre private, sem possibilidade de alteração
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
