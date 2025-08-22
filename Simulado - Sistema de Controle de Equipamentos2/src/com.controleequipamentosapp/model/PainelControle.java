package com.controleequipamentosapp.model;

public class PainelControle extends Equipamento {
	
	private String tensao;
	
	public PainelControle (String codigo, String nome, int quantidade, double preco, String tensao) {
		super(codigo, nome, quantidade, preco);
		this.tensao = tensao;
	}
	
	@Override
	public String toString() {
		return "Motor Elétrico = [código = " + codigo + ", nome = " + nome + ", quantidade = " + quantidade + ", preço = " + preco + ", tensão = " + tensao + " ]";
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

}