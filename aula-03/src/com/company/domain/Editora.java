package com.company.domain;

public class Editora {

    private String nomeEditora;
    private String localizacao;

    public Editora(String nomeEditora, String localizacao) {
        if (nomeEditora.contentEquals("DC Comics")){
            throw new ExceptionEditora("\n \n Não use essa editora fraca !!!\n \n");
        }
        this.nomeEditora = nomeEditora;
        this.localizacao = localizacao;

    }
}
