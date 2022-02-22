package br.com.thiago.moto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalMoto {
	public static void main(String[] args) {
		
		LocalDate dataFabricacao;
		String chassi;
		String cor;
		String fabricante;
		String modelo;
		double preco;
		
		ArrayList<Moto> motos = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		boolean sair = false;
		
		while (sair!=true) {
			System.out.print("Escolha:\n1 para cadastrar moto\n2 para ver todas as motos\n3 para alterar valor da moto\n==>");
			int opcao = entrada.nextInt();
			switch (opcao) {
			case 1: {
				System.out.println("Cadastro de veiculos:");
				System.out.print("Digite data de fabricação: (DD/MM/AAAA):");
				String data = entrada.next();
				DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				dataFabricacao = LocalDate.parse(data, formatador);
				System.out.print("Digite o chassi: ");
				chassi = entrada.next();
				System.out.print("Digite a cor: ");
				cor = entrada.next();
				System.out.print("Digite o fabricante: ");
				fabricante = entrada.next();
				System.out.print("Digite o modelo: ");
				modelo = entrada.next();
				System.out.print("Digite o preço: ");
				preco = entrada.nextDouble();
				
				try {
					Moto moto = new Moto(dataFabricacao, chassi, cor, fabricante, modelo, preco);
					motos.add(moto);
				}catch(IllegalArgumentException e) {
					System.err.println("Impossivel criar veiculo, argumentos invalidos:"+ e.getMessage());
				}
				continue;
			}
			case 2: {
				System.out.println("Motocicletas cadastradas:");
				motos.forEach(System.out::println); 
				continue;
			}
			case 3: {
				System.out.println("Alterar preço:");
				System.out.println("Digite o chassi da moto: ");
				String pesquisarChassi = entrada.next();
				for ( Moto m: motos) {
					if (m.chassi.equals(pesquisarChassi)) {
						System.out.println("Digite o percentual de aumento: ");
						int percentual = entrada.nextInt();
						m.atualizarPreco(percentual);
					}
				}
				continue;
			}
			default:
				System.out.println("Obrigado por usar nosso sistema");
				sair=true;
			}
		}
		entrada.close();
	}
	
}
