package br.com.banco.desgraca.domain;

public enum TipoTransacao {
    SAQUE ("Saque"),
    DEPOSITO ("Depósito"),
    TRANSFERENCIA ("Transferência");

    private String descricao;

    TipoTransacao(String descricao) {
        this.descricao = descricao;
    }

}
