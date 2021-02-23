package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transacao {

    private TipoTransacao tipoTransacao;
    private double valor;
    private LocalDate data;


    public Transacao(TipoTransacao tipoTransacao, double valor, LocalDate data) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.data = data;
    }

    public String descricao() {
        String simboloTransacao;
        if (tipoTransacao.equals(TipoTransacao.DEPOSITO)){
            simboloTransacao = "+ ";
        } else {
            simboloTransacao = "- ";
        }
        return simboloTransacao + DecimalFormat.getCurrencyInstance().format(valor) + " " + data;
    }

    public LocalDate getData() {
        return data;
    }
}
