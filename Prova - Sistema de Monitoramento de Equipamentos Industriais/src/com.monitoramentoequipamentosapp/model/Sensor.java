package com.monitoramentoequipamentosapp.model;

public class Sensor {

    protected String codigo;
    protected String nomeEquipamento;
    protected String tipo;

    public Sensor () {
        this.codigo = "";
        this.nomeEquipamento = "";
        this.tipo = "";
    }

    public Sensor (String codigo, String nomeEquipamento, String tipo) {
        this.codigo = codigo;
        this.nomeEquipamento = nomeEquipamento;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Equipamento: " + nomeEquipamento + " | Tipo: " + tipo;
    }

     public String getCodigo() {
         return codigo;
     }

     public void setCodigo(String codigo) {
         this.codigo = codigo;
     }

     public String getNomeEquipamento() {
         return nomeEquipamento;
     }

     public void setNomeEquipamento(String nomeEquipamento) {
         this.nomeEquipamento = nomeEquipamento;
     }

     public String getTipo() {
         return tipo;
     }

     public void setTipo(String tipo) {
         this.tipo = tipo;
     }
 }