import stiftUndCo.*;

public class StarteUhr {

    public static void main(String[] args) {
        //Create Bildschirm
        Bildschirm bildschirm = new Bildschirm("Uhr", 900, 280);
        Uhr clock = new Uhr();

        //Refresh Clock and clear Screen
        while(true) {
            bildschirm.löscheAlles();
            clock.zeichneUhr();
            Hilfe.warte(100);
        }
    }
}
