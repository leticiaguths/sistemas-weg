package com.monitoramentoequipamentosapp.model;

public class SensorTemperatura extends Sensor {

    public SensorTemperatura () {
        super();
    }

    public SensorTemperatura (String codigo, String nomeEquipamento, String tipo, int alerta) {
        super(codigo, nomeEquipamento, tipo, alerta);
    }
}