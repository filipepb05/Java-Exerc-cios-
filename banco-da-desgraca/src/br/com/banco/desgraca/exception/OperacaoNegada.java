package br.com.banco.desgraca.exception;

public class OperacaoNegada extends RuntimeException{

    public OperacaoNegada(String message) {
        super(message);
    }
}
