package br.edu.ifmt.biblioteca;

import br.edu.ifmt.biblioteca.entities.Livro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		Livro livro = new Livro();
		//Sem Builder
		//livro.setEditora("Teste");

		//Com Builder
		Livro build = Livro.builder().editora("Teste").build();
	}
}
