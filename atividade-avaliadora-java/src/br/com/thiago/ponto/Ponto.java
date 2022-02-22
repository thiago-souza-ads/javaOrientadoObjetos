package br.com.thiago.ponto;

import java.util.ArrayList;
import java.util.List;

import br.com.thiago.bicicleta.Bicicleta;

public class Ponto {
	
	List<Bicicleta> bicicletas = new ArrayList<>();
	int disponiveis =3;
	
	public Ponto(){
		
		for(int i = 0; i < 3; i++) {
			Bicicleta bicicleta = new Bicicleta("Caloi Padão");
			bicicletas.add(bicicleta);
		}
	}

	public void visualisar() {
		for (Bicicleta b: bicicletas) {
			b.apresentar();
		}
	}

	public int getDisponiveis() {
		return disponiveis;
	}
	public void emprestar(int id, String nome, String cpf) {
		for (Bicicleta b: bicicletas) {
			if((b.id==id)&&(b.disponivel==true)){
				b.nome = nome;
				b.cfp= cpf;
				b.disponivel=false;
				this.disponiveis--;
			}
		}
	}

}

