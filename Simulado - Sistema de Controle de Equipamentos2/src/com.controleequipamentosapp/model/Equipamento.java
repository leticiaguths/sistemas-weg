package com.controleequipamentosapp.model;

public class Equipamento {
	
	protected String codigo;
	protected String nome;
	protected int quantidade;
	protected double preco;
	
	public Equipamento (String codigo, String nome, int quantidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Equipamento = [código = " + codigo + ", nome = " + nome + ", quantidade = " + quantidade + ", preço = " + preco + " ]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}