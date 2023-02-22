package com.example.ClassesProject;

import com.example.ClassesProject.models.Classes;
import com.example.ClassesProject.repositories.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ClassesProjectApplication implements CommandLineRunner {
	@Autowired
	ClassesRepository classesRepository;

	public static void main(String[] args) {
		SpringApplication.run(ClassesProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Classes> classes = new ArrayList<>();
			classes.add(new Classes(null, "Matemáticas", "Estudio de los números, operaciones y relaciones, incluyendo el álgebra, la geometría, el cálculo y la estadística."));
			classes.add(new Classes(null, "Física", "Estudio de las propiedades y comportamiento de la materia y la energía en el universo."));
			classes.add(new Classes(null, "Química", "Estudio de la estructura, composición y propiedades de la materia, incluyendo su comportamiento en las reacciones químicas."));
			classes.add(new Classes(null, "Historia del Arte", "Estudio de la evolución del arte a lo largo de la historia y de sus características principales."));
			classes.add(new Classes(null, "Biología", "Estudio de los seres vivos, desde los más simples hasta los más complejos."));
			classes.add(new Classes(null, "Música", "Estudio de los elementos que conforman la música y de las diferentes manifestaciones musicales."));
			classes.add(new Classes(null, "Filosofía", "Estudio de las cuestiones fundamentales acerca de la existencia, la verdad, la moral y la mente."));
			classes.add(new Classes(null, "Inglés", "Estudio del idioma inglés, tanto en su gramática como en su vocabulario."));
			classes.add(new Classes(null, "Python", "Lenguaje de programación interpretado cuya filosofía hace hincapié en una sintaxis que favorezca un código legible."));
			classes.add(new Classes(null, "JavaScript", "Lenguaje de programación interpretado, diseñado para crear scripts y programas en el lado del cliente en las páginas web."));
		classesRepository.saveAll(classes);
	}
}




