package gentjanahani.u2w5d2.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Order {
    private int numOrdine;
    private ArrayList<ElementiMenu> elementiOrdinati = new ArrayList<>();
    private StatoOrdine statoOrdine;
    private int numCoperti;
    private LocalTime oraDiArrivo;
    private int totale;


    public void printOrder() {
        System.out.println(
                "Tavolo: " + getNumOrdine() +
                        " Coperti: " + getNumCoperti() +
                        " Stato: " + getStatoOrdine() +
                        " - " + getElementiOrdinati() + " " +
                        "Totale: " + getTotale()
        );
    }
}
