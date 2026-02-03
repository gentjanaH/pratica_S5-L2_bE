package gentjanahani.u2w5d2.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Order {
    private int numOrdine;
    private List<ElementiMenu> elementiOrdinati;
    private StatoOrdine statoOrdine;
    private int numCoperti;
    private LocalTime oraDiArrivo;
    private double totale;


    public void printOrder() {

                System.out.println("Tavolo: " + getNumOrdine());
                System.out.println("Coperti: " + getNumCoperti());
                System.out.println("Stato: " + getStatoOrdine());
                System.out.println("Ora di arrivo: " + getOraDiArrivo());
                System.out.println("Elementi ordinati:");

                elementiOrdinati.forEach(e->
                        System.out.println(e.getName() + " --- € " + e.getPrice()));

        System.out.println("Totale:  € " + getTotale() );

    }
}
