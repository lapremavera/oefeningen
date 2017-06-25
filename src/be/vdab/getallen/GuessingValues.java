package be.vdab.getallen;

import java.util.Random;

public class GuessingValues {

    private int waarde1;
    private int waarde2;

    public int getNummerToGuess() {
        return nummerToGuess;
    }

    private int nummerToGuess = 0;

    private int aantalKeren = 0;

    public int getAantalKeren() {
        return aantalKeren;
    }


    public GuessingValues(int waarde1, int waarde2) {
        this.waarde1 = waarde1;
        this.waarde2 = waarde2;

        this.berekenNummerToGuess();
    }

    private void berekenNummerToGuess()
    {
        Random rand = new Random();
        this.nummerToGuess = rand.nextInt(waarde2 - waarde1) + waarde1;
    }

    public int getWaarde1() {
        return waarde1;
    }

    public void setWaarde1(int waarde1) {
        this.waarde1 = waarde1;
        berekenNummerToGuess();
    }

    public int getWaarde2() {
        return waarde2;

    }

    public void setWaarde2(int waarde2) {
        this.waarde2 = waarde2;
        berekenNummerToGuess();
    }

    // Deze methode voert een gok uit - let op maximum 3 keer!
    public boolean guessNummer(int guess) throws Exception
    {
        if (getAantalKeren() > 1)
        {
            // game over
            throw new Exception("Game over!");
        }
        else
        {
            aantalKeren = getAantalKeren() + 1;

            // de gok doen
            if (guess == this.nummerToGuess)
            {
                // juist
                return true;
            }
            else
            {
                // fout
                return false;
            }
        }
    }


}
