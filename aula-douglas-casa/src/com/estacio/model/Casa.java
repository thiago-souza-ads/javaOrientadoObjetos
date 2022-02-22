package com.estacio.model;

public class Casa {
	private final String cor;
	private final Integer numeroDeComodos;
	private final String endereco;

	public Casa(CasaBuilder casaBuilder) {
		super();
		this.endereco = casaBuilder.endereco;
		this.numeroDeComodos = casaBuilder.numeroDeComodos;
	}

	public String getCor() {return cor;}

	public Integer getNumeroDeComodos() {return numeroDeComodos;}

	public String getEndereco() {return endereco;}
	
	public static class CasaBuilder {
		private String cor;
		private Integer numeroDeComodos;
		private String endereco;
		
		public CasaBuilder(String endereco, Integer numeroComodos) {
			this.endereco = endereco;
			this.numeroDeComodos = numeroComodos;
		}
	
		public Casa build() {
			Casa casa = new Casa(this);
			return casa;
		}
	
	}
}
