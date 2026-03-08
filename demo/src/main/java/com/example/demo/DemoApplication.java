package com.example.demo;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Consultor[] promart = new Consultor[2];
		promart[0] = new ConsultorPartime("Adriel Reategui",12345678,520,100);
		promart[1] = new ConsultorFulltime("Hugo Kong",87654321,1130,450);

		for (Consultor con : promart) {

			System.out.println("Consultor:" +con.getNombre());
			System.out.println("Codigo:" +con.getCodigo());
			System.out.println("Sueldo:" +con.getSueldo());
			System.out.println("Bono de tienda:" +con.getBonotienda());
			System.out.println("------------------------------------");
		}

		}
	}


