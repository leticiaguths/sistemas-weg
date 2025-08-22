package com.monitoramentoequipamentosapp.view;

import java.util.Scanner;

public class InterfaceUsuario {

    private Scanner sc = new Scanner(System.in);

    //MENU PRINCIPAL
    public int menuPrincipal() {

        System.out.println("\n==========================================================");
        System.out.println(" Sistema de Monitoramento de Equipamentos Industriais WEG ");
        System.out.println("==========================================================");

        System.out.println("\n1 - Cadastrar Sensor \n2 - Listar Sensores \n3 - Registrar Medição \n4 - Exibir Histórico de Medições \n5 - Verificar Alertas \n6 - Listar Sensores Críticos \n0 - Sair");
        System.out.print("\nDigite a opção desejada: ");
        String opcao = sc.nextLine();
        int opcaoMenu = 0;

        try {
            opcaoMenu = Integer.parseInt(opcao);
        } catch (NumberFormatException e) {
            System.err.println("❌ Erro: você não digitou um número válido.");
        }

        return opcaoMenu;
    }

    public String cadastrarCodigo() {
        System.out.println("Digite o código do sensor: ");
        return sc.nextLine();
    }

    public String cadastrarNomeEquipamento() {
        System.out.println("Digite o nome do equipamento: ");
        return sc.nextLine();
    }

    public String cadastrarTipo() {
        System.out.println("Escolha o tipo do sensor: \n1 - Temperatura \n2 - Vibração");
        return sc.nextLine();
    }

    public void cadastroRealizado() {
        System.out.println("\u001b[32m✅ Sensor cadastrado com sucesso!\u001b[0m");
    }


}