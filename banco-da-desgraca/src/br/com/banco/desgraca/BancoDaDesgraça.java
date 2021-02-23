package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

import java.time.LocalDate;

public class BancoDaDesgraça {

        public static void main(String[] args) throws Exception {

                ContaBancaria conta1 = new ContaCorrente(541, InstituicaoBancaria.ITAU);
                ContaBancaria conta2 = new ContaPoupanca(764, InstituicaoBancaria.BRADESCO);
                ContaBancaria conta3 = new ContaDigital(324, InstituicaoBancaria.NUBANK);



                conta2.depositar(50.00);
                conta2.sacar(10.0);
                conta2.transferir(20.0,conta1);
                conta1.depositar(50.00);
                conta1.depositar(65.00);
                conta1.sacar(10.0);
                conta1.sacar(20.0);
                conta1.transferir(50.0,conta2);
                conta1.depositar(150.00);

                conta1.exibirExtrato(LocalDate.of(2020,7,1),LocalDate.of(2021,7,1));
                conta1.exibirExtrato(LocalDate.of(2020,8,1),LocalDate.of(2021,7,1));

        }
}