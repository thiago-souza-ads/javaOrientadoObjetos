package br.com.thiago.moto;

import java.time.LocalDate;

public class Moto {
	private LocalDate dataFabricacao;
	public String chassi;
	private String cor;
	private String fabricante;
	private String modelo;
	private double preco;
	
	
	public Moto(LocalDate dataFabricacao, String chassi, String cor, String fabricante, String modelo,
			double preco) {
		this.dataFabricacao = dataFabricacao;
		this.chassi = chassi;
		this.cor = cor;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.preco = preco;
	}
	public void atualizarPreco(int percentual) {
		this.preco = this.preco + ((this.preco *percentual) / 100);
		System.out.println("Novo preço"+this.preco);
	}
	@Override
	public String toString() {
		return "Dados do veiculo:\n Modelo: "+this.modelo+ "\n Fabricante: " +this.fabricante+ "\n Cor: " +this.cor +"\n Data de Fabricacao: " +this.dataFabricacao+ "\n Chassi:" +this.chassi +"\n Valor: "+this.preco;
	}
	
}
