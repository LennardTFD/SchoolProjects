import stiftUndCo.*;

public class Uhr {

    Ziffern ziffern = new Ziffern();
    Block block = new Block();



    public void zeichneUhr()
    {
        int stunde = Hilfe.stunde();
        //Seperate each Digit of Number
        int[] parsedStunde = {0, 0};
        //If Number lowet than 10, add a "0" in front
        if(stunde < 10)
        {
            parsedStunde[0] = 0;
            parsedStunde[1] = stunde;
        }
        //Else use current Time but with splitted Digits
        else
        {
            parsedStunde[0] = Integer.parseInt(Integer.toString(stunde).substring(0, 1));
            parsedStunde[1] = Integer.parseInt(Integer.toString(stunde).substring(1, 2));
        }

        int minute = Hilfe.minute();
        int[] parsedMinute = {0, 0};
        if(minute < 10)
        {
            parsedMinute[0] = 0;
            parsedMinute[1] = minute;
        }
        else
        {
            parsedMinute[0] = Integer.parseInt(Integer.toString(minute).substring(0, 1));
            parsedMinute[1] = Integer.parseInt(Integer.toString(minute).substring(1, 2));
        }

        int sekunde = Hilfe.sekunde();
        int[] parsedSekunde = {0, 0};
        if(sekunde < 10)
        {
            parsedSekunde[0] = 0;
            parsedSekunde[1] = sekunde;
        }
        else
        {
            parsedSekunde[0] = Integer.parseInt(Integer.toString(sekunde).substring(0, 1));
            parsedSekunde[1] = Integer.parseInt(Integer.toString(sekunde).substring(1, 2));
        }

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
