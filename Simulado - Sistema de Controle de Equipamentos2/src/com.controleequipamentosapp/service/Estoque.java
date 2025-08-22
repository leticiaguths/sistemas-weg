package com.controleequipamentosapp.service;

import java.util.ArrayList;
import java.util.List;

import com.controleequipamentosapp.model.Equipamento;
import com.controleequipamentosapp.model.MotorEletrico;
import com.controleequipamentosapp.model.PainelControle;
import com.controleequipamentosapp.view.Atendente;

public class Estoque {
	
	private List<Equipamento> estoqueEquipamento;
	
	public Estoque() {
		estoqueEquipamento = new ArrayList<>();
	}

	
	public void gerenciarEstoque(int opcaoMenu, Atendente atendente) {
		
		switch (opcaoMenu) {
		
			//CADASTRAR
			case 1 -> {
				
				int cadastrar = atendente.cadastrarEquipamento();
				
				String codigo = atendente.cadastrarCodigo();
				String nome = atendente.cadastrarNome();
				int quantidade = atendente.cadastrarQuantidade();
				double preco = atendente.cadastrarPreco();
				
				if (cadastrar == 1) {
					double potencia = atendente.cadastrarPotencia();
					Equipamento motor = new MotorEletrico(codigo, nome, quantidade, preco, potencia);
					estoqueEquipamento.add(motor);
					System.out.println("\n==============================================================");
					
				} else if (cadastrar == 2) {
					String tensao = atendente.cadastrarTensao();
					Equipamento painel = new PainelControle(codigo, nome, quantidade, preco, tensao);
					estoqueEquipamento.add(painel);
					System.out.println("\n==============================================================");
					
				}
				
			}
			
			//LISTAR TUDO
			case 2 -> {
				
				System.out.println("\n============================== Lista de Equipamentos ================================\n");
					System.out.println("--------------------------------------------------------");
					for (Equipamento Equipamento : estoqueEquipamento) {
						System.out.println();
						atendente.visualizarEquipamento(Equipamento);
					}
						
					if(estoqueEquipamento.isEmpty()) {
						System.out.println("\nNenhum equipamento cadastrado.");
					}
					
					System.out.println();
					System.out.println("--------------------------------------------------------");
					System.out.println();
					
			}
			
			//LISTAR TIPOS
			case 3 -> {
				
				int listar = atendente.listarEquipamento();
				
				if (listar == 1) {
					System.out.println("\n============================== Lista de Mo0tores ================================\n");
					System.out.println("--------------------------------------------------------");
					for (Equipamento Equipamento : estoqueEquipamento) {
						
						if (Equipamento instanceof MotorEletrico motor) {
							System.out.println();
							atendente.visualizarMotor(Equipamento);
						} 
						
						if(estoqueEquipamento.isEmpty()) {
						System.out.println("\nNenhum motor cadastrado.");
						}
					}
					
					System.out.println();
					System.out.println("--------------------------------------------------------");
					System.out.println();
					
				} else if (listar == 2) {
					System.out.println("\n============================== Lista de Painéis ================================\n");
					System.out.println("--------------------------------------------------------");
					for (Equipamento Equipamento : estoqueEquipamento) {
						
						if (Equipamento instanceof PainelControle painel) {
							System.out.println();
							atendente.visualizarPainel(Equipamento);
						}
						
						if(estoqueEquipamento.isEmpty()) {
						System.out.println("\nNenhum painel cadastrado.");
						}
					}
					
					System.out.println();
					System.out.println("--------------------------------------------------------");
					System.out.println();
					
					
				}
				
			}
			
			
			//PESQUISAR CÓDIGO
			case 4 -> {
				String pesquisar = atendente.pesquisarEquipamento();
				boolean encontrado = false;
				
				for (Equipamento equipamento : estoqueEquipamento) {
			        if (equipamento.getCodigo().equalsIgnoreCase(pesquisar)) {
			            atendente.visualizarEquipamento(equipamento);
			            encontrado = true;
			            break;
			        }
			    }
				
				if (!encontrado) {
				   atendente.mensagemEquipamentoNaoEncontrado();
				}
				
				
			}
			
			
			//REMOVER CÓDIGO
			case 5 -> {
				String remover = atendente.removerEquipamento();
				boolean removido = false;

				for (int indice = 0; indice < estoqueEquipamento.size(); indice++) {
					if (estoqueEquipamento.get(indice).getCodigo().equalsIgnoreCase(remover)) {
						estoqueEquipamento.remove(indice);
						removido = true;
						break;
					}
				}

				if (removido) {
					atendente.visualizarEquipamentoRemovido(remover);
				} else {
					atendente.mensagemEquipamentoNaoEncontrado();
				} 
			}
			
			//MOVIMENTAR ESTOQUE
			case 6 -> {
				String codigo = atendente.pesquisarEquipamento();
			    boolean encontrado = false;

			    for (Equipamento equipamento : estoqueEquipamento) {
			        if (equipamento.getCodigo().equalsIgnoreCase(codigo)) {
			            encontrado = true;
			            int quantidade = atendente.movimentarEstoque();
			            int novaQuantidade = equipamento.getQuantidade() + quantidade;

			            if (novaQuantidade < 0) {
			            	atendente.estoqueInvalido();
			            } else {
			                equipamento.setQuantidade(novaQuantidade);
			                atendente.estoqueAtualizado();
			            }
			            break;
			        }
			    }

			    if (!encontrado) {
			        atendente.mensagemEquipamentoNaoEncontrado();
			    }
				
			}
			
			// RELATÓRIOS DE ESTOQUE
			case 7 -> {
				int relatorio = atendente.relatorioEstoque();
				
				switch (relatorio) {
				
				case 1 -> {
				    System.out.println("\nQuantidade total de equipamentos em estoque: " + estoqueEquipamento.size() + "\n");
				}
				
				case 2 -> {
				    double maiorPreco = 0;
				    Equipamento equipamentoMaisCaro = null;
				    for (Equipamento equipamento : estoqueEquipamento) {
				        if (equipamento.getPreco() > maiorPreco) {
				            maiorPreco = equipamento.getPreco();
				            equipamentoMaisCaro = equipamento;
				        }
				    }
				    if (equipamentoMaisCaro != null) {
				    	System.out.println("\nEquipamento com maior preço: ");
				        atendente.visualizarEquipamento(equipamentoMaisCaro);
				    }
				    System.out.println();
				}
				
				case 3 -> {
				    int maiorQtd = 0;
				    Equipamento equipamentoMaiorQtd = null;
				    for (Equipamento equipamento : estoqueEquipamento) {
				        if (equipamento.getQuantidade() > maiorQtd) {
				            maiorQtd = equipamento.getQuantidade();
				            equipamentoMaiorQtd = equipamento;
				        }
				    }
				    if (equipamentoMaiorQtd != null) {
				        System.out.println("\nEquipamento com maior quantidade: ");
				        atendente.visualizarEquipamento(equipamentoMaiorQtd);
				    }
				    System.out.println();
				}
				
				case 4 -> {
				    System.out.println("\nEquipamentos com estoque baixo (quantidade < 5):");
				    boolean valorAbaixo = false;
				    for (Equipamento equipamento : estoqueEquipamento) {
				        if (equipamento.getQuantidade() < 5) {
				            atendente.visualizarEquipamento(equipamento);
				            valorAbaixo = true;
				        }
				    }
				    
				    System.out.println();
				    if (!valorAbaixo) {
				        System.out.println("Nenhum equipamento com estoque baixo.");
				    }
				}
				
				}

			}
			
			//BUSCA AVANÇADA POR NOME
			case 8 -> { 
				String parteNome = atendente.pesquisarPorNomeAvancado();
			    boolean encontrou = false;
			    for (Equipamento equipamento : estoqueEquipamento) {
			        if (equipamento.getNome().toLowerCase().contains(parteNome.toLowerCase())) {
			            atendente.visualizarEquipamento(equipamento);
			            encontrou = true;
			        }
			    }
			    if (!encontrou) {
			        System.out.println("\nNenhum equipamento encontrado contendo '" + parteNome + "'.");
			    }
			}
			
			//BUSCA AVANÇADA POR PREÇO
			case 9 -> {
			    double valorMinimo = atendente.pesquisarPorPrecoAvancado(); 
			    boolean encontrou = false;
			    for (Equipamento equipamento : estoqueEquipamento) {
			        if (equipamento.getPreco() > valorMinimo) {
			            atendente.visualizarEquipamento(equipamento);
			            encontrou = true;
			        }
			    }
			    if (!encontrou) {
			        System.out.println("\nNenhum equipamento com preço acima de " + valorMinimo);
			    }
			}
			
			//SAIR
			case 0 -> {
				atendente.mensagemSaida();
			}
			
			
			//DEFAULT
			default -> {
				atendente.mensagemPadrao();
			}
		
		}
	}
	
	public List<Equipamento> getEstoqueEquipamento(){
		return estoqueEquipamento;
	}
	
	public void setEstoqueEquipamento(List<Equipamento> estoqueEquipamento){
		this.estoqueEquipamento = estoqueEquipamento;
	}

}