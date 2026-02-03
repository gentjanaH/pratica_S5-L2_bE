package gentjanahani.u2w5d2.config;

import gentjanahani.u2w5d2.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    //PIZZE
    @Bean
    public Pizza margherita(){
       ArrayList<Toppings> toppings=new ArrayList<>();

        return new Pizza("pizza Margherita", toppings, 1104, 4.99);
    }

    @Bean
    public Pizza hawaiian(){
        ArrayList<Toppings> toppings=new ArrayList<>();
        toppings.add(ham());
        toppings.add(pineapple());

        return new Pizza("pizza Hawaiian", toppings, 1024, 6.49);
    }

    @Bean
    public Pizza salamiPizza(){
        ArrayList<Toppings> toppings=new ArrayList<>();
        toppings.add(salami());


        return new Pizza("pizza Salami", toppings, 1160, 5.99);
    }


    //TOPPINGS
    @Bean
    public Toppings tomato(){
        return new Toppings("Tomato", 92, 0.69);
    }

    @Bean
    public Toppings cheese(){
        return new Toppings("Cheese", 92, 0.69);
    }

    @Bean
    public Toppings ham(){
        return new Toppings("Ham", 35, 0.99);
    }

    @Bean
    public Toppings onions(){
        return new Toppings("Onions", 22, 0.69);
    }

    @Bean
    public Toppings pineapple(){
        return new Toppings("Pineapple", 24, 0.79);
    }

    @Bean
    public Toppings salami(){
        return new Toppings("Salami", 86, 0.99);
    }

    //DRINKS
    @Bean
    public Drinks lemonade(){
        return new Drinks("Lemonade(0.33l)", 128, 1.29);
    }

    @Bean
    public Drinks water(){
        return new Drinks("Water(0.5l)", 0, 1.29);
    }

    @Bean
    public Drinks wine(){
        return new Drinks("Wine", 607, 7.49);
    }

    //MENU
    @Bean
    public Menu menu(){
        return new Menu(
                List.of(margherita(), hawaiian(), salamiPizza()),
                List.of(cheese(), ham(), onions(), pineapple(), salami()),
                List.of(lemonade(),water(),wine())
        );
    }

    //TAVOLI
    @Bean
    public Table tavolo1(){
        return new Table()

    }
}
