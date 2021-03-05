package br.com.cwi.reset.exemploreset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	private UsuarioController usuarioController;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
