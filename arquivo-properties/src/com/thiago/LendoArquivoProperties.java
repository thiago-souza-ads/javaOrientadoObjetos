package com.thiago;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config/config.properties"));
		
		// Conectar banco de dados....
		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");
		
		System.out.printf("Conectando a URL %s, atraves do ususario %s.\n", url, usuario);
		
		try {
			int x= 5/0; /// operacao ilegal so pra avisar por email. mas se viesse algo errado do servidor
		} catch (Exception e) {
			// se acontecer qualquer erro, informar o administrador
			String email = prop.getProperty("email.admin");
			System.err.printf("Enviando email para: %s informando o erro: %s", email, e.getMessage());
		}
	}
}
