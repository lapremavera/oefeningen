package be.vdab.eersteOefnMao;

public class ArrayOef{

    //neem de even getallen tot 100


    public static void main (String []args){

        int []mijnLijst = new int [100];

        for (int x = 0; x < mijnLijst.length; x++){
            mijnLijst [x] = x*2;

        }
        for (int j = 0; j < mijnLijst.length; j ++){
            System.out.println (mijnLijst [j]);
        }
    }
}