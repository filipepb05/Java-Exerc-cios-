package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.domain.conta.ContaBancaria;
import br.com.banco.desgraca.exception.OperacaoNegada;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;

public abstract class ContaTransacoes {

    public double depositar(Double valor, Double saldo) {

        return saldo = saldo + valor;
    }

    public double sacar (Double valor, Double saldo, TipoConta tipoConta) {
        double taxa = 1;
        if (tipoConta.equals(TipoConta.CONTA_POUPANCA)){
            taxa = 1.02; }
        if ((valor * taxa) >= saldo) {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        if (tipoConta.equals(TipoConta.CONTA_CORRENTE)){
            if ((valor % 5) == 0) {
                saldo = saldo - valor;
            } else {
                throw new OperacaoNegada("Valor inválido. Notas apenas de R$ 5,00, R$ 10,00, R$ 20,00, R$ 50,00, " +
                        "R$ 100,00 e R$ 200,00 ");
            }
        }
        if (tipoConta.equals(TipoConta.CONTA_DIGITAL)){
            if (valor >= 10) {
                saldo = saldo - valor;
            } else {
                throw new OperacaoNegada("Valor inválido. Saques apenas acima de R$10,00");
            }
        }
        if (tipoConta.equals(TipoConta.CONTA_POUPANCA)){
            saldo = saldo - valor * taxa;
        }

        return saldo;
    }

    public double transferir (Double valor, Double saldo, TipoConta tipoConta, InstituicaoBancaria bancoRemetente,
                              ContaBancaria contaDestinatario){
        double taxa = 1;
        boolean mesmoBanco = bancoRemetente.getDescricao().equals(contaDestinatario.getInstituicaoBancaria().getDescricao());

        if (tipoConta.equals(TipoConta.CONTA_CORRENTE) && (mesmoBanco == false)){
            taxa = 1.01;
        }
        if (tipoConta.equals(TipoConta.CONTA_POUPANCA) && (mesmoBanco)){
            taxa = 1.005;
        }
        if (tipoConta.equals(TipoConta.CONTA_POUPANCA) && (mesmoBanco == false)){
            taxa = 1.01;
        }
        if ((valor * taxa) >= saldo) {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        } else {
            saldo = saldo - valor;
            contaDestinatario.depositar(valor);
        }

        return saldo;
    }



}
