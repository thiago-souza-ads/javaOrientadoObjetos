package br.com.thiago.usuario;

import java.util.Scanner;

import br.com.thiago.ponto.Ponto;

public class Usuario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean sair = false;
		Ponto ponto = new Ponto();

		while (sair != true) {
			System.out.print("\n1 - Emprestar bicicletas\n2 - Listar bicicletas");
			int opcao = entrada.nextInt();
			switch (opcao) {
			case 1: {
				if(ponto.getDisponiveis()==0) {
					System.out.println("Bicicletas indisponiveis no momento!");
					break;
				} else {
				System.out.print("Digite seu nome: ");
				String nome = entrada.next();
				System.out.print("Digite seu cpf: ");
				String cpf = entrada.next();
				System.out.print("Digite a id da bicicleta: ");
				int id = entrada.nextInt();	
				ponto.emprestar(id, nome, cpf );
				}
				continue;
			}
			case 2: {
				if(ponto.getDisponiveis()==0) {
					System.out.println("Bicicletas indisponiveis no momento!");
				}
				System.out.println("\nBicicletas disponiveis no ponto:");
				ponto.visualisar();
				System.out.println();
				continue;
			}
			default:
				entrada.close();
				System.out.println("Saindo");
				sair = true;
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}

	}
}
