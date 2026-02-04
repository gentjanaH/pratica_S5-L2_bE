package gentjanahani.u2w5d2;

import gentjanahani.u2w5d2.entities.Menu;
import gentjanahani.u2w5d2.entities.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class U2w5d2Application {

	public static void main(String[] args) {

		SpringApplication.run(U2w5d2Application.class, args);

//		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(U2w5d2Application.class);
//		Menu menu=ctx.getBean(Menu.class);
//		menu.printMenu();
//
//		System.out.println("-------------ORDINE---------------");
//
//		Order order=ctx.getBean(Order.class);
//		order.calcolaTotale();
//		order.printOrder();
	}

}
