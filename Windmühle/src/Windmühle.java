import stiftUndCo.*;

public class Windmühle {

    Stift stift = new Stift();
    double dGeschwindigkeit;
    int iGroeße;
    int x;
    int y;


    //Constructor
    public Windmühle(double dGeschwindigkeit, int iGroeße, int x, int y)
    {
        this.dGeschwindigkeit = dGeschwindigkeit;
        this.iGroeße = iGroeße;
        this.x = x;
        this.y = y;

        zeichneTurm();
    }

    //Draw Tower
    private void zeichneTurm()
    {
        stift.bewegeBis(this.x, this.y); //Use Lower Left Corner as root
        stift.runter();
        stift.bewegeBis(this.x + 50, this.y); //Draw Lower line
        stift.bewegeBis(this.x + 25, this.y - 100); //Draw top corner
        stift.bewegeBis(this.x, this.y); //Return to root
        stift.hoch();
    }

    /*
    public void dreheEinStueck()
    {
        //Draw rotor
        for(int i = 0; i < 2; i++)
        {
            //If first run draw it, if second erase
            if (i == 1) {
                //Hilfe.warte(30);
                stift.radiere();
            }else{
                stift.normal();
            }

            stift.bewegeBis(this.x + 25, this.y - 100); //Top Corner of Tower
            stift.runter();
            stift.bewegeUm(30 * iGroeße);
            stift.dreheUm(180);
            stift.hoch();
            stift.bewegeBis(this.x + 25, this.y - 100); //Top Corner of Tower
            stift.runter();
            stift.bewegeUm(30 * iGroeße);
            stift.hoch();
        }
        //Turn Rotor depending on "Rotation speed"
        stift.dreheUm(1 * dGeschwindigkeit);
        stift.normal(); //Redraw Tower
        zeichneTurm();
    }*/

    public void dreheEinStueck()
    {

        for(int i = 0; i < 2; i++)
        {
            if(i == 0)
            {
                stift.radiere();
            }
            else
            {
                stift.dreheUm(1 * dGeschwindigkeit);
                stift.normal();
            }

            stift.bewegeBis(this.x + 25, this.y - 100); //Top Corner of Tower
            stift.runter();
            stift.bewegeUm(30 * iGroeße);
            stift.dreheUm(180);
            stift.hoch();
            stift.bewegeBis(this.x + 25, this.y - 100); //Top Corner of Tower
            stift.runter();
            stift.bewegeUm(30 * iGroeße);
            stift.hoch();

        }
        zeichneTurm();

    }

}
