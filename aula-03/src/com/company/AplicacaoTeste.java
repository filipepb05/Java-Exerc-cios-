package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enumeradores.Genero;
import com.company.heranca.Diretor;

public class AplicacaoTeste {

    public static void main(String[] args) {

        Editora editora = new Editora("DC Comics", "California");

        Diretor max = new Diretor("Max", 55, 1, Genero.MASCULINO);

        Filme madmax = new Filme("MadMax", "Max está Mad", 120, 2018, 8, max);

    }
}
