package gentjanahani.u2w5d1;

import gentjanahani.u2w5d1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2w5d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U2w5d1Application.class, args);

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(U2w5d1Application.class);
Menu menu=ctx.getBean(Menu.class);
menu.printMenu();


	}

}
