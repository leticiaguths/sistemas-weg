package com.monitoramentoequipamentosapp.service;

import com.monitoramentoequipamentosapp.model.Sensor;
import com.monitoramentoequipamentosapp.model.SensorTemperatura;
import com.monitoramentoequipamentosapp.model.SensorVibracao;
import com.monitoramentoequipamentosapp.view.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;

public class SensorService {

    private List<Sensor> listaSensores = new ArrayList<>();

    public void gerenciarService(int opcaoMenu, InterfaceUsuario tela) {

        switch (opcaoMenu) {

            //CADASTRAR SENSOR
            case 1 -> {
                String codigo = tela.cadastrarCodigo();
                String nomeEq = tela.cadastrarNomeEquipamento();
                String tipo = tela.cadastrarTipo();

                //SENSOR TEMPERATURA
                if (tipo.equalsIgnoreCase("1")){
                    tipo = "Temperatura";
                    Sensor sensor = new SensorTemperatura(codigo, nomeEq, tipo);
                    listaSensores.add(sensor);

                //SENSOR VIBRAÇÃO
                } else if (tipo.equalsIgnoreCase("2")) {
                    tipo = "Vibração";
                    Sensor sensor = new SensorVibracao(codigo, nomeEq, tipo);
                    listaSensores.add(sensor);
                }

                tela.cadastroRealizado();

            }

            case 2 -> {

            }

            case 3 -> {

            }

            case 4 -> {

            }

            case 5 -> {

            }

            case 6 -> {

            }

            case 0 -> {

            }

            default -> {

            }
        }

    }
}