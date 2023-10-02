package com.padroes.projeto.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {

        System.out.println("Agressivo");
    }
}
