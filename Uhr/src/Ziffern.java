public class Ziffern {
    /*

      0
    1   2
      3
    4   5
      6
    */
    //Preset of Blocks for each Digit
    //                         0      1     2      3      4     5      6
    public boolean[] eins = {false, false, true, false, false, true, false};
    public boolean[] zwei = {true, false, true, true, true, false, true};
    public boolean[] drei = {true, false, true, true, false, true, true};
    public boolean[] vier = {false, true, true, true, false, true, false};
    public boolean[] fuenf = {true, true, false, true, false, true, true};
    public boolean[] sechs = {true, true, false, true, true, true, true};
    public boolean[] sieben = {true, false, true, false, false, true, false};
    public boolean[] acht = {true, true, true, true, true, true, true};
    public boolean[] neun = {true, true, true, true, false, true, true};
    public boolean[] zero = {true, true, true, false, true, true, true};

    //Return needed "digitSet" from presets above
    public boolean[] getBlocks(int ziffer)
    {
        boolean[] digitSet;

        switch(ziffer)
        {
            case 1:
                digitSet = eins;
                break;
            case 2:
                digitSet = zwei;
                break;
            case 3:
                digitSet = drei;
                break;
            case 4:
                digitSet = vier;
                break;
            case 5:
                digitSet = fuenf;
                break;
            case 6:
                digitSet = sechs;
                break;
            case 7:
                digitSet = sieben;
                break;
            case 8:
                digitSet = acht;
                break;
            case 9:
                digitSet = neun;
                break;
            case 0:
                digitSet = zero;
                break;
            default:
                digitSet = zero;
                break;
        }
        return digitSet;
    }

}
