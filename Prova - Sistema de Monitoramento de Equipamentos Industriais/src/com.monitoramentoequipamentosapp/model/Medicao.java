package com.monitoramentoequipamentosapp.model;

public class Medicao {

    protected double valor;
    protected String dataHora;
    protected String codigo;

    public Medicao () {
        this.valor = 0.0;
        this.dataHora = "";
        this.codigo = "";
    }

    public Medicao (double valor, String dataHora, String codigo) {
        this.valor = valor;
        this.dataHora = dataHora;
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return "Valor: " + valor + " | Data: " + dataHora;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    public String getDataHora() {
        return this.dataHora;
    }

    public void setDataHora(final String dataHora) {
        this.dataHora = dataHora;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(final double valor) {
        this.valor = valor;
    }

}