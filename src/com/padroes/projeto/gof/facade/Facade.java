package com.padroes.projeto.gof.facade;

import com.padroes.projeto.gof.facade.subsistema1.Crm;
import com.padroes.projeto.gof.facade.subsistema2.Cep;

public class Facade {

    public void migrarCliente(String nome, String cep) {

        String cidade = Cep.getInstancia().recuperarCidade(cep);
        String estado = Cep.getInstancia().recuperarEstado(cep);

        Crm.gravarCliente(nome, cep, cidade, estado);
    }
}
