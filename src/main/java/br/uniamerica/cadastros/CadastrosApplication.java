package br.uniamerica.cadastros;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastrosApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(CadastrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {}
}