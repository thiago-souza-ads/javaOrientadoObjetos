package br.com.thiago.bicicleta;

public class Bicicleta {

	private static int contadorbikes;
	
	public boolean disponivel;
	private String modelo;
	public int id;
	public String nome;
	public String cfp;
	
	public Bicicleta(String modelo) {
		this.modelo = modelo;
		this.id = contadorbikes;
		this.disponivel = true;
		contadorbikes++;
	}

	public void apresentar() {
		if(this.disponivel==false) {
			
		} else {
			System.out.println("ID: "+this.id+ " MODELO: " +this.modelo+ " DISPONIVEL: "+this.disponivel);
		}
	}

}
