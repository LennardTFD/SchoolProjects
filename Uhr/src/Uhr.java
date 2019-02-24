import stiftUndCo.*;

public class Uhr {

    Ziffern ziffern = new Ziffern();
    Block block = new Block();


    public void zeichneUhr()
    {
        int stunde = Hilfe.stunde();
        int[] parsedStunde = {0, 0};
        parsedStunde[0] = stunde / 10; //Get 10er
        parsedStunde[1] = stunde - parsedStunde[0] * 10; //Get 1er

        int minute = Hilfe.minute();
        int[] parsedMinute = {0, 0};
        parsedMinute[0] = minute / 10;
        parsedMinute[1] = minute - parsedMinute[0] * 10;


        int sekunde = Hilfe.sekunde();
        int[] parsedSekunde = {0, 0};
        parsedSekunde[0] = sekunde / 10;
        parsedSekunde[1] = sekunde - parsedSekunde[0] * 10;




        //Draw every number, add a separator each Hour/Minute
        zeichenZahl(0, parsedStunde[0]); //10th Hour
        zeichenZahl(1, parsedStunde[1]); //1st Hour
        block.createSeperator(2); //Seperator (:)
        zeichenZahl(3, parsedMinute[0]); //10th Minute
        zeichenZahl(4, parsedMinute[1]); //1st Minute
        block.createSeperator(5); //Seperator (:)
        zeichenZahl(6, parsedSekunde[0]); //10th Second
        zeichenZahl(7, parsedSekunde[1]); //1st Second
    }


    public void zeichenZahl(int stelle, int ziffer)
    {

        //Get the preset of blocks, which have to be turned on
        boolean[] blocks = ziffern.getBlocks(ziffer);

        //For every Possible block, check if it needs to be turned on
        for(int i = 0; i < 7; i++)
        {
            if(blocks[i])
            {
                //Turn on Block
                block.createBlock(stelle, i);
            }
        }

    }

}
