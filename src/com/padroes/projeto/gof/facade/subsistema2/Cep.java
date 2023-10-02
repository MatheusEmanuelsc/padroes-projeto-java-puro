package com.padroes.projeto.gof.facade.subsistema2;

public class Cep {

    private static Cep instancia = new Cep();

    private Cep() {
        super();
    }

    public static Cep getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "seilar";
    }

    public String recuperarEstado(String cep) {
        return "BA";
    }
}
