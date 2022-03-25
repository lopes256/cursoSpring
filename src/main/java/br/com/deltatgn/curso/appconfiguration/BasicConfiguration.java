package br.com.deltatgn.curso.appconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicConfiguration {

	@Bean(name = "applicationAlias")
	public String applicationAlias() {
		return "Apoio WEB Config";
	}

}
