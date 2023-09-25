package pe.edu.upc.aaw.beeorganizedproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upc.aaw.beeorganizedproject.entities.Usuarios;

@SpringBootApplication
public class BeeOrganizedProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(BeeOrganizedProjectApplication.class, args);
		System.out.println("Los datos de BeeOrganized se cargaron exitosamente.");

	}

}
