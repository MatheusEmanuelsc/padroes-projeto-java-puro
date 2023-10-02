package com.padroes.projeto.gof.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {

        System.out.println("Normal");
    }
}
