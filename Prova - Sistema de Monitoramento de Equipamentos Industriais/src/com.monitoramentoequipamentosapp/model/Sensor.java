package com.monitoramentoequipamentosapp.model;

public class Sensor {

    protected String codigo;
    protected String nomeEquipamento;
    protected String tipo;
    protected int alerta;

    public Sensor () {
        this.codigo = "";
        this.nomeEquipamento = "";
        this.tipo = "";
        this.alerta = 0;
    }

    public Sensor (String codigo, String nomeEquipamento, String tipo, int alerta) {
        this.codigo = codigo;
        this.nomeEquipamento = nomeEquipamento;
        this.tipo = tipo;
        this.alerta = alerta;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Equipamento: " + nomeEquipamento + " | Tipo: " + tipo + " | Alertas: " + alerta;
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

     public int getAlerta() {
         return this.alerta;
     }

     public void setAlerta(final int alerta) {
         this.alerta = alerta;
     }
 }