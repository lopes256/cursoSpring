package br.com.deltatgn.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {
		"br.com.deltatgn.curso.repository",
		"br.com.deltatgn.curso.service",
		"br.com.deltatgn.curso.appconfiguration"
})
@RestController
public class CursoApplication {
	
	@Autowired
	private String applicationAlias;
	
	@Value("${application.name}")
	private String applicationName;
	
	@Value("${application.version}")
	private String applicationVersion;

	@GetMapping("/")
	public String hello() {
		/*development*/
		return applicationAlias + " --->>> " + applicationName + " --->>> " + applicationVersion;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

}
