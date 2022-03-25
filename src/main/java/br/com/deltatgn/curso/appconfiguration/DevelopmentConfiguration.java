package br.com.deltatgn.curso.appconfiguration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class DevelopmentConfiguration {
	
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
		};
	}
}
