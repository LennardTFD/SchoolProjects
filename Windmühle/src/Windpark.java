import stiftUndCo.*;

public class Windpark {

    Bildschirm bildschirm = new Bildschirm("Windpark", 650, 650);

    Windmühle muehle1 = new Windmühle(4, 2, 100, 200);
    Windmühle muehle2 = new Windmühle(8, 2, 220, 200);
    Windmühle muehle3 = new Windmühle(8, 2, 340, 200);
    Windmühle muehle4 = new Windmühle(4, 2, 460, 200);


    //Move Rotor one by one
    public void animateMuehle()
    {
        while(true)
        {
            muehle1.dreheEinStueck();
            muehle2.dreheEinStueck();
            muehle3.dreheEinStueck();
            muehle4.dreheEinStueck();
        }
    }
}
