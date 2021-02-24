package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

import java.time.LocalDate;


public class BancoDaDesgraca {

        public static void main(String[] args) {

                ContaBancaria conta1 = new ContaCorrente(541, InstituicaoBancaria.ITAU);
                ContaBancaria conta2 = new ContaPoupanca(764, InstituicaoBancaria.BRADESCO);
                ContaBancaria conta3 = new ContaDigital(324, InstituicaoBancaria.NUBANK);
                ContaBancaria conta4 = new ContaPoupanca(555, InstituicaoBancaria.CAIXA);
                ContaBancaria conta5 = new ContaDigital(157, InstituicaoBancaria.ITAU);
                ContaBancaria conta6 = new ContaCorrente(751, InstituicaoBancaria.BRADESCO);

                conta1.depositar(50.00);
                conta2.depositar(150.00);
                conta3.depositar(50.00);
                conta4.depositar(50.00);
                conta3.sacar(10.8);
                conta1.transferir(10.0,conta5);
                conta1.consultarSaldo();
                conta1.transferir(10.0,conta6);
                conta1.consultarSaldo();
               // conta1.sacar(25.9);
                conta2.sacar(50.0);
                conta2.consultarSaldo();
                conta2.transferir(20.0,conta6);
                conta2.consultarSaldo();
                conta2.transferir(20.0,conta5);
                conta2.consultarSaldo();

//                conta2.depositar(50.00);
//                conta2.sacar(10.0);
//                conta2.transferir(20.0,conta1);
//                conta1.depositar(50.00);
//                conta1.depositar(65.00);
//                conta1.sacar(10.0);
//                conta1.sacar(20.0);
//                conta1.transferir(50.0,conta2);
//                conta1.depositar(150.00);

                conta2.exibirExtrato(null, null);
                conta2.exibirExtrato(null, LocalDate.of(2020,8,10));
                conta2.exibirExtrato(LocalDate.of(2020,8,1),null);


        }
}