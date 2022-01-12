package br.com.itau.maquinas_equipamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan ({"br.com.itau.maquinas_equipamentos.domain", "br.com.itau.maquinas_equipamentos.port"})
@SpringBootApplication
public class MaquEquiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaquEquiApplication.class, args);
	}

}
