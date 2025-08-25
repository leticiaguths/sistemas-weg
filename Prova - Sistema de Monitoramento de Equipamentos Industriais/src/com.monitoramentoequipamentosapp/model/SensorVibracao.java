package com.monitoramentoequipamentosapp.model;

public class SensorVibracao extends Sensor {

    public SensorVibracao () {
        super();
    }

    public SensorVibracao (String codigo, String nomeEquipamento, String tipo, int alerta) {
        super(codigo, nomeEquipamento, tipo, alerta);
    }
}