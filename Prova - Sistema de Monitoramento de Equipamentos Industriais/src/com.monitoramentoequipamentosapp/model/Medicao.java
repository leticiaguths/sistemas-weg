package com.monitoramentoequipamentosapp.model;

public class Medicao {

    protected double valor;
    protected String dataHora;

    public Medicao () {
        this.valor = 0.0;
        this.dataHora = "";
    }

    @Override
    public String toString(){
        return "Valor: " + valor + " | Data: " + dataHora + "";
    }

}