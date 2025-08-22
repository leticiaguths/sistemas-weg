package com.controleequipamentosapp.view;
import java.util.Scanner;

import com.controleequipamentosapp.model.Equipamento;

public class Atendente {
	
	private Scanner sc;
	
	public Atendente() {
		sc = new Scanner(System.in);
	}
	
	public int menuPrincipal() {
		
		System.out.println("==============================================================");
		System.out.println("         Sistema de Controle de Equipamentos WEG 1.0");
		System.out.println("==============================================================\n");

		boolean entradaInvalida = true;
		int menu = 0;
		while (entradaInvalida) {
		
			System.out.println("1 - Cadastrar Equipamento \n2 - Listar Todos os Equipamentos \n3 - Listar Equipamentos por Tipo \n4 - Pesquisar Equipamento por Código \n5 - Remover Equipamento por Código \n6 - Movimentar Estoque \n7 - Relatótios de Estoque \n8 - Busca Avançada por Nome \n9 - Busca Avançada por Preço\n0 - Sair");
			String escolha = sc.nextLine();
			System.out.println("\n==============================================================\n");
			
			try {
				menu = Integer.parseInt(escolha);
				entradaInvalida = false;
			} catch (NumberFormatException erro) {
				System.err.println("❌ [Erro: você não digitou um número válido.]");
				System.out.println("\n==============================================================\n");
				entradaInvalida = true;
			}
		}
		
		return menu;
		
	}
	
	public int cadastrarEquipamento() {
		System.out.print("O que você deseja cadastrar: \n\n1 - Cadastrar um motor elétrico \n2 - Cadastrar um painel de controle \n");
		int cadastrar = sc.nextInt();
		sc.nextLine();
		System.out.println("\n==============================================================");
		return cadastrar;
	}

	public String cadastrarCodigo() {
		System.out.print("\nDigite o código do equipamento: ");
		String codigo = sc.nextLine();
		return codigo;		
	}

	public String cadastrarNome() {
		System.out.print("\nDigite o nome do equipamento: ");
		String nome = sc.nextLine();
		return nome;
	}

	public int cadastrarQuantidade() {
		System.out.print("\nDigite a quantidade do equipamento: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		return quantidade;
	}

	public double cadastrarPreco() {
		System.out.print("\nDigite o preço do equipamento: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		return preco;
	}

	public double cadastrarPotencia() {
		System.out.print("\nDigite a potência do equipamento: ");
		double potencia = sc.nextDouble();
		sc.nextLine();
		return potencia;
	}

	public String cadastrarTensao() {
		System.out.print("\nDigite a tensão do equipamento: ");
		String tensao = sc.nextLine();
		return tensao;
	}

	public int listarEquipamento() {
		System.out.print("\nO que você deseja listar: \n\n1 - Listar motores elétricos \n2 - Listar painéis de controle\n\n");
		int listar = sc.nextInt();
		sc.nextLine();
		return listar;
	}

	public void visualizarMotor(Equipamento equipamento) {
		System.out.println(equipamento);
	}

	public void visualizarPainel(Equipamento equipamento) {
		System.out.println(equipamento);		
	}

	public void visualizarEquipamento(Equipamento equipamento) {
		System.out.println(equipamento);
	}
	
	public String removerEquipamento() {
		System.out.print("\nDigite o código do equipamento a ser removido: ");
		String remover = sc.nextLine();
		return remover;
	}
	
	public void visualizarEquipamentoRemovido(String codigo) {
		System.out.println("\nO equipamento '" + codigo + "' foi removido.\n");
	}
	
	public void mensagemEquipamentoNaoEncontrado() {
		System.out.println("\nEquipamento não encontrado.\n");
	}

	public String pesquisarEquipamento() {
		System.out.print("\nDigite o código do produto que você deseja: \n\n");
		String pesquisar = sc.nextLine();
		return pesquisar;
	}

	public int movimentarEstoque() {
        System.out.print("\nDigite a quantidade a movimentar \n(positivo para adicionar e negativo para retirar): ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        return quantidade;
	}

	public void estoqueInvalido() {
        System.err.println("\n❌ Movimento inválido. Estoque não pode ser negativo.");
	}

	public void estoqueAtualizado() {
        System.out.println("\n✅ Estoque atualizado com sucesso.");
	}
	
	public void mensagemSaida() {
		System.out.println("\nObrigado por confiar no Sistema de Controle de Equipamentos WEG. Volte sempre.");
	}

	public void mensagemPadrao() {
		System.out.println("\nNúmero inválido. Tente novamente.");
	}
	
	public int relatorioEstoque() {
        System.out.println("Escolha o tipo de relatório que deseja visualizar: \n1 - Quantidade total de equipamentos em estoque \n2 - Equipamento com maior preço \n3 - Equipamento com maior quantidade \n4 - Equipamentos com estoque baixo (quantidade < 5) ");
        int relatorio = sc.nextInt();
        sc.nextLine();
        return relatorio;
	}

	public String pesquisarPorNomeAvancado() {
		System.out.print("\nDigite o nome para buscar no estoque: ");
        String nome = sc.nextLine();
        return nome;
	}

	public double pesquisarPorPrecoAvancado() {
		System.out.println("\nDigite o preço mínimo a ser pesquisado no estoque:  ");
        double preco = sc.nextInt();
        sc.nextLine();
        return preco;
	}

}
