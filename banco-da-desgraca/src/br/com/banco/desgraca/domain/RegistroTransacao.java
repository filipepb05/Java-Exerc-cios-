package br.com.banco.desgraca.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistroTransacao {

    private List<Transacao> listaTransacoes;

    public RegistroTransacao() {
        listaTransacoes = new ArrayList<>();
    }

    public void registrarTransacao(Transacao transacao) {
        listaTransacoes.add(transacao);
    }

    public List<String> listaExtrato(LocalDate inicio, LocalDate fim) {

        List<String> listaExtrato = new ArrayList<>();

        if (inicio == null) {
            inicio = LocalDate.of(2020, 7, 1);
        }
        if (fim == null) {
            fim = LocalDate.now();
        }
        for (Transacao transacao : listaTransacoes) {
            if (transacao.getData().isAfter(inicio) && transacao.getData().isBefore(fim)) {
                listaExtrato.add(transacao.descricao());
            }
        }
        return listaExtrato;
    }
}