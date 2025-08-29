package com.monitoramentoequipamentosapp.service;

import com.monitoramentoequipamentosapp.model.Medicao;
import com.monitoramentoequipamentosapp.model.Sensor;
import com.monitoramentoequipamentosapp.model.SensorTemperatura;
import com.monitoramentoequipamentosapp.model.SensorVibracao;
import com.monitoramentoequipamentosapp.view.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;

public class SensorService {

    private List<Sensor> listaSensores = new ArrayList<>();
    private List<Medicao> listaMedicoes = new ArrayList<>();

    public void gerenciarService(int opcaoMenu, InterfaceUsuario tela) {

        switch (opcaoMenu) {

            //CADASTRAR SENSOR
            case 1 -> {
                String codigo = tela.codigo();
                tela.divisor();
                String nomeEq = tela.cadastrarNomeEquipamento();
                tela.divisor();
                String tipo = tela.cadastrarTipo();
                tela.divisor();

                int alerta = 0;
                //SENSOR TEMPERATURA
                if (tipo.equalsIgnoreCase("1")){
                    tipo = "Temperatura";
                    Sensor sensor = new SensorTemperatura(codigo, nomeEq, tipo, alerta);
                    listaSensores.add(sensor);
                    tela.cadastroRealizado();
                    tela.limiteTemperatura();

                //SENSOR VIBRAÇÃO
                } else if (tipo.equalsIgnoreCase("2")) {
                    tipo = "Vibração";
                    Sensor sensor = new SensorVibracao(codigo, nomeEq, tipo, alerta);
                    listaSensores.add(sensor);
                    tela.cadastroRealizado();
                    tela.limiteVibracao();
                }

            }

            //LISTAR SENSORES
            case 2 -> {
                tela.listaSensores();
                tela.divisor();

                for (Sensor sensor : listaSensores) {
                    System.out.println();
                    tela.visualizarSensor(sensor);
                }

                if(listaSensores.isEmpty()) {
                    tela.semSensor();
                }

                System.out.println();
                tela.divisor();
                System.out.println();
            }

            //REGISTRAR MEDIÇÕES
            case 3 -> {
                String codigo = tela.codigo();
                tela.divisor();
                Double valor = tela.registrarValor();
                tela.divisor();
                String dataHora = tela.registrarDataHora();
                tela.divisor();

                Medicao medicao = new Medicao(valor, dataHora, codigo);
                listaMedicoes.add(medicao);
                tela.registroRealizado(medicao);

                Sensor sensorEncontrado = null;
                for (Sensor sensor : listaSensores) {
                    if (sensor.getCodigo().equalsIgnoreCase(codigo)) {
                        sensorEncontrado = sensor;
                        break;
                    }
                }

                if (sensorEncontrado == null) {
                    tela.codigoNaoEncontrado(codigo);
                    return;

                } else if (sensorEncontrado instanceof SensorTemperatura) {
                    if (valor > 80) {
                        int alertaAtual = sensorEncontrado.getAlerta();
                        sensorEncontrado.setAlerta(alertaAtual + 1);
                        tela.medicaoTemperatura(valor);
                    }
                } else if (sensorEncontrado instanceof SensorVibracao) {
                    if (valor != 60) {
                        int alertaAtual = sensorEncontrado.getAlerta();
                        sensorEncontrado.setAlerta(alertaAtual + 1);
                        tela.medicaoVibracao(valor);
                    }
                }

            }

            //EXIBIR HISTÓRICO MEDIÇÕES
            case 4 -> {
                String codigo = tela.codigo();

                for (Medicao medicao : listaMedicoes) {

                    if (medicao.getCodigo().equalsIgnoreCase(codigo)) {
                        System.out.println();
                        tela.exibirMedicoes(medicao);
                    }

                }
            }

            //VERIFICAR ALERTAS
            case 5 -> {
                tela.verificandoSensores();
                System.out.println();

                if (listaSensores.isEmpty()) {
                    tela.semSensor();
                    return;
                }

                for (Sensor sensor : listaSensores) {
                    String tipoSensor = sensor.getTipo();
                    String nomeEquipamento = sensor.getNomeEquipamento();
                    String codigo = sensor.getCodigo();
                    int totalAlertas = sensor.getAlerta();

                    System.out.println("\nSensor " + codigo + " (" + tipoSensor + ") – " + nomeEquipamento + ":");

                    if (totalAlertas > 0) {
                        tela.alertasDetectados(totalAlertas);
                    } else {
                        tela.nenhumAlerta();
                    }

                }

                System.out.println();
                tela.divisor();
                System.out.println();
            }

            //LISTAR SENSORES CRÍTICOS
            case 6 -> {
                tela.sensoresCriticos();
                System.out.println();

                List<Sensor> sensoresCriticos = new ArrayList<>();
                for (Sensor sensor : listaSensores) {
                    if (sensor.getAlerta() > 3) {
                        sensoresCriticos.add(sensor);
                    }
                }

                if (sensoresCriticos.isEmpty()) {
                    tela.nenhumSensorCritico();
                } else {
                    for (Sensor sensor : sensoresCriticos) {
                        tela.exibirSensorCritico(sensor);
                    }
                    System.out.println();
                    tela.atencaoInspecao();
                }

                System.out.println();
                tela.divisor();
                System.out.println();
            }

            case 0 -> {
                tela.encerrarSistema();
            }

            default -> {
                tela.mensagemPadrao();
            }
        }

    }
}