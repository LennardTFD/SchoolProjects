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
    /*
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
    */


    private boolean[][] digitSet = {
            {true, true, true, false, true, true, true},
            {false, false, true, false, false, true, false},
            {true, false, true, true, true, false, true},
            {true, false, true, true, false, true, true},
            {false, true, true, true, false, true, false},
            {true, true, false, true, false, true, true},
            {true, true, false, true, true, true, true},
            {true, false, true, false, false, true, false},
            {true, true, true, true, true, true, true},
            {true, true, true, true, false, true, true}
    };

    //Return needed "digitSet" from presets above
    public boolean[] getBlocks(int ziffer)
    {
        return digitSet[ziffer];
    }

}
