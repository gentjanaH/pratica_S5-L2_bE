package gentjanahani.u2w5d2.entities;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    private int numOrdine;
    private List<ElementiMenu> elementiOrdinati;
    private StatoOrdine statoOrdine;
    private int numCoperti;
    private LocalTime oraDiArrivo=LocalTime.now();
    private double totale=0;

    public Order( int numOrdine, int numCoperti, StatoOrdine statoOrdine,List<ElementiMenu> elementiOrdinati) {
        this.numCoperti = numCoperti;
        this.numOrdine = numOrdine;
        this.elementiOrdinati = elementiOrdinati;
        this.statoOrdine = statoOrdine;

    }

    public void calcolaTotale(){
        double tot=0;

        for (int i = 0; i < elementiOrdinati.size(); i++) {
          ElementiMenu  elemento=elementiOrdinati.get(i);
        tot += elemento.getPrice();
        }

        this.totale=tot;
    }

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
