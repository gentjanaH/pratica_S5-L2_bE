package gentjanahani.u2w5d2.config;

import gentjanahani.u2w5d2.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
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



    //TAVOLI
    @Bean
    public Table tavolo1(){
        return new Table(1, 4, StatoTavolo.LIBERO){

        };

    }

    @Bean
    public Table tavolo2(){
        return new Table(2, 10, StatoTavolo.LIBERO){

        };

    }

    @Bean
    public Table tavolo3(){
        return new Table(3, 2, StatoTavolo.OCCUPATO){

        };

    }

    @Bean
    public Table tavolo4(){
        return new Table(4, 4, StatoTavolo.LIBERO){

        };

    }

    @Bean
    public double getCostoCoperti(@Value("${coperto.costo}") double copertoCosto){
        return copertoCosto;
    }

    //ORDINI
    @Bean
    public Order order1(){
        ArrayList<ElementiMenu> elementiMenus=new ArrayList<>();
        elementiMenus.add(salamiPizza());
        elementiMenus.add(margherita());
        elementiMenus.add(hawaiian());
        elementiMenus.add(water());
        elementiMenus.add(wine());
        elementiMenus.add(wine());

        return new Order(1, 3, StatoOrdine.IN_CORSO, elementiMenus){};
    }
}
