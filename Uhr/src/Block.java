import stiftUndCo.*;

public class Block {

    BuntStift stift = new BuntStift();

    //Creates a seperator between the numbers
    public void createSeperator(int stelle)
    {
        stift.setzeFarbe(Farbe.ROT);
        stift.setzeFuellMuster(1);

        stift.bewegeBis((stelle * 100) + 50, 70);
        stift.runter();
        stift.zeichneRechteck(20, 20);
        stift.hoch();
        stift.bewegeBis((stelle * 100) + 50, 130);
        stift.runter();
        stift.zeichneRechteck(20, 20);
        stift.hoch();
    }

    //Draw a block at given Spot, depending of Digit Index
    public void createBlock(int stelle, int blockNo)
    {
        //Add fill and color red to "stift"
        stift.setzeFarbe(Farbe.ROT);
        stift.setzeFuellMuster(1);

        //Draw the needed Block
        switch (blockNo)
        {
            case 0:
                stift.bewegeBis((stelle * 100) + 40, 50);
                stift.runter();
                stift.zeichneRechteck(50, 10);
                break;
            case 3:
                stift.bewegeBis((stelle * 100) + 40, 110);
                stift.runter();
                stift.zeichneRechteck(50, 10);
                break;
            case 6:
                stift.bewegeBis((stelle * 100) + 40, 170);
                stift.runter();
                stift.zeichneRechteck(50, 10);
                break;

            case 1:
                stift.bewegeBis((stelle * 100) + 30, 60);
                stift.runter();
                stift.zeichneRechteck(10, 50);
                break;

            case 2:
                stift.bewegeBis((stelle * 100) + 90, 60);
                stift.runter();
                stift.zeichneRechteck(10, 50);
                break;

            case 4:
                stift.bewegeBis((stelle * 100) + 30, 120);
                stift.runter();
                stift.zeichneRechteck(10, 50);
                break;
            case 5:
                stift.bewegeBis((stelle * 100) + 90, 120);
                stift.runter();
                stift.zeichneRechteck(10, 50);
                break;
        }
        stift.hoch();
    }

}
