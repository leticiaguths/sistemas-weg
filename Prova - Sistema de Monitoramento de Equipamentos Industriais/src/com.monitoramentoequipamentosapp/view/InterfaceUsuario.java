package com.monitoramentoequipamentosapp.view;

import com.monitoramentoequipamentosapp.model.Medicao;
import com.monitoramentoequipamentosapp.model.Sensor;

import java.util.Scanner;

public class InterfaceUsuario {

    private Scanner sc = new Scanner(System.in);

    //MENU PRINCIPAL
    public int menuPrincipal() {

        System.out.println("\n==========================================================");
        System.out.println(" Sistema de Monitoramento de Equipamentos Industriais WEG ");
        System.out.println("==========================================================");

        System.out.println("\n\uD83D\uDCDD 1 - Cadastrar Sensor \n\uD83D\uDCCB 2 - Listar Sensores \n\uD83C\uDF21\uFE0F 3 - Registrar Medição \n\uD83D\uDCC8 4 - Exibir Histórico de Medições \n\uD83D\uDEA8 5 - Verificar Alertas \n\uD83E\uDDEF 6 - Listar Sensores Críticos \n❌ 0 - Sair");
        System.out.print("\nDigite a opção desejada: ");
        String opcao = sc.nextLine();
        int opcaoMenu = 0;

        try {
            opcaoMenu = Integer.parseInt(opcao);
        } catch (NumberFormatException e) {
            System.err.println("❌ Erro: você não digitou um número válido.");
        }

        System.out.println("\n==========================================================");
        return opcaoMenu;
    }

    public String codigo() {
        System.out.print("\nDigite o código do sensor: ");
        return sc.nextLine();
    }

    public String cadastrarNomeEquipamento() {
        System.out.print("\nDigite o nome do equipamento: ");
        return sc.nextLine();
    }

    public String cadastrarTipo() {
        System.out.println("\nEscolha o tipo do sensor: \n1 - Temperatura \n2 - Vibração");
        return sc.nextLine();
    }

    public double registrarValor() {
        System.out.print("\nDigite o valor da medição: ");
        return sc.nextDouble();
    }

    public String registrarDataHora() {
        sc.nextLine();
        System.out.print("\nDigite a data e hora (formato dd/MM/yyyy HH:mm): ");
        return sc.nextLine();
    }

    public void cadastroRealizado() {
        System.out.println("\n\u001b[32m✅ Sensor cadastrado com sucesso!\u001b[0m");
    }

    public String limiteTemperatura() {
        return "Tipo: Temperatura | Limite de Alerta: 80.0 ºC";
    }

    public String limiteVibracao() {
        return "Tipo: Vibração | Medição Permitida: 60.0 Hz";
    }

    public void registroRealizado(Medicao medicao) {
        System.out.println("\n\u001b[32m✅ Medição registrada com sucesso!\u001b[0m");
    }

    public void visualizarSensor(Sensor sensor) {
        System.out.println(sensor);
    }

    public void exibirMedicoes(Medicao medicao) {
        System.out.println(medicao);
    }

    public void semSensor() {
        System.out.println("\nNenhum sensor cadastrado.");
    }

    public void codigoNaoEncontrado(String codigo) {
        System.out.println("Código '" + codigo + "' não encontrado!");
    }

    public void listaSensores() {
        System.out.println("\n==================== Lista de Sensores ===================");
    }

    public void medicaoTemperatura(Double valor) {
        System.out.println("\u001B[33m⚠\uFE0F ALERTA: Medição fora do limite técnico! (" + valor + " > 80.0)\u001B[0m");
    }

    public void medicaoVibracao(Double valor) {
        System.out.println("\u001B[33m⚠\uFE0F ALERTA: Medição fora do limite técnico! (" + valor + " ≠ 60.0)\u001B[0m");
    }

    public void nenhumSensorCritico() {
        System.out.println("\n\u001b[32m✅ Nenhum sensor crítico encontrado.\u001b[0m");
    }

    public void atencaoInspecao() {
        System.out.println("\n\u001B[31m⚠️ ATENÇÃO: Inspeção imediata recomendada!\u001B[0m");
    }

    public void exibirSensorCritico(Sensor sensor) {
        System.out.println("Código: " + sensor.getCodigo() + " | Tipo: " + sensor.getTipo() + " | Equipamento: " + sensor.getNomeEquipamento() + " | Alertas: " + sensor.getAlerta());
    }

    public void sensoresCriticos() {
        System.out.println("\n================= Sensores Críticos (> 3 alertas) =================");
    }

    public void verificandoSensores() {
        System.out.println("\n=================== Verificando Sensores ===================");
    }

    public void alertasDetectados(int totalAlertas) {
        System.out.println("\u001B[31m⚠️ " + totalAlertas + " alerta(s) detectado(s)\u001B[0m");
    }

    public void nenhumAlerta() {
        System.out.println("\u001b[32m✅ Nenhum alerta\u001B[0m");
    }

    public void divisor() {
        System.out.println("\n----------------------------------------------------------");
    }

    public void encerrarSistema() {
        System.out.println("Encerrando sistema... Obrigado por usar o Monitoramento WEG!");
    }

    public void mensagemPadrao() {
        System.out.println("\nNúmero inválido. Tente novamente.");
    }

}