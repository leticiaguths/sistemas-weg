package com.controleequipamentosapp;

import com.controleequipamentosapp.service.Estoque;
import com.controleequipamentosapp.view.Atendente;

public class Main {

	public static void main(String[] args) {
		
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int opcaoMenu = 0;
		
		do {
		opcaoMenu = atendente.menuPrincipal();		
		estoque.gerenciarEstoque(opcaoMenu, atendente);
		} while (opcaoMenu != 0);

	}

}