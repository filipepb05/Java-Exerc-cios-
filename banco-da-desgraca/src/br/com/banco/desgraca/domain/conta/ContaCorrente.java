package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.*;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;

public class ContaCorrente extends ContaTransacoes implements ContaBancaria {

    private final int numeroDaConta;
    private final InstituicaoBancaria banco;
    private TipoConta tipoConta;
    private String informacaoConta;
    private double saldo;


    public ContaCorrente(int numeroDaConta, InstituicaoBancaria banco) {
        this.numeroDaConta = numeroDaConta;
        this.banco = banco;
        this.saldo = 0;
        this.tipoConta = TipoConta.CONTA_CORRENTE;
        this.informacaoConta = tipoConta.getDescricao() + " " + banco.getDescricao() + " " + numeroDaConta;
    }

    RegistroTransacao registroTransacao = new RegistroTransacao();

    @Override
    public String toString() {
        return tipoConta.getDescricao() + " " + banco.getDescricao() + " " + numeroDaConta;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return banco;
    }

    @Override
    public Double consultarSaldo() {
        System.out.println("Saldo " + informacaoConta + " " + DecimalFormat.getCurrencyInstance().format(saldo));
        return saldo;
    }

    @Override
    public void depositar(Double valor) {
        saldo = super.depositar(valor, saldo);
        System.out.println("Depositando valor de " + DecimalFormat.getCurrencyInstance().format(valor) +
                " na " + informacaoConta);
        Transacao transacao = new Transacao(TipoTransacao.DEPOSITO, valor, Data.getDataTransacao());
        registroTransacao.registrarTransacao(transacao);
    }

    @Override
    public void sacar(Double valor) {
        saldo = super.sacar(valor, saldo, TipoConta.CONTA_CORRENTE);
        System.out.println("Sacando valor de " + DecimalFormat.getCurrencyInstance().format(valor) +
                " da " + informacaoConta);
        Transacao transacao = new Transacao(TipoTransacao.SAQUE, valor, Data.getDataTransacao());
        registroTransacao.registrarTransacao(transacao);
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        saldo = super.transferir(valor, saldo, TipoConta.CONTA_CORRENTE, banco, contaDestino);
        System.out.println("Transferindo valor de " + DecimalFormat.getCurrencyInstance().format(valor) +
                " da " + informacaoConta + " para " + contaDestino.toString());
        Transacao transacao = new Transacao(TipoTransacao.TRANSFERENCIA, valor, Data.getDataTransacao());
        registroTransacao.registrarTransacao(transacao);
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println("----- EXTRATO " + informacaoConta + "--------");
        List<String> listaExtrato = registroTransacao.listaExtrato(inicio, fim);
        for (String transacao : listaExtrato) {
            System.out.println(transacao);
        }
        System.out.println("---------------------------------");
        }
    }



